package com.att.repository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FwDutyStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FwDutyStateExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("SID is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("SID is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("SID =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("SID <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("SID >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("SID >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("SID <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("SID <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("SID like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("SID not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("SID in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("SID not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("SID between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("SID not between", value1, value2, "sid");
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

        public Criteria andWorkCenterIsNull() {
            addCriterion("WORK_CENTER is null");
            return (Criteria) this;
        }

        public Criteria andWorkCenterIsNotNull() {
            addCriterion("WORK_CENTER is not null");
            return (Criteria) this;
        }

        public Criteria andWorkCenterEqualTo(String value) {
            addCriterion("WORK_CENTER =", value, "workCenter");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNotEqualTo(String value) {
            addCriterion("WORK_CENTER <>", value, "workCenter");
            return (Criteria) this;
        }

        public Criteria andWorkCenterGreaterThan(String value) {
            addCriterion("WORK_CENTER >", value, "workCenter");
            return (Criteria) this;
        }

        public Criteria andWorkCenterGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_CENTER >=", value, "workCenter");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLessThan(String value) {
            addCriterion("WORK_CENTER <", value, "workCenter");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLessThanOrEqualTo(String value) {
            addCriterion("WORK_CENTER <=", value, "workCenter");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLike(String value) {
            addCriterion("WORK_CENTER like", value, "workCenter");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNotLike(String value) {
            addCriterion("WORK_CENTER not like", value, "workCenter");
            return (Criteria) this;
        }

        public Criteria andWorkCenterIn(List<String> values) {
            addCriterion("WORK_CENTER in", values, "workCenter");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNotIn(List<String> values) {
            addCriterion("WORK_CENTER not in", values, "workCenter");
            return (Criteria) this;
        }

        public Criteria andWorkCenterBetween(String value1, String value2) {
            addCriterion("WORK_CENTER between", value1, value2, "workCenter");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNotBetween(String value1, String value2) {
            addCriterion("WORK_CENTER not between", value1, value2, "workCenter");
            return (Criteria) this;
        }

        public Criteria andResrceIsNull() {
            addCriterion("RESRCE is null");
            return (Criteria) this;
        }

        public Criteria andResrceIsNotNull() {
            addCriterion("RESRCE is not null");
            return (Criteria) this;
        }

        public Criteria andResrceEqualTo(String value) {
            addCriterion("RESRCE =", value, "resrce");
            return (Criteria) this;
        }

        public Criteria andResrceNotEqualTo(String value) {
            addCriterion("RESRCE <>", value, "resrce");
            return (Criteria) this;
        }

        public Criteria andResrceGreaterThan(String value) {
            addCriterion("RESRCE >", value, "resrce");
            return (Criteria) this;
        }

        public Criteria andResrceGreaterThanOrEqualTo(String value) {
            addCriterion("RESRCE >=", value, "resrce");
            return (Criteria) this;
        }

        public Criteria andResrceLessThan(String value) {
            addCriterion("RESRCE <", value, "resrce");
            return (Criteria) this;
        }

        public Criteria andResrceLessThanOrEqualTo(String value) {
            addCriterion("RESRCE <=", value, "resrce");
            return (Criteria) this;
        }

        public Criteria andResrceLike(String value) {
            addCriterion("RESRCE like", value, "resrce");
            return (Criteria) this;
        }

        public Criteria andResrceNotLike(String value) {
            addCriterion("RESRCE not like", value, "resrce");
            return (Criteria) this;
        }

        public Criteria andResrceIn(List<String> values) {
            addCriterion("RESRCE in", values, "resrce");
            return (Criteria) this;
        }

        public Criteria andResrceNotIn(List<String> values) {
            addCriterion("RESRCE not in", values, "resrce");
            return (Criteria) this;
        }

        public Criteria andResrceBetween(String value1, String value2) {
            addCriterion("RESRCE between", value1, value2, "resrce");
            return (Criteria) this;
        }

        public Criteria andResrceNotBetween(String value1, String value2) {
            addCriterion("RESRCE not between", value1, value2, "resrce");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("USER_NO =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("USER_NO <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("USER_NO >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NO >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("USER_NO <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("USER_NO <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("USER_NO like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("USER_NO not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("USER_NO in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("USER_NO not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("USER_NO between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("USER_NO not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andClockInTimeIsNull() {
            addCriterion("CLOCK_IN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andClockInTimeIsNotNull() {
            addCriterion("CLOCK_IN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andClockInTimeEqualTo(Date value) {
            addCriterion("CLOCK_IN_TIME =", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeNotEqualTo(Date value) {
            addCriterion("CLOCK_IN_TIME <>", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeGreaterThan(Date value) {
            addCriterion("CLOCK_IN_TIME >", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CLOCK_IN_TIME >=", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeLessThan(Date value) {
            addCriterion("CLOCK_IN_TIME <", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeLessThanOrEqualTo(Date value) {
            addCriterion("CLOCK_IN_TIME <=", value, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeIn(List<Date> values) {
            addCriterion("CLOCK_IN_TIME in", values, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeNotIn(List<Date> values) {
            addCriterion("CLOCK_IN_TIME not in", values, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeBetween(Date value1, Date value2) {
            addCriterion("CLOCK_IN_TIME between", value1, value2, "clockInTime");
            return (Criteria) this;
        }

        public Criteria andClockInTimeNotBetween(Date value1, Date value2) {
            addCriterion("CLOCK_IN_TIME not between", value1, value2, "clockInTime");
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