package com.example.offer.model;

import java.util.ArrayList;
import java.util.List;

public class PostMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostMessageExample() {
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

        public Criteria andPostidIsNull() {
            addCriterion("postId is null");
            return (Criteria) this;
        }

        public Criteria andPostidIsNotNull() {
            addCriterion("postId is not null");
            return (Criteria) this;
        }

        public Criteria andPostidEqualTo(Integer value) {
            addCriterion("postId =", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotEqualTo(Integer value) {
            addCriterion("postId <>", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThan(Integer value) {
            addCriterion("postId >", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("postId >=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThan(Integer value) {
            addCriterion("postId <", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThanOrEqualTo(Integer value) {
            addCriterion("postId <=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidIn(List<Integer> values) {
            addCriterion("postId in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotIn(List<Integer> values) {
            addCriterion("postId not in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidBetween(Integer value1, Integer value2) {
            addCriterion("postId between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotBetween(Integer value1, Integer value2) {
            addCriterion("postId not between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostnameIsNull() {
            addCriterion("postName is null");
            return (Criteria) this;
        }

        public Criteria andPostnameIsNotNull() {
            addCriterion("postName is not null");
            return (Criteria) this;
        }

        public Criteria andPostnameEqualTo(String value) {
            addCriterion("postName =", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotEqualTo(String value) {
            addCriterion("postName <>", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameGreaterThan(String value) {
            addCriterion("postName >", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameGreaterThanOrEqualTo(String value) {
            addCriterion("postName >=", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameLessThan(String value) {
            addCriterion("postName <", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameLessThanOrEqualTo(String value) {
            addCriterion("postName <=", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameLike(String value) {
            addCriterion("postName like", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotLike(String value) {
            addCriterion("postName not like", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameIn(List<String> values) {
            addCriterion("postName in", values, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotIn(List<String> values) {
            addCriterion("postName not in", values, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameBetween(String value1, String value2) {
            addCriterion("postName between", value1, value2, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotBetween(String value1, String value2) {
            addCriterion("postName not between", value1, value2, "postname");
            return (Criteria) this;
        }

        public Criteria andPostskillIsNull() {
            addCriterion("postSkill is null");
            return (Criteria) this;
        }

        public Criteria andPostskillIsNotNull() {
            addCriterion("postSkill is not null");
            return (Criteria) this;
        }

        public Criteria andPostskillEqualTo(String value) {
            addCriterion("postSkill =", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillNotEqualTo(String value) {
            addCriterion("postSkill <>", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillGreaterThan(String value) {
            addCriterion("postSkill >", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillGreaterThanOrEqualTo(String value) {
            addCriterion("postSkill >=", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillLessThan(String value) {
            addCriterion("postSkill <", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillLessThanOrEqualTo(String value) {
            addCriterion("postSkill <=", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillLike(String value) {
            addCriterion("postSkill like", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillNotLike(String value) {
            addCriterion("postSkill not like", value, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillIn(List<String> values) {
            addCriterion("postSkill in", values, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillNotIn(List<String> values) {
            addCriterion("postSkill not in", values, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillBetween(String value1, String value2) {
            addCriterion("postSkill between", value1, value2, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostskillNotBetween(String value1, String value2) {
            addCriterion("postSkill not between", value1, value2, "postskill");
            return (Criteria) this;
        }

        public Criteria andPostnumIsNull() {
            addCriterion("postNum is null");
            return (Criteria) this;
        }

        public Criteria andPostnumIsNotNull() {
            addCriterion("postNum is not null");
            return (Criteria) this;
        }

        public Criteria andPostnumEqualTo(Integer value) {
            addCriterion("postNum =", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotEqualTo(Integer value) {
            addCriterion("postNum <>", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumGreaterThan(Integer value) {
            addCriterion("postNum >", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("postNum >=", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumLessThan(Integer value) {
            addCriterion("postNum <", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumLessThanOrEqualTo(Integer value) {
            addCriterion("postNum <=", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumIn(List<Integer> values) {
            addCriterion("postNum in", values, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotIn(List<Integer> values) {
            addCriterion("postNum not in", values, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumBetween(Integer value1, Integer value2) {
            addCriterion("postNum between", value1, value2, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotBetween(Integer value1, Integer value2) {
            addCriterion("postNum not between", value1, value2, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostsalaryIsNull() {
            addCriterion("postSalary is null");
            return (Criteria) this;
        }

        public Criteria andPostsalaryIsNotNull() {
            addCriterion("postSalary is not null");
            return (Criteria) this;
        }

        public Criteria andPostsalaryEqualTo(Double value) {
            addCriterion("postSalary =", value, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryNotEqualTo(Double value) {
            addCriterion("postSalary <>", value, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryGreaterThan(Double value) {
            addCriterion("postSalary >", value, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("postSalary >=", value, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryLessThan(Double value) {
            addCriterion("postSalary <", value, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryLessThanOrEqualTo(Double value) {
            addCriterion("postSalary <=", value, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryIn(List<Double> values) {
            addCriterion("postSalary in", values, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryNotIn(List<Double> values) {
            addCriterion("postSalary not in", values, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryBetween(Double value1, Double value2) {
            addCriterion("postSalary between", value1, value2, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsalaryNotBetween(Double value1, Double value2) {
            addCriterion("postSalary not between", value1, value2, "postsalary");
            return (Criteria) this;
        }

        public Criteria andPostsuccnumIsNull() {
            addCriterion("postSuccNum is null");
            return (Criteria) this;
        }

        public Criteria andPostsuccnumIsNotNull() {
            addCriterion("postSuccNum is not null");
            return (Criteria) this;
        }

        public Criteria andPostsuccnumEqualTo(Integer value) {
            addCriterion("postSuccNum =", value, "postsuccnum");
            return (Criteria) this;
        }

        public Criteria andPostsuccnumNotEqualTo(Integer value) {
            addCriterion("postSuccNum <>", value, "postsuccnum");
            return (Criteria) this;
        }

        public Criteria andPostsuccnumGreaterThan(Integer value) {
            addCriterion("postSuccNum >", value, "postsuccnum");
            return (Criteria) this;
        }

        public Criteria andPostsuccnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("postSuccNum >=", value, "postsuccnum");
            return (Criteria) this;
        }

        public Criteria andPostsuccnumLessThan(Integer value) {
            addCriterion("postSuccNum <", value, "postsuccnum");
            return (Criteria) this;
        }

        public Criteria andPostsuccnumLessThanOrEqualTo(Integer value) {
            addCriterion("postSuccNum <=", value, "postsuccnum");
            return (Criteria) this;
        }

        public Criteria andPostsuccnumIn(List<Integer> values) {
            addCriterion("postSuccNum in", values, "postsuccnum");
            return (Criteria) this;
        }

        public Criteria andPostsuccnumNotIn(List<Integer> values) {
            addCriterion("postSuccNum not in", values, "postsuccnum");
            return (Criteria) this;
        }

        public Criteria andPostsuccnumBetween(Integer value1, Integer value2) {
            addCriterion("postSuccNum between", value1, value2, "postsuccnum");
            return (Criteria) this;
        }

        public Criteria andPostsuccnumNotBetween(Integer value1, Integer value2) {
            addCriterion("postSuccNum not between", value1, value2, "postsuccnum");
            return (Criteria) this;
        }

        public Criteria andPostintroduceIsNull() {
            addCriterion("postIntroduce is null");
            return (Criteria) this;
        }

        public Criteria andPostintroduceIsNotNull() {
            addCriterion("postIntroduce is not null");
            return (Criteria) this;
        }

        public Criteria andPostintroduceEqualTo(String value) {
            addCriterion("postIntroduce =", value, "postintroduce");
            return (Criteria) this;
        }

        public Criteria andPostintroduceNotEqualTo(String value) {
            addCriterion("postIntroduce <>", value, "postintroduce");
            return (Criteria) this;
        }

        public Criteria andPostintroduceGreaterThan(String value) {
            addCriterion("postIntroduce >", value, "postintroduce");
            return (Criteria) this;
        }

        public Criteria andPostintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("postIntroduce >=", value, "postintroduce");
            return (Criteria) this;
        }

        public Criteria andPostintroduceLessThan(String value) {
            addCriterion("postIntroduce <", value, "postintroduce");
            return (Criteria) this;
        }

        public Criteria andPostintroduceLessThanOrEqualTo(String value) {
            addCriterion("postIntroduce <=", value, "postintroduce");
            return (Criteria) this;
        }

        public Criteria andPostintroduceLike(String value) {
            addCriterion("postIntroduce like", value, "postintroduce");
            return (Criteria) this;
        }

        public Criteria andPostintroduceNotLike(String value) {
            addCriterion("postIntroduce not like", value, "postintroduce");
            return (Criteria) this;
        }

        public Criteria andPostintroduceIn(List<String> values) {
            addCriterion("postIntroduce in", values, "postintroduce");
            return (Criteria) this;
        }

        public Criteria andPostintroduceNotIn(List<String> values) {
            addCriterion("postIntroduce not in", values, "postintroduce");
            return (Criteria) this;
        }

        public Criteria andPostintroduceBetween(String value1, String value2) {
            addCriterion("postIntroduce between", value1, value2, "postintroduce");
            return (Criteria) this;
        }

        public Criteria andPostintroduceNotBetween(String value1, String value2) {
            addCriterion("postIntroduce not between", value1, value2, "postintroduce");
            return (Criteria) this;
        }

        public Criteria andPostrequireIsNull() {
            addCriterion("postRequire is null");
            return (Criteria) this;
        }

        public Criteria andPostrequireIsNotNull() {
            addCriterion("postRequire is not null");
            return (Criteria) this;
        }

        public Criteria andPostrequireEqualTo(String value) {
            addCriterion("postRequire =", value, "postrequire");
            return (Criteria) this;
        }

        public Criteria andPostrequireNotEqualTo(String value) {
            addCriterion("postRequire <>", value, "postrequire");
            return (Criteria) this;
        }

        public Criteria andPostrequireGreaterThan(String value) {
            addCriterion("postRequire >", value, "postrequire");
            return (Criteria) this;
        }

        public Criteria andPostrequireGreaterThanOrEqualTo(String value) {
            addCriterion("postRequire >=", value, "postrequire");
            return (Criteria) this;
        }

        public Criteria andPostrequireLessThan(String value) {
            addCriterion("postRequire <", value, "postrequire");
            return (Criteria) this;
        }

        public Criteria andPostrequireLessThanOrEqualTo(String value) {
            addCriterion("postRequire <=", value, "postrequire");
            return (Criteria) this;
        }

        public Criteria andPostrequireLike(String value) {
            addCriterion("postRequire like", value, "postrequire");
            return (Criteria) this;
        }

        public Criteria andPostrequireNotLike(String value) {
            addCriterion("postRequire not like", value, "postrequire");
            return (Criteria) this;
        }

        public Criteria andPostrequireIn(List<String> values) {
            addCriterion("postRequire in", values, "postrequire");
            return (Criteria) this;
        }

        public Criteria andPostrequireNotIn(List<String> values) {
            addCriterion("postRequire not in", values, "postrequire");
            return (Criteria) this;
        }

        public Criteria andPostrequireBetween(String value1, String value2) {
            addCriterion("postRequire between", value1, value2, "postrequire");
            return (Criteria) this;
        }

        public Criteria andPostrequireNotBetween(String value1, String value2) {
            addCriterion("postRequire not between", value1, value2, "postrequire");
            return (Criteria) this;
        }

        public Criteria andPostaddressIsNull() {
            addCriterion("postAddress is null");
            return (Criteria) this;
        }

        public Criteria andPostaddressIsNotNull() {
            addCriterion("postAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPostaddressEqualTo(String value) {
            addCriterion("postAddress =", value, "postaddress");
            return (Criteria) this;
        }

        public Criteria andPostaddressNotEqualTo(String value) {
            addCriterion("postAddress <>", value, "postaddress");
            return (Criteria) this;
        }

        public Criteria andPostaddressGreaterThan(String value) {
            addCriterion("postAddress >", value, "postaddress");
            return (Criteria) this;
        }

        public Criteria andPostaddressGreaterThanOrEqualTo(String value) {
            addCriterion("postAddress >=", value, "postaddress");
            return (Criteria) this;
        }

        public Criteria andPostaddressLessThan(String value) {
            addCriterion("postAddress <", value, "postaddress");
            return (Criteria) this;
        }

        public Criteria andPostaddressLessThanOrEqualTo(String value) {
            addCriterion("postAddress <=", value, "postaddress");
            return (Criteria) this;
        }

        public Criteria andPostaddressLike(String value) {
            addCriterion("postAddress like", value, "postaddress");
            return (Criteria) this;
        }

        public Criteria andPostaddressNotLike(String value) {
            addCriterion("postAddress not like", value, "postaddress");
            return (Criteria) this;
        }

        public Criteria andPostaddressIn(List<String> values) {
            addCriterion("postAddress in", values, "postaddress");
            return (Criteria) this;
        }

        public Criteria andPostaddressNotIn(List<String> values) {
            addCriterion("postAddress not in", values, "postaddress");
            return (Criteria) this;
        }

        public Criteria andPostaddressBetween(String value1, String value2) {
            addCriterion("postAddress between", value1, value2, "postaddress");
            return (Criteria) this;
        }

        public Criteria andPostaddressNotBetween(String value1, String value2) {
            addCriterion("postAddress not between", value1, value2, "postaddress");
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