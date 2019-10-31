package com.qxccc.employeeservice.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ControllerResult implements Serializable {
    private int code;
    private Object data;
    private  String msg;
}
