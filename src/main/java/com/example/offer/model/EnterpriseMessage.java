package com.example.offer.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class EnterpriseMessage implements Serializable {
    private Integer enterId;

    private String enterName;

    private String enterIntroduce;

    private Integer enterSize;

    private String enterWelfare;

    private String enterAddress;

    private String enterProduct;

    private int userId;



}