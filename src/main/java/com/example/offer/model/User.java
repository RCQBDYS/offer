package com.example.offer.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer userid;

    private String username;

    private String userpassword;

    private String usertype;
}