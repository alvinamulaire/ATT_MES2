package com.att.service.impl;


import com.att.domain.certification.CertificationInfo;
import com.att.repository.CertificationRepository;
import com.att.repository.entity.Certification;
import com.att.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

import java.util.List;

@Service
public class CertificationServiceImpl implements CertificationService {

    @Autowired
    private CertificationRepository certificationRepository;

    @Override
    public List<Certification> getCerInfo(Certification certification) {
        String site = certification.getSite();

        Certification certification1 = new Certification();
        certification1.setSite(site);
        List<Certification> list = certificationRepository.getCerInfo(certification1);
        return  list;
    }

    @Override
    public void importCertification( CertificationInfo certificationInfo) {
        List<Certification> detailInfoList = certificationInfo.getDetailInfoList();
        for (Certification detail : detailInfoList){
            String certification = detail.getCertification();

            //刪除相同資料
            certificationRepository.deleteCertification(certification);

            // 寫入
            String description = detail.getDescription();
            String site = certificationInfo.getSite();
            Date currentDate = new Date();
            Certification certification1 = new Certification();
            certification1.setHandle("CertificationBO:"+site+","+ certification);
            certification1.setChangeStamp(null);
            certification1.setSite(site);
            certification1.setCertification(certification);
            certification1.setDescription(description);
            certification1.setRenewalDays(null);
            certification1.setWarningDays(null);
            certification1.setWarningAlarmBo(null);
            certification1.setExpirationAlarmBo(null);
            certification1.setCertificationTypeBo(null);
            certification1.setDurationType("P");
            certification1.setDuration(null);
            certification1.setDurationUnits("M");
            certification1.setStatusBo("StatusBO:"+site+",701");
            certification1.setNumOfExtensions(null);
            certification1.setMaxExtensionDuration(null);
            certification1.setExtensionUnits("M");
            certification1.setCreatedDateTime(currentDate);
            certification1.setModifiedDateTime(currentDate);
            certificationRepository.insertCertification(certification1);
        }

    }
}

