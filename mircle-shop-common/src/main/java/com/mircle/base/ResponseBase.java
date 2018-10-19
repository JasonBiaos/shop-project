package com.mircle.base;

public class ResponseBase {

    private Integer rtnCode;

    private String msg;

    private Object oj;

    public Integer getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(Integer rtnCode) {
        this.rtnCode = rtnCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getOj() {
        return oj;
    }

    public void setOj(Object oj) {
        this.oj = oj;
    }
}
