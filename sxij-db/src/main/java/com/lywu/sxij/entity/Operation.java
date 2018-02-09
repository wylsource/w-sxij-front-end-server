package com.lywu.sxij.entity;

public class Operation {
    private String operationId;

    private String operationName;

    private String operationCode;

    private String operationInterceptUrlPrefix;

    private String parentOperationId;

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public String getOperationInterceptUrlPrefix() {
        return operationInterceptUrlPrefix;
    }

    public void setOperationInterceptUrlPrefix(String operationInterceptUrlPrefix) {
        this.operationInterceptUrlPrefix = operationInterceptUrlPrefix;
    }

    public String getParentOperationId() {
        return parentOperationId;
    }

    public void setParentOperationId(String parentOperationId) {
        this.parentOperationId = parentOperationId;
    }
}