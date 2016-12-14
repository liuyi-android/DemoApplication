package com.zsw.demoapplication.http.base;

/**
 * CommonResponse 接收返回的错误信息
 */
public  class CommonResponse<T> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 错误ID
     */
    private int code = 0;
    /**
     * 错误信息
     */
    private String message = "";


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
}
