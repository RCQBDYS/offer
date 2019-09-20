package com.example.offer.model;

import java.util.ArrayList;
import java.util.List;

public class SkillWishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkillWishExample() {
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

        public Criteria andSwidIsNull() {
            addCriterion("swId is null");
            return (Criteria) this;
        }

        public Criteria andSwidIsNotNull() {
            addCriterion("swId is not null");
            return (Criteria) this;
        }

        public Criteria andSwidEqualTo(Integer value) {
            addCriterion("swId =", value, "swid");
            return (Criteria) this;
        }

        public Criteria andSwidNotEqualTo(Integer value) {
            addCriterion("swId <>", value, "swid");
            return (Criteria) this;
        }

        public Criteria andSwidGreaterThan(Integer value) {
            addCriterion("swId >", value, "swid");
            return (Criteria) this;
        }

        public Criteria andSwidGreaterThanOrEqualTo(Integer value) {
            addCriterion("swId >=", value, "swid");
            return (Criteria) this;
        }

        public Criteria andSwidLessThan(Integer value) {
            addCriterion("swId <", value, "swid");
            return (Criteria) this;
        }

        public Criteria andSwidLessThanOrEqualTo(Integer value) {
            addCriterion("swId <=", value, "swid");
            return (Criteria) this;
        }

        public Criteria andSwidIn(List<Integer> values) {
            addCriterion("swId in", values, "swid");
            return (Criteria) this;
        }

        public Criteria andSwidNotIn(List<Integer> values) {
            addCriterion("swId not in", values, "swid");
            return (Criteria) this;
        }

        public Criteria andSwidBetween(Integer value1, Integer value2) {
            addCriterion("swId between", value1, value2, "swid");
            return (Criteria) this;
        }

        public Criteria andSwidNotBetween(Integer value1, Integer value2) {
            addCriterion("swId not between", value1, value2, "swid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSwjobIsNull() {
            addCriterion("swJob is null");
            return (Criteria) this;
        }

        public Criteria andSwjobIsNotNull() {
            addCriterion("swJob is not null");
            return (Criteria) this;
        }

        public Criteria andSwjobEqualTo(String value) {
            addCriterion("swJob =", value, "swjob");
            return (Criteria) this;
        }

        public Criteria andSwjobNotEqualTo(String value) {
            addCriterion("swJob <>", value, "swjob");
            return (Criteria) this;
        }

        public Criteria andSwjobGreaterThan(String value) {
            addCriterion("swJob >", value, "swjob");
            return (Criteria) this;
        }

        public Criteria andSwjobGreaterThanOrEqualTo(String value) {
            addCriterion("swJob >=", value, "swjob");
            return (Criteria) this;
        }

        public Criteria andSwjobLessThan(String value) {
            addCriterion("swJob <", value, "swjob");
            return (Criteria) this;
        }

        public Criteria andSwjobLessThanOrEqualTo(String value) {
            addCriterion("swJob <=", value, "swjob");
            return (Criteria) this;
        }

        public Criteria andSwjobLike(String value) {
            addCriterion("swJob like", value, "swjob");
            return (Criteria) this;
        }

        public Criteria andSwjobNotLike(String value) {
            addCriterion("swJob not like", value, "swjob");
            return (Criteria) this;
        }

        public Criteria andSwjobIn(List<String> values) {
            addCriterion("swJob in", values, "swjob");
            return (Criteria) this;
        }

        public Criteria andSwjobNotIn(List<String> values) {
            addCriterion("swJob not in", values, "swjob");
            return (Criteria) this;
        }

        public Criteria andSwjobBetween(String value1, String value2) {
            addCriterion("swJob between", value1, value2, "swjob");
            return (Criteria) this;
        }

        public Criteria andSwjobNotBetween(String value1, String value2) {
            addCriterion("swJob not between", value1, value2, "swjob");
            return (Criteria) this;
        }

        public Criteria andSwcityIsNull() {
            addCriterion("swCity is null");
            return (Criteria) this;
        }

        public Criteria andSwcityIsNotNull() {
            addCriterion("swCity is not null");
            return (Criteria) this;
        }

        public Criteria andSwcityEqualTo(String value) {
            addCriterion("swCity =", value, "swcity");
            return (Criteria) this;
        }

        public Criteria andSwcityNotEqualTo(String value) {
            addCriterion("swCity <>", value, "swcity");
            return (Criteria) this;
        }

        public Criteria andSwcityGreaterThan(String value) {
            addCriterion("swCity >", value, "swcity");
            return (Criteria) this;
        }

        public Criteria andSwcityGreaterThanOrEqualTo(String value) {
            addCriterion("swCity >=", value, "swcity");
            return (Criteria) this;
        }

        public Criteria andSwcityLessThan(String value) {
            addCriterion("swCity <", value, "swcity");
            return (Criteria) this;
        }

        public Criteria andSwcityLessThanOrEqualTo(String value) {
            addCriterion("swCity <=", value, "swcity");
            return (Criteria) this;
        }

        public Criteria andSwcityLike(String value) {
            addCriterion("swCity like", value, "swcity");
            return (Criteria) this;
        }

        public Criteria andSwcityNotLike(String value) {
            addCriterion("swCity not like", value, "swcity");
            return (Criteria) this;
        }

        public Criteria andSwcityIn(List<String> values) {
            addCriterion("swCity in", values, "swcity");
            return (Criteria) this;
        }

        public Criteria andSwcityNotIn(List<String> values) {
            addCriterion("swCity not in", values, "swcity");
            return (Criteria) this;
        }

        public Criteria andSwcityBetween(String value1, String value2) {
            addCriterion("swCity between", value1, value2, "swcity");
            return (Criteria) this;
        }

        public Criteria andSwcityNotBetween(String value1, String value2) {
            addCriterion("swCity not between", value1, value2, "swcity");
            return (Criteria) this;
        }

        public Criteria andSwsalaryIsNull() {
            addCriterion("swSalary is null");
            return (Criteria) this;
        }

        public Criteria andSwsalaryIsNotNull() {
            addCriterion("swSalary is not null");
            return (Criteria) this;
        }

        public Criteria andSwsalaryEqualTo(Double value) {
            addCriterion("swSalary =", value, "swsalary");
            return (Criteria) this;
        }

        public Criteria andSwsalaryNotEqualTo(Double value) {
            addCriterion("swSalary <>", value, "swsalary");
            return (Criteria) this;
        }

        public Criteria andSwsalaryGreaterThan(Double value) {
            addCriterion("swSalary >", value, "swsalary");
            return (Criteria) this;
        }

        public Criteria andSwsalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("swSalary >=", value, "swsalary");
            return (Criteria) this;
        }

        public Criteria andSwsalaryLessThan(Double value) {
            addCriterion("swSalary <", value, "swsalary");
            return (Criteria) this;
        }

        public Criteria andSwsalaryLessThanOrEqualTo(Double value) {
            addCriterion("swSalary <=", value, "swsalary");
            return (Criteria) this;
        }

        public Criteria andSwsalaryIn(List<Double> values) {
            addCriterion("swSalary in", values, "swsalary");
            return (Criteria) this;
        }

        public Criteria andSwsalaryNotIn(List<Double> values) {
            addCriterion("swSalary not in", values, "swsalary");
            return (Criteria) this;
        }

        public Criteria andSwsalaryBetween(Double value1, Double value2) {
            addCriterion("swSalary between", value1, value2, "swsalary");
            return (Criteria) this;
        }

        public Criteria andSwsalaryNotBetween(Double value1, Double value2) {
            addCriterion("swSalary not between", value1, value2, "swsalary");
            return (Criteria) this;
        }

        public Criteria andSwskillIsNull() {
            addCriterion("swSkill is null");
            return (Criteria) this;
        }

        public Criteria andSwskillIsNotNull() {
            addCriterion("swSkill is not null");
            return (Criteria) this;
        }

        public Criteria andSwskillEqualTo(String value) {
            addCriterion("swSkill =", value, "swskill");
            return (Criteria) this;
        }

        public Criteria andSwskillNotEqualTo(String value) {
            addCriterion("swSkill <>", value, "swskill");
            return (Criteria) this;
        }

        public Criteria andSwskillGreaterThan(String value) {
            addCriterion("swSkill >", value, "swskill");
            return (Criteria) this;
        }

        public Criteria andSwskillGreaterThanOrEqualTo(String value) {
            addCriterion("swSkill >=", value, "swskill");
            return (Criteria) this;
        }

        public Criteria andSwskillLessThan(String value) {
            addCriterion("swSkill <", value, "swskill");
            return (Criteria) this;
        }

        public Criteria andSwskillLessThanOrEqualTo(String value) {
            addCriterion("swSkill <=", value, "swskill");
            return (Criteria) this;
        }

        public Criteria andSwskillLike(String value) {
            addCriterion("swSkill like", value, "swskill");
            return (Criteria) this;
        }

        public Criteria andSwskillNotLike(String value) {
            addCriterion("swSkill not like", value, "swskill");
            return (Criteria) this;
        }

        public Criteria andSwskillIn(List<String> values) {
            addCriterion("swSkill in", values, "swskill");
            return (Criteria) this;
        }

        public Criteria andSwskillNotIn(List<String> values) {
            addCriterion("swSkill not in", values, "swskill");
            return (Criteria) this;
        }

        public Criteria andSwskillBetween(String value1, String value2) {
            addCriterion("swSkill between", value1, value2, "swskill");
            return (Criteria) this;
        }

        public Criteria andSwskillNotBetween(String value1, String value2) {
            addCriterion("swSkill not between", value1, value2, "swskill");
            return (Criteria) this;
        }

        public Criteria andSwcareerIsNull() {
            addCriterion("swCareer is null");
            return (Criteria) this;
        }

        public Criteria andSwcareerIsNotNull() {
            addCriterion("swCareer is not null");
            return (Criteria) this;
        }

        public Criteria andSwcareerEqualTo(String value) {
            addCriterion("swCareer =", value, "swcareer");
            return (Criteria) this;
        }

        public Criteria andSwcareerNotEqualTo(String value) {
            addCriterion("swCareer <>", value, "swcareer");
            return (Criteria) this;
        }

        public Criteria andSwcareerGreaterThan(String value) {
            addCriterion("swCareer >", value, "swcareer");
            return (Criteria) this;
        }

        public Criteria andSwcareerGreaterThanOrEqualTo(String value) {
            addCriterion("swCareer >=", value, "swcareer");
            return (Criteria) this;
        }

        public Criteria andSwcareerLessThan(String value) {
            addCriterion("swCareer <", value, "swcareer");
            return (Criteria) this;
        }

        public Criteria andSwcareerLessThanOrEqualTo(String value) {
            addCriterion("swCareer <=", value, "swcareer");
            return (Criteria) this;
        }

        public Criteria andSwcareerLike(String value) {
            addCriterion("swCareer like", value, "swcareer");
            return (Criteria) this;
        }

        public Criteria andSwcareerNotLike(String value) {
            addCriterion("swCareer not like", value, "swcareer");
            return (Criteria) this;
        }

        public Criteria andSwcareerIn(List<String> values) {
            addCriterion("swCareer in", values, "swcareer");
            return (Criteria) this;
        }

        public Criteria andSwcareerNotIn(List<String> values) {
            addCriterion("swCareer not in", values, "swcareer");
            return (Criteria) this;
        }

        public Criteria andSwcareerBetween(String value1, String value2) {
            addCriterion("swCareer between", value1, value2, "swcareer");
            return (Criteria) this;
        }

        public Criteria andSwcareerNotBetween(String value1, String value2) {
            addCriterion("swCareer not between", value1, value2, "swcareer");
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