package com.mentoria.domain.enuns;

public enum RoleEnum {

    STUDENT("ROLE_STUDENT"),
    ADMIN("ROLE_ADMIN");

    private final String role;

    RoleEnum(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
