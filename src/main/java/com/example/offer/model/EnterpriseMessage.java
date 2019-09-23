package com.example.offer.model;

import java.io.Serializable;

public class EnterpriseMessage implements Serializable {
    private Integer enterid;

    private String entername;

    private String enterintroduce;

    private Integer entersize;

    private String enterwelfare;

    private static final long serialVersionUID = 1L;

    public Integer getEnterid() {
        return enterid;
    }

    public void setEnterid(Integer enterid) {
        this.enterid = enterid;
    }

    public String getEntername() {
        return entername;
    }

    public void setEntername(String entername) {
        this.entername = entername;
    }

    public String getEnterintroduce() {
        return enterintroduce;
    }

    public void setEnterintroduce(String enterintroduce) {
        this.enterintroduce = enterintroduce;
    }

    public Integer getEntersize() {
        return entersize;
    }

    public void setEntersize(Integer entersize) {
        this.entersize = entersize;
    }

    public String getEnterwelfare() {
        return enterwelfare;
    }

    public void setEnterwelfare(String enterwelfare) {
        this.enterwelfare = enterwelfare;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", enterid=").append(enterid);
        sb.append(", entername=").append(entername);
        sb.append(", enterintroduce=").append(enterintroduce);
        sb.append(", entersize=").append(entersize);
        sb.append(", enterwelfare=").append(enterwelfare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}