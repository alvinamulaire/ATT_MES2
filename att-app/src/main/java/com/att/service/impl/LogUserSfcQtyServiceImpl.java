package com.att.service.impl;

import com.att.domain.productionLog.ZProductionLogDTO;
import com.att.repository.LogUserSfcQtyRepository;
import com.att.repository.entity.FwDutyState;
import com.att.repository.entity.ZProductionLog;
import com.att.service.LogUserSfcQtyService;
import com.fw.mes.me.controller.sfc.SfcRepo;
import com.fw.mes.me.controller.site.SiteRepo;
import com.fw.mes.me.entity.Operation;
import com.fw.mes.me.entity.Sfc;
import com.fw.mes.me.entity.ViewSfcStepInfo;
import com.fw.mes.util.DateUtil;
import com.fw.mes.util.FwUtils;
import com.sap.me.productdefinition.OperationBOHandle;
import com.sap.me.productdefinition.wserpimpl.operation.OperationHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class LogUserSfcQtyServiceImpl implements LogUserSfcQtyService {

    @Autowired
    private LogUserSfcQtyRepository logUserSfcQtyRepository;

    @Autowired
    private SfcRepo sfcRepo;

    @Autowired
    private SiteRepo siteRepo;

    @Override
    public ZProductionLogDTO search(ZProductionLog zProductionLog) throws ParseException {
        String site = zProductionLog.getSite();
        String operation = zProductionLog.getOperation();
        String resource = zProductionLog.getResource();
        String sfc = zProductionLog.getSfc();

        String timeZone = siteRepo.getTimeZone(site);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date localToday = dateFormat.parse( DateUtil.dateToString(new Date(), "yyyy-MM-dd")+ " 00:00:00");
        Date todayStart = DateUtil.toGmtDate(localToday, timeZone);
        zProductionLog.setCreateDateTimeStart(todayStart);

        List<FwDutyState> fwDutyStateList = logUserSfcQtyRepository.getDutyState(site, resource);

        List<ZProductionLogDTO> zProductionLogDTOList = new ArrayList<>();
        fwDutyStateList.forEach(fwDutyState -> {
            zProductionLog.setUser(fwDutyState.getUserNo());
            List<ZProductionLog> zProductionLogList = logUserSfcQtyRepository.search(zProductionLog);
            ZProductionLogDTO zProductionLogDTO = new ZProductionLogDTO();
            if(zProductionLogList.isEmpty()){
                zProductionLogDTO.setUser(fwDutyState.getUserNo());
            }else {
                BeanUtils.copyProperties(zProductionLogList.get(0), zProductionLogDTO);
            }
            zProductionLogDTO.setUserName(FwUtils.findUserName(site, zProductionLogDTO.getUser()));
            zProductionLogDTOList.add(zProductionLogDTO);
        });

        ViewSfcStepInfo viewSfcStepInfo = new ViewSfcStepInfo();
        viewSfcStepInfo.setSite(site);
        viewSfcStepInfo.setSfc(sfc);
        viewSfcStepInfo.setOperationBo(new OperationBOHandle(site, operation, "#").getValue());

        List<ViewSfcStepInfo> sfcObj = sfcRepo.getSfc(viewSfcStepInfo, "");

        zProductionLog.setCreateDateTimeEnd(zProductionLog.getCreateDateTimeStart());
        zProductionLog.setCreateDateTimeStart(null);
        zProductionLog.setUser(null);
        List<ZProductionLog> zProductionLogList = logUserSfcQtyRepository.search(zProductionLog);

        ZProductionLogDTO zProductionLogDTO = new ZProductionLogDTO();
        zProductionLogDTO.setQty(sfcObj.get(0).getQtyInWork().add(sfcObj.get(0).getQtyCompleted()));
        zProductionLogDTO.setConfirmedQty(zProductionLogList.stream().map(zProductionLog1 -> {
            return zProductionLog1.getQty().add(zProductionLog1.getNgQty());
        }).reduce(BigDecimal.ZERO, BigDecimal::add));
        zProductionLogDTO.setzProductionLogList(zProductionLogDTOList);
        return zProductionLogDTO;
    }

    @Override
    @Transactional
    public void save(List<ZProductionLog> zProductionLogList) {
        zProductionLogList.forEach(zProductionLog -> {
            if(!FwUtils.isNullOrEmpty(zProductionLog.getSid())){
                logUserSfcQtyRepository.delete(zProductionLog.getSid());
            }
            zProductionLog.setSid(FwUtils.getUid());
            zProductionLog.setCreateDateTime(DateUtil.getGmtTime());
        });
        logUserSfcQtyRepository.insert(zProductionLogList);
    }
}
