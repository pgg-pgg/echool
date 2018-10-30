package com.lsm.demo.Response;

public class ResponseLogin {
    private int code;
    private Object data;
    private String message;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public static ResponseLogin success(Object data, String message) {
        ResponseLogin responseLogin = new ResponseLogin();
        responseLogin.setCode(0);
        responseLogin.setMessage(message);
        responseLogin.setData(data);
        return responseLogin;
    }

    public static ResponseLogin error(Object data, String message) {
        ResponseLogin responseLogin = new ResponseLogin();
        responseLogin.setCode(-1);
        responseLogin.setMessage(message);
        responseLogin.setData(data);
        return responseLogin;
    }


}
