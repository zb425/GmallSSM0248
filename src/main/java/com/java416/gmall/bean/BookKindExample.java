package com.java416.gmall.bean;

import java.util.ArrayList;
import java.util.List;

public class BookKindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookKindExample() {
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

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(String value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(String value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(String value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(String value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(String value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(String value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLike(String value) {
            addCriterion("b_id like", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotLike(String value) {
            addCriterion("b_id not like", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<String> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<String> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(String value1, String value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(String value1, String value2) {
            addCriterion("b_id not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBNameIsNull() {
            addCriterion("b_name is null");
            return (Criteria) this;
        }

        public Criteria andBNameIsNotNull() {
            addCriterion("b_name is not null");
            return (Criteria) this;
        }

        public Criteria andBNameEqualTo(String value) {
            addCriterion("b_name =", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotEqualTo(String value) {
            addCriterion("b_name <>", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThan(String value) {
            addCriterion("b_name >", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThanOrEqualTo(String value) {
            addCriterion("b_name >=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThan(String value) {
            addCriterion("b_name <", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThanOrEqualTo(String value) {
            addCriterion("b_name <=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLike(String value) {
            addCriterion("b_name like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotLike(String value) {
            addCriterion("b_name not like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameIn(List<String> values) {
            addCriterion("b_name in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotIn(List<String> values) {
            addCriterion("b_name not in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameBetween(String value1, String value2) {
            addCriterion("b_name between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotBetween(String value1, String value2) {
            addCriterion("b_name not between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBStateIsNull() {
            addCriterion("b_state is null");
            return (Criteria) this;
        }

        public Criteria andBStateIsNotNull() {
            addCriterion("b_state is not null");
            return (Criteria) this;
        }

        public Criteria andBStateEqualTo(Integer value) {
            addCriterion("b_state =", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateNotEqualTo(Integer value) {
            addCriterion("b_state <>", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateGreaterThan(Integer value) {
            addCriterion("b_state >", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_state >=", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateLessThan(Integer value) {
            addCriterion("b_state <", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateLessThanOrEqualTo(Integer value) {
            addCriterion("b_state <=", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateIn(List<Integer> values) {
            addCriterion("b_state in", values, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateNotIn(List<Integer> values) {
            addCriterion("b_state not in", values, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateBetween(Integer value1, Integer value2) {
            addCriterion("b_state between", value1, value2, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateNotBetween(Integer value1, Integer value2) {
            addCriterion("b_state not between", value1, value2, "bState");
            return (Criteria) this;
        }

        public Criteria andBCountIsNull() {
            addCriterion("b_count is null");
            return (Criteria) this;
        }

        public Criteria andBCountIsNotNull() {
            addCriterion("b_count is not null");
            return (Criteria) this;
        }

        public Criteria andBCountEqualTo(Integer value) {
            addCriterion("b_count =", value, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountNotEqualTo(Integer value) {
            addCriterion("b_count <>", value, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountGreaterThan(Integer value) {
            addCriterion("b_count >", value, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_count >=", value, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountLessThan(Integer value) {
            addCriterion("b_count <", value, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountLessThanOrEqualTo(Integer value) {
            addCriterion("b_count <=", value, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountIn(List<Integer> values) {
            addCriterion("b_count in", values, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountNotIn(List<Integer> values) {
            addCriterion("b_count not in", values, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountBetween(Integer value1, Integer value2) {
            addCriterion("b_count between", value1, value2, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountNotBetween(Integer value1, Integer value2) {
            addCriterion("b_count not between", value1, value2, "bCount");
            return (Criteria) this;
        }

        public Criteria andBMsgIsNull() {
            addCriterion("b_msg is null");
            return (Criteria) this;
        }

        public Criteria andBMsgIsNotNull() {
            addCriterion("b_msg is not null");
            return (Criteria) this;
        }

        public Criteria andBMsgEqualTo(String value) {
            addCriterion("b_msg =", value, "bMsg");
            return (Criteria) this;
        }

        public Criteria andBMsgNotEqualTo(String value) {
            addCriterion("b_msg <>", value, "bMsg");
            return (Criteria) this;
        }

        public Criteria andBMsgGreaterThan(String value) {
            addCriterion("b_msg >", value, "bMsg");
            return (Criteria) this;
        }

        public Criteria andBMsgGreaterThanOrEqualTo(String value) {
            addCriterion("b_msg >=", value, "bMsg");
            return (Criteria) this;
        }

        public Criteria andBMsgLessThan(String value) {
            addCriterion("b_msg <", value, "bMsg");
            return (Criteria) this;
        }

        public Criteria andBMsgLessThanOrEqualTo(String value) {
            addCriterion("b_msg <=", value, "bMsg");
            return (Criteria) this;
        }

        public Criteria andBMsgLike(String value) {
            addCriterion("b_msg like", value, "bMsg");
            return (Criteria) this;
        }

        public Criteria andBMsgNotLike(String value) {
            addCriterion("b_msg not like", value, "bMsg");
            return (Criteria) this;
        }

        public Criteria andBMsgIn(List<String> values) {
            addCriterion("b_msg in", values, "bMsg");
            return (Criteria) this;
        }

        public Criteria andBMsgNotIn(List<String> values) {
            addCriterion("b_msg not in", values, "bMsg");
            return (Criteria) this;
        }

        public Criteria andBMsgBetween(String value1, String value2) {
            addCriterion("b_msg between", value1, value2, "bMsg");
            return (Criteria) this;
        }

        public Criteria andBMsgNotBetween(String value1, String value2) {
            addCriterion("b_msg not between", value1, value2, "bMsg");
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