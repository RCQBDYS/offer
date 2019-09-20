package com.example.offer.model;

import java.util.ArrayList;
import java.util.List;

public class PutPostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PutPostExample() {
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

        public Criteria andPutidIsNull() {
            addCriterion("putId is null");
            return (Criteria) this;
        }

        public Criteria andPutidIsNotNull() {
            addCriterion("putId is not null");
            return (Criteria) this;
        }

        public Criteria andPutidEqualTo(Integer value) {
            addCriterion("putId =", value, "putid");
            return (Criteria) this;
        }

        public Criteria andPutidNotEqualTo(Integer value) {
            addCriterion("putId <>", value, "putid");
            return (Criteria) this;
        }

        public Criteria andPutidGreaterThan(Integer value) {
            addCriterion("putId >", value, "putid");
            return (Criteria) this;
        }

        public Criteria andPutidGreaterThanOrEqualTo(Integer value) {
            addCriterion("putId >=", value, "putid");
            return (Criteria) this;
        }

        public Criteria andPutidLessThan(Integer value) {
            addCriterion("putId <", value, "putid");
            return (Criteria) this;
        }

        public Criteria andPutidLessThanOrEqualTo(Integer value) {
            addCriterion("putId <=", value, "putid");
            return (Criteria) this;
        }

        public Criteria andPutidIn(List<Integer> values) {
            addCriterion("putId in", values, "putid");
            return (Criteria) this;
        }

        public Criteria andPutidNotIn(List<Integer> values) {
            addCriterion("putId not in", values, "putid");
            return (Criteria) this;
        }

        public Criteria andPutidBetween(Integer value1, Integer value2) {
            addCriterion("putId between", value1, value2, "putid");
            return (Criteria) this;
        }

        public Criteria andPutidNotBetween(Integer value1, Integer value2) {
            addCriterion("putId not between", value1, value2, "putid");
            return (Criteria) this;
        }

        public Criteria andPutnameIsNull() {
            addCriterion("putName is null");
            return (Criteria) this;
        }

        public Criteria andPutnameIsNotNull() {
            addCriterion("putName is not null");
            return (Criteria) this;
        }

        public Criteria andPutnameEqualTo(String value) {
            addCriterion("putName =", value, "putname");
            return (Criteria) this;
        }

        public Criteria andPutnameNotEqualTo(String value) {
            addCriterion("putName <>", value, "putname");
            return (Criteria) this;
        }

        public Criteria andPutnameGreaterThan(String value) {
            addCriterion("putName >", value, "putname");
            return (Criteria) this;
        }

        public Criteria andPutnameGreaterThanOrEqualTo(String value) {
            addCriterion("putName >=", value, "putname");
            return (Criteria) this;
        }

        public Criteria andPutnameLessThan(String value) {
            addCriterion("putName <", value, "putname");
            return (Criteria) this;
        }

        public Criteria andPutnameLessThanOrEqualTo(String value) {
            addCriterion("putName <=", value, "putname");
            return (Criteria) this;
        }

        public Criteria andPutnameLike(String value) {
            addCriterion("putName like", value, "putname");
            return (Criteria) this;
        }

        public Criteria andPutnameNotLike(String value) {
            addCriterion("putName not like", value, "putname");
            return (Criteria) this;
        }

        public Criteria andPutnameIn(List<String> values) {
            addCriterion("putName in", values, "putname");
            return (Criteria) this;
        }

        public Criteria andPutnameNotIn(List<String> values) {
            addCriterion("putName not in", values, "putname");
            return (Criteria) this;
        }

        public Criteria andPutnameBetween(String value1, String value2) {
            addCriterion("putName between", value1, value2, "putname");
            return (Criteria) this;
        }

        public Criteria andPutnameNotBetween(String value1, String value2) {
            addCriterion("putName not between", value1, value2, "putname");
            return (Criteria) this;
        }

        public Criteria andPutskillIsNull() {
            addCriterion("putSkill is null");
            return (Criteria) this;
        }

        public Criteria andPutskillIsNotNull() {
            addCriterion("putSkill is not null");
            return (Criteria) this;
        }

        public Criteria andPutskillEqualTo(String value) {
            addCriterion("putSkill =", value, "putskill");
            return (Criteria) this;
        }

        public Criteria andPutskillNotEqualTo(String value) {
            addCriterion("putSkill <>", value, "putskill");
            return (Criteria) this;
        }

        public Criteria andPutskillGreaterThan(String value) {
            addCriterion("putSkill >", value, "putskill");
            return (Criteria) this;
        }

        public Criteria andPutskillGreaterThanOrEqualTo(String value) {
            addCriterion("putSkill >=", value, "putskill");
            return (Criteria) this;
        }

        public Criteria andPutskillLessThan(String value) {
            addCriterion("putSkill <", value, "putskill");
            return (Criteria) this;
        }

        public Criteria andPutskillLessThanOrEqualTo(String value) {
            addCriterion("putSkill <=", value, "putskill");
            return (Criteria) this;
        }

        public Criteria andPutskillLike(String value) {
            addCriterion("putSkill like", value, "putskill");
            return (Criteria) this;
        }

        public Criteria andPutskillNotLike(String value) {
            addCriterion("putSkill not like", value, "putskill");
            return (Criteria) this;
        }

        public Criteria andPutskillIn(List<String> values) {
            addCriterion("putSkill in", values, "putskill");
            return (Criteria) this;
        }

        public Criteria andPutskillNotIn(List<String> values) {
            addCriterion("putSkill not in", values, "putskill");
            return (Criteria) this;
        }

        public Criteria andPutskillBetween(String value1, String value2) {
            addCriterion("putSkill between", value1, value2, "putskill");
            return (Criteria) this;
        }

        public Criteria andPutskillNotBetween(String value1, String value2) {
            addCriterion("putSkill not between", value1, value2, "putskill");
            return (Criteria) this;
        }

        public Criteria andPutsalaryIsNull() {
            addCriterion("putSalary is null");
            return (Criteria) this;
        }

        public Criteria andPutsalaryIsNotNull() {
            addCriterion("putSalary is not null");
            return (Criteria) this;
        }

        public Criteria andPutsalaryEqualTo(Double value) {
            addCriterion("putSalary =", value, "putsalary");
            return (Criteria) this;
        }

        public Criteria andPutsalaryNotEqualTo(Double value) {
            addCriterion("putSalary <>", value, "putsalary");
            return (Criteria) this;
        }

        public Criteria andPutsalaryGreaterThan(Double value) {
            addCriterion("putSalary >", value, "putsalary");
            return (Criteria) this;
        }

        public Criteria andPutsalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("putSalary >=", value, "putsalary");
            return (Criteria) this;
        }

        public Criteria andPutsalaryLessThan(Double value) {
            addCriterion("putSalary <", value, "putsalary");
            return (Criteria) this;
        }

        public Criteria andPutsalaryLessThanOrEqualTo(Double value) {
            addCriterion("putSalary <=", value, "putsalary");
            return (Criteria) this;
        }

        public Criteria andPutsalaryIn(List<Double> values) {
            addCriterion("putSalary in", values, "putsalary");
            return (Criteria) this;
        }

        public Criteria andPutsalaryNotIn(List<Double> values) {
            addCriterion("putSalary not in", values, "putsalary");
            return (Criteria) this;
        }

        public Criteria andPutsalaryBetween(Double value1, Double value2) {
            addCriterion("putSalary between", value1, value2, "putsalary");
            return (Criteria) this;
        }

        public Criteria andPutsalaryNotBetween(Double value1, Double value2) {
            addCriterion("putSalary not between", value1, value2, "putsalary");
            return (Criteria) this;
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

        public Criteria andPutnumIsNull() {
            addCriterion("putNum is null");
            return (Criteria) this;
        }

        public Criteria andPutnumIsNotNull() {
            addCriterion("putNum is not null");
            return (Criteria) this;
        }

        public Criteria andPutnumEqualTo(Integer value) {
            addCriterion("putNum =", value, "putnum");
            return (Criteria) this;
        }

        public Criteria andPutnumNotEqualTo(Integer value) {
            addCriterion("putNum <>", value, "putnum");
            return (Criteria) this;
        }

        public Criteria andPutnumGreaterThan(Integer value) {
            addCriterion("putNum >", value, "putnum");
            return (Criteria) this;
        }

        public Criteria andPutnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("putNum >=", value, "putnum");
            return (Criteria) this;
        }

        public Criteria andPutnumLessThan(Integer value) {
            addCriterion("putNum <", value, "putnum");
            return (Criteria) this;
        }

        public Criteria andPutnumLessThanOrEqualTo(Integer value) {
            addCriterion("putNum <=", value, "putnum");
            return (Criteria) this;
        }

        public Criteria andPutnumIn(List<Integer> values) {
            addCriterion("putNum in", values, "putnum");
            return (Criteria) this;
        }

        public Criteria andPutnumNotIn(List<Integer> values) {
            addCriterion("putNum not in", values, "putnum");
            return (Criteria) this;
        }

        public Criteria andPutnumBetween(Integer value1, Integer value2) {
            addCriterion("putNum between", value1, value2, "putnum");
            return (Criteria) this;
        }

        public Criteria andPutnumNotBetween(Integer value1, Integer value2) {
            addCriterion("putNum not between", value1, value2, "putnum");
            return (Criteria) this;
        }

        public Criteria andPutintroduceIsNull() {
            addCriterion("putIntroduce is null");
            return (Criteria) this;
        }

        public Criteria andPutintroduceIsNotNull() {
            addCriterion("putIntroduce is not null");
            return (Criteria) this;
        }

        public Criteria andPutintroduceEqualTo(String value) {
            addCriterion("putIntroduce =", value, "putintroduce");
            return (Criteria) this;
        }

        public Criteria andPutintroduceNotEqualTo(String value) {
            addCriterion("putIntroduce <>", value, "putintroduce");
            return (Criteria) this;
        }

        public Criteria andPutintroduceGreaterThan(String value) {
            addCriterion("putIntroduce >", value, "putintroduce");
            return (Criteria) this;
        }

        public Criteria andPutintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("putIntroduce >=", value, "putintroduce");
            return (Criteria) this;
        }

        public Criteria andPutintroduceLessThan(String value) {
            addCriterion("putIntroduce <", value, "putintroduce");
            return (Criteria) this;
        }

        public Criteria andPutintroduceLessThanOrEqualTo(String value) {
            addCriterion("putIntroduce <=", value, "putintroduce");
            return (Criteria) this;
        }

        public Criteria andPutintroduceLike(String value) {
            addCriterion("putIntroduce like", value, "putintroduce");
            return (Criteria) this;
        }

        public Criteria andPutintroduceNotLike(String value) {
            addCriterion("putIntroduce not like", value, "putintroduce");
            return (Criteria) this;
        }

        public Criteria andPutintroduceIn(List<String> values) {
            addCriterion("putIntroduce in", values, "putintroduce");
            return (Criteria) this;
        }

        public Criteria andPutintroduceNotIn(List<String> values) {
            addCriterion("putIntroduce not in", values, "putintroduce");
            return (Criteria) this;
        }

        public Criteria andPutintroduceBetween(String value1, String value2) {
            addCriterion("putIntroduce between", value1, value2, "putintroduce");
            return (Criteria) this;
        }

        public Criteria andPutintroduceNotBetween(String value1, String value2) {
            addCriterion("putIntroduce not between", value1, value2, "putintroduce");
            return (Criteria) this;
        }

        public Criteria andPutrequireIsNull() {
            addCriterion("putRequire is null");
            return (Criteria) this;
        }

        public Criteria andPutrequireIsNotNull() {
            addCriterion("putRequire is not null");
            return (Criteria) this;
        }

        public Criteria andPutrequireEqualTo(String value) {
            addCriterion("putRequire =", value, "putrequire");
            return (Criteria) this;
        }

        public Criteria andPutrequireNotEqualTo(String value) {
            addCriterion("putRequire <>", value, "putrequire");
            return (Criteria) this;
        }

        public Criteria andPutrequireGreaterThan(String value) {
            addCriterion("putRequire >", value, "putrequire");
            return (Criteria) this;
        }

        public Criteria andPutrequireGreaterThanOrEqualTo(String value) {
            addCriterion("putRequire >=", value, "putrequire");
            return (Criteria) this;
        }

        public Criteria andPutrequireLessThan(String value) {
            addCriterion("putRequire <", value, "putrequire");
            return (Criteria) this;
        }

        public Criteria andPutrequireLessThanOrEqualTo(String value) {
            addCriterion("putRequire <=", value, "putrequire");
            return (Criteria) this;
        }

        public Criteria andPutrequireLike(String value) {
            addCriterion("putRequire like", value, "putrequire");
            return (Criteria) this;
        }

        public Criteria andPutrequireNotLike(String value) {
            addCriterion("putRequire not like", value, "putrequire");
            return (Criteria) this;
        }

        public Criteria andPutrequireIn(List<String> values) {
            addCriterion("putRequire in", values, "putrequire");
            return (Criteria) this;
        }

        public Criteria andPutrequireNotIn(List<String> values) {
            addCriterion("putRequire not in", values, "putrequire");
            return (Criteria) this;
        }

        public Criteria andPutrequireBetween(String value1, String value2) {
            addCriterion("putRequire between", value1, value2, "putrequire");
            return (Criteria) this;
        }

        public Criteria andPutrequireNotBetween(String value1, String value2) {
            addCriterion("putRequire not between", value1, value2, "putrequire");
            return (Criteria) this;
        }

        public Criteria andPutaddressIsNull() {
            addCriterion("putAddress is null");
            return (Criteria) this;
        }

        public Criteria andPutaddressIsNotNull() {
            addCriterion("putAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPutaddressEqualTo(String value) {
            addCriterion("putAddress =", value, "putaddress");
            return (Criteria) this;
        }

        public Criteria andPutaddressNotEqualTo(String value) {
            addCriterion("putAddress <>", value, "putaddress");
            return (Criteria) this;
        }

        public Criteria andPutaddressGreaterThan(String value) {
            addCriterion("putAddress >", value, "putaddress");
            return (Criteria) this;
        }

        public Criteria andPutaddressGreaterThanOrEqualTo(String value) {
            addCriterion("putAddress >=", value, "putaddress");
            return (Criteria) this;
        }

        public Criteria andPutaddressLessThan(String value) {
            addCriterion("putAddress <", value, "putaddress");
            return (Criteria) this;
        }

        public Criteria andPutaddressLessThanOrEqualTo(String value) {
            addCriterion("putAddress <=", value, "putaddress");
            return (Criteria) this;
        }

        public Criteria andPutaddressLike(String value) {
            addCriterion("putAddress like", value, "putaddress");
            return (Criteria) this;
        }

        public Criteria andPutaddressNotLike(String value) {
            addCriterion("putAddress not like", value, "putaddress");
            return (Criteria) this;
        }

        public Criteria andPutaddressIn(List<String> values) {
            addCriterion("putAddress in", values, "putaddress");
            return (Criteria) this;
        }

        public Criteria andPutaddressNotIn(List<String> values) {
            addCriterion("putAddress not in", values, "putaddress");
            return (Criteria) this;
        }

        public Criteria andPutaddressBetween(String value1, String value2) {
            addCriterion("putAddress between", value1, value2, "putaddress");
            return (Criteria) this;
        }

        public Criteria andPutaddressNotBetween(String value1, String value2) {
            addCriterion("putAddress not between", value1, value2, "putaddress");
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