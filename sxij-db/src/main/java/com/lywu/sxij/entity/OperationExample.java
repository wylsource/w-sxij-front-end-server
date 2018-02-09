package com.lywu.sxij.entity;

import java.util.ArrayList;
import java.util.List;

public class OperationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public OperationExample() {
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

    public OperationExample(int pageIndex, int pageSize) {
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

        public Criteria andOperationIdIsNull() {
            addCriterion("operation_id is null");
            return (Criteria) this;
        }

        public Criteria andOperationIdIsNotNull() {
            addCriterion("operation_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperationIdEqualTo(String value) {
            addCriterion("operation_id =", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotEqualTo(String value) {
            addCriterion("operation_id <>", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThan(String value) {
            addCriterion("operation_id >", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThanOrEqualTo(String value) {
            addCriterion("operation_id >=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThan(String value) {
            addCriterion("operation_id <", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThanOrEqualTo(String value) {
            addCriterion("operation_id <=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLike(String value) {
            addCriterion("operation_id like", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotLike(String value) {
            addCriterion("operation_id not like", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdIn(List<String> values) {
            addCriterion("operation_id in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotIn(List<String> values) {
            addCriterion("operation_id not in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdBetween(String value1, String value2) {
            addCriterion("operation_id between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotBetween(String value1, String value2) {
            addCriterion("operation_id not between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNull() {
            addCriterion("operation_name is null");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNotNull() {
            addCriterion("operation_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperationNameEqualTo(String value) {
            addCriterion("operation_name =", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotEqualTo(String value) {
            addCriterion("operation_name <>", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThan(String value) {
            addCriterion("operation_name >", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThanOrEqualTo(String value) {
            addCriterion("operation_name >=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThan(String value) {
            addCriterion("operation_name <", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThanOrEqualTo(String value) {
            addCriterion("operation_name <=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLike(String value) {
            addCriterion("operation_name like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotLike(String value) {
            addCriterion("operation_name not like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameIn(List<String> values) {
            addCriterion("operation_name in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotIn(List<String> values) {
            addCriterion("operation_name not in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameBetween(String value1, String value2) {
            addCriterion("operation_name between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotBetween(String value1, String value2) {
            addCriterion("operation_name not between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationCodeIsNull() {
            addCriterion("operation_code is null");
            return (Criteria) this;
        }

        public Criteria andOperationCodeIsNotNull() {
            addCriterion("operation_code is not null");
            return (Criteria) this;
        }

        public Criteria andOperationCodeEqualTo(String value) {
            addCriterion("operation_code =", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeNotEqualTo(String value) {
            addCriterion("operation_code <>", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeGreaterThan(String value) {
            addCriterion("operation_code >", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("operation_code >=", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeLessThan(String value) {
            addCriterion("operation_code <", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeLessThanOrEqualTo(String value) {
            addCriterion("operation_code <=", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeLike(String value) {
            addCriterion("operation_code like", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeNotLike(String value) {
            addCriterion("operation_code not like", value, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeIn(List<String> values) {
            addCriterion("operation_code in", values, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeNotIn(List<String> values) {
            addCriterion("operation_code not in", values, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeBetween(String value1, String value2) {
            addCriterion("operation_code between", value1, value2, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationCodeNotBetween(String value1, String value2) {
            addCriterion("operation_code not between", value1, value2, "operationCode");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixIsNull() {
            addCriterion("operation_intercept_url_prefix is null");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixIsNotNull() {
            addCriterion("operation_intercept_url_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixEqualTo(String value) {
            addCriterion("operation_intercept_url_prefix =", value, "operationInterceptUrlPrefix");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixNotEqualTo(String value) {
            addCriterion("operation_intercept_url_prefix <>", value, "operationInterceptUrlPrefix");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixGreaterThan(String value) {
            addCriterion("operation_intercept_url_prefix >", value, "operationInterceptUrlPrefix");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("operation_intercept_url_prefix >=", value, "operationInterceptUrlPrefix");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixLessThan(String value) {
            addCriterion("operation_intercept_url_prefix <", value, "operationInterceptUrlPrefix");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixLessThanOrEqualTo(String value) {
            addCriterion("operation_intercept_url_prefix <=", value, "operationInterceptUrlPrefix");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixLike(String value) {
            addCriterion("operation_intercept_url_prefix like", value, "operationInterceptUrlPrefix");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixNotLike(String value) {
            addCriterion("operation_intercept_url_prefix not like", value, "operationInterceptUrlPrefix");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixIn(List<String> values) {
            addCriterion("operation_intercept_url_prefix in", values, "operationInterceptUrlPrefix");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixNotIn(List<String> values) {
            addCriterion("operation_intercept_url_prefix not in", values, "operationInterceptUrlPrefix");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixBetween(String value1, String value2) {
            addCriterion("operation_intercept_url_prefix between", value1, value2, "operationInterceptUrlPrefix");
            return (Criteria) this;
        }

        public Criteria andOperationInterceptUrlPrefixNotBetween(String value1, String value2) {
            addCriterion("operation_intercept_url_prefix not between", value1, value2, "operationInterceptUrlPrefix");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdIsNull() {
            addCriterion("parent_operation_id is null");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdIsNotNull() {
            addCriterion("parent_operation_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdEqualTo(String value) {
            addCriterion("parent_operation_id =", value, "parentOperationId");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdNotEqualTo(String value) {
            addCriterion("parent_operation_id <>", value, "parentOperationId");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdGreaterThan(String value) {
            addCriterion("parent_operation_id >", value, "parentOperationId");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_operation_id >=", value, "parentOperationId");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdLessThan(String value) {
            addCriterion("parent_operation_id <", value, "parentOperationId");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdLessThanOrEqualTo(String value) {
            addCriterion("parent_operation_id <=", value, "parentOperationId");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdLike(String value) {
            addCriterion("parent_operation_id like", value, "parentOperationId");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdNotLike(String value) {
            addCriterion("parent_operation_id not like", value, "parentOperationId");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdIn(List<String> values) {
            addCriterion("parent_operation_id in", values, "parentOperationId");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdNotIn(List<String> values) {
            addCriterion("parent_operation_id not in", values, "parentOperationId");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdBetween(String value1, String value2) {
            addCriterion("parent_operation_id between", value1, value2, "parentOperationId");
            return (Criteria) this;
        }

        public Criteria andParentOperationIdNotBetween(String value1, String value2) {
            addCriterion("parent_operation_id not between", value1, value2, "parentOperationId");
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