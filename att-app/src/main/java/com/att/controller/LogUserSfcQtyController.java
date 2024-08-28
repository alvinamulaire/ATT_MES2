package com.att.controller;

import com.att.domain.productionLog.ZProductionLogDTO;
import com.att.repository.entity.ZProductionLog;
import com.att.service.LogUserSfcQtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@CrossOrigin(origins = { "*" })
public class LogUserSfcQtyController {

    @Autowired
    private LogUserSfcQtyService logUserSfcQtyService;

    @GetMapping("logSfc/search")
    public ZProductionLogDTO search(@RequestParam("site") String site,
                                    @RequestParam("operation") String operation,
                                    @RequestParam("sfc") String sfc,
                                    @RequestParam("resource") String resource,
                                    @RequestParam("user") String user) throws ParseException {
        ZProductionLog zProductionLog = new ZProductionLog();
        zProductionLog.setSite(site);
        zProductionLog.setUser(user);
        zProductionLog.setOperation(operation);
        zProductionLog.setSfc(sfc);
        zProductionLog.setResource(resource);
        return logUserSfcQtyService.search(zProductionLog);
    }

    @PostMapping("logSfc/save")
    public void save(@RequestBody List<ZProductionLog> zProductionLogList) {
        logUserSfcQtyService.save(zProductionLogList);
    }
}
