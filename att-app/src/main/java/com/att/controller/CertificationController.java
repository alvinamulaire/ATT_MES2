package com.att.controller;

import com.att.domain.cert.CertDetailInfo;
import com.att.domain.certification.CertificationInfo;
import com.att.repository.entity.Certification;
import com.att.service.CertestService;
import com.att.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = { "*" })
public class CertificationController {

    @Autowired
    private CertestService certestservice;

    @Autowired
    private CertificationService certificationService;

//ex.
//    @PostMapping("certest/import")
//    public void importCertest(@RequestBody CertDetailInfo certDetailInfo) {
//        certestservice.importCertest(certDetailInfo);
//    }

    @PostMapping("certification/info")
    public List<Certification> getCerInfo(@RequestBody Certification certification){
        return  certificationService.getCerInfo(certification);
    }

    @PostMapping("certification/import")
    public void importCertest(@RequestBody CertificationInfo certificationInfo) {
        certificationService.importCertification(certificationInfo);
    }
}
