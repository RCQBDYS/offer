package com.example.offer.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class PostMessage implements Serializable {
    private Integer postId;

    private String postName;

    private String postSkill;

    private Integer postNum;

    private Double postSalary;

    private Integer postSuccNum;

    private String postIntroduce;

    private String postRequire;

    private String postAddress;

    private Integer userId;

    private Integer enterId;

    private Integer postState;

    private User user;

    private EnterpriseMessage enterprise;


}