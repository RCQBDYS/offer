package com.example.offer.model;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserrealnameIsNull() {
            addCriterion("userRealName is null");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIsNotNull() {
            addCriterion("userRealName is not null");
            return (Criteria) this;
        }

        public Criteria andUserrealnameEqualTo(String value) {
            addCriterion("userRealName =", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotEqualTo(String value) {
            addCriterion("userRealName <>", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameGreaterThan(String value) {
            addCriterion("userRealName >", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("userRealName >=", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLessThan(String value) {
            addCriterion("userRealName <", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLessThanOrEqualTo(String value) {
            addCriterion("userRealName <=", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLike(String value) {
            addCriterion("userRealName like", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotLike(String value) {
            addCriterion("userRealName not like", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIn(List<String> values) {
            addCriterion("userRealName in", values, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotIn(List<String> values) {
            addCriterion("userRealName not in", values, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameBetween(String value1, String value2) {
            addCriterion("userRealName between", value1, value2, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotBetween(String value1, String value2) {
            addCriterion("userRealName not between", value1, value2, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsericonIsNull() {
            addCriterion("userIcon is null");
            return (Criteria) this;
        }

        public Criteria andUsericonIsNotNull() {
            addCriterion("userIcon is not null");
            return (Criteria) this;
        }

        public Criteria andUsericonEqualTo(String value) {
            addCriterion("userIcon =", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonNotEqualTo(String value) {
            addCriterion("userIcon <>", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonGreaterThan(String value) {
            addCriterion("userIcon >", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonGreaterThanOrEqualTo(String value) {
            addCriterion("userIcon >=", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonLessThan(String value) {
            addCriterion("userIcon <", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonLessThanOrEqualTo(String value) {
            addCriterion("userIcon <=", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonLike(String value) {
            addCriterion("userIcon like", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonNotLike(String value) {
            addCriterion("userIcon not like", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonIn(List<String> values) {
            addCriterion("userIcon in", values, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonNotIn(List<String> values) {
            addCriterion("userIcon not in", values, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonBetween(String value1, String value2) {
            addCriterion("userIcon between", value1, value2, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonNotBetween(String value1, String value2) {
            addCriterion("userIcon not between", value1, value2, "usericon");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userPhone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userPhone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserageIsNull() {
            addCriterion("userAge is null");
            return (Criteria) this;
        }

        public Criteria andUserageIsNotNull() {
            addCriterion("userAge is not null");
            return (Criteria) this;
        }

        public Criteria andUserageEqualTo(String value) {
            addCriterion("userAge =", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageNotEqualTo(String value) {
            addCriterion("userAge <>", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageGreaterThan(String value) {
            addCriterion("userAge >", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageGreaterThanOrEqualTo(String value) {
            addCriterion("userAge >=", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageLessThan(String value) {
            addCriterion("userAge <", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageLessThanOrEqualTo(String value) {
            addCriterion("userAge <=", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageLike(String value) {
            addCriterion("userAge like", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageNotLike(String value) {
            addCriterion("userAge not like", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageIn(List<String> values) {
            addCriterion("userAge in", values, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageNotIn(List<String> values) {
            addCriterion("userAge not in", values, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageBetween(String value1, String value2) {
            addCriterion("userAge between", value1, value2, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageNotBetween(String value1, String value2) {
            addCriterion("userAge not between", value1, value2, "userage");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityIsNull() {
            addCriterion("userAddressCity is null");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityIsNotNull() {
            addCriterion("userAddressCity is not null");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityEqualTo(String value) {
            addCriterion("userAddressCity =", value, "useraddresscity");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityNotEqualTo(String value) {
            addCriterion("userAddressCity <>", value, "useraddresscity");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityGreaterThan(String value) {
            addCriterion("userAddressCity >", value, "useraddresscity");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityGreaterThanOrEqualTo(String value) {
            addCriterion("userAddressCity >=", value, "useraddresscity");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityLessThan(String value) {
            addCriterion("userAddressCity <", value, "useraddresscity");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityLessThanOrEqualTo(String value) {
            addCriterion("userAddressCity <=", value, "useraddresscity");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityLike(String value) {
            addCriterion("userAddressCity like", value, "useraddresscity");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityNotLike(String value) {
            addCriterion("userAddressCity not like", value, "useraddresscity");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityIn(List<String> values) {
            addCriterion("userAddressCity in", values, "useraddresscity");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityNotIn(List<String> values) {
            addCriterion("userAddressCity not in", values, "useraddresscity");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityBetween(String value1, String value2) {
            addCriterion("userAddressCity between", value1, value2, "useraddresscity");
            return (Criteria) this;
        }

        public Criteria andUseraddresscityNotBetween(String value1, String value2) {
            addCriterion("userAddressCity not between", value1, value2, "useraddresscity");
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