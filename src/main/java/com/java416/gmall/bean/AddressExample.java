package com.java416.gmall.bean;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andAddIdIsNull() {
            addCriterion("add_id is null");
            return (Criteria) this;
        }

        public Criteria andAddIdIsNotNull() {
            addCriterion("add_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddIdEqualTo(String value) {
            addCriterion("add_id =", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdNotEqualTo(String value) {
            addCriterion("add_id <>", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdGreaterThan(String value) {
            addCriterion("add_id >", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdGreaterThanOrEqualTo(String value) {
            addCriterion("add_id >=", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdLessThan(String value) {
            addCriterion("add_id <", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdLessThanOrEqualTo(String value) {
            addCriterion("add_id <=", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdLike(String value) {
            addCriterion("add_id like", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdNotLike(String value) {
            addCriterion("add_id not like", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdIn(List<String> values) {
            addCriterion("add_id in", values, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdNotIn(List<String> values) {
            addCriterion("add_id not in", values, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdBetween(String value1, String value2) {
            addCriterion("add_id between", value1, value2, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdNotBetween(String value1, String value2) {
            addCriterion("add_id not between", value1, value2, "addId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(String value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(String value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(String value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(String value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(String value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(String value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLike(String value) {
            addCriterion("u_id like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotLike(String value) {
            addCriterion("u_id not like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<String> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<String> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(String value1, String value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(String value1, String value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andAddNameIsNull() {
            addCriterion("add_name is null");
            return (Criteria) this;
        }

        public Criteria andAddNameIsNotNull() {
            addCriterion("add_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddNameEqualTo(String value) {
            addCriterion("add_name =", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameNotEqualTo(String value) {
            addCriterion("add_name <>", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameGreaterThan(String value) {
            addCriterion("add_name >", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameGreaterThanOrEqualTo(String value) {
            addCriterion("add_name >=", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameLessThan(String value) {
            addCriterion("add_name <", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameLessThanOrEqualTo(String value) {
            addCriterion("add_name <=", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameLike(String value) {
            addCriterion("add_name like", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameNotLike(String value) {
            addCriterion("add_name not like", value, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameIn(List<String> values) {
            addCriterion("add_name in", values, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameNotIn(List<String> values) {
            addCriterion("add_name not in", values, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameBetween(String value1, String value2) {
            addCriterion("add_name between", value1, value2, "addName");
            return (Criteria) this;
        }

        public Criteria andAddNameNotBetween(String value1, String value2) {
            addCriterion("add_name not between", value1, value2, "addName");
            return (Criteria) this;
        }

        public Criteria andAddPhoneIsNull() {
            addCriterion("add_phone is null");
            return (Criteria) this;
        }

        public Criteria andAddPhoneIsNotNull() {
            addCriterion("add_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAddPhoneEqualTo(String value) {
            addCriterion("add_phone =", value, "addPhone");
            return (Criteria) this;
        }

        public Criteria andAddPhoneNotEqualTo(String value) {
            addCriterion("add_phone <>", value, "addPhone");
            return (Criteria) this;
        }

        public Criteria andAddPhoneGreaterThan(String value) {
            addCriterion("add_phone >", value, "addPhone");
            return (Criteria) this;
        }

        public Criteria andAddPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("add_phone >=", value, "addPhone");
            return (Criteria) this;
        }

        public Criteria andAddPhoneLessThan(String value) {
            addCriterion("add_phone <", value, "addPhone");
            return (Criteria) this;
        }

        public Criteria andAddPhoneLessThanOrEqualTo(String value) {
            addCriterion("add_phone <=", value, "addPhone");
            return (Criteria) this;
        }

        public Criteria andAddPhoneLike(String value) {
            addCriterion("add_phone like", value, "addPhone");
            return (Criteria) this;
        }

        public Criteria andAddPhoneNotLike(String value) {
            addCriterion("add_phone not like", value, "addPhone");
            return (Criteria) this;
        }

        public Criteria andAddPhoneIn(List<String> values) {
            addCriterion("add_phone in", values, "addPhone");
            return (Criteria) this;
        }

        public Criteria andAddPhoneNotIn(List<String> values) {
            addCriterion("add_phone not in", values, "addPhone");
            return (Criteria) this;
        }

        public Criteria andAddPhoneBetween(String value1, String value2) {
            addCriterion("add_phone between", value1, value2, "addPhone");
            return (Criteria) this;
        }

        public Criteria andAddPhoneNotBetween(String value1, String value2) {
            addCriterion("add_phone not between", value1, value2, "addPhone");
            return (Criteria) this;
        }

        public Criteria andAddCodeIsNull() {
            addCriterion("add_code is null");
            return (Criteria) this;
        }

        public Criteria andAddCodeIsNotNull() {
            addCriterion("add_code is not null");
            return (Criteria) this;
        }

        public Criteria andAddCodeEqualTo(String value) {
            addCriterion("add_code =", value, "addCode");
            return (Criteria) this;
        }

        public Criteria andAddCodeNotEqualTo(String value) {
            addCriterion("add_code <>", value, "addCode");
            return (Criteria) this;
        }

        public Criteria andAddCodeGreaterThan(String value) {
            addCriterion("add_code >", value, "addCode");
            return (Criteria) this;
        }

        public Criteria andAddCodeGreaterThanOrEqualTo(String value) {
            addCriterion("add_code >=", value, "addCode");
            return (Criteria) this;
        }

        public Criteria andAddCodeLessThan(String value) {
            addCriterion("add_code <", value, "addCode");
            return (Criteria) this;
        }

        public Criteria andAddCodeLessThanOrEqualTo(String value) {
            addCriterion("add_code <=", value, "addCode");
            return (Criteria) this;
        }

        public Criteria andAddCodeLike(String value) {
            addCriterion("add_code like", value, "addCode");
            return (Criteria) this;
        }

        public Criteria andAddCodeNotLike(String value) {
            addCriterion("add_code not like", value, "addCode");
            return (Criteria) this;
        }

        public Criteria andAddCodeIn(List<String> values) {
            addCriterion("add_code in", values, "addCode");
            return (Criteria) this;
        }

        public Criteria andAddCodeNotIn(List<String> values) {
            addCriterion("add_code not in", values, "addCode");
            return (Criteria) this;
        }

        public Criteria andAddCodeBetween(String value1, String value2) {
            addCriterion("add_code between", value1, value2, "addCode");
            return (Criteria) this;
        }

        public Criteria andAddCodeNotBetween(String value1, String value2) {
            addCriterion("add_code not between", value1, value2, "addCode");
            return (Criteria) this;
        }

        public Criteria andAddProvinceIsNull() {
            addCriterion("add_province is null");
            return (Criteria) this;
        }

        public Criteria andAddProvinceIsNotNull() {
            addCriterion("add_province is not null");
            return (Criteria) this;
        }

        public Criteria andAddProvinceEqualTo(String value) {
            addCriterion("add_province =", value, "addProvince");
            return (Criteria) this;
        }

        public Criteria andAddProvinceNotEqualTo(String value) {
            addCriterion("add_province <>", value, "addProvince");
            return (Criteria) this;
        }

        public Criteria andAddProvinceGreaterThan(String value) {
            addCriterion("add_province >", value, "addProvince");
            return (Criteria) this;
        }

        public Criteria andAddProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("add_province >=", value, "addProvince");
            return (Criteria) this;
        }

        public Criteria andAddProvinceLessThan(String value) {
            addCriterion("add_province <", value, "addProvince");
            return (Criteria) this;
        }

        public Criteria andAddProvinceLessThanOrEqualTo(String value) {
            addCriterion("add_province <=", value, "addProvince");
            return (Criteria) this;
        }

        public Criteria andAddProvinceLike(String value) {
            addCriterion("add_province like", value, "addProvince");
            return (Criteria) this;
        }

        public Criteria andAddProvinceNotLike(String value) {
            addCriterion("add_province not like", value, "addProvince");
            return (Criteria) this;
        }

        public Criteria andAddProvinceIn(List<String> values) {
            addCriterion("add_province in", values, "addProvince");
            return (Criteria) this;
        }

        public Criteria andAddProvinceNotIn(List<String> values) {
            addCriterion("add_province not in", values, "addProvince");
            return (Criteria) this;
        }

        public Criteria andAddProvinceBetween(String value1, String value2) {
            addCriterion("add_province between", value1, value2, "addProvince");
            return (Criteria) this;
        }

        public Criteria andAddProvinceNotBetween(String value1, String value2) {
            addCriterion("add_province not between", value1, value2, "addProvince");
            return (Criteria) this;
        }

        public Criteria andAddCictyIsNull() {
            addCriterion("add_cicty is null");
            return (Criteria) this;
        }

        public Criteria andAddCictyIsNotNull() {
            addCriterion("add_cicty is not null");
            return (Criteria) this;
        }

        public Criteria andAddCictyEqualTo(String value) {
            addCriterion("add_cicty =", value, "addCicty");
            return (Criteria) this;
        }

        public Criteria andAddCictyNotEqualTo(String value) {
            addCriterion("add_cicty <>", value, "addCicty");
            return (Criteria) this;
        }

        public Criteria andAddCictyGreaterThan(String value) {
            addCriterion("add_cicty >", value, "addCicty");
            return (Criteria) this;
        }

        public Criteria andAddCictyGreaterThanOrEqualTo(String value) {
            addCriterion("add_cicty >=", value, "addCicty");
            return (Criteria) this;
        }

        public Criteria andAddCictyLessThan(String value) {
            addCriterion("add_cicty <", value, "addCicty");
            return (Criteria) this;
        }

        public Criteria andAddCictyLessThanOrEqualTo(String value) {
            addCriterion("add_cicty <=", value, "addCicty");
            return (Criteria) this;
        }

        public Criteria andAddCictyLike(String value) {
            addCriterion("add_cicty like", value, "addCicty");
            return (Criteria) this;
        }

        public Criteria andAddCictyNotLike(String value) {
            addCriterion("add_cicty not like", value, "addCicty");
            return (Criteria) this;
        }

        public Criteria andAddCictyIn(List<String> values) {
            addCriterion("add_cicty in", values, "addCicty");
            return (Criteria) this;
        }

        public Criteria andAddCictyNotIn(List<String> values) {
            addCriterion("add_cicty not in", values, "addCicty");
            return (Criteria) this;
        }

        public Criteria andAddCictyBetween(String value1, String value2) {
            addCriterion("add_cicty between", value1, value2, "addCicty");
            return (Criteria) this;
        }

        public Criteria andAddCictyNotBetween(String value1, String value2) {
            addCriterion("add_cicty not between", value1, value2, "addCicty");
            return (Criteria) this;
        }

        public Criteria andAddAreaIsNull() {
            addCriterion("add_area is null");
            return (Criteria) this;
        }

        public Criteria andAddAreaIsNotNull() {
            addCriterion("add_area is not null");
            return (Criteria) this;
        }

        public Criteria andAddAreaEqualTo(String value) {
            addCriterion("add_area =", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaNotEqualTo(String value) {
            addCriterion("add_area <>", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaGreaterThan(String value) {
            addCriterion("add_area >", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaGreaterThanOrEqualTo(String value) {
            addCriterion("add_area >=", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaLessThan(String value) {
            addCriterion("add_area <", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaLessThanOrEqualTo(String value) {
            addCriterion("add_area <=", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaLike(String value) {
            addCriterion("add_area like", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaNotLike(String value) {
            addCriterion("add_area not like", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaIn(List<String> values) {
            addCriterion("add_area in", values, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaNotIn(List<String> values) {
            addCriterion("add_area not in", values, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaBetween(String value1, String value2) {
            addCriterion("add_area between", value1, value2, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaNotBetween(String value1, String value2) {
            addCriterion("add_area not between", value1, value2, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAdderssIsNull() {
            addCriterion("add_adderss is null");
            return (Criteria) this;
        }

        public Criteria andAddAdderssIsNotNull() {
            addCriterion("add_adderss is not null");
            return (Criteria) this;
        }

        public Criteria andAddAdderssEqualTo(String value) {
            addCriterion("add_adderss =", value, "addAdderss");
            return (Criteria) this;
        }

        public Criteria andAddAdderssNotEqualTo(String value) {
            addCriterion("add_adderss <>", value, "addAdderss");
            return (Criteria) this;
        }

        public Criteria andAddAdderssGreaterThan(String value) {
            addCriterion("add_adderss >", value, "addAdderss");
            return (Criteria) this;
        }

        public Criteria andAddAdderssGreaterThanOrEqualTo(String value) {
            addCriterion("add_adderss >=", value, "addAdderss");
            return (Criteria) this;
        }

        public Criteria andAddAdderssLessThan(String value) {
            addCriterion("add_adderss <", value, "addAdderss");
            return (Criteria) this;
        }

        public Criteria andAddAdderssLessThanOrEqualTo(String value) {
            addCriterion("add_adderss <=", value, "addAdderss");
            return (Criteria) this;
        }

        public Criteria andAddAdderssLike(String value) {
            addCriterion("add_adderss like", value, "addAdderss");
            return (Criteria) this;
        }

        public Criteria andAddAdderssNotLike(String value) {
            addCriterion("add_adderss not like", value, "addAdderss");
            return (Criteria) this;
        }

        public Criteria andAddAdderssIn(List<String> values) {
            addCriterion("add_adderss in", values, "addAdderss");
            return (Criteria) this;
        }

        public Criteria andAddAdderssNotIn(List<String> values) {
            addCriterion("add_adderss not in", values, "addAdderss");
            return (Criteria) this;
        }

        public Criteria andAddAdderssBetween(String value1, String value2) {
            addCriterion("add_adderss between", value1, value2, "addAdderss");
            return (Criteria) this;
        }

        public Criteria andAddAdderssNotBetween(String value1, String value2) {
            addCriterion("add_adderss not between", value1, value2, "addAdderss");
            return (Criteria) this;
        }

        public Criteria andAddTFIsNull() {
            addCriterion("add_t_f is null");
            return (Criteria) this;
        }

        public Criteria andAddTFIsNotNull() {
            addCriterion("add_t_f is not null");
            return (Criteria) this;
        }

        public Criteria andAddTFEqualTo(Integer value) {
            addCriterion("add_t_f =", value, "addTF");
            return (Criteria) this;
        }

        public Criteria andAddTFNotEqualTo(Integer value) {
            addCriterion("add_t_f <>", value, "addTF");
            return (Criteria) this;
        }

        public Criteria andAddTFGreaterThan(Integer value) {
            addCriterion("add_t_f >", value, "addTF");
            return (Criteria) this;
        }

        public Criteria andAddTFGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_t_f >=", value, "addTF");
            return (Criteria) this;
        }

        public Criteria andAddTFLessThan(Integer value) {
            addCriterion("add_t_f <", value, "addTF");
            return (Criteria) this;
        }

        public Criteria andAddTFLessThanOrEqualTo(Integer value) {
            addCriterion("add_t_f <=", value, "addTF");
            return (Criteria) this;
        }

        public Criteria andAddTFIn(List<Integer> values) {
            addCriterion("add_t_f in", values, "addTF");
            return (Criteria) this;
        }

        public Criteria andAddTFNotIn(List<Integer> values) {
            addCriterion("add_t_f not in", values, "addTF");
            return (Criteria) this;
        }

        public Criteria andAddTFBetween(Integer value1, Integer value2) {
            addCriterion("add_t_f between", value1, value2, "addTF");
            return (Criteria) this;
        }

        public Criteria andAddTFNotBetween(Integer value1, Integer value2) {
            addCriterion("add_t_f not between", value1, value2, "addTF");
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