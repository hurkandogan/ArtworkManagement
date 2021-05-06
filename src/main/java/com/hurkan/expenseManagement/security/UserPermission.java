package com.hurkan.expenseManagement.security;

public enum UserPermission {

    ARTWORK_CREATE("artwork:create"),
    ARTWORK_DELETE("student:write");

    private String permission;

    UserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
