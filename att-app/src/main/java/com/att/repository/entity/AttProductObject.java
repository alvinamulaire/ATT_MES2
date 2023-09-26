package com.att.repository.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AttProductObject implements Serializable {
    private String site;

    private String itemBo;

    private String operationBo;

    private BigDecimal dpsObject;

    private BigDecimal mpsObject;

    private Date createdDateTime;

    private Date modifiedDateTime;

    private static final long serialVersionUID = 1L;

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getItemBo() {
        return itemBo;
    }

    public void setItemBo(String itemBo) {
        this.itemBo = itemBo;
    }

    public String getOperationBo() {
        return operationBo;
    }

    public void setOperationBo(String operationBo) {
        this.operationBo = operationBo;
    }

    public BigDecimal getDpsObject() {
        return dpsObject;
    }

    public void setDpsObject(BigDecimal dpsObject) {
        this.dpsObject = dpsObject;
    }

    public BigDecimal getMpsObject() {
        return mpsObject;
    }

    public void setMpsObject(BigDecimal mpsObject) {
        this.mpsObject = mpsObject;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Date getModifiedDateTime() {
        return modifiedDateTime;
    }

    public void setModifiedDateTime(Date modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
    }
}