package com.att.repository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AttDetaileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttDetaileExample() {
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

        public Criteria andItemIsNull() {
            addCriterion("ITEM is null");
            return (Criteria) this;
        }

        public Criteria andItemIsNotNull() {
            addCriterion("ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andItemEqualTo(String value) {
            addCriterion("ITEM =", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotEqualTo(String value) {
            addCriterion("ITEM <>", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemGreaterThan(String value) {
            addCriterion("ITEM >", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM >=", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLessThan(String value) {
            addCriterion("ITEM <", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLessThanOrEqualTo(String value) {
            addCriterion("ITEM <=", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLike(String value) {
            addCriterion("ITEM like", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotLike(String value) {
            addCriterion("ITEM not like", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemIn(List<String> values) {
            addCriterion("ITEM in", values, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotIn(List<String> values) {
            addCriterion("ITEM not in", values, "item");
            return (Criteria) this;
        }

        public Criteria andItemBetween(String value1, String value2) {
            addCriterion("ITEM between", value1, value2, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotBetween(String value1, String value2) {
            addCriterion("ITEM not between", value1, value2, "item");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("OPERATION is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("OPERATION is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(String value) {
            addCriterion("OPERATION =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("OPERATION <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(String value) {
            addCriterion("OPERATION >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(String value) {
            addCriterion("OPERATION <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("OPERATION <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLike(String value) {
            addCriterion("OPERATION like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotLike(String value) {
            addCriterion("OPERATION not like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<String> values) {
            addCriterion("OPERATION in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("OPERATION not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("OPERATION between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("OPERATION not between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andDpsobjectIsNull() {
            addCriterion("DPSOBJECT is null");
            return (Criteria) this;
        }

        public Criteria andDpsobjectIsNotNull() {
            addCriterion("DPSOBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andDpsobjectEqualTo(BigDecimal value) {
            addCriterion("DPSOBJECT =", value, "dpsobject");
            return (Criteria) this;
        }

        public Criteria andDpsobjectNotEqualTo(BigDecimal value) {
            addCriterion("DPSOBJECT <>", value, "dpsobject");
            return (Criteria) this;
        }

        public Criteria andDpsobjectGreaterThan(BigDecimal value) {
            addCriterion("DPSOBJECT >", value, "dpsobject");
            return (Criteria) this;
        }

        public Criteria andDpsobjectGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DPSOBJECT >=", value, "dpsobject");
            return (Criteria) this;
        }

        public Criteria andDpsobjectLessThan(BigDecimal value) {
            addCriterion("DPSOBJECT <", value, "dpsobject");
            return (Criteria) this;
        }

        public Criteria andDpsobjectLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DPSOBJECT <=", value, "dpsobject");
            return (Criteria) this;
        }

        public Criteria andDpsobjectIn(List<BigDecimal> values) {
            addCriterion("DPSOBJECT in", values, "dpsobject");
            return (Criteria) this;
        }

        public Criteria andDpsobjectNotIn(List<BigDecimal> values) {
            addCriterion("DPSOBJECT not in", values, "dpsobject");
            return (Criteria) this;
        }

        public Criteria andDpsobjectBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DPSOBJECT between", value1, value2, "dpsobject");
            return (Criteria) this;
        }

        public Criteria andDpsobjectNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DPSOBJECT not between", value1, value2, "dpsobject");
            return (Criteria) this;
        }

        public Criteria andMpsobjectIsNull() {
            addCriterion("MPSOBJECT is null");
            return (Criteria) this;
        }

        public Criteria andMpsobjectIsNotNull() {
            addCriterion("MPSOBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andMpsobjectEqualTo(BigDecimal value) {
            addCriterion("MPSOBJECT =", value, "mpsobject");
            return (Criteria) this;
        }

        public Criteria andMpsobjectNotEqualTo(BigDecimal value) {
            addCriterion("MPSOBJECT <>", value, "mpsobject");
            return (Criteria) this;
        }

        public Criteria andMpsobjectGreaterThan(BigDecimal value) {
            addCriterion("MPSOBJECT >", value, "mpsobject");
            return (Criteria) this;
        }

        public Criteria andMpsobjectGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MPSOBJECT >=", value, "mpsobject");
            return (Criteria) this;
        }

        public Criteria andMpsobjectLessThan(BigDecimal value) {
            addCriterion("MPSOBJECT <", value, "mpsobject");
            return (Criteria) this;
        }

        public Criteria andMpsobjectLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MPSOBJECT <=", value, "mpsobject");
            return (Criteria) this;
        }

        public Criteria andMpsobjectIn(List<BigDecimal> values) {
            addCriterion("MPSOBJECT in", values, "mpsobject");
            return (Criteria) this;
        }

        public Criteria andMpsobjectNotIn(List<BigDecimal> values) {
            addCriterion("MPSOBJECT not in", values, "mpsobject");
            return (Criteria) this;
        }

        public Criteria andMpsobjectBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPSOBJECT between", value1, value2, "mpsobject");
            return (Criteria) this;
        }

        public Criteria andMpsobjectNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPSOBJECT not between", value1, value2, "mpsobject");
            return (Criteria) this;
        }

        public Criteria andProductDayIsNull() {
            addCriterion("PRODUCT_DAY is null");
            return (Criteria) this;
        }

        public Criteria andProductDayIsNotNull() {
            addCriterion("PRODUCT_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andProductDayEqualTo(String value) {
            addCriterion("PRODUCT_DAY =", value, "productDay");
            return (Criteria) this;
        }

        public Criteria andProductDayNotEqualTo(String value) {
            addCriterion("PRODUCT_DAY <>", value, "productDay");
            return (Criteria) this;
        }

        public Criteria andProductDayGreaterThan(String value) {
            addCriterion("PRODUCT_DAY >", value, "productDay");
            return (Criteria) this;
        }

        public Criteria andProductDayGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DAY >=", value, "productDay");
            return (Criteria) this;
        }

        public Criteria andProductDayLessThan(String value) {
            addCriterion("PRODUCT_DAY <", value, "productDay");
            return (Criteria) this;
        }

        public Criteria andProductDayLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DAY <=", value, "productDay");
            return (Criteria) this;
        }

        public Criteria andProductDayLike(String value) {
            addCriterion("PRODUCT_DAY like", value, "productDay");
            return (Criteria) this;
        }

        public Criteria andProductDayNotLike(String value) {
            addCriterion("PRODUCT_DAY not like", value, "productDay");
            return (Criteria) this;
        }

        public Criteria andProductDayIn(List<String> values) {
            addCriterion("PRODUCT_DAY in", values, "productDay");
            return (Criteria) this;
        }

        public Criteria andProductDayNotIn(List<String> values) {
            addCriterion("PRODUCT_DAY not in", values, "productDay");
            return (Criteria) this;
        }

        public Criteria andProductDayBetween(String value1, String value2) {
            addCriterion("PRODUCT_DAY between", value1, value2, "productDay");
            return (Criteria) this;
        }

        public Criteria andProductDayNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_DAY not between", value1, value2, "productDay");
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