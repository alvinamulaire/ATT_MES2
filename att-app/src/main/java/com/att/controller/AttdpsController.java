package com.att.controller;

import com.att.domain.attdomain.AttdpsInfo;
import com.att.service.AttDpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = { "*" })
public class AttdpsController {

    @Autowired
    private AttDpsService attDpsService;

//ex.
//    @PostMapping("certest/import")
//    public void importCertest(@RequestBody CertDetailInfo certDetailInfo) {
//        certestservice.importCertest(certDetailInfo);
//    }

//    @PostMapping("certification/info")
//    public List<Certification> getCerInfo(@RequestBody Certification certification){
//        return  certificationService.getCerInfo(certification);
//    }

    @PostMapping("attdps/import")
    public void importCertest(@RequestBody AttdpsInfo attdpsInfo) {
        attDpsService.importattdps(attdpsInfo);
    }
}
