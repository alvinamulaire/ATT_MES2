package com.att.repository.impl;

import com.att.repository.AttDpsRepository;
import com.att.repository.entity.*;
import com.att.repository.mapper.AttDetaileMapper;
import com.att.repository.mapper.AttDpsItemDescMapper;
import com.att.repository.mapper.AttProductObjectMapper;
import com.fw.mes.util.FwUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AttDpsRepositoryImpl implements AttDpsRepository {

    @Autowired
    private AttProductObjectMapper attProductObjectMapper;

    @Autowired
    private AttDpsItemDescMapper attDpsItemDescMapper;

    @Autowired
    private AttDetaileMapper attDetaileMapper;

    //取得
    @Override
    public List<AttDetaile> getDpsdetail(AttDetaile attDetaile) {
        AttDetaileExample example = new AttDetaileExample();
        AttDetaileExample.Criteria criteria = example.createCriteria();

        criteria.andSiteEqualTo(attDetaile.getSite()).andItemEqualTo(attDetaile.getItem()).andProductDayEqualTo(attDetaile.getProductDay());
        return attDetaileMapper.selectByExample(example);
    }

    @Override
    public List<AttDpsItemDesc> getMaterialDesc(String site, String item, String locale) {
        AttDpsItemDescExample example = new AttDpsItemDescExample();
        AttDpsItemDescExample.Criteria criteria = example.createCriteria();

        criteria.andSiteEqualTo(site);

        if (!FwUtils.isNullOrEmpty(item)) {
            criteria.andItemEqualTo(item);
        }

        return attDpsItemDescMapper.selectByExample(locale,example);
    }

    @Override
    public void deleteAttdps(String site, String item_bo,String productDay)  {
        AttProductObjectExample example = new AttProductObjectExample();
        example.createCriteria().andSiteEqualTo(site).andItemBoEqualTo(item_bo).andProductDayEqualTo(productDay);
        attProductObjectMapper.deleteByExample(example);
    }

    @Override
    public void insertAttdps(AttProductObject attProductObject) {
        attProductObjectMapper.insertSelective(attProductObject);
    }
}
