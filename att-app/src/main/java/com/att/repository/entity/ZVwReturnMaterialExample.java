package com.att.repository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZVwReturnMaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZVwReturnMaterialExample() {
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

        public Criteria andInventoryBoIsNull() {
            addCriterion("INVENTORY_BO is null");
            return (Criteria) this;
        }

        public Criteria andInventoryBoIsNotNull() {
            addCriterion("INVENTORY_BO is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryBoEqualTo(String value) {
            addCriterion("INVENTORY_BO =", value, "inventoryBo");
            return (Criteria) this;
        }

        public Criteria andInventoryBoNotEqualTo(String value) {
            addCriterion("INVENTORY_BO <>", value, "inventoryBo");
            return (Criteria) this;
        }

        public Criteria andInventoryBoGreaterThan(String value) {
            addCriterion("INVENTORY_BO >", value, "inventoryBo");
            return (Criteria) this;
        }

        public Criteria andInventoryBoGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_BO >=", value, "inventoryBo");
            return (Criteria) this;
        }

        public Criteria andInventoryBoLessThan(String value) {
            addCriterion("INVENTORY_BO <", value, "inventoryBo");
            return (Criteria) this;
        }

        public Criteria andInventoryBoLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_BO <=", value, "inventoryBo");
            return (Criteria) this;
        }

        public Criteria andInventoryBoLike(String value) {
            addCriterion("INVENTORY_BO like", value, "inventoryBo");
            return (Criteria) this;
        }

        public Criteria andInventoryBoNotLike(String value) {
            addCriterion("INVENTORY_BO not like", value, "inventoryBo");
            return (Criteria) this;
        }

        public Criteria andInventoryBoIn(List<String> values) {
            addCriterion("INVENTORY_BO in", values, "inventoryBo");
            return (Criteria) this;
        }

        public Criteria andInventoryBoNotIn(List<String> values) {
            addCriterion("INVENTORY_BO not in", values, "inventoryBo");
            return (Criteria) this;
        }

        public Criteria andInventoryBoBetween(String value1, String value2) {
            addCriterion("INVENTORY_BO between", value1, value2, "inventoryBo");
            return (Criteria) this;
        }

        public Criteria andInventoryBoNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_BO not between", value1, value2, "inventoryBo");
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

        public Criteria andInventoryIdIsNull() {
            addCriterion("INVENTORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIdIsNotNull() {
            addCriterion("INVENTORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryIdEqualTo(String value) {
            addCriterion("INVENTORY_ID =", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdNotEqualTo(String value) {
            addCriterion("INVENTORY_ID <>", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdGreaterThan(String value) {
            addCriterion("INVENTORY_ID >", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_ID >=", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdLessThan(String value) {
            addCriterion("INVENTORY_ID <", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_ID <=", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdLike(String value) {
            addCriterion("INVENTORY_ID like", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdNotLike(String value) {
            addCriterion("INVENTORY_ID not like", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdIn(List<String> values) {
            addCriterion("INVENTORY_ID in", values, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdNotIn(List<String> values) {
            addCriterion("INVENTORY_ID not in", values, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdBetween(String value1, String value2) {
            addCriterion("INVENTORY_ID between", value1, value2, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_ID not between", value1, value2, "inventoryId");
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

        public Criteria andInventoryContextGboIsNull() {
            addCriterion("INVENTORY_CONTEXT_GBO is null");
            return (Criteria) this;
        }

        public Criteria andInventoryContextGboIsNotNull() {
            addCriterion("INVENTORY_CONTEXT_GBO is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryContextGboEqualTo(String value) {
            addCriterion("INVENTORY_CONTEXT_GBO =", value, "inventoryContextGbo");
            return (Criteria) this;
        }

        public Criteria andInventoryContextGboNotEqualTo(String value) {
            addCriterion("INVENTORY_CONTEXT_GBO <>", value, "inventoryContextGbo");
            return (Criteria) this;
        }

        public Criteria andInventoryContextGboGreaterThan(String value) {
            addCriterion("INVENTORY_CONTEXT_GBO >", value, "inventoryContextGbo");
            return (Criteria) this;
        }

        public Criteria andInventoryContextGboGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_CONTEXT_GBO >=", value, "inventoryContextGbo");
            return (Criteria) this;
        }

        public Criteria andInventoryContextGboLessThan(String value) {
            addCriterion("INVENTORY_CONTEXT_GBO <", value, "inventoryContextGbo");
            return (Criteria) this;
        }

        public Criteria andInventoryContextGboLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_CONTEXT_GBO <=", value, "inventoryContextGbo");
            return (Criteria) this;
        }

        public Criteria andInventoryContextGboLike(String value) {
            addCriterion("INVENTORY_CONTEXT_GBO like", value, "inventoryContextGbo");
            return (Criteria) this;
        }

        public Criteria andInventoryContextGboNotLike(String value) {
            addCriterion("INVENTORY_CONTEXT_GBO not like", value, "inventoryContextGbo");
            return (Criteria) this;
        }

        public Criteria andInventoryContextGboIn(List<String> values) {
            addCriterion("INVENTORY_CONTEXT_GBO in", values, "inventoryContextGbo");
            return (Criteria) this;
        }

        public Criteria andInventoryContextGboNotIn(List<String> values) {
            addCriterion("INVENTORY_CONTEXT_GBO not in", values, "inventoryContextGbo");
            return (Criteria) this;
        }

        public Criteria andInventoryContextGboBetween(String value1, String value2) {
            addCriterion("INVENTORY_CONTEXT_GBO between", value1, value2, "inventoryContextGbo");
            return (Criteria) this;
        }

        public Criteria andInventoryContextGboNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_CONTEXT_GBO not between", value1, value2, "inventoryContextGbo");
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

        public Criteria andQtyOnHandIsNull() {
            addCriterion("QTY_ON_HAND is null");
            return (Criteria) this;
        }

        public Criteria andQtyOnHandIsNotNull() {
            addCriterion("QTY_ON_HAND is not null");
            return (Criteria) this;
        }

        public Criteria andQtyOnHandEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_HAND =", value, "qtyOnHand");
            return (Criteria) this;
        }

        public Criteria andQtyOnHandNotEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_HAND <>", value, "qtyOnHand");
            return (Criteria) this;
        }

        public Criteria andQtyOnHandGreaterThan(BigDecimal value) {
            addCriterion("QTY_ON_HAND >", value, "qtyOnHand");
            return (Criteria) this;
        }

        public Criteria andQtyOnHandGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_HAND >=", value, "qtyOnHand");
            return (Criteria) this;
        }

        public Criteria andQtyOnHandLessThan(BigDecimal value) {
            addCriterion("QTY_ON_HAND <", value, "qtyOnHand");
            return (Criteria) this;
        }

        public Criteria andQtyOnHandLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_HAND <=", value, "qtyOnHand");
            return (Criteria) this;
        }

        public Criteria andQtyOnHandIn(List<BigDecimal> values) {
            addCriterion("QTY_ON_HAND in", values, "qtyOnHand");
            return (Criteria) this;
        }

        public Criteria andQtyOnHandNotIn(List<BigDecimal> values) {
            addCriterion("QTY_ON_HAND not in", values, "qtyOnHand");
            return (Criteria) this;
        }

        public Criteria andQtyOnHandBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ON_HAND between", value1, value2, "qtyOnHand");
            return (Criteria) this;
        }

        public Criteria andQtyOnHandNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ON_HAND not between", value1, value2, "qtyOnHand");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoIsNull() {
            addCriterion("ASSY_DATA_TYPE_BO is null");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoIsNotNull() {
            addCriterion("ASSY_DATA_TYPE_BO is not null");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoEqualTo(String value) {
            addCriterion("ASSY_DATA_TYPE_BO =", value, "assyDataTypeBo");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoNotEqualTo(String value) {
            addCriterion("ASSY_DATA_TYPE_BO <>", value, "assyDataTypeBo");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoGreaterThan(String value) {
            addCriterion("ASSY_DATA_TYPE_BO >", value, "assyDataTypeBo");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoGreaterThanOrEqualTo(String value) {
            addCriterion("ASSY_DATA_TYPE_BO >=", value, "assyDataTypeBo");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoLessThan(String value) {
            addCriterion("ASSY_DATA_TYPE_BO <", value, "assyDataTypeBo");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoLessThanOrEqualTo(String value) {
            addCriterion("ASSY_DATA_TYPE_BO <=", value, "assyDataTypeBo");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoLike(String value) {
            addCriterion("ASSY_DATA_TYPE_BO like", value, "assyDataTypeBo");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoNotLike(String value) {
            addCriterion("ASSY_DATA_TYPE_BO not like", value, "assyDataTypeBo");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoIn(List<String> values) {
            addCriterion("ASSY_DATA_TYPE_BO in", values, "assyDataTypeBo");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoNotIn(List<String> values) {
            addCriterion("ASSY_DATA_TYPE_BO not in", values, "assyDataTypeBo");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoBetween(String value1, String value2) {
            addCriterion("ASSY_DATA_TYPE_BO between", value1, value2, "assyDataTypeBo");
            return (Criteria) this;
        }

        public Criteria andAssyDataTypeBoNotBetween(String value1, String value2) {
            addCriterion("ASSY_DATA_TYPE_BO not between", value1, value2, "assyDataTypeBo");
            return (Criteria) this;
        }

        public Criteria andUsageCountIsNull() {
            addCriterion("USAGE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andUsageCountIsNotNull() {
            addCriterion("USAGE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsageCountEqualTo(BigDecimal value) {
            addCriterion("USAGE_COUNT =", value, "usageCount");
            return (Criteria) this;
        }

        public Criteria andUsageCountNotEqualTo(BigDecimal value) {
            addCriterion("USAGE_COUNT <>", value, "usageCount");
            return (Criteria) this;
        }

        public Criteria andUsageCountGreaterThan(BigDecimal value) {
            addCriterion("USAGE_COUNT >", value, "usageCount");
            return (Criteria) this;
        }

        public Criteria andUsageCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USAGE_COUNT >=", value, "usageCount");
            return (Criteria) this;
        }

        public Criteria andUsageCountLessThan(BigDecimal value) {
            addCriterion("USAGE_COUNT <", value, "usageCount");
            return (Criteria) this;
        }

        public Criteria andUsageCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USAGE_COUNT <=", value, "usageCount");
            return (Criteria) this;
        }

        public Criteria andUsageCountIn(List<BigDecimal> values) {
            addCriterion("USAGE_COUNT in", values, "usageCount");
            return (Criteria) this;
        }

        public Criteria andUsageCountNotIn(List<BigDecimal> values) {
            addCriterion("USAGE_COUNT not in", values, "usageCount");
            return (Criteria) this;
        }

        public Criteria andUsageCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USAGE_COUNT between", value1, value2, "usageCount");
            return (Criteria) this;
        }

        public Criteria andUsageCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USAGE_COUNT not between", value1, value2, "usageCount");
            return (Criteria) this;
        }

        public Criteria andMaximumUsageIsNull() {
            addCriterion("MAXIMUM_USAGE is null");
            return (Criteria) this;
        }

        public Criteria andMaximumUsageIsNotNull() {
            addCriterion("MAXIMUM_USAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumUsageEqualTo(BigDecimal value) {
            addCriterion("MAXIMUM_USAGE =", value, "maximumUsage");
            return (Criteria) this;
        }

        public Criteria andMaximumUsageNotEqualTo(BigDecimal value) {
            addCriterion("MAXIMUM_USAGE <>", value, "maximumUsage");
            return (Criteria) this;
        }

        public Criteria andMaximumUsageGreaterThan(BigDecimal value) {
            addCriterion("MAXIMUM_USAGE >", value, "maximumUsage");
            return (Criteria) this;
        }

        public Criteria andMaximumUsageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXIMUM_USAGE >=", value, "maximumUsage");
            return (Criteria) this;
        }

        public Criteria andMaximumUsageLessThan(BigDecimal value) {
            addCriterion("MAXIMUM_USAGE <", value, "maximumUsage");
            return (Criteria) this;
        }

        public Criteria andMaximumUsageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXIMUM_USAGE <=", value, "maximumUsage");
            return (Criteria) this;
        }

        public Criteria andMaximumUsageIn(List<BigDecimal> values) {
            addCriterion("MAXIMUM_USAGE in", values, "maximumUsage");
            return (Criteria) this;
        }

        public Criteria andMaximumUsageNotIn(List<BigDecimal> values) {
            addCriterion("MAXIMUM_USAGE not in", values, "maximumUsage");
            return (Criteria) this;
        }

        public Criteria andMaximumUsageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXIMUM_USAGE between", value1, value2, "maximumUsage");
            return (Criteria) this;
        }

        public Criteria andMaximumUsageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXIMUM_USAGE not between", value1, value2, "maximumUsage");
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

        public Criteria andOriginalQtyIsNull() {
            addCriterion("ORIGINAL_QTY is null");
            return (Criteria) this;
        }

        public Criteria andOriginalQtyIsNotNull() {
            addCriterion("ORIGINAL_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalQtyEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_QTY =", value, "originalQty");
            return (Criteria) this;
        }

        public Criteria andOriginalQtyNotEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_QTY <>", value, "originalQty");
            return (Criteria) this;
        }

        public Criteria andOriginalQtyGreaterThan(BigDecimal value) {
            addCriterion("ORIGINAL_QTY >", value, "originalQty");
            return (Criteria) this;
        }

        public Criteria andOriginalQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_QTY >=", value, "originalQty");
            return (Criteria) this;
        }

        public Criteria andOriginalQtyLessThan(BigDecimal value) {
            addCriterion("ORIGINAL_QTY <", value, "originalQty");
            return (Criteria) this;
        }

        public Criteria andOriginalQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_QTY <=", value, "originalQty");
            return (Criteria) this;
        }

        public Criteria andOriginalQtyIn(List<BigDecimal> values) {
            addCriterion("ORIGINAL_QTY in", values, "originalQty");
            return (Criteria) this;
        }

        public Criteria andOriginalQtyNotIn(List<BigDecimal> values) {
            addCriterion("ORIGINAL_QTY not in", values, "originalQty");
            return (Criteria) this;
        }

        public Criteria andOriginalQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGINAL_QTY between", value1, value2, "originalQty");
            return (Criteria) this;
        }

        public Criteria andOriginalQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGINAL_QTY not between", value1, value2, "originalQty");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoIsNull() {
            addCriterion("WORK_CENTER_LOC_BO is null");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoIsNotNull() {
            addCriterion("WORK_CENTER_LOC_BO is not null");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoEqualTo(String value) {
            addCriterion("WORK_CENTER_LOC_BO =", value, "workCenterLocBo");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoNotEqualTo(String value) {
            addCriterion("WORK_CENTER_LOC_BO <>", value, "workCenterLocBo");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoGreaterThan(String value) {
            addCriterion("WORK_CENTER_LOC_BO >", value, "workCenterLocBo");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_CENTER_LOC_BO >=", value, "workCenterLocBo");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoLessThan(String value) {
            addCriterion("WORK_CENTER_LOC_BO <", value, "workCenterLocBo");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoLessThanOrEqualTo(String value) {
            addCriterion("WORK_CENTER_LOC_BO <=", value, "workCenterLocBo");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoLike(String value) {
            addCriterion("WORK_CENTER_LOC_BO like", value, "workCenterLocBo");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoNotLike(String value) {
            addCriterion("WORK_CENTER_LOC_BO not like", value, "workCenterLocBo");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoIn(List<String> values) {
            addCriterion("WORK_CENTER_LOC_BO in", values, "workCenterLocBo");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoNotIn(List<String> values) {
            addCriterion("WORK_CENTER_LOC_BO not in", values, "workCenterLocBo");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoBetween(String value1, String value2) {
            addCriterion("WORK_CENTER_LOC_BO between", value1, value2, "workCenterLocBo");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocBoNotBetween(String value1, String value2) {
            addCriterion("WORK_CENTER_LOC_BO not between", value1, value2, "workCenterLocBo");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResIsNull() {
            addCriterion("WORK_CENTER_LOC_RES is null");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResIsNotNull() {
            addCriterion("WORK_CENTER_LOC_RES is not null");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResEqualTo(String value) {
            addCriterion("WORK_CENTER_LOC_RES =", value, "workCenterLocRes");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResNotEqualTo(String value) {
            addCriterion("WORK_CENTER_LOC_RES <>", value, "workCenterLocRes");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResGreaterThan(String value) {
            addCriterion("WORK_CENTER_LOC_RES >", value, "workCenterLocRes");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_CENTER_LOC_RES >=", value, "workCenterLocRes");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResLessThan(String value) {
            addCriterion("WORK_CENTER_LOC_RES <", value, "workCenterLocRes");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResLessThanOrEqualTo(String value) {
            addCriterion("WORK_CENTER_LOC_RES <=", value, "workCenterLocRes");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResLike(String value) {
            addCriterion("WORK_CENTER_LOC_RES like", value, "workCenterLocRes");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResNotLike(String value) {
            addCriterion("WORK_CENTER_LOC_RES not like", value, "workCenterLocRes");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResIn(List<String> values) {
            addCriterion("WORK_CENTER_LOC_RES in", values, "workCenterLocRes");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResNotIn(List<String> values) {
            addCriterion("WORK_CENTER_LOC_RES not in", values, "workCenterLocRes");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResBetween(String value1, String value2) {
            addCriterion("WORK_CENTER_LOC_RES between", value1, value2, "workCenterLocRes");
            return (Criteria) this;
        }

        public Criteria andWorkCenterLocResNotBetween(String value1, String value2) {
            addCriterion("WORK_CENTER_LOC_RES not between", value1, value2, "workCenterLocRes");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoIsNull() {
            addCriterion("OPERATION_LOC_BO is null");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoIsNotNull() {
            addCriterion("OPERATION_LOC_BO is not null");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoEqualTo(String value) {
            addCriterion("OPERATION_LOC_BO =", value, "operationLocBo");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoNotEqualTo(String value) {
            addCriterion("OPERATION_LOC_BO <>", value, "operationLocBo");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoGreaterThan(String value) {
            addCriterion("OPERATION_LOC_BO >", value, "operationLocBo");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_LOC_BO >=", value, "operationLocBo");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoLessThan(String value) {
            addCriterion("OPERATION_LOC_BO <", value, "operationLocBo");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_LOC_BO <=", value, "operationLocBo");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoLike(String value) {
            addCriterion("OPERATION_LOC_BO like", value, "operationLocBo");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoNotLike(String value) {
            addCriterion("OPERATION_LOC_BO not like", value, "operationLocBo");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoIn(List<String> values) {
            addCriterion("OPERATION_LOC_BO in", values, "operationLocBo");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoNotIn(List<String> values) {
            addCriterion("OPERATION_LOC_BO not in", values, "operationLocBo");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoBetween(String value1, String value2) {
            addCriterion("OPERATION_LOC_BO between", value1, value2, "operationLocBo");
            return (Criteria) this;
        }

        public Criteria andOperationLocBoNotBetween(String value1, String value2) {
            addCriterion("OPERATION_LOC_BO not between", value1, value2, "operationLocBo");
            return (Criteria) this;
        }

        public Criteria andOperationLocResIsNull() {
            addCriterion("OPERATION_LOC_RES is null");
            return (Criteria) this;
        }

        public Criteria andOperationLocResIsNotNull() {
            addCriterion("OPERATION_LOC_RES is not null");
            return (Criteria) this;
        }

        public Criteria andOperationLocResEqualTo(String value) {
            addCriterion("OPERATION_LOC_RES =", value, "operationLocRes");
            return (Criteria) this;
        }

        public Criteria andOperationLocResNotEqualTo(String value) {
            addCriterion("OPERATION_LOC_RES <>", value, "operationLocRes");
            return (Criteria) this;
        }

        public Criteria andOperationLocResGreaterThan(String value) {
            addCriterion("OPERATION_LOC_RES >", value, "operationLocRes");
            return (Criteria) this;
        }

        public Criteria andOperationLocResGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_LOC_RES >=", value, "operationLocRes");
            return (Criteria) this;
        }

        public Criteria andOperationLocResLessThan(String value) {
            addCriterion("OPERATION_LOC_RES <", value, "operationLocRes");
            return (Criteria) this;
        }

        public Criteria andOperationLocResLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_LOC_RES <=", value, "operationLocRes");
            return (Criteria) this;
        }

        public Criteria andOperationLocResLike(String value) {
            addCriterion("OPERATION_LOC_RES like", value, "operationLocRes");
            return (Criteria) this;
        }

        public Criteria andOperationLocResNotLike(String value) {
            addCriterion("OPERATION_LOC_RES not like", value, "operationLocRes");
            return (Criteria) this;
        }

        public Criteria andOperationLocResIn(List<String> values) {
            addCriterion("OPERATION_LOC_RES in", values, "operationLocRes");
            return (Criteria) this;
        }

        public Criteria andOperationLocResNotIn(List<String> values) {
            addCriterion("OPERATION_LOC_RES not in", values, "operationLocRes");
            return (Criteria) this;
        }

        public Criteria andOperationLocResBetween(String value1, String value2) {
            addCriterion("OPERATION_LOC_RES between", value1, value2, "operationLocRes");
            return (Criteria) this;
        }

        public Criteria andOperationLocResNotBetween(String value1, String value2) {
            addCriterion("OPERATION_LOC_RES not between", value1, value2, "operationLocRes");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoIsNull() {
            addCriterion("RESOURCE_LOC_BO is null");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoIsNotNull() {
            addCriterion("RESOURCE_LOC_BO is not null");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoEqualTo(String value) {
            addCriterion("RESOURCE_LOC_BO =", value, "resourceLocBo");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoNotEqualTo(String value) {
            addCriterion("RESOURCE_LOC_BO <>", value, "resourceLocBo");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoGreaterThan(String value) {
            addCriterion("RESOURCE_LOC_BO >", value, "resourceLocBo");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_LOC_BO >=", value, "resourceLocBo");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoLessThan(String value) {
            addCriterion("RESOURCE_LOC_BO <", value, "resourceLocBo");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_LOC_BO <=", value, "resourceLocBo");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoLike(String value) {
            addCriterion("RESOURCE_LOC_BO like", value, "resourceLocBo");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoNotLike(String value) {
            addCriterion("RESOURCE_LOC_BO not like", value, "resourceLocBo");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoIn(List<String> values) {
            addCriterion("RESOURCE_LOC_BO in", values, "resourceLocBo");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoNotIn(List<String> values) {
            addCriterion("RESOURCE_LOC_BO not in", values, "resourceLocBo");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoBetween(String value1, String value2) {
            addCriterion("RESOURCE_LOC_BO between", value1, value2, "resourceLocBo");
            return (Criteria) this;
        }

        public Criteria andResourceLocBoNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_LOC_BO not between", value1, value2, "resourceLocBo");
            return (Criteria) this;
        }

        public Criteria andResourceLocResIsNull() {
            addCriterion("RESOURCE_LOC_RES is null");
            return (Criteria) this;
        }

        public Criteria andResourceLocResIsNotNull() {
            addCriterion("RESOURCE_LOC_RES is not null");
            return (Criteria) this;
        }

        public Criteria andResourceLocResEqualTo(String value) {
            addCriterion("RESOURCE_LOC_RES =", value, "resourceLocRes");
            return (Criteria) this;
        }

        public Criteria andResourceLocResNotEqualTo(String value) {
            addCriterion("RESOURCE_LOC_RES <>", value, "resourceLocRes");
            return (Criteria) this;
        }

        public Criteria andResourceLocResGreaterThan(String value) {
            addCriterion("RESOURCE_LOC_RES >", value, "resourceLocRes");
            return (Criteria) this;
        }

        public Criteria andResourceLocResGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_LOC_RES >=", value, "resourceLocRes");
            return (Criteria) this;
        }

        public Criteria andResourceLocResLessThan(String value) {
            addCriterion("RESOURCE_LOC_RES <", value, "resourceLocRes");
            return (Criteria) this;
        }

        public Criteria andResourceLocResLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_LOC_RES <=", value, "resourceLocRes");
            return (Criteria) this;
        }

        public Criteria andResourceLocResLike(String value) {
            addCriterion("RESOURCE_LOC_RES like", value, "resourceLocRes");
            return (Criteria) this;
        }

        public Criteria andResourceLocResNotLike(String value) {
            addCriterion("RESOURCE_LOC_RES not like", value, "resourceLocRes");
            return (Criteria) this;
        }

        public Criteria andResourceLocResIn(List<String> values) {
            addCriterion("RESOURCE_LOC_RES in", values, "resourceLocRes");
            return (Criteria) this;
        }

        public Criteria andResourceLocResNotIn(List<String> values) {
            addCriterion("RESOURCE_LOC_RES not in", values, "resourceLocRes");
            return (Criteria) this;
        }

        public Criteria andResourceLocResBetween(String value1, String value2) {
            addCriterion("RESOURCE_LOC_RES between", value1, value2, "resourceLocRes");
            return (Criteria) this;
        }

        public Criteria andResourceLocResNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_LOC_RES not between", value1, value2, "resourceLocRes");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoIsNull() {
            addCriterion("SHOP_ORDER_LOC_BO is null");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoIsNotNull() {
            addCriterion("SHOP_ORDER_LOC_BO is not null");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoEqualTo(String value) {
            addCriterion("SHOP_ORDER_LOC_BO =", value, "shopOrderLocBo");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoNotEqualTo(String value) {
            addCriterion("SHOP_ORDER_LOC_BO <>", value, "shopOrderLocBo");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoGreaterThan(String value) {
            addCriterion("SHOP_ORDER_LOC_BO >", value, "shopOrderLocBo");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ORDER_LOC_BO >=", value, "shopOrderLocBo");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoLessThan(String value) {
            addCriterion("SHOP_ORDER_LOC_BO <", value, "shopOrderLocBo");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ORDER_LOC_BO <=", value, "shopOrderLocBo");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoLike(String value) {
            addCriterion("SHOP_ORDER_LOC_BO like", value, "shopOrderLocBo");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoNotLike(String value) {
            addCriterion("SHOP_ORDER_LOC_BO not like", value, "shopOrderLocBo");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoIn(List<String> values) {
            addCriterion("SHOP_ORDER_LOC_BO in", values, "shopOrderLocBo");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoNotIn(List<String> values) {
            addCriterion("SHOP_ORDER_LOC_BO not in", values, "shopOrderLocBo");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoBetween(String value1, String value2) {
            addCriterion("SHOP_ORDER_LOC_BO between", value1, value2, "shopOrderLocBo");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocBoNotBetween(String value1, String value2) {
            addCriterion("SHOP_ORDER_LOC_BO not between", value1, value2, "shopOrderLocBo");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResIsNull() {
            addCriterion("SHOP_ORDER_LOC_RES is null");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResIsNotNull() {
            addCriterion("SHOP_ORDER_LOC_RES is not null");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResEqualTo(String value) {
            addCriterion("SHOP_ORDER_LOC_RES =", value, "shopOrderLocRes");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResNotEqualTo(String value) {
            addCriterion("SHOP_ORDER_LOC_RES <>", value, "shopOrderLocRes");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResGreaterThan(String value) {
            addCriterion("SHOP_ORDER_LOC_RES >", value, "shopOrderLocRes");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ORDER_LOC_RES >=", value, "shopOrderLocRes");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResLessThan(String value) {
            addCriterion("SHOP_ORDER_LOC_RES <", value, "shopOrderLocRes");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ORDER_LOC_RES <=", value, "shopOrderLocRes");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResLike(String value) {
            addCriterion("SHOP_ORDER_LOC_RES like", value, "shopOrderLocRes");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResNotLike(String value) {
            addCriterion("SHOP_ORDER_LOC_RES not like", value, "shopOrderLocRes");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResIn(List<String> values) {
            addCriterion("SHOP_ORDER_LOC_RES in", values, "shopOrderLocRes");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResNotIn(List<String> values) {
            addCriterion("SHOP_ORDER_LOC_RES not in", values, "shopOrderLocRes");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResBetween(String value1, String value2) {
            addCriterion("SHOP_ORDER_LOC_RES between", value1, value2, "shopOrderLocRes");
            return (Criteria) this;
        }

        public Criteria andShopOrderLocResNotBetween(String value1, String value2) {
            addCriterion("SHOP_ORDER_LOC_RES not between", value1, value2, "shopOrderLocRes");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpIsNull() {
            addCriterion("SHOP_ORDER_SET_BY_ERP is null");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpIsNotNull() {
            addCriterion("SHOP_ORDER_SET_BY_ERP is not null");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpEqualTo(String value) {
            addCriterion("SHOP_ORDER_SET_BY_ERP =", value, "shopOrderSetByErp");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpNotEqualTo(String value) {
            addCriterion("SHOP_ORDER_SET_BY_ERP <>", value, "shopOrderSetByErp");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpGreaterThan(String value) {
            addCriterion("SHOP_ORDER_SET_BY_ERP >", value, "shopOrderSetByErp");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ORDER_SET_BY_ERP >=", value, "shopOrderSetByErp");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpLessThan(String value) {
            addCriterion("SHOP_ORDER_SET_BY_ERP <", value, "shopOrderSetByErp");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ORDER_SET_BY_ERP <=", value, "shopOrderSetByErp");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpLike(String value) {
            addCriterion("SHOP_ORDER_SET_BY_ERP like", value, "shopOrderSetByErp");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpNotLike(String value) {
            addCriterion("SHOP_ORDER_SET_BY_ERP not like", value, "shopOrderSetByErp");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpIn(List<String> values) {
            addCriterion("SHOP_ORDER_SET_BY_ERP in", values, "shopOrderSetByErp");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpNotIn(List<String> values) {
            addCriterion("SHOP_ORDER_SET_BY_ERP not in", values, "shopOrderSetByErp");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpBetween(String value1, String value2) {
            addCriterion("SHOP_ORDER_SET_BY_ERP between", value1, value2, "shopOrderSetByErp");
            return (Criteria) this;
        }

        public Criteria andShopOrderSetByErpNotBetween(String value1, String value2) {
            addCriterion("SHOP_ORDER_SET_BY_ERP not between", value1, value2, "shopOrderSetByErp");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeIsNull() {
            addCriterion("RECEIVE_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeIsNotNull() {
            addCriterion("RECEIVE_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeEqualTo(Date value) {
            addCriterion("RECEIVE_DATE_TIME =", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeNotEqualTo(Date value) {
            addCriterion("RECEIVE_DATE_TIME <>", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeGreaterThan(Date value) {
            addCriterion("RECEIVE_DATE_TIME >", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_DATE_TIME >=", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeLessThan(Date value) {
            addCriterion("RECEIVE_DATE_TIME <", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_DATE_TIME <=", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeIn(List<Date> values) {
            addCriterion("RECEIVE_DATE_TIME in", values, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeNotIn(List<Date> values) {
            addCriterion("RECEIVE_DATE_TIME not in", values, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_DATE_TIME between", value1, value2, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_DATE_TIME not between", value1, value2, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoIsNull() {
            addCriterion("ORIGINAL_USER_BO is null");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoIsNotNull() {
            addCriterion("ORIGINAL_USER_BO is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoEqualTo(String value) {
            addCriterion("ORIGINAL_USER_BO =", value, "originalUserBo");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoNotEqualTo(String value) {
            addCriterion("ORIGINAL_USER_BO <>", value, "originalUserBo");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoGreaterThan(String value) {
            addCriterion("ORIGINAL_USER_BO >", value, "originalUserBo");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_USER_BO >=", value, "originalUserBo");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoLessThan(String value) {
            addCriterion("ORIGINAL_USER_BO <", value, "originalUserBo");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_USER_BO <=", value, "originalUserBo");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoLike(String value) {
            addCriterion("ORIGINAL_USER_BO like", value, "originalUserBo");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoNotLike(String value) {
            addCriterion("ORIGINAL_USER_BO not like", value, "originalUserBo");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoIn(List<String> values) {
            addCriterion("ORIGINAL_USER_BO in", values, "originalUserBo");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoNotIn(List<String> values) {
            addCriterion("ORIGINAL_USER_BO not in", values, "originalUserBo");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoBetween(String value1, String value2) {
            addCriterion("ORIGINAL_USER_BO between", value1, value2, "originalUserBo");
            return (Criteria) this;
        }

        public Criteria andOriginalUserBoNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_USER_BO not between", value1, value2, "originalUserBo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoIsNull() {
            addCriterion("STORAGE_LOCATION_BO is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoIsNotNull() {
            addCriterion("STORAGE_LOCATION_BO is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_BO =", value, "storageLocationBo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoNotEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_BO <>", value, "storageLocationBo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoGreaterThan(String value) {
            addCriterion("STORAGE_LOCATION_BO >", value, "storageLocationBo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_BO >=", value, "storageLocationBo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoLessThan(String value) {
            addCriterion("STORAGE_LOCATION_BO <", value, "storageLocationBo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoLessThanOrEqualTo(String value) {
            addCriterion("STORAGE_LOCATION_BO <=", value, "storageLocationBo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoLike(String value) {
            addCriterion("STORAGE_LOCATION_BO like", value, "storageLocationBo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoNotLike(String value) {
            addCriterion("STORAGE_LOCATION_BO not like", value, "storageLocationBo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoIn(List<String> values) {
            addCriterion("STORAGE_LOCATION_BO in", values, "storageLocationBo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoNotIn(List<String> values) {
            addCriterion("STORAGE_LOCATION_BO not in", values, "storageLocationBo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoBetween(String value1, String value2) {
            addCriterion("STORAGE_LOCATION_BO between", value1, value2, "storageLocationBo");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBoNotBetween(String value1, String value2) {
            addCriterion("STORAGE_LOCATION_BO not between", value1, value2, "storageLocationBo");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedIsNull() {
            addCriterion("HAS_BEEN_USED is null");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedIsNotNull() {
            addCriterion("HAS_BEEN_USED is not null");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedEqualTo(String value) {
            addCriterion("HAS_BEEN_USED =", value, "hasBeenUsed");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedNotEqualTo(String value) {
            addCriterion("HAS_BEEN_USED <>", value, "hasBeenUsed");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedGreaterThan(String value) {
            addCriterion("HAS_BEEN_USED >", value, "hasBeenUsed");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_BEEN_USED >=", value, "hasBeenUsed");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedLessThan(String value) {
            addCriterion("HAS_BEEN_USED <", value, "hasBeenUsed");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedLessThanOrEqualTo(String value) {
            addCriterion("HAS_BEEN_USED <=", value, "hasBeenUsed");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedLike(String value) {
            addCriterion("HAS_BEEN_USED like", value, "hasBeenUsed");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedNotLike(String value) {
            addCriterion("HAS_BEEN_USED not like", value, "hasBeenUsed");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedIn(List<String> values) {
            addCriterion("HAS_BEEN_USED in", values, "hasBeenUsed");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedNotIn(List<String> values) {
            addCriterion("HAS_BEEN_USED not in", values, "hasBeenUsed");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedBetween(String value1, String value2) {
            addCriterion("HAS_BEEN_USED between", value1, value2, "hasBeenUsed");
            return (Criteria) this;
        }

        public Criteria andHasBeenUsedNotBetween(String value1, String value2) {
            addCriterion("HAS_BEEN_USED not between", value1, value2, "hasBeenUsed");
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

        public Criteria andPartitionDateIsNull() {
            addCriterion("PARTITION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPartitionDateIsNotNull() {
            addCriterion("PARTITION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPartitionDateEqualTo(Date value) {
            addCriterion("PARTITION_DATE =", value, "partitionDate");
            return (Criteria) this;
        }

        public Criteria andPartitionDateNotEqualTo(Date value) {
            addCriterion("PARTITION_DATE <>", value, "partitionDate");
            return (Criteria) this;
        }

        public Criteria andPartitionDateGreaterThan(Date value) {
            addCriterion("PARTITION_DATE >", value, "partitionDate");
            return (Criteria) this;
        }

        public Criteria andPartitionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PARTITION_DATE >=", value, "partitionDate");
            return (Criteria) this;
        }

        public Criteria andPartitionDateLessThan(Date value) {
            addCriterion("PARTITION_DATE <", value, "partitionDate");
            return (Criteria) this;
        }

        public Criteria andPartitionDateLessThanOrEqualTo(Date value) {
            addCriterion("PARTITION_DATE <=", value, "partitionDate");
            return (Criteria) this;
        }

        public Criteria andPartitionDateIn(List<Date> values) {
            addCriterion("PARTITION_DATE in", values, "partitionDate");
            return (Criteria) this;
        }

        public Criteria andPartitionDateNotIn(List<Date> values) {
            addCriterion("PARTITION_DATE not in", values, "partitionDate");
            return (Criteria) this;
        }

        public Criteria andPartitionDateBetween(Date value1, Date value2) {
            addCriterion("PARTITION_DATE between", value1, value2, "partitionDate");
            return (Criteria) this;
        }

        public Criteria andPartitionDateNotBetween(Date value1, Date value2) {
            addCriterion("PARTITION_DATE not between", value1, value2, "partitionDate");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoIsNull() {
            addCriterion("PARENT_INVENTORY_BO is null");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoIsNotNull() {
            addCriterion("PARENT_INVENTORY_BO is not null");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoEqualTo(String value) {
            addCriterion("PARENT_INVENTORY_BO =", value, "parentInventoryBo");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoNotEqualTo(String value) {
            addCriterion("PARENT_INVENTORY_BO <>", value, "parentInventoryBo");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoGreaterThan(String value) {
            addCriterion("PARENT_INVENTORY_BO >", value, "parentInventoryBo");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_INVENTORY_BO >=", value, "parentInventoryBo");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoLessThan(String value) {
            addCriterion("PARENT_INVENTORY_BO <", value, "parentInventoryBo");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoLessThanOrEqualTo(String value) {
            addCriterion("PARENT_INVENTORY_BO <=", value, "parentInventoryBo");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoLike(String value) {
            addCriterion("PARENT_INVENTORY_BO like", value, "parentInventoryBo");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoNotLike(String value) {
            addCriterion("PARENT_INVENTORY_BO not like", value, "parentInventoryBo");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoIn(List<String> values) {
            addCriterion("PARENT_INVENTORY_BO in", values, "parentInventoryBo");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoNotIn(List<String> values) {
            addCriterion("PARENT_INVENTORY_BO not in", values, "parentInventoryBo");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoBetween(String value1, String value2) {
            addCriterion("PARENT_INVENTORY_BO between", value1, value2, "parentInventoryBo");
            return (Criteria) this;
        }

        public Criteria andParentInventoryBoNotBetween(String value1, String value2) {
            addCriterion("PARENT_INVENTORY_BO not between", value1, value2, "parentInventoryBo");
            return (Criteria) this;
        }

        public Criteria andErpInventoryIsNull() {
            addCriterion("ERP_INVENTORY is null");
            return (Criteria) this;
        }

        public Criteria andErpInventoryIsNotNull() {
            addCriterion("ERP_INVENTORY is not null");
            return (Criteria) this;
        }

        public Criteria andErpInventoryEqualTo(String value) {
            addCriterion("ERP_INVENTORY =", value, "erpInventory");
            return (Criteria) this;
        }

        public Criteria andErpInventoryNotEqualTo(String value) {
            addCriterion("ERP_INVENTORY <>", value, "erpInventory");
            return (Criteria) this;
        }

        public Criteria andErpInventoryGreaterThan(String value) {
            addCriterion("ERP_INVENTORY >", value, "erpInventory");
            return (Criteria) this;
        }

        public Criteria andErpInventoryGreaterThanOrEqualTo(String value) {
            addCriterion("ERP_INVENTORY >=", value, "erpInventory");
            return (Criteria) this;
        }

        public Criteria andErpInventoryLessThan(String value) {
            addCriterion("ERP_INVENTORY <", value, "erpInventory");
            return (Criteria) this;
        }

        public Criteria andErpInventoryLessThanOrEqualTo(String value) {
            addCriterion("ERP_INVENTORY <=", value, "erpInventory");
            return (Criteria) this;
        }

        public Criteria andErpInventoryLike(String value) {
            addCriterion("ERP_INVENTORY like", value, "erpInventory");
            return (Criteria) this;
        }

        public Criteria andErpInventoryNotLike(String value) {
            addCriterion("ERP_INVENTORY not like", value, "erpInventory");
            return (Criteria) this;
        }

        public Criteria andErpInventoryIn(List<String> values) {
            addCriterion("ERP_INVENTORY in", values, "erpInventory");
            return (Criteria) this;
        }

        public Criteria andErpInventoryNotIn(List<String> values) {
            addCriterion("ERP_INVENTORY not in", values, "erpInventory");
            return (Criteria) this;
        }

        public Criteria andErpInventoryBetween(String value1, String value2) {
            addCriterion("ERP_INVENTORY between", value1, value2, "erpInventory");
            return (Criteria) this;
        }

        public Criteria andErpInventoryNotBetween(String value1, String value2) {
            addCriterion("ERP_INVENTORY not between", value1, value2, "erpInventory");
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

        public Criteria andItemRevisionIsNull() {
            addCriterion("ITEM_REVISION is null");
            return (Criteria) this;
        }

        public Criteria andItemRevisionIsNotNull() {
            addCriterion("ITEM_REVISION is not null");
            return (Criteria) this;
        }

        public Criteria andItemRevisionEqualTo(String value) {
            addCriterion("ITEM_REVISION =", value, "itemRevision");
            return (Criteria) this;
        }

        public Criteria andItemRevisionNotEqualTo(String value) {
            addCriterion("ITEM_REVISION <>", value, "itemRevision");
            return (Criteria) this;
        }

        public Criteria andItemRevisionGreaterThan(String value) {
            addCriterion("ITEM_REVISION >", value, "itemRevision");
            return (Criteria) this;
        }

        public Criteria andItemRevisionGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_REVISION >=", value, "itemRevision");
            return (Criteria) this;
        }

        public Criteria andItemRevisionLessThan(String value) {
            addCriterion("ITEM_REVISION <", value, "itemRevision");
            return (Criteria) this;
        }

        public Criteria andItemRevisionLessThanOrEqualTo(String value) {
            addCriterion("ITEM_REVISION <=", value, "itemRevision");
            return (Criteria) this;
        }

        public Criteria andItemRevisionLike(String value) {
            addCriterion("ITEM_REVISION like", value, "itemRevision");
            return (Criteria) this;
        }

        public Criteria andItemRevisionNotLike(String value) {
            addCriterion("ITEM_REVISION not like", value, "itemRevision");
            return (Criteria) this;
        }

        public Criteria andItemRevisionIn(List<String> values) {
            addCriterion("ITEM_REVISION in", values, "itemRevision");
            return (Criteria) this;
        }

        public Criteria andItemRevisionNotIn(List<String> values) {
            addCriterion("ITEM_REVISION not in", values, "itemRevision");
            return (Criteria) this;
        }

        public Criteria andItemRevisionBetween(String value1, String value2) {
            addCriterion("ITEM_REVISION between", value1, value2, "itemRevision");
            return (Criteria) this;
        }

        public Criteria andItemRevisionNotBetween(String value1, String value2) {
            addCriterion("ITEM_REVISION not between", value1, value2, "itemRevision");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNull() {
            addCriterion("ITEM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNotNull() {
            addCriterion("ITEM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescEqualTo(String value) {
            addCriterion("ITEM_DESC =", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotEqualTo(String value) {
            addCriterion("ITEM_DESC <>", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThan(String value) {
            addCriterion("ITEM_DESC >", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_DESC >=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThan(String value) {
            addCriterion("ITEM_DESC <", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThanOrEqualTo(String value) {
            addCriterion("ITEM_DESC <=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLike(String value) {
            addCriterion("ITEM_DESC like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotLike(String value) {
            addCriterion("ITEM_DESC not like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescIn(List<String> values) {
            addCriterion("ITEM_DESC in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotIn(List<String> values) {
            addCriterion("ITEM_DESC not in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescBetween(String value1, String value2) {
            addCriterion("ITEM_DESC between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotBetween(String value1, String value2) {
            addCriterion("ITEM_DESC not between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIsNull() {
            addCriterion("BATCH_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIsNotNull() {
            addCriterion("BATCH_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberEqualTo(String value) {
            addCriterion("BATCH_NUMBER =", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotEqualTo(String value) {
            addCriterion("BATCH_NUMBER <>", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThan(String value) {
            addCriterion("BATCH_NUMBER >", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_NUMBER >=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThan(String value) {
            addCriterion("BATCH_NUMBER <", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("BATCH_NUMBER <=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLike(String value) {
            addCriterion("BATCH_NUMBER like", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotLike(String value) {
            addCriterion("BATCH_NUMBER not like", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIn(List<String> values) {
            addCriterion("BATCH_NUMBER in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotIn(List<String> values) {
            addCriterion("BATCH_NUMBER not in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberBetween(String value1, String value2) {
            addCriterion("BATCH_NUMBER between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotBetween(String value1, String value2) {
            addCriterion("BATCH_NUMBER not between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrIsNull() {
            addCriterion("MCH1_LIFNR is null");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrIsNotNull() {
            addCriterion("MCH1_LIFNR is not null");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrEqualTo(String value) {
            addCriterion("MCH1_LIFNR =", value, "mch1Lifnr");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrNotEqualTo(String value) {
            addCriterion("MCH1_LIFNR <>", value, "mch1Lifnr");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrGreaterThan(String value) {
            addCriterion("MCH1_LIFNR >", value, "mch1Lifnr");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrGreaterThanOrEqualTo(String value) {
            addCriterion("MCH1_LIFNR >=", value, "mch1Lifnr");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrLessThan(String value) {
            addCriterion("MCH1_LIFNR <", value, "mch1Lifnr");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrLessThanOrEqualTo(String value) {
            addCriterion("MCH1_LIFNR <=", value, "mch1Lifnr");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrLike(String value) {
            addCriterion("MCH1_LIFNR like", value, "mch1Lifnr");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrNotLike(String value) {
            addCriterion("MCH1_LIFNR not like", value, "mch1Lifnr");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrIn(List<String> values) {
            addCriterion("MCH1_LIFNR in", values, "mch1Lifnr");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrNotIn(List<String> values) {
            addCriterion("MCH1_LIFNR not in", values, "mch1Lifnr");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrBetween(String value1, String value2) {
            addCriterion("MCH1_LIFNR between", value1, value2, "mch1Lifnr");
            return (Criteria) this;
        }

        public Criteria andMch1LifnrNotBetween(String value1, String value2) {
            addCriterion("MCH1_LIFNR not between", value1, value2, "mch1Lifnr");
            return (Criteria) this;
        }

        public Criteria andVendorLotIsNull() {
            addCriterion("VENDOR_LOT is null");
            return (Criteria) this;
        }

        public Criteria andVendorLotIsNotNull() {
            addCriterion("VENDOR_LOT is not null");
            return (Criteria) this;
        }

        public Criteria andVendorLotEqualTo(String value) {
            addCriterion("VENDOR_LOT =", value, "vendorLot");
            return (Criteria) this;
        }

        public Criteria andVendorLotNotEqualTo(String value) {
            addCriterion("VENDOR_LOT <>", value, "vendorLot");
            return (Criteria) this;
        }

        public Criteria andVendorLotGreaterThan(String value) {
            addCriterion("VENDOR_LOT >", value, "vendorLot");
            return (Criteria) this;
        }

        public Criteria andVendorLotGreaterThanOrEqualTo(String value) {
            addCriterion("VENDOR_LOT >=", value, "vendorLot");
            return (Criteria) this;
        }

        public Criteria andVendorLotLessThan(String value) {
            addCriterion("VENDOR_LOT <", value, "vendorLot");
            return (Criteria) this;
        }

        public Criteria andVendorLotLessThanOrEqualTo(String value) {
            addCriterion("VENDOR_LOT <=", value, "vendorLot");
            return (Criteria) this;
        }

        public Criteria andVendorLotLike(String value) {
            addCriterion("VENDOR_LOT like", value, "vendorLot");
            return (Criteria) this;
        }

        public Criteria andVendorLotNotLike(String value) {
            addCriterion("VENDOR_LOT not like", value, "vendorLot");
            return (Criteria) this;
        }

        public Criteria andVendorLotIn(List<String> values) {
            addCriterion("VENDOR_LOT in", values, "vendorLot");
            return (Criteria) this;
        }

        public Criteria andVendorLotNotIn(List<String> values) {
            addCriterion("VENDOR_LOT not in", values, "vendorLot");
            return (Criteria) this;
        }

        public Criteria andVendorLotBetween(String value1, String value2) {
            addCriterion("VENDOR_LOT between", value1, value2, "vendorLot");
            return (Criteria) this;
        }

        public Criteria andVendorLotNotBetween(String value1, String value2) {
            addCriterion("VENDOR_LOT not between", value1, value2, "vendorLot");
            return (Criteria) this;
        }

        public Criteria andMatDocNumIsNull() {
            addCriterion("MAT_DOC_NUM is null");
            return (Criteria) this;
        }

        public Criteria andMatDocNumIsNotNull() {
            addCriterion("MAT_DOC_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andMatDocNumEqualTo(String value) {
            addCriterion("MAT_DOC_NUM =", value, "matDocNum");
            return (Criteria) this;
        }

        public Criteria andMatDocNumNotEqualTo(String value) {
            addCriterion("MAT_DOC_NUM <>", value, "matDocNum");
            return (Criteria) this;
        }

        public Criteria andMatDocNumGreaterThan(String value) {
            addCriterion("MAT_DOC_NUM >", value, "matDocNum");
            return (Criteria) this;
        }

        public Criteria andMatDocNumGreaterThanOrEqualTo(String value) {
            addCriterion("MAT_DOC_NUM >=", value, "matDocNum");
            return (Criteria) this;
        }

        public Criteria andMatDocNumLessThan(String value) {
            addCriterion("MAT_DOC_NUM <", value, "matDocNum");
            return (Criteria) this;
        }

        public Criteria andMatDocNumLessThanOrEqualTo(String value) {
            addCriterion("MAT_DOC_NUM <=", value, "matDocNum");
            return (Criteria) this;
        }

        public Criteria andMatDocNumLike(String value) {
            addCriterion("MAT_DOC_NUM like", value, "matDocNum");
            return (Criteria) this;
        }

        public Criteria andMatDocNumNotLike(String value) {
            addCriterion("MAT_DOC_NUM not like", value, "matDocNum");
            return (Criteria) this;
        }

        public Criteria andMatDocNumIn(List<String> values) {
            addCriterion("MAT_DOC_NUM in", values, "matDocNum");
            return (Criteria) this;
        }

        public Criteria andMatDocNumNotIn(List<String> values) {
            addCriterion("MAT_DOC_NUM not in", values, "matDocNum");
            return (Criteria) this;
        }

        public Criteria andMatDocNumBetween(String value1, String value2) {
            addCriterion("MAT_DOC_NUM between", value1, value2, "matDocNum");
            return (Criteria) this;
        }

        public Criteria andMatDocNumNotBetween(String value1, String value2) {
            addCriterion("MAT_DOC_NUM not between", value1, value2, "matDocNum");
            return (Criteria) this;
        }

        public Criteria andZbMfdateIsNull() {
            addCriterion("ZB_MFDATE is null");
            return (Criteria) this;
        }

        public Criteria andZbMfdateIsNotNull() {
            addCriterion("ZB_MFDATE is not null");
            return (Criteria) this;
        }

        public Criteria andZbMfdateEqualTo(String value) {
            addCriterion("ZB_MFDATE =", value, "zbMfdate");
            return (Criteria) this;
        }

        public Criteria andZbMfdateNotEqualTo(String value) {
            addCriterion("ZB_MFDATE <>", value, "zbMfdate");
            return (Criteria) this;
        }

        public Criteria andZbMfdateGreaterThan(String value) {
            addCriterion("ZB_MFDATE >", value, "zbMfdate");
            return (Criteria) this;
        }

        public Criteria andZbMfdateGreaterThanOrEqualTo(String value) {
            addCriterion("ZB_MFDATE >=", value, "zbMfdate");
            return (Criteria) this;
        }

        public Criteria andZbMfdateLessThan(String value) {
            addCriterion("ZB_MFDATE <", value, "zbMfdate");
            return (Criteria) this;
        }

        public Criteria andZbMfdateLessThanOrEqualTo(String value) {
            addCriterion("ZB_MFDATE <=", value, "zbMfdate");
            return (Criteria) this;
        }

        public Criteria andZbMfdateLike(String value) {
            addCriterion("ZB_MFDATE like", value, "zbMfdate");
            return (Criteria) this;
        }

        public Criteria andZbMfdateNotLike(String value) {
            addCriterion("ZB_MFDATE not like", value, "zbMfdate");
            return (Criteria) this;
        }

        public Criteria andZbMfdateIn(List<String> values) {
            addCriterion("ZB_MFDATE in", values, "zbMfdate");
            return (Criteria) this;
        }

        public Criteria andZbMfdateNotIn(List<String> values) {
            addCriterion("ZB_MFDATE not in", values, "zbMfdate");
            return (Criteria) this;
        }

        public Criteria andZbMfdateBetween(String value1, String value2) {
            addCriterion("ZB_MFDATE between", value1, value2, "zbMfdate");
            return (Criteria) this;
        }

        public Criteria andZbMfdateNotBetween(String value1, String value2) {
            addCriterion("ZB_MFDATE not between", value1, value2, "zbMfdate");
            return (Criteria) this;
        }

        public Criteria andZbExpdateIsNull() {
            addCriterion("ZB_EXPDATE is null");
            return (Criteria) this;
        }

        public Criteria andZbExpdateIsNotNull() {
            addCriterion("ZB_EXPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andZbExpdateEqualTo(String value) {
            addCriterion("ZB_EXPDATE =", value, "zbExpdate");
            return (Criteria) this;
        }

        public Criteria andZbExpdateNotEqualTo(String value) {
            addCriterion("ZB_EXPDATE <>", value, "zbExpdate");
            return (Criteria) this;
        }

        public Criteria andZbExpdateGreaterThan(String value) {
            addCriterion("ZB_EXPDATE >", value, "zbExpdate");
            return (Criteria) this;
        }

        public Criteria andZbExpdateGreaterThanOrEqualTo(String value) {
            addCriterion("ZB_EXPDATE >=", value, "zbExpdate");
            return (Criteria) this;
        }

        public Criteria andZbExpdateLessThan(String value) {
            addCriterion("ZB_EXPDATE <", value, "zbExpdate");
            return (Criteria) this;
        }

        public Criteria andZbExpdateLessThanOrEqualTo(String value) {
            addCriterion("ZB_EXPDATE <=", value, "zbExpdate");
            return (Criteria) this;
        }

        public Criteria andZbExpdateLike(String value) {
            addCriterion("ZB_EXPDATE like", value, "zbExpdate");
            return (Criteria) this;
        }

        public Criteria andZbExpdateNotLike(String value) {
            addCriterion("ZB_EXPDATE not like", value, "zbExpdate");
            return (Criteria) this;
        }

        public Criteria andZbExpdateIn(List<String> values) {
            addCriterion("ZB_EXPDATE in", values, "zbExpdate");
            return (Criteria) this;
        }

        public Criteria andZbExpdateNotIn(List<String> values) {
            addCriterion("ZB_EXPDATE not in", values, "zbExpdate");
            return (Criteria) this;
        }

        public Criteria andZbExpdateBetween(String value1, String value2) {
            addCriterion("ZB_EXPDATE between", value1, value2, "zbExpdate");
            return (Criteria) this;
        }

        public Criteria andZbExpdateNotBetween(String value1, String value2) {
            addCriterion("ZB_EXPDATE not between", value1, value2, "zbExpdate");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationIsNull() {
            addCriterion("CENTRAL_STORAGE_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationIsNotNull() {
            addCriterion("CENTRAL_STORAGE_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationEqualTo(String value) {
            addCriterion("CENTRAL_STORAGE_LOCATION =", value, "centralStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationNotEqualTo(String value) {
            addCriterion("CENTRAL_STORAGE_LOCATION <>", value, "centralStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationGreaterThan(String value) {
            addCriterion("CENTRAL_STORAGE_LOCATION >", value, "centralStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationGreaterThanOrEqualTo(String value) {
            addCriterion("CENTRAL_STORAGE_LOCATION >=", value, "centralStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationLessThan(String value) {
            addCriterion("CENTRAL_STORAGE_LOCATION <", value, "centralStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationLessThanOrEqualTo(String value) {
            addCriterion("CENTRAL_STORAGE_LOCATION <=", value, "centralStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationLike(String value) {
            addCriterion("CENTRAL_STORAGE_LOCATION like", value, "centralStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationNotLike(String value) {
            addCriterion("CENTRAL_STORAGE_LOCATION not like", value, "centralStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationIn(List<String> values) {
            addCriterion("CENTRAL_STORAGE_LOCATION in", values, "centralStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationNotIn(List<String> values) {
            addCriterion("CENTRAL_STORAGE_LOCATION not in", values, "centralStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationBetween(String value1, String value2) {
            addCriterion("CENTRAL_STORAGE_LOCATION between", value1, value2, "centralStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCentralStorageLocationNotBetween(String value1, String value2) {
            addCriterion("CENTRAL_STORAGE_LOCATION not between", value1, value2, "centralStorageLocation");
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