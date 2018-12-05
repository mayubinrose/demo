package com.example.demo.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Bean;

@Setter
@Getter
@ToString
public class ParamObject {
    private int userId;
    private String startDate;
    private String endDate;

}
