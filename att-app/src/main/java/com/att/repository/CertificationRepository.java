package com.att.repository;

import com.att.repository.entity.Certification;

import java.util.List;

public interface CertificationRepository {

    List<Certification> getCerInfo(Certification certification);

    void deleteCertification(String certification);

    void insertCertification(Certification certification);
}
