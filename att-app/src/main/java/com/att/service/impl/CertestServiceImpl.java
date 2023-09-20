package com.att.service.impl;


import com.att.domain.cert.CertDetailInfo;
import com.att.repository.CertestRepository;
import com.att.repository.entity.AttTest;
import com.att.service.CertestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertestServiceImpl implements CertestService {

    @Autowired
    private CertestRepository certestrepository;

    @Override
    public void importCertest( CertDetailInfo certDetailInfo) {
        List<AttTest> detailInfoList = certDetailInfo.getDetailInfoList();
        for (AttTest detail : detailInfoList){
            String testid = detail.getTestid();
            String name = detail.getName();

            //刪除相同資料
            certestrepository.deleteCertest(testid);

            // 寫入
            AttTest attTest1 = new AttTest();
            attTest1.setTestid(testid);
            attTest1.setName(name);
            certestrepository.insertCertest(attTest1);
        }

    }
}

