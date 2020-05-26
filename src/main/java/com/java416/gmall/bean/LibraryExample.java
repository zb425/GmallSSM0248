package com.java416.gmall.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LibraryExample() {
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

        public Criteria andLibraryNameIsNull() {
            addCriterion("library_name is null");
            return (Criteria) this;
        }

        public Criteria andLibraryNameIsNotNull() {
            addCriterion("library_name is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryNameEqualTo(String value) {
            addCriterion("library_name =", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameNotEqualTo(String value) {
            addCriterion("library_name <>", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameGreaterThan(String value) {
            addCriterion("library_name >", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameGreaterThanOrEqualTo(String value) {
            addCriterion("library_name >=", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameLessThan(String value) {
            addCriterion("library_name <", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameLessThanOrEqualTo(String value) {
            addCriterion("library_name <=", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameLike(String value) {
            addCriterion("library_name like", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameNotLike(String value) {
            addCriterion("library_name not like", value, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameIn(List<String> values) {
            addCriterion("library_name in", values, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameNotIn(List<String> values) {
            addCriterion("library_name not in", values, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameBetween(String value1, String value2) {
            addCriterion("library_name between", value1, value2, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryNameNotBetween(String value1, String value2) {
            addCriterion("library_name not between", value1, value2, "libraryName");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressIsNull() {
            addCriterion("library_address is null");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressIsNotNull() {
            addCriterion("library_address is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressEqualTo(String value) {
            addCriterion("library_address =", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressNotEqualTo(String value) {
            addCriterion("library_address <>", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressGreaterThan(String value) {
            addCriterion("library_address >", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("library_address >=", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressLessThan(String value) {
            addCriterion("library_address <", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressLessThanOrEqualTo(String value) {
            addCriterion("library_address <=", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressLike(String value) {
            addCriterion("library_address like", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressNotLike(String value) {
            addCriterion("library_address not like", value, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressIn(List<String> values) {
            addCriterion("library_address in", values, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressNotIn(List<String> values) {
            addCriterion("library_address not in", values, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressBetween(String value1, String value2) {
            addCriterion("library_address between", value1, value2, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryAddressNotBetween(String value1, String value2) {
            addCriterion("library_address not between", value1, value2, "libraryAddress");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeIsNull() {
            addCriterion("library_code is null");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeIsNotNull() {
            addCriterion("library_code is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeEqualTo(String value) {
            addCriterion("library_code =", value, "libraryCode");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeNotEqualTo(String value) {
            addCriterion("library_code <>", value, "libraryCode");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeGreaterThan(String value) {
            addCriterion("library_code >", value, "libraryCode");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("library_code >=", value, "libraryCode");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeLessThan(String value) {
            addCriterion("library_code <", value, "libraryCode");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeLessThanOrEqualTo(String value) {
            addCriterion("library_code <=", value, "libraryCode");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeLike(String value) {
            addCriterion("library_code like", value, "libraryCode");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeNotLike(String value) {
            addCriterion("library_code not like", value, "libraryCode");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeIn(List<String> values) {
            addCriterion("library_code in", values, "libraryCode");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeNotIn(List<String> values) {
            addCriterion("library_code not in", values, "libraryCode");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeBetween(String value1, String value2) {
            addCriterion("library_code between", value1, value2, "libraryCode");
            return (Criteria) this;
        }

        public Criteria andLibraryCodeNotBetween(String value1, String value2) {
            addCriterion("library_code not between", value1, value2, "libraryCode");
            return (Criteria) this;
        }

        public Criteria andLibraryCreattimeIsNull() {
            addCriterion("library_creattime is null");
            return (Criteria) this;
        }

        public Criteria andLibraryCreattimeIsNotNull() {
            addCriterion("library_creattime is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryCreattimeEqualTo(Date value) {
            addCriterion("library_creattime =", value, "libraryCreattime");
            return (Criteria) this;
        }

        public Criteria andLibraryCreattimeNotEqualTo(Date value) {
            addCriterion("library_creattime <>", value, "libraryCreattime");
            return (Criteria) this;
        }

        public Criteria andLibraryCreattimeGreaterThan(Date value) {
            addCriterion("library_creattime >", value, "libraryCreattime");
            return (Criteria) this;
        }

        public Criteria andLibraryCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("library_creattime >=", value, "libraryCreattime");
            return (Criteria) this;
        }

        public Criteria andLibraryCreattimeLessThan(Date value) {
            addCriterion("library_creattime <", value, "libraryCreattime");
            return (Criteria) this;
        }

        public Criteria andLibraryCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("library_creattime <=", value, "libraryCreattime");
            return (Criteria) this;
        }

        public Criteria andLibraryCreattimeIn(List<Date> values) {
            addCriterion("library_creattime in", values, "libraryCreattime");
            return (Criteria) this;
        }

        public Criteria andLibraryCreattimeNotIn(List<Date> values) {
            addCriterion("library_creattime not in", values, "libraryCreattime");
            return (Criteria) this;
        }

        public Criteria andLibraryCreattimeBetween(Date value1, Date value2) {
            addCriterion("library_creattime between", value1, value2, "libraryCreattime");
            return (Criteria) this;
        }

        public Criteria andLibraryCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("library_creattime not between", value1, value2, "libraryCreattime");
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