package com.att.repository.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class AttDetaile implements Serializable {
    private String site;

    private String item;

    private String operation;

    private BigDecimal dpsobject;

    private BigDecimal mpsobject;

    private String productDay;

    private static final long serialVersionUID = 1L;

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public BigDecimal getDpsobject() {
        return dpsobject;
    }

    public void setDpsobject(BigDecimal dpsobject) {
        this.dpsobject = dpsobject;
    }

    public BigDecimal getMpsobject() {
        return mpsobject;
    }

    public void setMpsobject(BigDecimal mpsobject) {
        this.mpsobject = mpsobject;
    }

    public String getProductDay() {
        return productDay;
    }

    public void setProductDay(String productDay) {
        this.productDay = productDay;
    }
}