package com.att.service;


import com.att.domain.certification.CertificationInfo;
import com.att.repository.entity.Certification;

import java.util.List;

public interface CertificationService {

    List<Certification> getCerInfo(Certification certification);

    void importCertification(CertificationInfo certificationInfo);
}

