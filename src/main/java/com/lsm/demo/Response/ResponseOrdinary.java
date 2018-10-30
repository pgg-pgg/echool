package com.lsm.demo.Response;

public class ResponseOrdinary {
    private int code;
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

    public static ResponseOrdinary success(String message) {
        ResponseOrdinary responseOrdinary = new ResponseOrdinary();
        responseOrdinary.setCode(0);
        responseOrdinary.setMessage(message);
        return responseOrdinary;
    }

    public static ResponseOrdinary error(String message) {
        ResponseOrdinary responseOrdinary = new ResponseOrdinary();
        responseOrdinary.setCode(-1);
        responseOrdinary.setMessage(message);
        return responseOrdinary;
    }

}
