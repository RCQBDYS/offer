package com.example.offer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WorkExperienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkExperienceExample() {
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

        public Criteria andWorkidIsNull() {
            addCriterion("workId is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(Integer value) {
            addCriterion("workId =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(Integer value) {
            addCriterion("workId <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(Integer value) {
            addCriterion("workId >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("workId >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(Integer value) {
            addCriterion("workId <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(Integer value) {
            addCriterion("workId <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<Integer> values) {
            addCriterion("workId in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<Integer> values) {
            addCriterion("workId not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(Integer value1, Integer value2) {
            addCriterion("workId between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(Integer value1, Integer value2) {
            addCriterion("workId not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyIsNull() {
            addCriterion("workCompany is null");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyIsNotNull() {
            addCriterion("workCompany is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyEqualTo(String value) {
            addCriterion("workCompany =", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyNotEqualTo(String value) {
            addCriterion("workCompany <>", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyGreaterThan(String value) {
            addCriterion("workCompany >", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("workCompany >=", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyLessThan(String value) {
            addCriterion("workCompany <", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyLessThanOrEqualTo(String value) {
            addCriterion("workCompany <=", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyLike(String value) {
            addCriterion("workCompany like", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyNotLike(String value) {
            addCriterion("workCompany not like", value, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyIn(List<String> values) {
            addCriterion("workCompany in", values, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyNotIn(List<String> values) {
            addCriterion("workCompany not in", values, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyBetween(String value1, String value2) {
            addCriterion("workCompany between", value1, value2, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkcompanyNotBetween(String value1, String value2) {
            addCriterion("workCompany not between", value1, value2, "workcompany");
            return (Criteria) this;
        }

        public Criteria andWorkjobIsNull() {
            addCriterion("workJob is null");
            return (Criteria) this;
        }

        public Criteria andWorkjobIsNotNull() {
            addCriterion("workJob is not null");
            return (Criteria) this;
        }

        public Criteria andWorkjobEqualTo(String value) {
            addCriterion("workJob =", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobNotEqualTo(String value) {
            addCriterion("workJob <>", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobGreaterThan(String value) {
            addCriterion("workJob >", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobGreaterThanOrEqualTo(String value) {
            addCriterion("workJob >=", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobLessThan(String value) {
            addCriterion("workJob <", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobLessThanOrEqualTo(String value) {
            addCriterion("workJob <=", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobLike(String value) {
            addCriterion("workJob like", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobNotLike(String value) {
            addCriterion("workJob not like", value, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobIn(List<String> values) {
            addCriterion("workJob in", values, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobNotIn(List<String> values) {
            addCriterion("workJob not in", values, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobBetween(String value1, String value2) {
            addCriterion("workJob between", value1, value2, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkjobNotBetween(String value1, String value2) {
            addCriterion("workJob not between", value1, value2, "workjob");
            return (Criteria) this;
        }

        public Criteria andWorkstartdateIsNull() {
            addCriterion("workStartDate is null");
            return (Criteria) this;
        }

        public Criteria andWorkstartdateIsNotNull() {
            addCriterion("workStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andWorkstartdateEqualTo(Date value) {
            addCriterionForJDBCDate("workStartDate =", value, "workstartdate");
            return (Criteria) this;
        }

        public Criteria andWorkstartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("workStartDate <>", value, "workstartdate");
            return (Criteria) this;
        }

        public Criteria andWorkstartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("workStartDate >", value, "workstartdate");
            return (Criteria) this;
        }

        public Criteria andWorkstartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("workStartDate >=", value, "workstartdate");
            return (Criteria) this;
        }

        public Criteria andWorkstartdateLessThan(Date value) {
            addCriterionForJDBCDate("workStartDate <", value, "workstartdate");
            return (Criteria) this;
        }

        public Criteria andWorkstartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("workStartDate <=", value, "workstartdate");
            return (Criteria) this;
        }

        public Criteria andWorkstartdateIn(List<Date> values) {
            addCriterionForJDBCDate("workStartDate in", values, "workstartdate");
            return (Criteria) this;
        }

        public Criteria andWorkstartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("workStartDate not in", values, "workstartdate");
            return (Criteria) this;
        }

        public Criteria andWorkstartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("workStartDate between", value1, value2, "workstartdate");
            return (Criteria) this;
        }

        public Criteria andWorkstartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("workStartDate not between", value1, value2, "workstartdate");
            return (Criteria) this;
        }

        public Criteria andWorkenddateIsNull() {
            addCriterion("workEndDate is null");
            return (Criteria) this;
        }

        public Criteria andWorkenddateIsNotNull() {
            addCriterion("workEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andWorkenddateEqualTo(Date value) {
            addCriterionForJDBCDate("workEndDate =", value, "workenddate");
            return (Criteria) this;
        }

        public Criteria andWorkenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("workEndDate <>", value, "workenddate");
            return (Criteria) this;
        }

        public Criteria andWorkenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("workEndDate >", value, "workenddate");
            return (Criteria) this;
        }

        public Criteria andWorkenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("workEndDate >=", value, "workenddate");
            return (Criteria) this;
        }

        public Criteria andWorkenddateLessThan(Date value) {
            addCriterionForJDBCDate("workEndDate <", value, "workenddate");
            return (Criteria) this;
        }

        public Criteria andWorkenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("workEndDate <=", value, "workenddate");
            return (Criteria) this;
        }

        public Criteria andWorkenddateIn(List<Date> values) {
            addCriterionForJDBCDate("workEndDate in", values, "workenddate");
            return (Criteria) this;
        }

        public Criteria andWorkenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("workEndDate not in", values, "workenddate");
            return (Criteria) this;
        }

        public Criteria andWorkenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("workEndDate between", value1, value2, "workenddate");
            return (Criteria) this;
        }

        public Criteria andWorkenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("workEndDate not between", value1, value2, "workenddate");
            return (Criteria) this;
        }

        public Criteria andWorkcontentIsNull() {
            addCriterion("workContent is null");
            return (Criteria) this;
        }

        public Criteria andWorkcontentIsNotNull() {
            addCriterion("workContent is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcontentEqualTo(String value) {
            addCriterion("workContent =", value, "workcontent");
            return (Criteria) this;
        }

        public Criteria andWorkcontentNotEqualTo(String value) {
            addCriterion("workContent <>", value, "workcontent");
            return (Criteria) this;
        }

        public Criteria andWorkcontentGreaterThan(String value) {
            addCriterion("workContent >", value, "workcontent");
            return (Criteria) this;
        }

        public Criteria andWorkcontentGreaterThanOrEqualTo(String value) {
            addCriterion("workContent >=", value, "workcontent");
            return (Criteria) this;
        }

        public Criteria andWorkcontentLessThan(String value) {
            addCriterion("workContent <", value, "workcontent");
            return (Criteria) this;
        }

        public Criteria andWorkcontentLessThanOrEqualTo(String value) {
            addCriterion("workContent <=", value, "workcontent");
            return (Criteria) this;
        }

        public Criteria andWorkcontentLike(String value) {
            addCriterion("workContent like", value, "workcontent");
            return (Criteria) this;
        }

        public Criteria andWorkcontentNotLike(String value) {
            addCriterion("workContent not like", value, "workcontent");
            return (Criteria) this;
        }

        public Criteria andWorkcontentIn(List<String> values) {
            addCriterion("workContent in", values, "workcontent");
            return (Criteria) this;
        }

        public Criteria andWorkcontentNotIn(List<String> values) {
            addCriterion("workContent not in", values, "workcontent");
            return (Criteria) this;
        }

        public Criteria andWorkcontentBetween(String value1, String value2) {
            addCriterion("workContent between", value1, value2, "workcontent");
            return (Criteria) this;
        }

        public Criteria andWorkcontentNotBetween(String value1, String value2) {
            addCriterion("workContent not between", value1, value2, "workcontent");
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