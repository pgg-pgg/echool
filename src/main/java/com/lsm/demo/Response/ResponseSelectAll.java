package com.lsm.demo.Response;

import java.util.List;

public class ResponseSelectAll {
    private int code;
    private String message;
    private List<?> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
    public static ResponseSelectAll error(String message, List<?> data) {
        ResponseSelectAll responseSelectAll = new ResponseSelectAll();
        responseSelectAll.setCode(-1);
        responseSelectAll.setMessage(message);
        responseSelectAll.setData(data);
        return responseSelectAll;
    }

    public static ResponseSelectAll success(String message, List<?> data) {
        ResponseSelectAll responseSelectAll = new ResponseSelectAll();
        responseSelectAll.setCode(0);
        responseSelectAll.setMessage(message);
        responseSelectAll.setData(data);
        return responseSelectAll;
    }
}
