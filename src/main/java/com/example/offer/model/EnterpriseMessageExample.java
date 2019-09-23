package com.example.offer.model;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseMessageExample() {
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

        public Criteria andEnteridIsNull() {
            addCriterion("enterId is null");
            return (Criteria) this;
        }

        public Criteria andEnteridIsNotNull() {
            addCriterion("enterId is not null");
            return (Criteria) this;
        }

        public Criteria andEnteridEqualTo(Integer value) {
            addCriterion("enterId =", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridNotEqualTo(Integer value) {
            addCriterion("enterId <>", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridGreaterThan(Integer value) {
            addCriterion("enterId >", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterId >=", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridLessThan(Integer value) {
            addCriterion("enterId <", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridLessThanOrEqualTo(Integer value) {
            addCriterion("enterId <=", value, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridIn(List<Integer> values) {
            addCriterion("enterId in", values, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridNotIn(List<Integer> values) {
            addCriterion("enterId not in", values, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridBetween(Integer value1, Integer value2) {
            addCriterion("enterId between", value1, value2, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnteridNotBetween(Integer value1, Integer value2) {
            addCriterion("enterId not between", value1, value2, "enterid");
            return (Criteria) this;
        }

        public Criteria andEnternameIsNull() {
            addCriterion("enterName is null");
            return (Criteria) this;
        }

        public Criteria andEnternameIsNotNull() {
            addCriterion("enterName is not null");
            return (Criteria) this;
        }

        public Criteria andEnternameEqualTo(String value) {
            addCriterion("enterName =", value, "entername");
            return (Criteria) this;
        }

        public Criteria andEnternameNotEqualTo(String value) {
            addCriterion("enterName <>", value, "entername");
            return (Criteria) this;
        }

        public Criteria andEnternameGreaterThan(String value) {
            addCriterion("enterName >", value, "entername");
            return (Criteria) this;
        }

        public Criteria andEnternameGreaterThanOrEqualTo(String value) {
            addCriterion("enterName >=", value, "entername");
            return (Criteria) this;
        }

        public Criteria andEnternameLessThan(String value) {
            addCriterion("enterName <", value, "entername");
            return (Criteria) this;
        }

        public Criteria andEnternameLessThanOrEqualTo(String value) {
            addCriterion("enterName <=", value, "entername");
            return (Criteria) this;
        }

        public Criteria andEnternameLike(String value) {
            addCriterion("enterName like", value, "entername");
            return (Criteria) this;
        }

        public Criteria andEnternameNotLike(String value) {
            addCriterion("enterName not like", value, "entername");
            return (Criteria) this;
        }

        public Criteria andEnternameIn(List<String> values) {
            addCriterion("enterName in", values, "entername");
            return (Criteria) this;
        }

        public Criteria andEnternameNotIn(List<String> values) {
            addCriterion("enterName not in", values, "entername");
            return (Criteria) this;
        }

        public Criteria andEnternameBetween(String value1, String value2) {
            addCriterion("enterName between", value1, value2, "entername");
            return (Criteria) this;
        }

        public Criteria andEnternameNotBetween(String value1, String value2) {
            addCriterion("enterName not between", value1, value2, "entername");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceIsNull() {
            addCriterion("enterIntroduce is null");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceIsNotNull() {
            addCriterion("enterIntroduce is not null");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceEqualTo(String value) {
            addCriterion("enterIntroduce =", value, "enterintroduce");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceNotEqualTo(String value) {
            addCriterion("enterIntroduce <>", value, "enterintroduce");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceGreaterThan(String value) {
            addCriterion("enterIntroduce >", value, "enterintroduce");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("enterIntroduce >=", value, "enterintroduce");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceLessThan(String value) {
            addCriterion("enterIntroduce <", value, "enterintroduce");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceLessThanOrEqualTo(String value) {
            addCriterion("enterIntroduce <=", value, "enterintroduce");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceLike(String value) {
            addCriterion("enterIntroduce like", value, "enterintroduce");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceNotLike(String value) {
            addCriterion("enterIntroduce not like", value, "enterintroduce");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceIn(List<String> values) {
            addCriterion("enterIntroduce in", values, "enterintroduce");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceNotIn(List<String> values) {
            addCriterion("enterIntroduce not in", values, "enterintroduce");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceBetween(String value1, String value2) {
            addCriterion("enterIntroduce between", value1, value2, "enterintroduce");
            return (Criteria) this;
        }

        public Criteria andEnterintroduceNotBetween(String value1, String value2) {
            addCriterion("enterIntroduce not between", value1, value2, "enterintroduce");
            return (Criteria) this;
        }

        public Criteria andEntersizeIsNull() {
            addCriterion("enterSize is null");
            return (Criteria) this;
        }

        public Criteria andEntersizeIsNotNull() {
            addCriterion("enterSize is not null");
            return (Criteria) this;
        }

        public Criteria andEntersizeEqualTo(Integer value) {
            addCriterion("enterSize =", value, "entersize");
            return (Criteria) this;
        }

        public Criteria andEntersizeNotEqualTo(Integer value) {
            addCriterion("enterSize <>", value, "entersize");
            return (Criteria) this;
        }

        public Criteria andEntersizeGreaterThan(Integer value) {
            addCriterion("enterSize >", value, "entersize");
            return (Criteria) this;
        }

        public Criteria andEntersizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterSize >=", value, "entersize");
            return (Criteria) this;
        }

        public Criteria andEntersizeLessThan(Integer value) {
            addCriterion("enterSize <", value, "entersize");
            return (Criteria) this;
        }

        public Criteria andEntersizeLessThanOrEqualTo(Integer value) {
            addCriterion("enterSize <=", value, "entersize");
            return (Criteria) this;
        }

        public Criteria andEntersizeIn(List<Integer> values) {
            addCriterion("enterSize in", values, "entersize");
            return (Criteria) this;
        }

        public Criteria andEntersizeNotIn(List<Integer> values) {
            addCriterion("enterSize not in", values, "entersize");
            return (Criteria) this;
        }

        public Criteria andEntersizeBetween(Integer value1, Integer value2) {
            addCriterion("enterSize between", value1, value2, "entersize");
            return (Criteria) this;
        }

        public Criteria andEntersizeNotBetween(Integer value1, Integer value2) {
            addCriterion("enterSize not between", value1, value2, "entersize");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareIsNull() {
            addCriterion("enterWelfare is null");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareIsNotNull() {
            addCriterion("enterWelfare is not null");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareEqualTo(String value) {
            addCriterion("enterWelfare =", value, "enterwelfare");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareNotEqualTo(String value) {
            addCriterion("enterWelfare <>", value, "enterwelfare");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareGreaterThan(String value) {
            addCriterion("enterWelfare >", value, "enterwelfare");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareGreaterThanOrEqualTo(String value) {
            addCriterion("enterWelfare >=", value, "enterwelfare");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareLessThan(String value) {
            addCriterion("enterWelfare <", value, "enterwelfare");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareLessThanOrEqualTo(String value) {
            addCriterion("enterWelfare <=", value, "enterwelfare");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareLike(String value) {
            addCriterion("enterWelfare like", value, "enterwelfare");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareNotLike(String value) {
            addCriterion("enterWelfare not like", value, "enterwelfare");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareIn(List<String> values) {
            addCriterion("enterWelfare in", values, "enterwelfare");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareNotIn(List<String> values) {
            addCriterion("enterWelfare not in", values, "enterwelfare");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareBetween(String value1, String value2) {
            addCriterion("enterWelfare between", value1, value2, "enterwelfare");
            return (Criteria) this;
        }

        public Criteria andEnterwelfareNotBetween(String value1, String value2) {
            addCriterion("enterWelfare not between", value1, value2, "enterwelfare");
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