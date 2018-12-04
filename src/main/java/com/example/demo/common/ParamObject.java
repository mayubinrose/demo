package com.example.demo.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

@Setter
@Getter
public class ParamObject {
    private int userId;

    @Override
    public String toString() {
        return "ParamObject{" +
                "userId=" + userId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    private String startDate;
    private String endDate;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
