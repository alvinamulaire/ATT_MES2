package com.att.repository.impl;

import com.att.repository.CertificationRepository;
import com.att.repository.entity.Certification;
import com.att.repository.entity.CertificationExample;
import com.att.repository.mapper.CertificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CertificationRepositoryImpl implements CertificationRepository {

    @Autowired
    private CertificationMapper certificationMapper;


    @Override
    public List<Certification> getCerInfo(Certification certification) {
        CertificationExample example = new CertificationExample();
        CertificationExample.Criteria criteria = example.createCriteria();

        criteria.andSiteEqualTo(certification.getSite());
        return certificationMapper.selectByExample(example);
    }

    @Override
    public void deleteCertification(String certification) {
        CertificationExample example = new CertificationExample();
        example.createCriteria().andCertificationEqualTo(certification);

        certificationMapper.deleteByExample(example);
    }

    @Override
    public void insertCertification(Certification certification) {
        certificationMapper.insertSelective(certification);
    }
}
