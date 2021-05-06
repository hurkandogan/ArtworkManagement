package com.hurkan.expenseManagement.security;

import com.google.common.collect.Sets;
import static com.hurkan.expenseManagement.security.UserPermission.*;

import java.util.Set;

public enum UserRoles {
    SUPERADMIN(Sets.newHashSet(ARTWORK_CREATE, ARTWORK_DELETE)),
    ADMIN(Sets.newHashSet(ARTWORK_CREATE, ARTWORK_DELETE)),
    USER(Sets.newHashSet());



    private final Set<UserPermission> permissions;

    UserRoles(Set<UserPermission> permissions){
        this.permissions = permissions;
    }

    public Set<UserPermission> getPermissions(){
        return permissions;
    }

}
