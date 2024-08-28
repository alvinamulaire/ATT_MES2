package com.att.domain.productionLog;

import com.att.repository.entity.ZProductionLog;

import java.math.BigDecimal;
import java.util.List;

public class ZProductionLogDTO extends ZProductionLog {

    private String userName;

    private BigDecimal confirmedQty;

    private List<ZProductionLogDTO> zProductionLogList;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getConfirmedQty() {
        return confirmedQty;
    }

    public void setConfirmedQty(BigDecimal confirmedQty) {
        this.confirmedQty = confirmedQty;
    }

    public List<ZProductionLogDTO> getzProductionLogList() {
        return zProductionLogList;
    }

    public void setzProductionLogList(List<ZProductionLogDTO> zProductionLogList) {
        this.zProductionLogList = zProductionLogList;
    }
}
