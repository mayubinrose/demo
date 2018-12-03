package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Table;

@Getter
@Setter
@ToString
public class SexAnalysis {
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSexType() {
        return sexType;
    }

    public void setSexType(int sextype) {
        this.sexType = sextype;
    }

    public int getSexNum() {
        return sexNum;
    }

    public void setSexNum(int sexNum) {
        this.sexNum = sexNum;
    }

    private int sexType;
    private int sexNum;
}
