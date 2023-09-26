package com.att.repository.impl;

import com.att.repository.AttDpsRepository;
import com.att.repository.entity.AttProductObject;
import com.att.repository.entity.AttProductObjectExample;
import com.att.repository.mapper.AttProductObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AttDpsRepositoryImpl implements AttDpsRepository {

    @Autowired
    private AttProductObjectMapper attProductObjectMapper;


//    @Override
//    public List<Certification> getCerInfo(Certification certification) {
//        CertificationExample example = new CertificationExample();
//        CertificationExample.Criteria criteria = example.createCriteria();
//
//        criteria.andSiteEqualTo(certification.getSite());
//        return certificationMapper.selectByExample(example);
//    }
//
//    @Override
//    public void deleteCertification(String certification) {
//        CertificationExample example = new CertificationExample();
//        example.createCriteria().andCertificationEqualTo(certification);
//
//        certificationMapper.deleteByExample(example);
//    }

    @Override
    public void deleteAttdps(String site, String item_bo, String operation_bo) {
        AttProductObjectExample example = new AttProductObjectExample();
        example.createCriteria().andSiteEqualTo(site).andItemBoEqualTo(item_bo).andOperationBoEqualTo(operation_bo);
        attProductObjectMapper.deleteByExample(example);
    }

    @Override
    public void insertAttdps(AttProductObject attProductObject) {
        attProductObjectMapper.insertSelective(attProductObject);
    }
}