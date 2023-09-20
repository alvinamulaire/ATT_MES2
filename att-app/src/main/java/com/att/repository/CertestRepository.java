package com.att.repository;

import com.att.repository.entity.AttTest;

public interface CertestRepository {

    void deleteCertest(String testid);

    void insertCertest(AttTest attTest);
}
