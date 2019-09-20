package com.example.offer.model;

import java.io.Serializable;
import java.util.Date;

public class EducationalExperience implements Serializable {
    private Integer eduid;

    private Integer userid;

    private String eduschool;

    private String eduqualifications;

    private Date edustartdate;

    private Date eduenddate;

    private String edumajor;

    private static final long serialVersionUID = 1L;

    public Integer getEduid() {
        return eduid;
    }

    public void setEduid(Integer eduid) {
        this.eduid = eduid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getEduschool() {
        return eduschool;
    }

    public void setEduschool(String eduschool) {
        this.eduschool = eduschool;
    }

    public String getEduqualifications() {
        return eduqualifications;
    }

    public void setEduqualifications(String eduqualifications) {
        this.eduqualifications = eduqualifications;
    }

    public Date getEdustartdate() {
        return edustartdate;
    }

    public void setEdustartdate(Date edustartdate) {
        this.edustartdate = edustartdate;
    }

    public Date getEduenddate() {
        return eduenddate;
    }

    public void setEduenddate(Date eduenddate) {
        this.eduenddate = eduenddate;
    }

    public String getEdumajor() {
        return edumajor;
    }

    public void setEdumajor(String edumajor) {
        this.edumajor = edumajor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eduid=").append(eduid);
        sb.append(", userid=").append(userid);
        sb.append(", eduschool=").append(eduschool);
        sb.append(", eduqualifications=").append(eduqualifications);
        sb.append(", edustartdate=").append(edustartdate);
        sb.append(", eduenddate=").append(eduenddate);
        sb.append(", edumajor=").append(edumajor);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}