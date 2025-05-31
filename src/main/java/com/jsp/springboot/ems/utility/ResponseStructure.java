package com.jsp.springboot.ems.utility;

public class ResponseStructure<A> {

    private int statuscode;
    private String message;
    private A data;

    // No-args constructor
    public ResponseStructure() {
    }

    // All-args constructor
    public ResponseStructure(int statuscode, String message, A data) {
        this.statuscode = statuscode;
        this.message = message;
        this.data = data;
    }

    public int getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(int statuscode) {
        this.statuscode = statuscode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public A getData() {
        return data;
    }

    public void setData(A data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseStructure{" +
                "statuscode=" + statuscode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

