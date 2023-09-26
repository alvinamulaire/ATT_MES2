package com.att.service.impl;


import com.att.domain.attdomain.AttdpsInfo;
import com.att.repository.AttDpsRepository;
import com.att.repository.entity.AttProductObject;
import com.att.service.AttDpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class AttDpsServiceImpl implements AttDpsService {

    @Autowired
    private AttDpsRepository attDpsRepository;

//    @Override
//    public List<Certification> getCerInfo(Certification certification) {
//        String site = certification.getSite();
//
//        Certification certification1 = new Certification();
//        certification1.setSite(site);
//        List<Certification> list = certificationRepository.getCerInfo(certification1);
//        return  list;
//    }

    @Override
    public void importattdps( AttdpsInfo attdpsInfo) {
        List<AttProductObject> detailInfoList = attdpsInfo.getDetailInfoList();
        for (AttProductObject detail : detailInfoList){
            String site = attdpsInfo.getSite();
            String ITEM = detail.getItemBo();
            String OPERATION = detail.getOperationBo();
            String item_bo ="ItemBO:" + site + "," + ITEM + ",A";
            String operation_bo ="OperationBO:" + site + "," + OPERATION + ",A";

            //刪除相同資料
            attDpsRepository.deleteAttdps(site,item_bo,operation_bo);

            // 寫入
            if(ITEM != null && OPERATION !=null) {
                Date currentDate = new Date();
                BigDecimal DPS_OBJECT = detail.getDpsObject();
                BigDecimal MPS_OBJECT = detail.getMpsObject();

                AttProductObject attProductObject = new AttProductObject();
                attProductObject.setSite(site);
                attProductObject.setItemBo(item_bo);
                attProductObject.setOperationBo(operation_bo);
                attProductObject.setDpsObject(DPS_OBJECT);
                attProductObject.setMpsObject(MPS_OBJECT);
                attProductObject.setCreatedDateTime(currentDate);
                attProductObject.setModifiedDateTime(currentDate);
                attDpsRepository.insertAttdps(attProductObject);
            }
        }

    }
}

