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
    private int sexType;
    private int sexNum;
}
