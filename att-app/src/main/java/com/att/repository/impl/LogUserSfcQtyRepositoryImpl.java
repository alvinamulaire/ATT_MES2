package com.att.repository.impl;

import com.att.repository.LogUserSfcQtyRepository;
import com.att.repository.entity.FwDutyState;
import com.att.repository.entity.FwDutyStateExample;
import com.att.repository.entity.ZProductionLog;
import com.att.repository.entity.ZProductionLogExample;
import com.att.repository.mapper.FwDutyStateMapper;
import com.att.repository.mapper.ZProductionLogMapper;
import com.fw.mes.util.FwUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LogUserSfcQtyRepositoryImpl implements LogUserSfcQtyRepository {

    @Autowired
    private ZProductionLogMapper zProductionLogMapper;

    @Autowired
    private FwDutyStateMapper fwDutyStateMapper;

    @Override
    public List<FwDutyState> getDutyState(String site, String resource) {
        FwDutyStateExample example = new FwDutyStateExample();
        FwDutyStateExample.Criteria criteria = example.createCriteria();

        criteria.andSiteEqualTo(site)
                .andResrceEqualTo(resource);

        return fwDutyStateMapper.selectByExample(example);
    }

    @Override
    public List<ZProductionLog> search(ZProductionLog zProductionLog) {
        ZProductionLogExample example = new ZProductionLogExample();
        ZProductionLogExample.Criteria criteria = example.createCriteria();

        criteria.andSiteEqualTo(zProductionLog.getSite())
                .andOperationEqualTo(zProductionLog.getOperation())
                .andSfcEqualTo(zProductionLog.getSfc())
                .andResourceEqualTo(zProductionLog.getResource());

        if(!FwUtils.isNullOrEmpty(zProductionLog.getUser())){
            criteria.andUserEqualTo(zProductionLog.getUser());
        }

        if(zProductionLog.getCreateDateTimeStart() != null){
            criteria.andCreateDateTimeGreaterThanOrEqualTo(zProductionLog.getCreateDateTimeStart());
        }

        if(zProductionLog.getCreateDateTimeEnd() != null){
            criteria.andCreateDateTimeLessThan(zProductionLog.getCreateDateTimeEnd());
        }
        return zProductionLogMapper.selectByExample(example);
    }

    @Override
    public void delete(String sid) {
        zProductionLogMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public void insert(List<ZProductionLog> zProductionLogList) {
        zProductionLogList.forEach(zProductionLogMapper::insert);
    }
}
