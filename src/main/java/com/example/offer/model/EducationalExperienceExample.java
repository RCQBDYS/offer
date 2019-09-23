package com.example.offer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EducationalExperienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EducationalExperienceExample() {
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

        public Criteria andEduidIsNull() {
            addCriterion("eduId is null");
            return (Criteria) this;
        }

        public Criteria andEduidIsNotNull() {
            addCriterion("eduId is not null");
            return (Criteria) this;
        }

        public Criteria andEduidEqualTo(Integer value) {
            addCriterion("eduId =", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidNotEqualTo(Integer value) {
            addCriterion("eduId <>", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidGreaterThan(Integer value) {
            addCriterion("eduId >", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eduId >=", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidLessThan(Integer value) {
            addCriterion("eduId <", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidLessThanOrEqualTo(Integer value) {
            addCriterion("eduId <=", value, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidIn(List<Integer> values) {
            addCriterion("eduId in", values, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidNotIn(List<Integer> values) {
            addCriterion("eduId not in", values, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidBetween(Integer value1, Integer value2) {
            addCriterion("eduId between", value1, value2, "eduid");
            return (Criteria) this;
        }

        public Criteria andEduidNotBetween(Integer value1, Integer value2) {
            addCriterion("eduId not between", value1, value2, "eduid");
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

        public Criteria andEduschoolIsNull() {
            addCriterion("eduSchool is null");
            return (Criteria) this;
        }

        public Criteria andEduschoolIsNotNull() {
            addCriterion("eduSchool is not null");
            return (Criteria) this;
        }

        public Criteria andEduschoolEqualTo(String value) {
            addCriterion("eduSchool =", value, "eduschool");
            return (Criteria) this;
        }

        public Criteria andEduschoolNotEqualTo(String value) {
            addCriterion("eduSchool <>", value, "eduschool");
            return (Criteria) this;
        }

        public Criteria andEduschoolGreaterThan(String value) {
            addCriterion("eduSchool >", value, "eduschool");
            return (Criteria) this;
        }

        public Criteria andEduschoolGreaterThanOrEqualTo(String value) {
            addCriterion("eduSchool >=", value, "eduschool");
            return (Criteria) this;
        }

        public Criteria andEduschoolLessThan(String value) {
            addCriterion("eduSchool <", value, "eduschool");
            return (Criteria) this;
        }

        public Criteria andEduschoolLessThanOrEqualTo(String value) {
            addCriterion("eduSchool <=", value, "eduschool");
            return (Criteria) this;
        }

        public Criteria andEduschoolLike(String value) {
            addCriterion("eduSchool like", value, "eduschool");
            return (Criteria) this;
        }

        public Criteria andEduschoolNotLike(String value) {
            addCriterion("eduSchool not like", value, "eduschool");
            return (Criteria) this;
        }

        public Criteria andEduschoolIn(List<String> values) {
            addCriterion("eduSchool in", values, "eduschool");
            return (Criteria) this;
        }

        public Criteria andEduschoolNotIn(List<String> values) {
            addCriterion("eduSchool not in", values, "eduschool");
            return (Criteria) this;
        }

        public Criteria andEduschoolBetween(String value1, String value2) {
            addCriterion("eduSchool between", value1, value2, "eduschool");
            return (Criteria) this;
        }

        public Criteria andEduschoolNotBetween(String value1, String value2) {
            addCriterion("eduSchool not between", value1, value2, "eduschool");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsIsNull() {
            addCriterion("eduQualifications is null");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsIsNotNull() {
            addCriterion("eduQualifications is not null");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsEqualTo(String value) {
            addCriterion("eduQualifications =", value, "eduqualifications");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsNotEqualTo(String value) {
            addCriterion("eduQualifications <>", value, "eduqualifications");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsGreaterThan(String value) {
            addCriterion("eduQualifications >", value, "eduqualifications");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsGreaterThanOrEqualTo(String value) {
            addCriterion("eduQualifications >=", value, "eduqualifications");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsLessThan(String value) {
            addCriterion("eduQualifications <", value, "eduqualifications");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsLessThanOrEqualTo(String value) {
            addCriterion("eduQualifications <=", value, "eduqualifications");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsLike(String value) {
            addCriterion("eduQualifications like", value, "eduqualifications");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsNotLike(String value) {
            addCriterion("eduQualifications not like", value, "eduqualifications");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsIn(List<String> values) {
            addCriterion("eduQualifications in", values, "eduqualifications");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsNotIn(List<String> values) {
            addCriterion("eduQualifications not in", values, "eduqualifications");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsBetween(String value1, String value2) {
            addCriterion("eduQualifications between", value1, value2, "eduqualifications");
            return (Criteria) this;
        }

        public Criteria andEduqualificationsNotBetween(String value1, String value2) {
            addCriterion("eduQualifications not between", value1, value2, "eduqualifications");
            return (Criteria) this;
        }

        public Criteria andEdustartdateIsNull() {
            addCriterion("eduStartDate is null");
            return (Criteria) this;
        }

        public Criteria andEdustartdateIsNotNull() {
            addCriterion("eduStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andEdustartdateEqualTo(Date value) {
            addCriterion("eduStartDate =", value, "edustartdate");
            return (Criteria) this;
        }

        public Criteria andEdustartdateNotEqualTo(Date value) {
            addCriterion("eduStartDate <>", value, "edustartdate");
            return (Criteria) this;
        }

        public Criteria andEdustartdateGreaterThan(Date value) {
            addCriterion("eduStartDate >", value, "edustartdate");
            return (Criteria) this;
        }

        public Criteria andEdustartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("eduStartDate >=", value, "edustartdate");
            return (Criteria) this;
        }

        public Criteria andEdustartdateLessThan(Date value) {
            addCriterion("eduStartDate <", value, "edustartdate");
            return (Criteria) this;
        }

        public Criteria andEdustartdateLessThanOrEqualTo(Date value) {
            addCriterion("eduStartDate <=", value, "edustartdate");
            return (Criteria) this;
        }

        public Criteria andEdustartdateIn(List<Date> values) {
            addCriterion("eduStartDate in", values, "edustartdate");
            return (Criteria) this;
        }

        public Criteria andEdustartdateNotIn(List<Date> values) {
            addCriterion("eduStartDate not in", values, "edustartdate");
            return (Criteria) this;
        }

        public Criteria andEdustartdateBetween(Date value1, Date value2) {
            addCriterion("eduStartDate between", value1, value2, "edustartdate");
            return (Criteria) this;
        }

        public Criteria andEdustartdateNotBetween(Date value1, Date value2) {
            addCriterion("eduStartDate not between", value1, value2, "edustartdate");
            return (Criteria) this;
        }

        public Criteria andEduenddateIsNull() {
            addCriterion("eduEndDate is null");
            return (Criteria) this;
        }

        public Criteria andEduenddateIsNotNull() {
            addCriterion("eduEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEduenddateEqualTo(Date value) {
            addCriterion("eduEndDate =", value, "eduenddate");
            return (Criteria) this;
        }

        public Criteria andEduenddateNotEqualTo(Date value) {
            addCriterion("eduEndDate <>", value, "eduenddate");
            return (Criteria) this;
        }

        public Criteria andEduenddateGreaterThan(Date value) {
            addCriterion("eduEndDate >", value, "eduenddate");
            return (Criteria) this;
        }

        public Criteria andEduenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("eduEndDate >=", value, "eduenddate");
            return (Criteria) this;
        }

        public Criteria andEduenddateLessThan(Date value) {
            addCriterion("eduEndDate <", value, "eduenddate");
            return (Criteria) this;
        }

        public Criteria andEduenddateLessThanOrEqualTo(Date value) {
            addCriterion("eduEndDate <=", value, "eduenddate");
            return (Criteria) this;
        }

        public Criteria andEduenddateIn(List<Date> values) {
            addCriterion("eduEndDate in", values, "eduenddate");
            return (Criteria) this;
        }

        public Criteria andEduenddateNotIn(List<Date> values) {
            addCriterion("eduEndDate not in", values, "eduenddate");
            return (Criteria) this;
        }

        public Criteria andEduenddateBetween(Date value1, Date value2) {
            addCriterion("eduEndDate between", value1, value2, "eduenddate");
            return (Criteria) this;
        }

        public Criteria andEduenddateNotBetween(Date value1, Date value2) {
            addCriterion("eduEndDate not between", value1, value2, "eduenddate");
            return (Criteria) this;
        }

        public Criteria andEdumajorIsNull() {
            addCriterion("eduMajor is null");
            return (Criteria) this;
        }

        public Criteria andEdumajorIsNotNull() {
            addCriterion("eduMajor is not null");
            return (Criteria) this;
        }

        public Criteria andEdumajorEqualTo(String value) {
            addCriterion("eduMajor =", value, "edumajor");
            return (Criteria) this;
        }

        public Criteria andEdumajorNotEqualTo(String value) {
            addCriterion("eduMajor <>", value, "edumajor");
            return (Criteria) this;
        }

        public Criteria andEdumajorGreaterThan(String value) {
            addCriterion("eduMajor >", value, "edumajor");
            return (Criteria) this;
        }

        public Criteria andEdumajorGreaterThanOrEqualTo(String value) {
            addCriterion("eduMajor >=", value, "edumajor");
            return (Criteria) this;
        }

        public Criteria andEdumajorLessThan(String value) {
            addCriterion("eduMajor <", value, "edumajor");
            return (Criteria) this;
        }

        public Criteria andEdumajorLessThanOrEqualTo(String value) {
            addCriterion("eduMajor <=", value, "edumajor");
            return (Criteria) this;
        }

        public Criteria andEdumajorLike(String value) {
            addCriterion("eduMajor like", value, "edumajor");
            return (Criteria) this;
        }

        public Criteria andEdumajorNotLike(String value) {
            addCriterion("eduMajor not like", value, "edumajor");
            return (Criteria) this;
        }

        public Criteria andEdumajorIn(List<String> values) {
            addCriterion("eduMajor in", values, "edumajor");
            return (Criteria) this;
        }

        public Criteria andEdumajorNotIn(List<String> values) {
            addCriterion("eduMajor not in", values, "edumajor");
            return (Criteria) this;
        }

        public Criteria andEdumajorBetween(String value1, String value2) {
            addCriterion("eduMajor between", value1, value2, "edumajor");
            return (Criteria) this;
        }

        public Criteria andEdumajorNotBetween(String value1, String value2) {
            addCriterion("eduMajor not between", value1, value2, "edumajor");
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