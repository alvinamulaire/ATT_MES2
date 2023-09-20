package com.att.repository.entity;

import java.io.Serializable;

public class AttTest implements Serializable {
    private String testid;

    private String name;

    private static final long serialVersionUID = 1L;

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}