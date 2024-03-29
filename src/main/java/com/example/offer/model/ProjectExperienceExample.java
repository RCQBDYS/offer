package com.example.offer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectExperienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExperienceExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andProjectidIsNull() {
            addCriterion("projectId is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectId is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("projectId =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("projectId <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("projectId >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectId >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("projectId <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("projectId <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("projectId in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("projectId not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("projectId between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectId not between", value1, value2, "projectid");
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

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectroleIsNull() {
            addCriterion("projectRole is null");
            return (Criteria) this;
        }

        public Criteria andProjectroleIsNotNull() {
            addCriterion("projectRole is not null");
            return (Criteria) this;
        }

        public Criteria andProjectroleEqualTo(String value) {
            addCriterion("projectRole =", value, "projectrole");
            return (Criteria) this;
        }

        public Criteria andProjectroleNotEqualTo(String value) {
            addCriterion("projectRole <>", value, "projectrole");
            return (Criteria) this;
        }

        public Criteria andProjectroleGreaterThan(String value) {
            addCriterion("projectRole >", value, "projectrole");
            return (Criteria) this;
        }

        public Criteria andProjectroleGreaterThanOrEqualTo(String value) {
            addCriterion("projectRole >=", value, "projectrole");
            return (Criteria) this;
        }

        public Criteria andProjectroleLessThan(String value) {
            addCriterion("projectRole <", value, "projectrole");
            return (Criteria) this;
        }

        public Criteria andProjectroleLessThanOrEqualTo(String value) {
            addCriterion("projectRole <=", value, "projectrole");
            return (Criteria) this;
        }

        public Criteria andProjectroleLike(String value) {
            addCriterion("projectRole like", value, "projectrole");
            return (Criteria) this;
        }

        public Criteria andProjectroleNotLike(String value) {
            addCriterion("projectRole not like", value, "projectrole");
            return (Criteria) this;
        }

        public Criteria andProjectroleIn(List<String> values) {
            addCriterion("projectRole in", values, "projectrole");
            return (Criteria) this;
        }

        public Criteria andProjectroleNotIn(List<String> values) {
            addCriterion("projectRole not in", values, "projectrole");
            return (Criteria) this;
        }

        public Criteria andProjectroleBetween(String value1, String value2) {
            addCriterion("projectRole between", value1, value2, "projectrole");
            return (Criteria) this;
        }

        public Criteria andProjectroleNotBetween(String value1, String value2) {
            addCriterion("projectRole not between", value1, value2, "projectrole");
            return (Criteria) this;
        }

        public Criteria andProjectstartdateIsNull() {
            addCriterion("projectStartDate is null");
            return (Criteria) this;
        }

        public Criteria andProjectstartdateIsNotNull() {
            addCriterion("projectStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andProjectstartdateEqualTo(Date value) {
            addCriterionForJDBCDate("projectStartDate =", value, "projectstartdate");
            return (Criteria) this;
        }

        public Criteria andProjectstartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("projectStartDate <>", value, "projectstartdate");
            return (Criteria) this;
        }

        public Criteria andProjectstartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("projectStartDate >", value, "projectstartdate");
            return (Criteria) this;
        }

        public Criteria andProjectstartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("projectStartDate >=", value, "projectstartdate");
            return (Criteria) this;
        }

        public Criteria andProjectstartdateLessThan(Date value) {
            addCriterionForJDBCDate("projectStartDate <", value, "projectstartdate");
            return (Criteria) this;
        }

        public Criteria andProjectstartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("projectStartDate <=", value, "projectstartdate");
            return (Criteria) this;
        }

        public Criteria andProjectstartdateIn(List<Date> values) {
            addCriterionForJDBCDate("projectStartDate in", values, "projectstartdate");
            return (Criteria) this;
        }

        public Criteria andProjectstartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("projectStartDate not in", values, "projectstartdate");
            return (Criteria) this;
        }

        public Criteria andProjectstartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("projectStartDate between", value1, value2, "projectstartdate");
            return (Criteria) this;
        }

        public Criteria andProjectstartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("projectStartDate not between", value1, value2, "projectstartdate");
            return (Criteria) this;
        }

        public Criteria andProjectenddateIsNull() {
            addCriterion("projectEndDate is null");
            return (Criteria) this;
        }

        public Criteria andProjectenddateIsNotNull() {
            addCriterion("projectEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andProjectenddateEqualTo(Date value) {
            addCriterionForJDBCDate("projectEndDate =", value, "projectenddate");
            return (Criteria) this;
        }

        public Criteria andProjectenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("projectEndDate <>", value, "projectenddate");
            return (Criteria) this;
        }

        public Criteria andProjectenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("projectEndDate >", value, "projectenddate");
            return (Criteria) this;
        }

        public Criteria andProjectenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("projectEndDate >=", value, "projectenddate");
            return (Criteria) this;
        }

        public Criteria andProjectenddateLessThan(Date value) {
            addCriterionForJDBCDate("projectEndDate <", value, "projectenddate");
            return (Criteria) this;
        }

        public Criteria andProjectenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("projectEndDate <=", value, "projectenddate");
            return (Criteria) this;
        }

        public Criteria andProjectenddateIn(List<Date> values) {
            addCriterionForJDBCDate("projectEndDate in", values, "projectenddate");
            return (Criteria) this;
        }

        public Criteria andProjectenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("projectEndDate not in", values, "projectenddate");
            return (Criteria) this;
        }

        public Criteria andProjectenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("projectEndDate between", value1, value2, "projectenddate");
            return (Criteria) this;
        }

        public Criteria andProjectenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("projectEndDate not between", value1, value2, "projectenddate");
            return (Criteria) this;
        }

        public Criteria andProjectcontentIsNull() {
            addCriterion("projectContent is null");
            return (Criteria) this;
        }

        public Criteria andProjectcontentIsNotNull() {
            addCriterion("projectContent is not null");
            return (Criteria) this;
        }

        public Criteria andProjectcontentEqualTo(String value) {
            addCriterion("projectContent =", value, "projectcontent");
            return (Criteria) this;
        }

        public Criteria andProjectcontentNotEqualTo(String value) {
            addCriterion("projectContent <>", value, "projectcontent");
            return (Criteria) this;
        }

        public Criteria andProjectcontentGreaterThan(String value) {
            addCriterion("projectContent >", value, "projectcontent");
            return (Criteria) this;
        }

        public Criteria andProjectcontentGreaterThanOrEqualTo(String value) {
            addCriterion("projectContent >=", value, "projectcontent");
            return (Criteria) this;
        }

        public Criteria andProjectcontentLessThan(String value) {
            addCriterion("projectContent <", value, "projectcontent");
            return (Criteria) this;
        }

        public Criteria andProjectcontentLessThanOrEqualTo(String value) {
            addCriterion("projectContent <=", value, "projectcontent");
            return (Criteria) this;
        }

        public Criteria andProjectcontentLike(String value) {
            addCriterion("projectContent like", value, "projectcontent");
            return (Criteria) this;
        }

        public Criteria andProjectcontentNotLike(String value) {
            addCriterion("projectContent not like", value, "projectcontent");
            return (Criteria) this;
        }

        public Criteria andProjectcontentIn(List<String> values) {
            addCriterion("projectContent in", values, "projectcontent");
            return (Criteria) this;
        }

        public Criteria andProjectcontentNotIn(List<String> values) {
            addCriterion("projectContent not in", values, "projectcontent");
            return (Criteria) this;
        }

        public Criteria andProjectcontentBetween(String value1, String value2) {
            addCriterion("projectContent between", value1, value2, "projectcontent");
            return (Criteria) this;
        }

        public Criteria andProjectcontentNotBetween(String value1, String value2) {
            addCriterion("projectContent not between", value1, value2, "projectcontent");
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