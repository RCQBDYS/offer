package com.example.offer.model;

import java.io.Serializable;

public class PutPost implements Serializable {
    private Integer putid;

    private String putname;

    private String putskill;

    private Double putsalary;

    private Integer enterid;

    private Integer putnum;

    private String putintroduce;

    private String putrequire;

    private String putaddress;

    private static final long serialVersionUID = 1L;

    public Integer getPutid() {
        return putid;
    }

    public void setPutid(Integer putid) {
        this.putid = putid;
    }

    public String getPutname() {
        return putname;
    }

    public void setPutname(String putname) {
        this.putname = putname;
    }

    public String getPutskill() {
        return putskill;
    }

    public void setPutskill(String putskill) {
        this.putskill = putskill;
    }

    public Double getPutsalary() {
        return putsalary;
    }

    public void setPutsalary(Double putsalary) {
        this.putsalary = putsalary;
    }

    public Integer getEnterid() {
        return enterid;
    }

    public void setEnterid(Integer enterid) {
        this.enterid = enterid;
    }

    public Integer getPutnum() {
        return putnum;
    }

    public void setPutnum(Integer putnum) {
        this.putnum = putnum;
    }

    public String getPutintroduce() {
        return putintroduce;
    }

    public void setPutintroduce(String putintroduce) {
        this.putintroduce = putintroduce;
    }

    public String getPutrequire() {
        return putrequire;
    }

    public void setPutrequire(String putrequire) {
        this.putrequire = putrequire;
    }

    public String getPutaddress() {
        return putaddress;
    }

    public void setPutaddress(String putaddress) {
        this.putaddress = putaddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", putid=").append(putid);
        sb.append(", putname=").append(putname);
        sb.append(", putskill=").append(putskill);
        sb.append(", putsalary=").append(putsalary);
        sb.append(", enterid=").append(enterid);
        sb.append(", putnum=").append(putnum);
        sb.append(", putintroduce=").append(putintroduce);
        sb.append(", putrequire=").append(putrequire);
        sb.append(", putaddress=").append(putaddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}