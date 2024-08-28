package com.att.repository.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ZProductionLog implements Serializable {
    private String sid;

    private String site;

    private String operation;

    private String resource;

    private String user;

    private String sfc;

    private BigDecimal productionQty;

    private BigDecimal qty;

    private BigDecimal ngQty;

    private Date createDateTime;

    private Date createDateTimeStart;

    private Date createDateTimeEnd;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSfc() {
        return sfc;
    }

    public void setSfc(String sfc) {
        this.sfc = sfc;
    }

    public BigDecimal getProductionQty() {
        return productionQty;
    }

    public void setProductionQty(BigDecimal productionQty) {
        this.productionQty = productionQty;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getNgQty() {
        return ngQty;
    }

    public void setNgQty(BigDecimal ngQty) {
        this.ngQty = ngQty;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Date getCreateDateTimeStart() {
        return createDateTimeStart;
    }

    public void setCreateDateTimeStart(Date createDateTimeStart) {
        this.createDateTimeStart = createDateTimeStart;
    }

    public Date getCreateDateTimeEnd() {
        return createDateTimeEnd;
    }

    public void setCreateDateTimeEnd(Date createDateTimeEnd) {
        this.createDateTimeEnd = createDateTimeEnd;
    }
}