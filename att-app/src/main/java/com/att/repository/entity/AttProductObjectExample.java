package com.att.repository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttProductObjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttProductObjectExample() {
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

        public Criteria andItemBoIsNull() {
            addCriterion("ITEM_BO is null");
            return (Criteria) this;
        }

        public Criteria andItemBoIsNotNull() {
            addCriterion("ITEM_BO is not null");
            return (Criteria) this;
        }

        public Criteria andItemBoEqualTo(String value) {
            addCriterion("ITEM_BO =", value, "itemBo");
            return (Criteria) this;
        }

        public Criteria andItemBoNotEqualTo(String value) {
            addCriterion("ITEM_BO <>", value, "itemBo");
            return (Criteria) this;
        }

        public Criteria andItemBoGreaterThan(String value) {
            addCriterion("ITEM_BO >", value, "itemBo");
            return (Criteria) this;
        }

        public Criteria andItemBoGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_BO >=", value, "itemBo");
            return (Criteria) this;
        }

        public Criteria andItemBoLessThan(String value) {
            addCriterion("ITEM_BO <", value, "itemBo");
            return (Criteria) this;
        }

        public Criteria andItemBoLessThanOrEqualTo(String value) {
            addCriterion("ITEM_BO <=", value, "itemBo");
            return (Criteria) this;
        }

        public Criteria andItemBoLike(String value) {
            addCriterion("ITEM_BO like", value, "itemBo");
            return (Criteria) this;
        }

        public Criteria andItemBoNotLike(String value) {
            addCriterion("ITEM_BO not like", value, "itemBo");
            return (Criteria) this;
        }

        public Criteria andItemBoIn(List<String> values) {
            addCriterion("ITEM_BO in", values, "itemBo");
            return (Criteria) this;
        }

        public Criteria andItemBoNotIn(List<String> values) {
            addCriterion("ITEM_BO not in", values, "itemBo");
            return (Criteria) this;
        }

        public Criteria andItemBoBetween(String value1, String value2) {
            addCriterion("ITEM_BO between", value1, value2, "itemBo");
            return (Criteria) this;
        }

        public Criteria andItemBoNotBetween(String value1, String value2) {
            addCriterion("ITEM_BO not between", value1, value2, "itemBo");
            return (Criteria) this;
        }

        public Criteria andOperationBoIsNull() {
            addCriterion("OPERATION_BO is null");
            return (Criteria) this;
        }

        public Criteria andOperationBoIsNotNull() {
            addCriterion("OPERATION_BO is not null");
            return (Criteria) this;
        }

        public Criteria andOperationBoEqualTo(String value) {
            addCriterion("OPERATION_BO =", value, "operationBo");
            return (Criteria) this;
        }

        public Criteria andOperationBoNotEqualTo(String value) {
            addCriterion("OPERATION_BO <>", value, "operationBo");
            return (Criteria) this;
        }

        public Criteria andOperationBoGreaterThan(String value) {
            addCriterion("OPERATION_BO >", value, "operationBo");
            return (Criteria) this;
        }

        public Criteria andOperationBoGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_BO >=", value, "operationBo");
            return (Criteria) this;
        }

        public Criteria andOperationBoLessThan(String value) {
            addCriterion("OPERATION_BO <", value, "operationBo");
            return (Criteria) this;
        }

        public Criteria andOperationBoLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_BO <=", value, "operationBo");
            return (Criteria) this;
        }

        public Criteria andOperationBoLike(String value) {
            addCriterion("OPERATION_BO like", value, "operationBo");
            return (Criteria) this;
        }

        public Criteria andOperationBoNotLike(String value) {
            addCriterion("OPERATION_BO not like", value, "operationBo");
            return (Criteria) this;
        }

        public Criteria andOperationBoIn(List<String> values) {
            addCriterion("OPERATION_BO in", values, "operationBo");
            return (Criteria) this;
        }

        public Criteria andOperationBoNotIn(List<String> values) {
            addCriterion("OPERATION_BO not in", values, "operationBo");
            return (Criteria) this;
        }

        public Criteria andOperationBoBetween(String value1, String value2) {
            addCriterion("OPERATION_BO between", value1, value2, "operationBo");
            return (Criteria) this;
        }

        public Criteria andOperationBoNotBetween(String value1, String value2) {
            addCriterion("OPERATION_BO not between", value1, value2, "operationBo");
            return (Criteria) this;
        }

        public Criteria andDpsObjectIsNull() {
            addCriterion("DPS_OBJECT is null");
            return (Criteria) this;
        }

        public Criteria andDpsObjectIsNotNull() {
            addCriterion("DPS_OBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andDpsObjectEqualTo(BigDecimal value) {
            addCriterion("DPS_OBJECT =", value, "dpsObject");
            return (Criteria) this;
        }

        public Criteria andDpsObjectNotEqualTo(BigDecimal value) {
            addCriterion("DPS_OBJECT <>", value, "dpsObject");
            return (Criteria) this;
        }

        public Criteria andDpsObjectGreaterThan(BigDecimal value) {
            addCriterion("DPS_OBJECT >", value, "dpsObject");
            return (Criteria) this;
        }

        public Criteria andDpsObjectGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DPS_OBJECT >=", value, "dpsObject");
            return (Criteria) this;
        }

        public Criteria andDpsObjectLessThan(BigDecimal value) {
            addCriterion("DPS_OBJECT <", value, "dpsObject");
            return (Criteria) this;
        }

        public Criteria andDpsObjectLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DPS_OBJECT <=", value, "dpsObject");
            return (Criteria) this;
        }

        public Criteria andDpsObjectIn(List<BigDecimal> values) {
            addCriterion("DPS_OBJECT in", values, "dpsObject");
            return (Criteria) this;
        }

        public Criteria andDpsObjectNotIn(List<BigDecimal> values) {
            addCriterion("DPS_OBJECT not in", values, "dpsObject");
            return (Criteria) this;
        }

        public Criteria andDpsObjectBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DPS_OBJECT between", value1, value2, "dpsObject");
            return (Criteria) this;
        }

        public Criteria andDpsObjectNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DPS_OBJECT not between", value1, value2, "dpsObject");
            return (Criteria) this;
        }

        public Criteria andMpsObjectIsNull() {
            addCriterion("MPS_OBJECT is null");
            return (Criteria) this;
        }

        public Criteria andMpsObjectIsNotNull() {
            addCriterion("MPS_OBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andMpsObjectEqualTo(BigDecimal value) {
            addCriterion("MPS_OBJECT =", value, "mpsObject");
            return (Criteria) this;
        }

        public Criteria andMpsObjectNotEqualTo(BigDecimal value) {
            addCriterion("MPS_OBJECT <>", value, "mpsObject");
            return (Criteria) this;
        }

        public Criteria andMpsObjectGreaterThan(BigDecimal value) {
            addCriterion("MPS_OBJECT >", value, "mpsObject");
            return (Criteria) this;
        }

        public Criteria andMpsObjectGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MPS_OBJECT >=", value, "mpsObject");
            return (Criteria) this;
        }

        public Criteria andMpsObjectLessThan(BigDecimal value) {
            addCriterion("MPS_OBJECT <", value, "mpsObject");
            return (Criteria) this;
        }

        public Criteria andMpsObjectLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MPS_OBJECT <=", value, "mpsObject");
            return (Criteria) this;
        }

        public Criteria andMpsObjectIn(List<BigDecimal> values) {
            addCriterion("MPS_OBJECT in", values, "mpsObject");
            return (Criteria) this;
        }

        public Criteria andMpsObjectNotIn(List<BigDecimal> values) {
            addCriterion("MPS_OBJECT not in", values, "mpsObject");
            return (Criteria) this;
        }

        public Criteria andMpsObjectBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPS_OBJECT between", value1, value2, "mpsObject");
            return (Criteria) this;
        }

        public Criteria andMpsObjectNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPS_OBJECT not between", value1, value2, "mpsObject");
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