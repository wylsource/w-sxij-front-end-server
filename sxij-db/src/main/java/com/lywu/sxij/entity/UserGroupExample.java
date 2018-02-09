package com.lywu.sxij.entity;

import java.util.ArrayList;
import java.util.List;

public class UserGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public UserGroupExample() {
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

    public void setPageIndex(int pageIndex) {
        this.pageIndex=pageIndex;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public UserGroupExample(int pageIndex, int pageSize) {
        this();
        this.pageIndex=pageIndex;
        this.pageSize=pageSize;
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

        public Criteria andUserGroupIdIsNull() {
            addCriterion("user_group_id is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdIsNotNull() {
            addCriterion("user_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdEqualTo(String value) {
            addCriterion("user_group_id =", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdNotEqualTo(String value) {
            addCriterion("user_group_id <>", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdGreaterThan(String value) {
            addCriterion("user_group_id >", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_group_id >=", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdLessThan(String value) {
            addCriterion("user_group_id <", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdLessThanOrEqualTo(String value) {
            addCriterion("user_group_id <=", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdLike(String value) {
            addCriterion("user_group_id like", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdNotLike(String value) {
            addCriterion("user_group_id not like", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdIn(List<String> values) {
            addCriterion("user_group_id in", values, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdNotIn(List<String> values) {
            addCriterion("user_group_id not in", values, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdBetween(String value1, String value2) {
            addCriterion("user_group_id between", value1, value2, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdNotBetween(String value1, String value2) {
            addCriterion("user_group_id not between", value1, value2, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameIsNull() {
            addCriterion("user_group_name is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameIsNotNull() {
            addCriterion("user_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameEqualTo(String value) {
            addCriterion("user_group_name =", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameNotEqualTo(String value) {
            addCriterion("user_group_name <>", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameGreaterThan(String value) {
            addCriterion("user_group_name >", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_group_name >=", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameLessThan(String value) {
            addCriterion("user_group_name <", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameLessThanOrEqualTo(String value) {
            addCriterion("user_group_name <=", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameLike(String value) {
            addCriterion("user_group_name like", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameNotLike(String value) {
            addCriterion("user_group_name not like", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameIn(List<String> values) {
            addCriterion("user_group_name in", values, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameNotIn(List<String> values) {
            addCriterion("user_group_name not in", values, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameBetween(String value1, String value2) {
            addCriterion("user_group_name between", value1, value2, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameNotBetween(String value1, String value2) {
            addCriterion("user_group_name not between", value1, value2, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberIsNull() {
            addCriterion("user_group_number is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberIsNotNull() {
            addCriterion("user_group_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberEqualTo(String value) {
            addCriterion("user_group_number =", value, "userGroupNumber");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberNotEqualTo(String value) {
            addCriterion("user_group_number <>", value, "userGroupNumber");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberGreaterThan(String value) {
            addCriterion("user_group_number >", value, "userGroupNumber");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_group_number >=", value, "userGroupNumber");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberLessThan(String value) {
            addCriterion("user_group_number <", value, "userGroupNumber");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberLessThanOrEqualTo(String value) {
            addCriterion("user_group_number <=", value, "userGroupNumber");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberLike(String value) {
            addCriterion("user_group_number like", value, "userGroupNumber");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberNotLike(String value) {
            addCriterion("user_group_number not like", value, "userGroupNumber");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberIn(List<String> values) {
            addCriterion("user_group_number in", values, "userGroupNumber");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberNotIn(List<String> values) {
            addCriterion("user_group_number not in", values, "userGroupNumber");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberBetween(String value1, String value2) {
            addCriterion("user_group_number between", value1, value2, "userGroupNumber");
            return (Criteria) this;
        }

        public Criteria andUserGroupNumberNotBetween(String value1, String value2) {
            addCriterion("user_group_number not between", value1, value2, "userGroupNumber");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberIsNull() {
            addCriterion("parent_user_group_number is null");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberIsNotNull() {
            addCriterion("parent_user_group_number is not null");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberEqualTo(String value) {
            addCriterion("parent_user_group_number =", value, "parentUserGroupNumber");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberNotEqualTo(String value) {
            addCriterion("parent_user_group_number <>", value, "parentUserGroupNumber");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberGreaterThan(String value) {
            addCriterion("parent_user_group_number >", value, "parentUserGroupNumber");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberGreaterThanOrEqualTo(String value) {
            addCriterion("parent_user_group_number >=", value, "parentUserGroupNumber");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberLessThan(String value) {
            addCriterion("parent_user_group_number <", value, "parentUserGroupNumber");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberLessThanOrEqualTo(String value) {
            addCriterion("parent_user_group_number <=", value, "parentUserGroupNumber");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberLike(String value) {
            addCriterion("parent_user_group_number like", value, "parentUserGroupNumber");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberNotLike(String value) {
            addCriterion("parent_user_group_number not like", value, "parentUserGroupNumber");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberIn(List<String> values) {
            addCriterion("parent_user_group_number in", values, "parentUserGroupNumber");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberNotIn(List<String> values) {
            addCriterion("parent_user_group_number not in", values, "parentUserGroupNumber");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberBetween(String value1, String value2) {
            addCriterion("parent_user_group_number between", value1, value2, "parentUserGroupNumber");
            return (Criteria) this;
        }

        public Criteria andParentUserGroupNumberNotBetween(String value1, String value2) {
            addCriterion("parent_user_group_number not between", value1, value2, "parentUserGroupNumber");
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