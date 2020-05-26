package com.java416.gmall.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderBookExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(String value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(String value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(String value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(String value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(String value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(String value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLike(String value) {
            addCriterion("o_id like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotLike(String value) {
            addCriterion("o_id not like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<String> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<String> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(String value1, String value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(String value1, String value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
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

        public Criteria andOCodeIsNull() {
            addCriterion("o_code is null");
            return (Criteria) this;
        }

        public Criteria andOCodeIsNotNull() {
            addCriterion("o_code is not null");
            return (Criteria) this;
        }

        public Criteria andOCodeEqualTo(String value) {
            addCriterion("o_code =", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeNotEqualTo(String value) {
            addCriterion("o_code <>", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeGreaterThan(String value) {
            addCriterion("o_code >", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeGreaterThanOrEqualTo(String value) {
            addCriterion("o_code >=", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeLessThan(String value) {
            addCriterion("o_code <", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeLessThanOrEqualTo(String value) {
            addCriterion("o_code <=", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeLike(String value) {
            addCriterion("o_code like", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeNotLike(String value) {
            addCriterion("o_code not like", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeIn(List<String> values) {
            addCriterion("o_code in", values, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeNotIn(List<String> values) {
            addCriterion("o_code not in", values, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeBetween(String value1, String value2) {
            addCriterion("o_code between", value1, value2, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeNotBetween(String value1, String value2) {
            addCriterion("o_code not between", value1, value2, "oCode");
            return (Criteria) this;
        }

        public Criteria andOTotalIsNull() {
            addCriterion("o_total is null");
            return (Criteria) this;
        }

        public Criteria andOTotalIsNotNull() {
            addCriterion("o_total is not null");
            return (Criteria) this;
        }

        public Criteria andOTotalEqualTo(Float value) {
            addCriterion("o_total =", value, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalNotEqualTo(Float value) {
            addCriterion("o_total <>", value, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalGreaterThan(Float value) {
            addCriterion("o_total >", value, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("o_total >=", value, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalLessThan(Float value) {
            addCriterion("o_total <", value, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalLessThanOrEqualTo(Float value) {
            addCriterion("o_total <=", value, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalIn(List<Float> values) {
            addCriterion("o_total in", values, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalNotIn(List<Float> values) {
            addCriterion("o_total not in", values, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalBetween(Float value1, Float value2) {
            addCriterion("o_total between", value1, value2, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOTotalNotBetween(Float value1, Float value2) {
            addCriterion("o_total not between", value1, value2, "oTotal");
            return (Criteria) this;
        }

        public Criteria andOPayIsNull() {
            addCriterion("o_pay is null");
            return (Criteria) this;
        }

        public Criteria andOPayIsNotNull() {
            addCriterion("o_pay is not null");
            return (Criteria) this;
        }

        public Criteria andOPayEqualTo(Float value) {
            addCriterion("o_pay =", value, "oPay");
            return (Criteria) this;
        }

        public Criteria andOPayNotEqualTo(Float value) {
            addCriterion("o_pay <>", value, "oPay");
            return (Criteria) this;
        }

        public Criteria andOPayGreaterThan(Float value) {
            addCriterion("o_pay >", value, "oPay");
            return (Criteria) this;
        }

        public Criteria andOPayGreaterThanOrEqualTo(Float value) {
            addCriterion("o_pay >=", value, "oPay");
            return (Criteria) this;
        }

        public Criteria andOPayLessThan(Float value) {
            addCriterion("o_pay <", value, "oPay");
            return (Criteria) this;
        }

        public Criteria andOPayLessThanOrEqualTo(Float value) {
            addCriterion("o_pay <=", value, "oPay");
            return (Criteria) this;
        }

        public Criteria andOPayIn(List<Float> values) {
            addCriterion("o_pay in", values, "oPay");
            return (Criteria) this;
        }

        public Criteria andOPayNotIn(List<Float> values) {
            addCriterion("o_pay not in", values, "oPay");
            return (Criteria) this;
        }

        public Criteria andOPayBetween(Float value1, Float value2) {
            addCriterion("o_pay between", value1, value2, "oPay");
            return (Criteria) this;
        }

        public Criteria andOPayNotBetween(Float value1, Float value2) {
            addCriterion("o_pay not between", value1, value2, "oPay");
            return (Criteria) this;
        }

        public Criteria andORetrunIsNull() {
            addCriterion("o_retrun is null");
            return (Criteria) this;
        }

        public Criteria andORetrunIsNotNull() {
            addCriterion("o_retrun is not null");
            return (Criteria) this;
        }

        public Criteria andORetrunEqualTo(Float value) {
            addCriterion("o_retrun =", value, "oRetrun");
            return (Criteria) this;
        }

        public Criteria andORetrunNotEqualTo(Float value) {
            addCriterion("o_retrun <>", value, "oRetrun");
            return (Criteria) this;
        }

        public Criteria andORetrunGreaterThan(Float value) {
            addCriterion("o_retrun >", value, "oRetrun");
            return (Criteria) this;
        }

        public Criteria andORetrunGreaterThanOrEqualTo(Float value) {
            addCriterion("o_retrun >=", value, "oRetrun");
            return (Criteria) this;
        }

        public Criteria andORetrunLessThan(Float value) {
            addCriterion("o_retrun <", value, "oRetrun");
            return (Criteria) this;
        }

        public Criteria andORetrunLessThanOrEqualTo(Float value) {
            addCriterion("o_retrun <=", value, "oRetrun");
            return (Criteria) this;
        }

        public Criteria andORetrunIn(List<Float> values) {
            addCriterion("o_retrun in", values, "oRetrun");
            return (Criteria) this;
        }

        public Criteria andORetrunNotIn(List<Float> values) {
            addCriterion("o_retrun not in", values, "oRetrun");
            return (Criteria) this;
        }

        public Criteria andORetrunBetween(Float value1, Float value2) {
            addCriterion("o_retrun between", value1, value2, "oRetrun");
            return (Criteria) this;
        }

        public Criteria andORetrunNotBetween(Float value1, Float value2) {
            addCriterion("o_retrun not between", value1, value2, "oRetrun");
            return (Criteria) this;
        }

        public Criteria andODiscountIsNull() {
            addCriterion("o_discount is null");
            return (Criteria) this;
        }

        public Criteria andODiscountIsNotNull() {
            addCriterion("o_discount is not null");
            return (Criteria) this;
        }

        public Criteria andODiscountEqualTo(Float value) {
            addCriterion("o_discount =", value, "oDiscount");
            return (Criteria) this;
        }

        public Criteria andODiscountNotEqualTo(Float value) {
            addCriterion("o_discount <>", value, "oDiscount");
            return (Criteria) this;
        }

        public Criteria andODiscountGreaterThan(Float value) {
            addCriterion("o_discount >", value, "oDiscount");
            return (Criteria) this;
        }

        public Criteria andODiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("o_discount >=", value, "oDiscount");
            return (Criteria) this;
        }

        public Criteria andODiscountLessThan(Float value) {
            addCriterion("o_discount <", value, "oDiscount");
            return (Criteria) this;
        }

        public Criteria andODiscountLessThanOrEqualTo(Float value) {
            addCriterion("o_discount <=", value, "oDiscount");
            return (Criteria) this;
        }

        public Criteria andODiscountIn(List<Float> values) {
            addCriterion("o_discount in", values, "oDiscount");
            return (Criteria) this;
        }

        public Criteria andODiscountNotIn(List<Float> values) {
            addCriterion("o_discount not in", values, "oDiscount");
            return (Criteria) this;
        }

        public Criteria andODiscountBetween(Float value1, Float value2) {
            addCriterion("o_discount between", value1, value2, "oDiscount");
            return (Criteria) this;
        }

        public Criteria andODiscountNotBetween(Float value1, Float value2) {
            addCriterion("o_discount not between", value1, value2, "oDiscount");
            return (Criteria) this;
        }

        public Criteria andOPalyIsNull() {
            addCriterion("o_paly is null");
            return (Criteria) this;
        }

        public Criteria andOPalyIsNotNull() {
            addCriterion("o_paly is not null");
            return (Criteria) this;
        }

        public Criteria andOPalyEqualTo(Integer value) {
            addCriterion("o_paly =", value, "oPaly");
            return (Criteria) this;
        }

        public Criteria andOPalyNotEqualTo(Integer value) {
            addCriterion("o_paly <>", value, "oPaly");
            return (Criteria) this;
        }

        public Criteria andOPalyGreaterThan(Integer value) {
            addCriterion("o_paly >", value, "oPaly");
            return (Criteria) this;
        }

        public Criteria andOPalyGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_paly >=", value, "oPaly");
            return (Criteria) this;
        }

        public Criteria andOPalyLessThan(Integer value) {
            addCriterion("o_paly <", value, "oPaly");
            return (Criteria) this;
        }

        public Criteria andOPalyLessThanOrEqualTo(Integer value) {
            addCriterion("o_paly <=", value, "oPaly");
            return (Criteria) this;
        }

        public Criteria andOPalyIn(List<Integer> values) {
            addCriterion("o_paly in", values, "oPaly");
            return (Criteria) this;
        }

        public Criteria andOPalyNotIn(List<Integer> values) {
            addCriterion("o_paly not in", values, "oPaly");
            return (Criteria) this;
        }

        public Criteria andOPalyBetween(Integer value1, Integer value2) {
            addCriterion("o_paly between", value1, value2, "oPaly");
            return (Criteria) this;
        }

        public Criteria andOPalyNotBetween(Integer value1, Integer value2) {
            addCriterion("o_paly not between", value1, value2, "oPaly");
            return (Criteria) this;
        }

        public Criteria andOStateIsNull() {
            addCriterion("o_state is null");
            return (Criteria) this;
        }

        public Criteria andOStateIsNotNull() {
            addCriterion("o_state is not null");
            return (Criteria) this;
        }

        public Criteria andOStateEqualTo(Integer value) {
            addCriterion("o_state =", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotEqualTo(Integer value) {
            addCriterion("o_state <>", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThan(Integer value) {
            addCriterion("o_state >", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_state >=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThan(Integer value) {
            addCriterion("o_state <", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThanOrEqualTo(Integer value) {
            addCriterion("o_state <=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateIn(List<Integer> values) {
            addCriterion("o_state in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotIn(List<Integer> values) {
            addCriterion("o_state not in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateBetween(Integer value1, Integer value2) {
            addCriterion("o_state between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotBetween(Integer value1, Integer value2) {
            addCriterion("o_state not between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeIsNull() {
            addCriterion("o_wuliucode is null");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeIsNotNull() {
            addCriterion("o_wuliucode is not null");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeEqualTo(String value) {
            addCriterion("o_wuliucode =", value, "oWuliucode");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeNotEqualTo(String value) {
            addCriterion("o_wuliucode <>", value, "oWuliucode");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeGreaterThan(String value) {
            addCriterion("o_wuliucode >", value, "oWuliucode");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeGreaterThanOrEqualTo(String value) {
            addCriterion("o_wuliucode >=", value, "oWuliucode");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeLessThan(String value) {
            addCriterion("o_wuliucode <", value, "oWuliucode");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeLessThanOrEqualTo(String value) {
            addCriterion("o_wuliucode <=", value, "oWuliucode");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeLike(String value) {
            addCriterion("o_wuliucode like", value, "oWuliucode");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeNotLike(String value) {
            addCriterion("o_wuliucode not like", value, "oWuliucode");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeIn(List<String> values) {
            addCriterion("o_wuliucode in", values, "oWuliucode");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeNotIn(List<String> values) {
            addCriterion("o_wuliucode not in", values, "oWuliucode");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeBetween(String value1, String value2) {
            addCriterion("o_wuliucode between", value1, value2, "oWuliucode");
            return (Criteria) this;
        }

        public Criteria andOWuliucodeNotBetween(String value1, String value2) {
            addCriterion("o_wuliucode not between", value1, value2, "oWuliucode");
            return (Criteria) this;
        }

        public Criteria andOJfIsNull() {
            addCriterion("o_jf is null");
            return (Criteria) this;
        }

        public Criteria andOJfIsNotNull() {
            addCriterion("o_jf is not null");
            return (Criteria) this;
        }

        public Criteria andOJfEqualTo(Integer value) {
            addCriterion("o_jf =", value, "oJf");
            return (Criteria) this;
        }

        public Criteria andOJfNotEqualTo(Integer value) {
            addCriterion("o_jf <>", value, "oJf");
            return (Criteria) this;
        }

        public Criteria andOJfGreaterThan(Integer value) {
            addCriterion("o_jf >", value, "oJf");
            return (Criteria) this;
        }

        public Criteria andOJfGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_jf >=", value, "oJf");
            return (Criteria) this;
        }

        public Criteria andOJfLessThan(Integer value) {
            addCriterion("o_jf <", value, "oJf");
            return (Criteria) this;
        }

        public Criteria andOJfLessThanOrEqualTo(Integer value) {
            addCriterion("o_jf <=", value, "oJf");
            return (Criteria) this;
        }

        public Criteria andOJfIn(List<Integer> values) {
            addCriterion("o_jf in", values, "oJf");
            return (Criteria) this;
        }

        public Criteria andOJfNotIn(List<Integer> values) {
            addCriterion("o_jf not in", values, "oJf");
            return (Criteria) this;
        }

        public Criteria andOJfBetween(Integer value1, Integer value2) {
            addCriterion("o_jf between", value1, value2, "oJf");
            return (Criteria) this;
        }

        public Criteria andOJfNotBetween(Integer value1, Integer value2) {
            addCriterion("o_jf not between", value1, value2, "oJf");
            return (Criteria) this;
        }

        public Criteria andOMomerIsNull() {
            addCriterion("o_momer is null");
            return (Criteria) this;
        }

        public Criteria andOMomerIsNotNull() {
            addCriterion("o_momer is not null");
            return (Criteria) this;
        }

        public Criteria andOMomerEqualTo(String value) {
            addCriterion("o_momer =", value, "oMomer");
            return (Criteria) this;
        }

        public Criteria andOMomerNotEqualTo(String value) {
            addCriterion("o_momer <>", value, "oMomer");
            return (Criteria) this;
        }

        public Criteria andOMomerGreaterThan(String value) {
            addCriterion("o_momer >", value, "oMomer");
            return (Criteria) this;
        }

        public Criteria andOMomerGreaterThanOrEqualTo(String value) {
            addCriterion("o_momer >=", value, "oMomer");
            return (Criteria) this;
        }

        public Criteria andOMomerLessThan(String value) {
            addCriterion("o_momer <", value, "oMomer");
            return (Criteria) this;
        }

        public Criteria andOMomerLessThanOrEqualTo(String value) {
            addCriterion("o_momer <=", value, "oMomer");
            return (Criteria) this;
        }

        public Criteria andOMomerLike(String value) {
            addCriterion("o_momer like", value, "oMomer");
            return (Criteria) this;
        }

        public Criteria andOMomerNotLike(String value) {
            addCriterion("o_momer not like", value, "oMomer");
            return (Criteria) this;
        }

        public Criteria andOMomerIn(List<String> values) {
            addCriterion("o_momer in", values, "oMomer");
            return (Criteria) this;
        }

        public Criteria andOMomerNotIn(List<String> values) {
            addCriterion("o_momer not in", values, "oMomer");
            return (Criteria) this;
        }

        public Criteria andOMomerBetween(String value1, String value2) {
            addCriterion("o_momer between", value1, value2, "oMomer");
            return (Criteria) this;
        }

        public Criteria andOMomerNotBetween(String value1, String value2) {
            addCriterion("o_momer not between", value1, value2, "oMomer");
            return (Criteria) this;
        }

        public Criteria andOSSstateIsNull() {
            addCriterion("o_s_sstate is null");
            return (Criteria) this;
        }

        public Criteria andOSSstateIsNotNull() {
            addCriterion("o_s_sstate is not null");
            return (Criteria) this;
        }

        public Criteria andOSSstateEqualTo(Integer value) {
            addCriterion("o_s_sstate =", value, "oSSstate");
            return (Criteria) this;
        }

        public Criteria andOSSstateNotEqualTo(Integer value) {
            addCriterion("o_s_sstate <>", value, "oSSstate");
            return (Criteria) this;
        }

        public Criteria andOSSstateGreaterThan(Integer value) {
            addCriterion("o_s_sstate >", value, "oSSstate");
            return (Criteria) this;
        }

        public Criteria andOSSstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_s_sstate >=", value, "oSSstate");
            return (Criteria) this;
        }

        public Criteria andOSSstateLessThan(Integer value) {
            addCriterion("o_s_sstate <", value, "oSSstate");
            return (Criteria) this;
        }

        public Criteria andOSSstateLessThanOrEqualTo(Integer value) {
            addCriterion("o_s_sstate <=", value, "oSSstate");
            return (Criteria) this;
        }

        public Criteria andOSSstateIn(List<Integer> values) {
            addCriterion("o_s_sstate in", values, "oSSstate");
            return (Criteria) this;
        }

        public Criteria andOSSstateNotIn(List<Integer> values) {
            addCriterion("o_s_sstate not in", values, "oSSstate");
            return (Criteria) this;
        }

        public Criteria andOSSstateBetween(Integer value1, Integer value2) {
            addCriterion("o_s_sstate between", value1, value2, "oSSstate");
            return (Criteria) this;
        }

        public Criteria andOSSstateNotBetween(Integer value1, Integer value2) {
            addCriterion("o_s_sstate not between", value1, value2, "oSSstate");
            return (Criteria) this;
        }

        public Criteria andOCreatetimeIsNull() {
            addCriterion("o_createtime is null");
            return (Criteria) this;
        }

        public Criteria andOCreatetimeIsNotNull() {
            addCriterion("o_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andOCreatetimeEqualTo(Date value) {
            addCriterion("o_createtime =", value, "oCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCreatetimeNotEqualTo(Date value) {
            addCriterion("o_createtime <>", value, "oCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCreatetimeGreaterThan(Date value) {
            addCriterion("o_createtime >", value, "oCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_createtime >=", value, "oCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCreatetimeLessThan(Date value) {
            addCriterion("o_createtime <", value, "oCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("o_createtime <=", value, "oCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCreatetimeIn(List<Date> values) {
            addCriterion("o_createtime in", values, "oCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCreatetimeNotIn(List<Date> values) {
            addCriterion("o_createtime not in", values, "oCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCreatetimeBetween(Date value1, Date value2) {
            addCriterion("o_createtime between", value1, value2, "oCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("o_createtime not between", value1, value2, "oCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCCreatetimeIsNull() {
            addCriterion("o_c_createtime is null");
            return (Criteria) this;
        }

        public Criteria andOCCreatetimeIsNotNull() {
            addCriterion("o_c_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andOCCreatetimeEqualTo(Date value) {
            addCriterion("o_c_createtime =", value, "oCCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCCreatetimeNotEqualTo(Date value) {
            addCriterion("o_c_createtime <>", value, "oCCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCCreatetimeGreaterThan(Date value) {
            addCriterion("o_c_createtime >", value, "oCCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_c_createtime >=", value, "oCCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCCreatetimeLessThan(Date value) {
            addCriterion("o_c_createtime <", value, "oCCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("o_c_createtime <=", value, "oCCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCCreatetimeIn(List<Date> values) {
            addCriterion("o_c_createtime in", values, "oCCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCCreatetimeNotIn(List<Date> values) {
            addCriterion("o_c_createtime not in", values, "oCCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCCreatetimeBetween(Date value1, Date value2) {
            addCriterion("o_c_createtime between", value1, value2, "oCCreatetime");
            return (Criteria) this;
        }

        public Criteria andOCCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("o_c_createtime not between", value1, value2, "oCCreatetime");
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