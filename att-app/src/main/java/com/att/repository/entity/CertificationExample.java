package com.att.repository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CertificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertificationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHandleIsNull() {
            addCriterion("HANDLE is null");
            return (Criteria) this;
        }

        public Criteria andHandleIsNotNull() {
            addCriterion("HANDLE is not null");
            return (Criteria) this;
        }

        public Criteria andHandleEqualTo(String value) {
            addCriterion("HANDLE =", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleNotEqualTo(String value) {
            addCriterion("HANDLE <>", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleGreaterThan(String value) {
            addCriterion("HANDLE >", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLE >=", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleLessThan(String value) {
            addCriterion("HANDLE <", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleLessThanOrEqualTo(String value) {
            addCriterion("HANDLE <=", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleLike(String value) {
            addCriterion("HANDLE like", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleNotLike(String value) {
            addCriterion("HANDLE not like", value, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleIn(List<String> values) {
            addCriterion("HANDLE in", values, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleNotIn(List<String> values) {
            addCriterion("HANDLE not in", values, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleBetween(String value1, String value2) {
            addCriterion("HANDLE between", value1, value2, "handle");
            return (Criteria) this;
        }

        public Criteria andHandleNotBetween(String value1, String value2) {
            addCriterion("HANDLE not between", value1, value2, "handle");
            return (Criteria) this;
        }

        public Criteria andChangeStampIsNull() {
            addCriterion("CHANGE_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andChangeStampIsNotNull() {
            addCriterion("CHANGE_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andChangeStampEqualTo(BigDecimal value) {
            addCriterion("CHANGE_STAMP =", value, "changeStamp");
            return (Criteria) this;
        }

        public Criteria andChangeStampNotEqualTo(BigDecimal value) {
            addCriterion("CHANGE_STAMP <>", value, "changeStamp");
            return (Criteria) this;
        }

        public Criteria andChangeStampGreaterThan(BigDecimal value) {
            addCriterion("CHANGE_STAMP >", value, "changeStamp");
            return (Criteria) this;
        }

        public Criteria andChangeStampGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANGE_STAMP >=", value, "changeStamp");
            return (Criteria) this;
        }

        public Criteria andChangeStampLessThan(BigDecimal value) {
            addCriterion("CHANGE_STAMP <", value, "changeStamp");
            return (Criteria) this;
        }

        public Criteria andChangeStampLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANGE_STAMP <=", value, "changeStamp");
            return (Criteria) this;
        }

        public Criteria andChangeStampIn(List<BigDecimal> values) {
            addCriterion("CHANGE_STAMP in", values, "changeStamp");
            return (Criteria) this;
        }

        public Criteria andChangeStampNotIn(List<BigDecimal> values) {
            addCriterion("CHANGE_STAMP not in", values, "changeStamp");
            return (Criteria) this;
        }

        public Criteria andChangeStampBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANGE_STAMP between", value1, value2, "changeStamp");
            return (Criteria) this;
        }

        public Criteria andChangeStampNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANGE_STAMP not between", value1, value2, "changeStamp");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("SITE is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("SITE is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("SITE =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("SITE <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("SITE >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("SITE >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("SITE <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("SITE <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("SITE like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("SITE not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("SITE in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("SITE not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("SITE between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("SITE not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andCertificationIsNull() {
            addCriterion("CERTIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andCertificationIsNotNull() {
            addCriterion("CERTIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationEqualTo(String value) {
            addCriterion("CERTIFICATION =", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationNotEqualTo(String value) {
            addCriterion("CERTIFICATION <>", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationGreaterThan(String value) {
            addCriterion("CERTIFICATION >", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATION >=", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationLessThan(String value) {
            addCriterion("CERTIFICATION <", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATION <=", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationLike(String value) {
            addCriterion("CERTIFICATION like", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationNotLike(String value) {
            addCriterion("CERTIFICATION not like", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationIn(List<String> values) {
            addCriterion("CERTIFICATION in", values, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationNotIn(List<String> values) {
            addCriterion("CERTIFICATION not in", values, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationBetween(String value1, String value2) {
            addCriterion("CERTIFICATION between", value1, value2, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATION not between", value1, value2, "certification");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysIsNull() {
            addCriterion("RENEWAL_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysIsNotNull() {
            addCriterion("RENEWAL_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysEqualTo(BigDecimal value) {
            addCriterion("RENEWAL_DAYS =", value, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysNotEqualTo(BigDecimal value) {
            addCriterion("RENEWAL_DAYS <>", value, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysGreaterThan(BigDecimal value) {
            addCriterion("RENEWAL_DAYS >", value, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RENEWAL_DAYS >=", value, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysLessThan(BigDecimal value) {
            addCriterion("RENEWAL_DAYS <", value, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RENEWAL_DAYS <=", value, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysIn(List<BigDecimal> values) {
            addCriterion("RENEWAL_DAYS in", values, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysNotIn(List<BigDecimal> values) {
            addCriterion("RENEWAL_DAYS not in", values, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENEWAL_DAYS between", value1, value2, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andRenewalDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENEWAL_DAYS not between", value1, value2, "renewalDays");
            return (Criteria) this;
        }

        public Criteria andWarningDaysIsNull() {
            addCriterion("WARNING_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andWarningDaysIsNotNull() {
            addCriterion("WARNING_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andWarningDaysEqualTo(BigDecimal value) {
            addCriterion("WARNING_DAYS =", value, "warningDays");
            return (Criteria) this;
        }

        public Criteria andWarningDaysNotEqualTo(BigDecimal value) {
            addCriterion("WARNING_DAYS <>", value, "warningDays");
            return (Criteria) this;
        }

        public Criteria andWarningDaysGreaterThan(BigDecimal value) {
            addCriterion("WARNING_DAYS >", value, "warningDays");
            return (Criteria) this;
        }

        public Criteria andWarningDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WARNING_DAYS >=", value, "warningDays");
            return (Criteria) this;
        }

        public Criteria andWarningDaysLessThan(BigDecimal value) {
            addCriterion("WARNING_DAYS <", value, "warningDays");
            return (Criteria) this;
        }

        public Criteria andWarningDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WARNING_DAYS <=", value, "warningDays");
            return (Criteria) this;
        }

        public Criteria andWarningDaysIn(List<BigDecimal> values) {
            addCriterion("WARNING_DAYS in", values, "warningDays");
            return (Criteria) this;
        }

        public Criteria andWarningDaysNotIn(List<BigDecimal> values) {
            addCriterion("WARNING_DAYS not in", values, "warningDays");
            return (Criteria) this;
        }

        public Criteria andWarningDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WARNING_DAYS between", value1, value2, "warningDays");
            return (Criteria) this;
        }

        public Criteria andWarningDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WARNING_DAYS not between", value1, value2, "warningDays");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoIsNull() {
            addCriterion("WARNING_ALARM_BO is null");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoIsNotNull() {
            addCriterion("WARNING_ALARM_BO is not null");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoEqualTo(String value) {
            addCriterion("WARNING_ALARM_BO =", value, "warningAlarmBo");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoNotEqualTo(String value) {
            addCriterion("WARNING_ALARM_BO <>", value, "warningAlarmBo");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoGreaterThan(String value) {
            addCriterion("WARNING_ALARM_BO >", value, "warningAlarmBo");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoGreaterThanOrEqualTo(String value) {
            addCriterion("WARNING_ALARM_BO >=", value, "warningAlarmBo");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoLessThan(String value) {
            addCriterion("WARNING_ALARM_BO <", value, "warningAlarmBo");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoLessThanOrEqualTo(String value) {
            addCriterion("WARNING_ALARM_BO <=", value, "warningAlarmBo");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoLike(String value) {
            addCriterion("WARNING_ALARM_BO like", value, "warningAlarmBo");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoNotLike(String value) {
            addCriterion("WARNING_ALARM_BO not like", value, "warningAlarmBo");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoIn(List<String> values) {
            addCriterion("WARNING_ALARM_BO in", values, "warningAlarmBo");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoNotIn(List<String> values) {
            addCriterion("WARNING_ALARM_BO not in", values, "warningAlarmBo");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoBetween(String value1, String value2) {
            addCriterion("WARNING_ALARM_BO between", value1, value2, "warningAlarmBo");
            return (Criteria) this;
        }

        public Criteria andWarningAlarmBoNotBetween(String value1, String value2) {
            addCriterion("WARNING_ALARM_BO not between", value1, value2, "warningAlarmBo");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoIsNull() {
            addCriterion("EXPIRATION_ALARM_BO is null");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoIsNotNull() {
            addCriterion("EXPIRATION_ALARM_BO is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoEqualTo(String value) {
            addCriterion("EXPIRATION_ALARM_BO =", value, "expirationAlarmBo");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoNotEqualTo(String value) {
            addCriterion("EXPIRATION_ALARM_BO <>", value, "expirationAlarmBo");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoGreaterThan(String value) {
            addCriterion("EXPIRATION_ALARM_BO >", value, "expirationAlarmBo");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoGreaterThanOrEqualTo(String value) {
            addCriterion("EXPIRATION_ALARM_BO >=", value, "expirationAlarmBo");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoLessThan(String value) {
            addCriterion("EXPIRATION_ALARM_BO <", value, "expirationAlarmBo");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoLessThanOrEqualTo(String value) {
            addCriterion("EXPIRATION_ALARM_BO <=", value, "expirationAlarmBo");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoLike(String value) {
            addCriterion("EXPIRATION_ALARM_BO like", value, "expirationAlarmBo");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoNotLike(String value) {
            addCriterion("EXPIRATION_ALARM_BO not like", value, "expirationAlarmBo");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoIn(List<String> values) {
            addCriterion("EXPIRATION_ALARM_BO in", values, "expirationAlarmBo");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoNotIn(List<String> values) {
            addCriterion("EXPIRATION_ALARM_BO not in", values, "expirationAlarmBo");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoBetween(String value1, String value2) {
            addCriterion("EXPIRATION_ALARM_BO between", value1, value2, "expirationAlarmBo");
            return (Criteria) this;
        }

        public Criteria andExpirationAlarmBoNotBetween(String value1, String value2) {
            addCriterion("EXPIRATION_ALARM_BO not between", value1, value2, "expirationAlarmBo");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoIsNull() {
            addCriterion("CERTIFICATION_TYPE_BO is null");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoIsNotNull() {
            addCriterion("CERTIFICATION_TYPE_BO is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoEqualTo(String value) {
            addCriterion("CERTIFICATION_TYPE_BO =", value, "certificationTypeBo");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoNotEqualTo(String value) {
            addCriterion("CERTIFICATION_TYPE_BO <>", value, "certificationTypeBo");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoGreaterThan(String value) {
            addCriterion("CERTIFICATION_TYPE_BO >", value, "certificationTypeBo");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATION_TYPE_BO >=", value, "certificationTypeBo");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoLessThan(String value) {
            addCriterion("CERTIFICATION_TYPE_BO <", value, "certificationTypeBo");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATION_TYPE_BO <=", value, "certificationTypeBo");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoLike(String value) {
            addCriterion("CERTIFICATION_TYPE_BO like", value, "certificationTypeBo");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoNotLike(String value) {
            addCriterion("CERTIFICATION_TYPE_BO not like", value, "certificationTypeBo");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoIn(List<String> values) {
            addCriterion("CERTIFICATION_TYPE_BO in", values, "certificationTypeBo");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoNotIn(List<String> values) {
            addCriterion("CERTIFICATION_TYPE_BO not in", values, "certificationTypeBo");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoBetween(String value1, String value2) {
            addCriterion("CERTIFICATION_TYPE_BO between", value1, value2, "certificationTypeBo");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBoNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATION_TYPE_BO not between", value1, value2, "certificationTypeBo");
            return (Criteria) this;
        }

        public Criteria andDurationTypeIsNull() {
            addCriterion("DURATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDurationTypeIsNotNull() {
            addCriterion("DURATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDurationTypeEqualTo(String value) {
            addCriterion("DURATION_TYPE =", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeNotEqualTo(String value) {
            addCriterion("DURATION_TYPE <>", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeGreaterThan(String value) {
            addCriterion("DURATION_TYPE >", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DURATION_TYPE >=", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeLessThan(String value) {
            addCriterion("DURATION_TYPE <", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeLessThanOrEqualTo(String value) {
            addCriterion("DURATION_TYPE <=", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeLike(String value) {
            addCriterion("DURATION_TYPE like", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeNotLike(String value) {
            addCriterion("DURATION_TYPE not like", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeIn(List<String> values) {
            addCriterion("DURATION_TYPE in", values, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeNotIn(List<String> values) {
            addCriterion("DURATION_TYPE not in", values, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeBetween(String value1, String value2) {
            addCriterion("DURATION_TYPE between", value1, value2, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeNotBetween(String value1, String value2) {
            addCriterion("DURATION_TYPE not between", value1, value2, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(BigDecimal value) {
            addCriterion("DURATION =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(BigDecimal value) {
            addCriterion("DURATION <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(BigDecimal value) {
            addCriterion("DURATION >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DURATION >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(BigDecimal value) {
            addCriterion("DURATION <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DURATION <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<BigDecimal> values) {
            addCriterion("DURATION in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<BigDecimal> values) {
            addCriterion("DURATION not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DURATION between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DURATION not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsIsNull() {
            addCriterion("DURATION_UNITS is null");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsIsNotNull() {
            addCriterion("DURATION_UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsEqualTo(String value) {
            addCriterion("DURATION_UNITS =", value, "durationUnits");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsNotEqualTo(String value) {
            addCriterion("DURATION_UNITS <>", value, "durationUnits");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsGreaterThan(String value) {
            addCriterion("DURATION_UNITS >", value, "durationUnits");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("DURATION_UNITS >=", value, "durationUnits");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsLessThan(String value) {
            addCriterion("DURATION_UNITS <", value, "durationUnits");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsLessThanOrEqualTo(String value) {
            addCriterion("DURATION_UNITS <=", value, "durationUnits");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsLike(String value) {
            addCriterion("DURATION_UNITS like", value, "durationUnits");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsNotLike(String value) {
            addCriterion("DURATION_UNITS not like", value, "durationUnits");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsIn(List<String> values) {
            addCriterion("DURATION_UNITS in", values, "durationUnits");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsNotIn(List<String> values) {
            addCriterion("DURATION_UNITS not in", values, "durationUnits");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsBetween(String value1, String value2) {
            addCriterion("DURATION_UNITS between", value1, value2, "durationUnits");
            return (Criteria) this;
        }

        public Criteria andDurationUnitsNotBetween(String value1, String value2) {
            addCriterion("DURATION_UNITS not between", value1, value2, "durationUnits");
            return (Criteria) this;
        }

        public Criteria andStatusBoIsNull() {
            addCriterion("STATUS_BO is null");
            return (Criteria) this;
        }

        public Criteria andStatusBoIsNotNull() {
            addCriterion("STATUS_BO is not null");
            return (Criteria) this;
        }

        public Criteria andStatusBoEqualTo(String value) {
            addCriterion("STATUS_BO =", value, "statusBo");
            return (Criteria) this;
        }

        public Criteria andStatusBoNotEqualTo(String value) {
            addCriterion("STATUS_BO <>", value, "statusBo");
            return (Criteria) this;
        }

        public Criteria andStatusBoGreaterThan(String value) {
            addCriterion("STATUS_BO >", value, "statusBo");
            return (Criteria) this;
        }

        public Criteria andStatusBoGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_BO >=", value, "statusBo");
            return (Criteria) this;
        }

        public Criteria andStatusBoLessThan(String value) {
            addCriterion("STATUS_BO <", value, "statusBo");
            return (Criteria) this;
        }

        public Criteria andStatusBoLessThanOrEqualTo(String value) {
            addCriterion("STATUS_BO <=", value, "statusBo");
            return (Criteria) this;
        }

        public Criteria andStatusBoLike(String value) {
            addCriterion("STATUS_BO like", value, "statusBo");
            return (Criteria) this;
        }

        public Criteria andStatusBoNotLike(String value) {
            addCriterion("STATUS_BO not like", value, "statusBo");
            return (Criteria) this;
        }

        public Criteria andStatusBoIn(List<String> values) {
            addCriterion("STATUS_BO in", values, "statusBo");
            return (Criteria) this;
        }

        public Criteria andStatusBoNotIn(List<String> values) {
            addCriterion("STATUS_BO not in", values, "statusBo");
            return (Criteria) this;
        }

        public Criteria andStatusBoBetween(String value1, String value2) {
            addCriterion("STATUS_BO between", value1, value2, "statusBo");
            return (Criteria) this;
        }

        public Criteria andStatusBoNotBetween(String value1, String value2) {
            addCriterion("STATUS_BO not between", value1, value2, "statusBo");
            return (Criteria) this;
        }

        public Criteria andNumOfExtensionsIsNull() {
            addCriterion("NUM_OF_EXTENSIONS is null");
            return (Criteria) this;
        }

        public Criteria andNumOfExtensionsIsNotNull() {
            addCriterion("NUM_OF_EXTENSIONS is not null");
            return (Criteria) this;
        }

        public Criteria andNumOfExtensionsEqualTo(BigDecimal value) {
            addCriterion("NUM_OF_EXTENSIONS =", value, "numOfExtensions");
            return (Criteria) this;
        }

        public Criteria andNumOfExtensionsNotEqualTo(BigDecimal value) {
            addCriterion("NUM_OF_EXTENSIONS <>", value, "numOfExtensions");
            return (Criteria) this;
        }

        public Criteria andNumOfExtensionsGreaterThan(BigDecimal value) {
            addCriterion("NUM_OF_EXTENSIONS >", value, "numOfExtensions");
            return (Criteria) this;
        }

        public Criteria andNumOfExtensionsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_OF_EXTENSIONS >=", value, "numOfExtensions");
            return (Criteria) this;
        }

        public Criteria andNumOfExtensionsLessThan(BigDecimal value) {
            addCriterion("NUM_OF_EXTENSIONS <", value, "numOfExtensions");
            return (Criteria) this;
        }

        public Criteria andNumOfExtensionsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_OF_EXTENSIONS <=", value, "numOfExtensions");
            return (Criteria) this;
        }

        public Criteria andNumOfExtensionsIn(List<BigDecimal> values) {
            addCriterion("NUM_OF_EXTENSIONS in", values, "numOfExtensions");
            return (Criteria) this;
        }

        public Criteria andNumOfExtensionsNotIn(List<BigDecimal> values) {
            addCriterion("NUM_OF_EXTENSIONS not in", values, "numOfExtensions");
            return (Criteria) this;
        }

        public Criteria andNumOfExtensionsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_OF_EXTENSIONS between", value1, value2, "numOfExtensions");
            return (Criteria) this;
        }

        public Criteria andNumOfExtensionsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_OF_EXTENSIONS not between", value1, value2, "numOfExtensions");
            return (Criteria) this;
        }

        public Criteria andMaxExtensionDurationIsNull() {
            addCriterion("MAX_EXTENSION_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andMaxExtensionDurationIsNotNull() {
            addCriterion("MAX_EXTENSION_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andMaxExtensionDurationEqualTo(BigDecimal value) {
            addCriterion("MAX_EXTENSION_DURATION =", value, "maxExtensionDuration");
            return (Criteria) this;
        }

        public Criteria andMaxExtensionDurationNotEqualTo(BigDecimal value) {
            addCriterion("MAX_EXTENSION_DURATION <>", value, "maxExtensionDuration");
            return (Criteria) this;
        }

        public Criteria andMaxExtensionDurationGreaterThan(BigDecimal value) {
            addCriterion("MAX_EXTENSION_DURATION >", value, "maxExtensionDuration");
            return (Criteria) this;
        }

        public Criteria andMaxExtensionDurationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_EXTENSION_DURATION >=", value, "maxExtensionDuration");
            return (Criteria) this;
        }

        public Criteria andMaxExtensionDurationLessThan(BigDecimal value) {
            addCriterion("MAX_EXTENSION_DURATION <", value, "maxExtensionDuration");
            return (Criteria) this;
        }

        public Criteria andMaxExtensionDurationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_EXTENSION_DURATION <=", value, "maxExtensionDuration");
            return (Criteria) this;
        }

        public Criteria andMaxExtensionDurationIn(List<BigDecimal> values) {
            addCriterion("MAX_EXTENSION_DURATION in", values, "maxExtensionDuration");
            return (Criteria) this;
        }

        public Criteria andMaxExtensionDurationNotIn(List<BigDecimal> values) {
            addCriterion("MAX_EXTENSION_DURATION not in", values, "maxExtensionDuration");
            return (Criteria) this;
        }

        public Criteria andMaxExtensionDurationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_EXTENSION_DURATION between", value1, value2, "maxExtensionDuration");
            return (Criteria) this;
        }

        public Criteria andMaxExtensionDurationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_EXTENSION_DURATION not between", value1, value2, "maxExtensionDuration");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsIsNull() {
            addCriterion("EXTENSION_UNITS is null");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsIsNotNull() {
            addCriterion("EXTENSION_UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsEqualTo(String value) {
            addCriterion("EXTENSION_UNITS =", value, "extensionUnits");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsNotEqualTo(String value) {
            addCriterion("EXTENSION_UNITS <>", value, "extensionUnits");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsGreaterThan(String value) {
            addCriterion("EXTENSION_UNITS >", value, "extensionUnits");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("EXTENSION_UNITS >=", value, "extensionUnits");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsLessThan(String value) {
            addCriterion("EXTENSION_UNITS <", value, "extensionUnits");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsLessThanOrEqualTo(String value) {
            addCriterion("EXTENSION_UNITS <=", value, "extensionUnits");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsLike(String value) {
            addCriterion("EXTENSION_UNITS like", value, "extensionUnits");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsNotLike(String value) {
            addCriterion("EXTENSION_UNITS not like", value, "extensionUnits");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsIn(List<String> values) {
            addCriterion("EXTENSION_UNITS in", values, "extensionUnits");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsNotIn(List<String> values) {
            addCriterion("EXTENSION_UNITS not in", values, "extensionUnits");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsBetween(String value1, String value2) {
            addCriterion("EXTENSION_UNITS between", value1, value2, "extensionUnits");
            return (Criteria) this;
        }

        public Criteria andExtensionUnitsNotBetween(String value1, String value2) {
            addCriterion("EXTENSION_UNITS not between", value1, value2, "extensionUnits");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeIsNull() {
            addCriterion("CREATED_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeIsNotNull() {
            addCriterion("CREATED_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeEqualTo(Date value) {
            addCriterion("CREATED_DATE_TIME =", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeNotEqualTo(Date value) {
            addCriterion("CREATED_DATE_TIME <>", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeGreaterThan(Date value) {
            addCriterion("CREATED_DATE_TIME >", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE_TIME >=", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeLessThan(Date value) {
            addCriterion("CREATED_DATE_TIME <", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE_TIME <=", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeIn(List<Date> values) {
            addCriterion("CREATED_DATE_TIME in", values, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeNotIn(List<Date> values) {
            addCriterion("CREATED_DATE_TIME not in", values, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE_TIME between", value1, value2, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE_TIME not between", value1, value2, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andModifiedDateTimeIsNull() {
            addCriterion("MODIFIED_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateTimeIsNotNull() {
            addCriterion("MODIFIED_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateTimeEqualTo(Date value) {
            addCriterion("MODIFIED_DATE_TIME =", value, "modifiedDateTime");
            return (Criteria) this;
        }

        public Criteria andModifiedDateTimeNotEqualTo(Date value) {
            addCriterion("MODIFIED_DATE_TIME <>", value, "modifiedDateTime");
            return (Criteria) this;
        }

        public Criteria andModifiedDateTimeGreaterThan(Date value) {
            addCriterion("MODIFIED_DATE_TIME >", value, "modifiedDateTime");
            return (Criteria) this;
        }

        public Criteria andModifiedDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_DATE_TIME >=", value, "modifiedDateTime");
            return (Criteria) this;
        }

        public Criteria andModifiedDateTimeLessThan(Date value) {
            addCriterion("MODIFIED_DATE_TIME <", value, "modifiedDateTime");
            return (Criteria) this;
        }

        public Criteria andModifiedDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_DATE_TIME <=", value, "modifiedDateTime");
            return (Criteria) this;
        }

        public Criteria andModifiedDateTimeIn(List<Date> values) {
            addCriterion("MODIFIED_DATE_TIME in", values, "modifiedDateTime");
            return (Criteria) this;
        }

        public Criteria andModifiedDateTimeNotIn(List<Date> values) {
            addCriterion("MODIFIED_DATE_TIME not in", values, "modifiedDateTime");
            return (Criteria) this;
        }

        public Criteria andModifiedDateTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_DATE_TIME between", value1, value2, "modifiedDateTime");
            return (Criteria) this;
        }

        public Criteria andModifiedDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_DATE_TIME not between", value1, value2, "modifiedDateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}