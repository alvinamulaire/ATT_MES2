package com.att.service;

import com.att.domain.productionLog.ZProductionLogDTO;
import com.att.repository.entity.ZProductionLog;

import java.text.ParseException;
import java.util.List;

public interface LogUserSfcQtyService {

    ZProductionLogDTO search(ZProductionLog zProductionLog) throws ParseException;

    void save(List<ZProductionLog> zProductionLogList);
}
