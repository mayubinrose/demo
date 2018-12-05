package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Table;

@Getter
@Setter
@ToString
public class SexAnalysis {
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSexType() {
        return sexType;
    }

    public void setSexType(int sexType) {
        this.sexType = sexType;
    }

    public int getSexNum() {
        return sexNum;
    }

    public void setSexNum(int sexNum) {
        this.sexNum = sexNum;
    }

    private int userId;
    private int sexType;
    private int sexNum;
}
