package com.att.repository.impl;

import com.att.repository.CertestRepository;
import com.att.repository.entity.AttTest;
import com.att.repository.entity.*;
import com.att.repository.mapper.AttTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CertestRepositoryImpl implements CertestRepository {

    @Autowired
    private AttTestMapper attTestMapper;


    @Override
    public void deleteCertest(String testid) {
        AttTestExample example = new AttTestExample();
        example.createCriteria().andTestidEqualTo(testid);

        attTestMapper.deleteByExample(example);
    }

    @Override
    public void insertCertest(AttTest attTest) {
        attTestMapper.insertSelective(attTest);
    }
}
