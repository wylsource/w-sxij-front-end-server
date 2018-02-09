package com.lywu.sxij.entity;

public class UserGroup {
    private String userGroupId;

    private String userGroupName;

    private String userGroupNumber;

    private String parentUserGroupNumber;

    public String getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public String getUserGroupNumber() {
        return userGroupNumber;
    }

    public void setUserGroupNumber(String userGroupNumber) {
        this.userGroupNumber = userGroupNumber;
    }

    public String getParentUserGroupNumber() {
        return parentUserGroupNumber;
    }

    public void setParentUserGroupNumber(String parentUserGroupNumber) {
        this.parentUserGroupNumber = parentUserGroupNumber;
    }
}