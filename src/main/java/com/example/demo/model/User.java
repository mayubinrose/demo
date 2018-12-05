package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class User {
    private Integer id;

    private String phone;
    private String username;
    private String password;


}
