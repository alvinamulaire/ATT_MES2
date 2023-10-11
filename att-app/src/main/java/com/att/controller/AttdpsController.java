package com.att.controller;

import com.att.domain.attdomain.AttdpsInfo;
import com.att.repository.entity.AttDetaile;
import com.att.repository.entity.AttDpsItemDesc;
import com.att.service.AttDpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;


@RestController
@CrossOrigin(origins = { "*" })
public class AttdpsController {

    @Autowired
    private AttDpsService attDpsService;

    @PostMapping("attdps/info")
    public  List<AttDetaile> getDpsdetail(@RequestBody AttDetaile attDetaile){
        return  attDpsService.getDpsdetail(attDetaile);
    }

    @GetMapping("attdps/item/get")
    public List<AttDpsItemDesc> getMaterialDesc(@RequestParam("site") String site,
                                                @RequestParam(value = "item", required = false) String item,
                                                Locale locale ) {
        return attDpsService.getMaterialDesc(site, item, locale.toString().toLowerCase());
}

    @PostMapping("attdps/import")
    public void importCertest(@RequestBody AttdpsInfo attdpsInfo) {
        attDpsService.importattdps(attdpsInfo);
    }
}
