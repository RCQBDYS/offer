package com.example.offer.model;

import java.io.Serializable;

public class SkillWish implements Serializable {
    private Integer swid;

    private Integer userid;

    private String swjob;

    private String swcity;

    private Double swsalary;

    private String swskill;

    private String swcareer;

    private static final long serialVersionUID = 1L;

    public Integer getSwid() {
        return swid;
    }

    public void setSwid(Integer swid) {
        this.swid = swid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSwjob() {
        return swjob;
    }

    public void setSwjob(String swjob) {
        this.swjob = swjob;
    }

    public String getSwcity() {
        return swcity;
    }

    public void setSwcity(String swcity) {
        this.swcity = swcity;
    }

    public Double getSwsalary() {
        return swsalary;
    }

    public void setSwsalary(Double swsalary) {
        this.swsalary = swsalary;
    }

    public String getSwskill() {
        return swskill;
    }

    public void setSwskill(String swskill) {
        this.swskill = swskill;
    }

    public String getSwcareer() {
        return swcareer;
    }

    public void setSwcareer(String swcareer) {
        this.swcareer = swcareer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", swid=").append(swid);
        sb.append(", userid=").append(userid);
        sb.append(", swjob=").append(swjob);
        sb.append(", swcity=").append(swcity);
        sb.append(", swsalary=").append(swsalary);
        sb.append(", swskill=").append(swskill);
        sb.append(", swcareer=").append(swcareer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}