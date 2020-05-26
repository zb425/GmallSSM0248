package com.java416.gmall.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WaybillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaybillExample() {
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

        public Criteria andWaybillIdIsNull() {
            addCriterion("waybill_id is null");
            return (Criteria) this;
        }

        public Criteria andWaybillIdIsNotNull() {
            addCriterion("waybill_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillIdEqualTo(String value) {
            addCriterion("waybill_id =", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotEqualTo(String value) {
            addCriterion("waybill_id <>", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdGreaterThan(String value) {
            addCriterion("waybill_id >", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdGreaterThanOrEqualTo(String value) {
            addCriterion("waybill_id >=", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdLessThan(String value) {
            addCriterion("waybill_id <", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdLessThanOrEqualTo(String value) {
            addCriterion("waybill_id <=", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdLike(String value) {
            addCriterion("waybill_id like", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotLike(String value) {
            addCriterion("waybill_id not like", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdIn(List<String> values) {
            addCriterion("waybill_id in", values, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotIn(List<String> values) {
            addCriterion("waybill_id not in", values, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdBetween(String value1, String value2) {
            addCriterion("waybill_id between", value1, value2, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotBetween(String value1, String value2) {
            addCriterion("waybill_id not between", value1, value2, "waybillId");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(String value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(String value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(String value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(String value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(String value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(String value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLike(String value) {
            addCriterion("a_id like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotLike(String value) {
            addCriterion("a_id not like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<String> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<String> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(String value1, String value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(String value1, String value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andWStatueIsNull() {
            addCriterion("w_statue is null");
            return (Criteria) this;
        }

        public Criteria andWStatueIsNotNull() {
            addCriterion("w_statue is not null");
            return (Criteria) this;
        }

        public Criteria andWStatueEqualTo(Integer value) {
            addCriterion("w_statue =", value, "wStatue");
            return (Criteria) this;
        }

        public Criteria andWStatueNotEqualTo(Integer value) {
            addCriterion("w_statue <>", value, "wStatue");
            return (Criteria) this;
        }

        public Criteria andWStatueGreaterThan(Integer value) {
            addCriterion("w_statue >", value, "wStatue");
            return (Criteria) this;
        }

        public Criteria andWStatueGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_statue >=", value, "wStatue");
            return (Criteria) this;
        }

        public Criteria andWStatueLessThan(Integer value) {
            addCriterion("w_statue <", value, "wStatue");
            return (Criteria) this;
        }

        public Criteria andWStatueLessThanOrEqualTo(Integer value) {
            addCriterion("w_statue <=", value, "wStatue");
            return (Criteria) this;
        }

        public Criteria andWStatueIn(List<Integer> values) {
            addCriterion("w_statue in", values, "wStatue");
            return (Criteria) this;
        }

        public Criteria andWStatueNotIn(List<Integer> values) {
            addCriterion("w_statue not in", values, "wStatue");
            return (Criteria) this;
        }

        public Criteria andWStatueBetween(Integer value1, Integer value2) {
            addCriterion("w_statue between", value1, value2, "wStatue");
            return (Criteria) this;
        }

        public Criteria andWStatueNotBetween(Integer value1, Integer value2) {
            addCriterion("w_statue not between", value1, value2, "wStatue");
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