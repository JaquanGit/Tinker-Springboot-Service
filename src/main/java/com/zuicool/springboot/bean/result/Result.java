package com.zuicool.springboot.bean.result;

public class Result {

    private State state;
    private Object data;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
