package com.qxccc.employeeservice.domain;

import lombok.Data;

@Data
public class Role {
    private Integer roleId;

    private String roleName;

    private String state;

    private String roleFunction;
}