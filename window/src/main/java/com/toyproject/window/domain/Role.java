package com.toyproject.window.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {
    ROLE_MEMBER("MEMBER"),
    ROLE_ADMIN("ADMIN");

    private String value;

}
