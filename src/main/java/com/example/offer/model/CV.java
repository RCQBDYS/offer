package com.example.offer.model;

import java.util.List;

public class CV {
    private List<ProjectExperience> projectExperiencesList;
    private List<WorkExperience>    workExperiencesList;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    private UserInfo userInfo;

    public List<WorkExperience> getWorkExperiencesList() {
        return workExperiencesList;
    }

    public void setWorkExperiencesList(List<WorkExperience> workExperiencesList) {
        this.workExperiencesList = workExperiencesList;
    }

    public List<ProjectExperience> getProjectExperiencesList() {
        return projectExperiencesList;
    }

    public void setProjectExperiencesList(List<ProjectExperience> projectExperiencesList) {
        this.projectExperiencesList = projectExperiencesList;
    }
}
