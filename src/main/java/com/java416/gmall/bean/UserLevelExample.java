package com.java416.gmall.bean;

import java.util.ArrayList;
import java.util.List;

public class UserLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLevelExample() {
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

        public Criteria andLIdIsNull() {
            addCriterion("l_id is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("l_id is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(String value) {
            addCriterion("l_id =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(String value) {
            addCriterion("l_id <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(String value) {
            addCriterion("l_id >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(String value) {
            addCriterion("l_id >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(String value) {
            addCriterion("l_id <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(String value) {
            addCriterion("l_id <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLike(String value) {
            addCriterion("l_id like", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotLike(String value) {
            addCriterion("l_id not like", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<String> values) {
            addCriterion("l_id in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<String> values) {
            addCriterion("l_id not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(String value1, String value2) {
            addCriterion("l_id between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(String value1, String value2) {
            addCriterion("l_id not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLNameIsNull() {
            addCriterion("l_name is null");
            return (Criteria) this;
        }

        public Criteria andLNameIsNotNull() {
            addCriterion("l_name is not null");
            return (Criteria) this;
        }

        public Criteria andLNameEqualTo(String value) {
            addCriterion("l_name =", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotEqualTo(String value) {
            addCriterion("l_name <>", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThan(String value) {
            addCriterion("l_name >", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThanOrEqualTo(String value) {
            addCriterion("l_name >=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThan(String value) {
            addCriterion("l_name <", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThanOrEqualTo(String value) {
            addCriterion("l_name <=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLike(String value) {
            addCriterion("l_name like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotLike(String value) {
            addCriterion("l_name not like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameIn(List<String> values) {
            addCriterion("l_name in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotIn(List<String> values) {
            addCriterion("l_name not in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameBetween(String value1, String value2) {
            addCriterion("l_name between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotBetween(String value1, String value2) {
            addCriterion("l_name not between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLCzzhiIsNull() {
            addCriterion("l_czzhi is null");
            return (Criteria) this;
        }

        public Criteria andLCzzhiIsNotNull() {
            addCriterion("l_czzhi is not null");
            return (Criteria) this;
        }

        public Criteria andLCzzhiEqualTo(Integer value) {
            addCriterion("l_czzhi =", value, "lCzzhi");
            return (Criteria) this;
        }

        public Criteria andLCzzhiNotEqualTo(Integer value) {
            addCriterion("l_czzhi <>", value, "lCzzhi");
            return (Criteria) this;
        }

        public Criteria andLCzzhiGreaterThan(Integer value) {
            addCriterion("l_czzhi >", value, "lCzzhi");
            return (Criteria) this;
        }

        public Criteria andLCzzhiGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_czzhi >=", value, "lCzzhi");
            return (Criteria) this;
        }

        public Criteria andLCzzhiLessThan(Integer value) {
            addCriterion("l_czzhi <", value, "lCzzhi");
            return (Criteria) this;
        }

        public Criteria andLCzzhiLessThanOrEqualTo(Integer value) {
            addCriterion("l_czzhi <=", value, "lCzzhi");
            return (Criteria) this;
        }

        public Criteria andLCzzhiIn(List<Integer> values) {
            addCriterion("l_czzhi in", values, "lCzzhi");
            return (Criteria) this;
        }

        public Criteria andLCzzhiNotIn(List<Integer> values) {
            addCriterion("l_czzhi not in", values, "lCzzhi");
            return (Criteria) this;
        }

        public Criteria andLCzzhiBetween(Integer value1, Integer value2) {
            addCriterion("l_czzhi between", value1, value2, "lCzzhi");
            return (Criteria) this;
        }

        public Criteria andLCzzhiNotBetween(Integer value1, Integer value2) {
            addCriterion("l_czzhi not between", value1, value2, "lCzzhi");
            return (Criteria) this;
        }

        public Criteria andLDiscountIsNull() {
            addCriterion("l_discount is null");
            return (Criteria) this;
        }

        public Criteria andLDiscountIsNotNull() {
            addCriterion("l_discount is not null");
            return (Criteria) this;
        }

        public Criteria andLDiscountEqualTo(Float value) {
            addCriterion("l_discount =", value, "lDiscount");
            return (Criteria) this;
        }

        public Criteria andLDiscountNotEqualTo(Float value) {
            addCriterion("l_discount <>", value, "lDiscount");
            return (Criteria) this;
        }

        public Criteria andLDiscountGreaterThan(Float value) {
            addCriterion("l_discount >", value, "lDiscount");
            return (Criteria) this;
        }

        public Criteria andLDiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("l_discount >=", value, "lDiscount");
            return (Criteria) this;
        }

        public Criteria andLDiscountLessThan(Float value) {
            addCriterion("l_discount <", value, "lDiscount");
            return (Criteria) this;
        }

        public Criteria andLDiscountLessThanOrEqualTo(Float value) {
            addCriterion("l_discount <=", value, "lDiscount");
            return (Criteria) this;
        }

        public Criteria andLDiscountIn(List<Float> values) {
            addCriterion("l_discount in", values, "lDiscount");
            return (Criteria) this;
        }

        public Criteria andLDiscountNotIn(List<Float> values) {
            addCriterion("l_discount not in", values, "lDiscount");
            return (Criteria) this;
        }

        public Criteria andLDiscountBetween(Float value1, Float value2) {
            addCriterion("l_discount between", value1, value2, "lDiscount");
            return (Criteria) this;
        }

        public Criteria andLDiscountNotBetween(Float value1, Float value2) {
            addCriterion("l_discount not between", value1, value2, "lDiscount");
            return (Criteria) this;
        }

        public Criteria andLMeberIsNull() {
            addCriterion("l_meber is null");
            return (Criteria) this;
        }

        public Criteria andLMeberIsNotNull() {
            addCriterion("l_meber is not null");
            return (Criteria) this;
        }

        public Criteria andLMeberEqualTo(String value) {
            addCriterion("l_meber =", value, "lMeber");
            return (Criteria) this;
        }

        public Criteria andLMeberNotEqualTo(String value) {
            addCriterion("l_meber <>", value, "lMeber");
            return (Criteria) this;
        }

        public Criteria andLMeberGreaterThan(String value) {
            addCriterion("l_meber >", value, "lMeber");
            return (Criteria) this;
        }

        public Criteria andLMeberGreaterThanOrEqualTo(String value) {
            addCriterion("l_meber >=", value, "lMeber");
            return (Criteria) this;
        }

        public Criteria andLMeberLessThan(String value) {
            addCriterion("l_meber <", value, "lMeber");
            return (Criteria) this;
        }

        public Criteria andLMeberLessThanOrEqualTo(String value) {
            addCriterion("l_meber <=", value, "lMeber");
            return (Criteria) this;
        }

        public Criteria andLMeberLike(String value) {
            addCriterion("l_meber like", value, "lMeber");
            return (Criteria) this;
        }

        public Criteria andLMeberNotLike(String value) {
            addCriterion("l_meber not like", value, "lMeber");
            return (Criteria) this;
        }

        public Criteria andLMeberIn(List<String> values) {
            addCriterion("l_meber in", values, "lMeber");
            return (Criteria) this;
        }

        public Criteria andLMeberNotIn(List<String> values) {
            addCriterion("l_meber not in", values, "lMeber");
            return (Criteria) this;
        }

        public Criteria andLMeberBetween(String value1, String value2) {
            addCriterion("l_meber between", value1, value2, "lMeber");
            return (Criteria) this;
        }

        public Criteria andLMeberNotBetween(String value1, String value2) {
            addCriterion("l_meber not between", value1, value2, "lMeber");
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