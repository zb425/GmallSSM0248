package com.java416.gmall.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryComeSendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LibraryComeSendExample() {
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

        public Criteria andLibraryCsIdIsNull() {
            addCriterion("library_cs_id is null");
            return (Criteria) this;
        }

        public Criteria andLibraryCsIdIsNotNull() {
            addCriterion("library_cs_id is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryCsIdEqualTo(String value) {
            addCriterion("library_cs_id =", value, "libraryCsId");
            return (Criteria) this;
        }

        public Criteria andLibraryCsIdNotEqualTo(String value) {
            addCriterion("library_cs_id <>", value, "libraryCsId");
            return (Criteria) this;
        }

        public Criteria andLibraryCsIdGreaterThan(String value) {
            addCriterion("library_cs_id >", value, "libraryCsId");
            return (Criteria) this;
        }

        public Criteria andLibraryCsIdGreaterThanOrEqualTo(String value) {
            addCriterion("library_cs_id >=", value, "libraryCsId");
            return (Criteria) this;
        }

        public Criteria andLibraryCsIdLessThan(String value) {
            addCriterion("library_cs_id <", value, "libraryCsId");
            return (Criteria) this;
        }

        public Criteria andLibraryCsIdLessThanOrEqualTo(String value) {
            addCriterion("library_cs_id <=", value, "libraryCsId");
            return (Criteria) this;
        }

        public Criteria andLibraryCsIdLike(String value) {
            addCriterion("library_cs_id like", value, "libraryCsId");
            return (Criteria) this;
        }

        public Criteria andLibraryCsIdNotLike(String value) {
            addCriterion("library_cs_id not like", value, "libraryCsId");
            return (Criteria) this;
        }

        public Criteria andLibraryCsIdIn(List<String> values) {
            addCriterion("library_cs_id in", values, "libraryCsId");
            return (Criteria) this;
        }

        public Criteria andLibraryCsIdNotIn(List<String> values) {
            addCriterion("library_cs_id not in", values, "libraryCsId");
            return (Criteria) this;
        }

        public Criteria andLibraryCsIdBetween(String value1, String value2) {
            addCriterion("library_cs_id between", value1, value2, "libraryCsId");
            return (Criteria) this;
        }

        public Criteria andLibraryCsIdNotBetween(String value1, String value2) {
            addCriterion("library_cs_id not between", value1, value2, "libraryCsId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdIsNull() {
            addCriterion("library_id is null");
            return (Criteria) this;
        }

        public Criteria andLibraryIdIsNotNull() {
            addCriterion("library_id is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryIdEqualTo(String value) {
            addCriterion("library_id =", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdNotEqualTo(String value) {
            addCriterion("library_id <>", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdGreaterThan(String value) {
            addCriterion("library_id >", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdGreaterThanOrEqualTo(String value) {
            addCriterion("library_id >=", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdLessThan(String value) {
            addCriterion("library_id <", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdLessThanOrEqualTo(String value) {
            addCriterion("library_id <=", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdLike(String value) {
            addCriterion("library_id like", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdNotLike(String value) {
            addCriterion("library_id not like", value, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdIn(List<String> values) {
            addCriterion("library_id in", values, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdNotIn(List<String> values) {
            addCriterion("library_id not in", values, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdBetween(String value1, String value2) {
            addCriterion("library_id between", value1, value2, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryIdNotBetween(String value1, String value2) {
            addCriterion("library_id not between", value1, value2, "libraryId");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameIsNull() {
            addCriterion("library_cs_name is null");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameIsNotNull() {
            addCriterion("library_cs_name is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameEqualTo(String value) {
            addCriterion("library_cs_name =", value, "libraryCsName");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameNotEqualTo(String value) {
            addCriterion("library_cs_name <>", value, "libraryCsName");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameGreaterThan(String value) {
            addCriterion("library_cs_name >", value, "libraryCsName");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameGreaterThanOrEqualTo(String value) {
            addCriterion("library_cs_name >=", value, "libraryCsName");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameLessThan(String value) {
            addCriterion("library_cs_name <", value, "libraryCsName");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameLessThanOrEqualTo(String value) {
            addCriterion("library_cs_name <=", value, "libraryCsName");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameLike(String value) {
            addCriterion("library_cs_name like", value, "libraryCsName");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameNotLike(String value) {
            addCriterion("library_cs_name not like", value, "libraryCsName");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameIn(List<String> values) {
            addCriterion("library_cs_name in", values, "libraryCsName");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameNotIn(List<String> values) {
            addCriterion("library_cs_name not in", values, "libraryCsName");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameBetween(String value1, String value2) {
            addCriterion("library_cs_name between", value1, value2, "libraryCsName");
            return (Criteria) this;
        }

        public Criteria andLibraryCsNameNotBetween(String value1, String value2) {
            addCriterion("library_cs_name not between", value1, value2, "libraryCsName");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTypeIsNull() {
            addCriterion("library_cs_type is null");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTypeIsNotNull() {
            addCriterion("library_cs_type is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTypeEqualTo(Integer value) {
            addCriterion("library_cs_type =", value, "libraryCsType");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTypeNotEqualTo(Integer value) {
            addCriterion("library_cs_type <>", value, "libraryCsType");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTypeGreaterThan(Integer value) {
            addCriterion("library_cs_type >", value, "libraryCsType");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("library_cs_type >=", value, "libraryCsType");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTypeLessThan(Integer value) {
            addCriterion("library_cs_type <", value, "libraryCsType");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("library_cs_type <=", value, "libraryCsType");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTypeIn(List<Integer> values) {
            addCriterion("library_cs_type in", values, "libraryCsType");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTypeNotIn(List<Integer> values) {
            addCriterion("library_cs_type not in", values, "libraryCsType");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTypeBetween(Integer value1, Integer value2) {
            addCriterion("library_cs_type between", value1, value2, "libraryCsType");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("library_cs_type not between", value1, value2, "libraryCsType");
            return (Criteria) this;
        }

        public Criteria andLibraryCsCountIsNull() {
            addCriterion("library_cs_count is null");
            return (Criteria) this;
        }

        public Criteria andLibraryCsCountIsNotNull() {
            addCriterion("library_cs_count is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryCsCountEqualTo(Integer value) {
            addCriterion("library_cs_count =", value, "libraryCsCount");
            return (Criteria) this;
        }

        public Criteria andLibraryCsCountNotEqualTo(Integer value) {
            addCriterion("library_cs_count <>", value, "libraryCsCount");
            return (Criteria) this;
        }

        public Criteria andLibraryCsCountGreaterThan(Integer value) {
            addCriterion("library_cs_count >", value, "libraryCsCount");
            return (Criteria) this;
        }

        public Criteria andLibraryCsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("library_cs_count >=", value, "libraryCsCount");
            return (Criteria) this;
        }

        public Criteria andLibraryCsCountLessThan(Integer value) {
            addCriterion("library_cs_count <", value, "libraryCsCount");
            return (Criteria) this;
        }

        public Criteria andLibraryCsCountLessThanOrEqualTo(Integer value) {
            addCriterion("library_cs_count <=", value, "libraryCsCount");
            return (Criteria) this;
        }

        public Criteria andLibraryCsCountIn(List<Integer> values) {
            addCriterion("library_cs_count in", values, "libraryCsCount");
            return (Criteria) this;
        }

        public Criteria andLibraryCsCountNotIn(List<Integer> values) {
            addCriterion("library_cs_count not in", values, "libraryCsCount");
            return (Criteria) this;
        }

        public Criteria andLibraryCsCountBetween(Integer value1, Integer value2) {
            addCriterion("library_cs_count between", value1, value2, "libraryCsCount");
            return (Criteria) this;
        }

        public Criteria andLibraryCsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("library_cs_count not between", value1, value2, "libraryCsCount");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgIsNull() {
            addCriterion("library_cs_msg is null");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgIsNotNull() {
            addCriterion("library_cs_msg is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgEqualTo(String value) {
            addCriterion("library_cs_msg =", value, "libraryCsMsg");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgNotEqualTo(String value) {
            addCriterion("library_cs_msg <>", value, "libraryCsMsg");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgGreaterThan(String value) {
            addCriterion("library_cs_msg >", value, "libraryCsMsg");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgGreaterThanOrEqualTo(String value) {
            addCriterion("library_cs_msg >=", value, "libraryCsMsg");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgLessThan(String value) {
            addCriterion("library_cs_msg <", value, "libraryCsMsg");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgLessThanOrEqualTo(String value) {
            addCriterion("library_cs_msg <=", value, "libraryCsMsg");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgLike(String value) {
            addCriterion("library_cs_msg like", value, "libraryCsMsg");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgNotLike(String value) {
            addCriterion("library_cs_msg not like", value, "libraryCsMsg");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgIn(List<String> values) {
            addCriterion("library_cs_msg in", values, "libraryCsMsg");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgNotIn(List<String> values) {
            addCriterion("library_cs_msg not in", values, "libraryCsMsg");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgBetween(String value1, String value2) {
            addCriterion("library_cs_msg between", value1, value2, "libraryCsMsg");
            return (Criteria) this;
        }

        public Criteria andLibraryCsMsgNotBetween(String value1, String value2) {
            addCriterion("library_cs_msg not between", value1, value2, "libraryCsMsg");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTimeIsNull() {
            addCriterion("library_cs_time is null");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTimeIsNotNull() {
            addCriterion("library_cs_time is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTimeEqualTo(Date value) {
            addCriterion("library_cs_time =", value, "libraryCsTime");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTimeNotEqualTo(Date value) {
            addCriterion("library_cs_time <>", value, "libraryCsTime");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTimeGreaterThan(Date value) {
            addCriterion("library_cs_time >", value, "libraryCsTime");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("library_cs_time >=", value, "libraryCsTime");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTimeLessThan(Date value) {
            addCriterion("library_cs_time <", value, "libraryCsTime");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTimeLessThanOrEqualTo(Date value) {
            addCriterion("library_cs_time <=", value, "libraryCsTime");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTimeIn(List<Date> values) {
            addCriterion("library_cs_time in", values, "libraryCsTime");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTimeNotIn(List<Date> values) {
            addCriterion("library_cs_time not in", values, "libraryCsTime");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTimeBetween(Date value1, Date value2) {
            addCriterion("library_cs_time between", value1, value2, "libraryCsTime");
            return (Criteria) this;
        }

        public Criteria andLibraryCsTimeNotBetween(Date value1, Date value2) {
            addCriterion("library_cs_time not between", value1, value2, "libraryCsTime");
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