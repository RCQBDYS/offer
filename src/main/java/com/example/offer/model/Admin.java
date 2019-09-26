package com.example.offer.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Admin implements Serializable {
    private Integer adminId;

    private String adminName;

    private String adminPassword;

    /*private static final long serialVersionUID = 1L;*/
}