package com.att.repository;

import com.att.repository.entity.FwDutyState;
import com.att.repository.entity.ZProductionLog;

import java.util.List;

public interface LogUserSfcQtyRepository {

    List<FwDutyState> getDutyState(String site, String resource);

    List<ZProductionLog> search(ZProductionLog zProductionLog);

    void delete(String sid);

    void insert(List<ZProductionLog> zProductionLogList);
}
