package com.java416.gmall.bean;

import java.util.ArrayList;
import java.util.List;

public class BookInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookInfoExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(String value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(String value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(String value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(String value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(String value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLike(String value) {
            addCriterion("book_id like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotLike(String value) {
            addCriterion("book_id not like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<String> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<String> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(String value1, String value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(String value1, String value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
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

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookAuthIsNull() {
            addCriterion("book_auth is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthIsNotNull() {
            addCriterion("book_auth is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthEqualTo(String value) {
            addCriterion("book_auth =", value, "bookAuth");
            return (Criteria) this;
        }

        public Criteria andBookAuthNotEqualTo(String value) {
            addCriterion("book_auth <>", value, "bookAuth");
            return (Criteria) this;
        }

        public Criteria andBookAuthGreaterThan(String value) {
            addCriterion("book_auth >", value, "bookAuth");
            return (Criteria) this;
        }

        public Criteria andBookAuthGreaterThanOrEqualTo(String value) {
            addCriterion("book_auth >=", value, "bookAuth");
            return (Criteria) this;
        }

        public Criteria andBookAuthLessThan(String value) {
            addCriterion("book_auth <", value, "bookAuth");
            return (Criteria) this;
        }

        public Criteria andBookAuthLessThanOrEqualTo(String value) {
            addCriterion("book_auth <=", value, "bookAuth");
            return (Criteria) this;
        }

        public Criteria andBookAuthLike(String value) {
            addCriterion("book_auth like", value, "bookAuth");
            return (Criteria) this;
        }

        public Criteria andBookAuthNotLike(String value) {
            addCriterion("book_auth not like", value, "bookAuth");
            return (Criteria) this;
        }

        public Criteria andBookAuthIn(List<String> values) {
            addCriterion("book_auth in", values, "bookAuth");
            return (Criteria) this;
        }

        public Criteria andBookAuthNotIn(List<String> values) {
            addCriterion("book_auth not in", values, "bookAuth");
            return (Criteria) this;
        }

        public Criteria andBookAuthBetween(String value1, String value2) {
            addCriterion("book_auth between", value1, value2, "bookAuth");
            return (Criteria) this;
        }

        public Criteria andBookAuthNotBetween(String value1, String value2) {
            addCriterion("book_auth not between", value1, value2, "bookAuth");
            return (Criteria) this;
        }

        public Criteria andBookTotalIsNull() {
            addCriterion("book_total is null");
            return (Criteria) this;
        }

        public Criteria andBookTotalIsNotNull() {
            addCriterion("book_total is not null");
            return (Criteria) this;
        }

        public Criteria andBookTotalEqualTo(Integer value) {
            addCriterion("book_total =", value, "bookTotal");
            return (Criteria) this;
        }

        public Criteria andBookTotalNotEqualTo(Integer value) {
            addCriterion("book_total <>", value, "bookTotal");
            return (Criteria) this;
        }

        public Criteria andBookTotalGreaterThan(Integer value) {
            addCriterion("book_total >", value, "bookTotal");
            return (Criteria) this;
        }

        public Criteria andBookTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_total >=", value, "bookTotal");
            return (Criteria) this;
        }

        public Criteria andBookTotalLessThan(Integer value) {
            addCriterion("book_total <", value, "bookTotal");
            return (Criteria) this;
        }

        public Criteria andBookTotalLessThanOrEqualTo(Integer value) {
            addCriterion("book_total <=", value, "bookTotal");
            return (Criteria) this;
        }

        public Criteria andBookTotalIn(List<Integer> values) {
            addCriterion("book_total in", values, "bookTotal");
            return (Criteria) this;
        }

        public Criteria andBookTotalNotIn(List<Integer> values) {
            addCriterion("book_total not in", values, "bookTotal");
            return (Criteria) this;
        }

        public Criteria andBookTotalBetween(Integer value1, Integer value2) {
            addCriterion("book_total between", value1, value2, "bookTotal");
            return (Criteria) this;
        }

        public Criteria andBookTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("book_total not between", value1, value2, "bookTotal");
            return (Criteria) this;
        }

        public Criteria andBookStateIsNull() {
            addCriterion("book_state is null");
            return (Criteria) this;
        }

        public Criteria andBookStateIsNotNull() {
            addCriterion("book_state is not null");
            return (Criteria) this;
        }

        public Criteria andBookStateEqualTo(Integer value) {
            addCriterion("book_state =", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateNotEqualTo(Integer value) {
            addCriterion("book_state <>", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateGreaterThan(Integer value) {
            addCriterion("book_state >", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_state >=", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateLessThan(Integer value) {
            addCriterion("book_state <", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateLessThanOrEqualTo(Integer value) {
            addCriterion("book_state <=", value, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateIn(List<Integer> values) {
            addCriterion("book_state in", values, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateNotIn(List<Integer> values) {
            addCriterion("book_state not in", values, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateBetween(Integer value1, Integer value2) {
            addCriterion("book_state between", value1, value2, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookStateNotBetween(Integer value1, Integer value2) {
            addCriterion("book_state not between", value1, value2, "bookState");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNull() {
            addCriterion("book_price is null");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNotNull() {
            addCriterion("book_price is not null");
            return (Criteria) this;
        }

        public Criteria andBookPriceEqualTo(Float value) {
            addCriterion("book_price =", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotEqualTo(Float value) {
            addCriterion("book_price <>", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThan(Float value) {
            addCriterion("book_price >", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("book_price >=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThan(Float value) {
            addCriterion("book_price <", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThanOrEqualTo(Float value) {
            addCriterion("book_price <=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceIn(List<Float> values) {
            addCriterion("book_price in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotIn(List<Float> values) {
            addCriterion("book_price not in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceBetween(Float value1, Float value2) {
            addCriterion("book_price between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotBetween(Float value1, Float value2) {
            addCriterion("book_price not between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookMsgIsNull() {
            addCriterion("book_msg is null");
            return (Criteria) this;
        }

        public Criteria andBookMsgIsNotNull() {
            addCriterion("book_msg is not null");
            return (Criteria) this;
        }

        public Criteria andBookMsgEqualTo(String value) {
            addCriterion("book_msg =", value, "bookMsg");
            return (Criteria) this;
        }

        public Criteria andBookMsgNotEqualTo(String value) {
            addCriterion("book_msg <>", value, "bookMsg");
            return (Criteria) this;
        }

        public Criteria andBookMsgGreaterThan(String value) {
            addCriterion("book_msg >", value, "bookMsg");
            return (Criteria) this;
        }

        public Criteria andBookMsgGreaterThanOrEqualTo(String value) {
            addCriterion("book_msg >=", value, "bookMsg");
            return (Criteria) this;
        }

        public Criteria andBookMsgLessThan(String value) {
            addCriterion("book_msg <", value, "bookMsg");
            return (Criteria) this;
        }

        public Criteria andBookMsgLessThanOrEqualTo(String value) {
            addCriterion("book_msg <=", value, "bookMsg");
            return (Criteria) this;
        }

        public Criteria andBookMsgLike(String value) {
            addCriterion("book_msg like", value, "bookMsg");
            return (Criteria) this;
        }

        public Criteria andBookMsgNotLike(String value) {
            addCriterion("book_msg not like", value, "bookMsg");
            return (Criteria) this;
        }

        public Criteria andBookMsgIn(List<String> values) {
            addCriterion("book_msg in", values, "bookMsg");
            return (Criteria) this;
        }

        public Criteria andBookMsgNotIn(List<String> values) {
            addCriterion("book_msg not in", values, "bookMsg");
            return (Criteria) this;
        }

        public Criteria andBookMsgBetween(String value1, String value2) {
            addCriterion("book_msg between", value1, value2, "bookMsg");
            return (Criteria) this;
        }

        public Criteria andBookMsgNotBetween(String value1, String value2) {
            addCriterion("book_msg not between", value1, value2, "bookMsg");
            return (Criteria) this;
        }

        public Criteria andBookSalesIsNull() {
            addCriterion("book_sales is null");
            return (Criteria) this;
        }

        public Criteria andBookSalesIsNotNull() {
            addCriterion("book_sales is not null");
            return (Criteria) this;
        }

        public Criteria andBookSalesEqualTo(Integer value) {
            addCriterion("book_sales =", value, "bookSales");
            return (Criteria) this;
        }

        public Criteria andBookSalesNotEqualTo(Integer value) {
            addCriterion("book_sales <>", value, "bookSales");
            return (Criteria) this;
        }

        public Criteria andBookSalesGreaterThan(Integer value) {
            addCriterion("book_sales >", value, "bookSales");
            return (Criteria) this;
        }

        public Criteria andBookSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_sales >=", value, "bookSales");
            return (Criteria) this;
        }

        public Criteria andBookSalesLessThan(Integer value) {
            addCriterion("book_sales <", value, "bookSales");
            return (Criteria) this;
        }

        public Criteria andBookSalesLessThanOrEqualTo(Integer value) {
            addCriterion("book_sales <=", value, "bookSales");
            return (Criteria) this;
        }

        public Criteria andBookSalesIn(List<Integer> values) {
            addCriterion("book_sales in", values, "bookSales");
            return (Criteria) this;
        }

        public Criteria andBookSalesNotIn(List<Integer> values) {
            addCriterion("book_sales not in", values, "bookSales");
            return (Criteria) this;
        }

        public Criteria andBookSalesBetween(Integer value1, Integer value2) {
            addCriterion("book_sales between", value1, value2, "bookSales");
            return (Criteria) this;
        }

        public Criteria andBookSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("book_sales not between", value1, value2, "bookSales");
            return (Criteria) this;
        }

        public Criteria andBookImgIsNull() {
            addCriterion("book_img is null");
            return (Criteria) this;
        }

        public Criteria andBookImgIsNotNull() {
            addCriterion("book_img is not null");
            return (Criteria) this;
        }

        public Criteria andBookImgEqualTo(String value) {
            addCriterion("book_img =", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotEqualTo(String value) {
            addCriterion("book_img <>", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgGreaterThan(String value) {
            addCriterion("book_img >", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgGreaterThanOrEqualTo(String value) {
            addCriterion("book_img >=", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgLessThan(String value) {
            addCriterion("book_img <", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgLessThanOrEqualTo(String value) {
            addCriterion("book_img <=", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgLike(String value) {
            addCriterion("book_img like", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotLike(String value) {
            addCriterion("book_img not like", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgIn(List<String> values) {
            addCriterion("book_img in", values, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotIn(List<String> values) {
            addCriterion("book_img not in", values, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgBetween(String value1, String value2) {
            addCriterion("book_img between", value1, value2, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotBetween(String value1, String value2) {
            addCriterion("book_img not between", value1, value2, "bookImg");
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