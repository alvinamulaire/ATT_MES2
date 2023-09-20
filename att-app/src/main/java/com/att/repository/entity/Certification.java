package com.att.repository.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Certification implements Serializable {
    private String handle;

    private BigDecimal changeStamp;

    private String site;

    private String certification;

    private String description;

    private BigDecimal renewalDays;

    private BigDecimal warningDays;

    private String warningAlarmBo;

    private String expirationAlarmBo;

    private String certificationTypeBo;

    private String durationType;

    private BigDecimal duration;

    private String durationUnits;

    private String statusBo;

    private BigDecimal numOfExtensions;

    private BigDecimal maxExtensionDuration;

    private String extensionUnits;

    private Date createdDateTime;

    private Date modifiedDateTime;

    private static final long serialVersionUID = 1L;

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public BigDecimal getChangeStamp() {
        return changeStamp;
    }

    public void setChangeStamp(BigDecimal changeStamp) {
        this.changeStamp = changeStamp;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getRenewalDays() {
        return renewalDays;
    }

    public void setRenewalDays(BigDecimal renewalDays) {
        this.renewalDays = renewalDays;
    }

    public BigDecimal getWarningDays() {
        return warningDays;
    }

    public void setWarningDays(BigDecimal warningDays) {
        this.warningDays = warningDays;
    }

    public String getWarningAlarmBo() {
        return warningAlarmBo;
    }

    public void setWarningAlarmBo(String warningAlarmBo) {
        this.warningAlarmBo = warningAlarmBo;
    }

    public String getExpirationAlarmBo() {
        return expirationAlarmBo;
    }

    public void setExpirationAlarmBo(String expirationAlarmBo) {
        this.expirationAlarmBo = expirationAlarmBo;
    }

    public String getCertificationTypeBo() {
        return certificationTypeBo;
    }

    public void setCertificationTypeBo(String certificationTypeBo) {
        this.certificationTypeBo = certificationTypeBo;
    }

    public String getDurationType() {
        return durationType;
    }

    public void setDurationType(String durationType) {
        this.durationType = durationType;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public String getDurationUnits() {
        return durationUnits;
    }

    public void setDurationUnits(String durationUnits) {
        this.durationUnits = durationUnits;
    }

    public String getStatusBo() {
        return statusBo;
    }

    public void setStatusBo(String statusBo) {
        this.statusBo = statusBo;
    }

    public BigDecimal getNumOfExtensions() {
        return numOfExtensions;
    }

    public void setNumOfExtensions(BigDecimal numOfExtensions) {
        this.numOfExtensions = numOfExtensions;
    }

    public BigDecimal getMaxExtensionDuration() {
        return maxExtensionDuration;
    }

    public void setMaxExtensionDuration(BigDecimal maxExtensionDuration) {
        this.maxExtensionDuration = maxExtensionDuration;
    }

    public String getExtensionUnits() {
        return extensionUnits;
    }

    public void setExtensionUnits(String extensionUnits) {
        this.extensionUnits = extensionUnits;
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