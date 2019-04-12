package com.newer.domain;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String userName;
    private String password;
    private String email;
    private String job;
    private String level;

    public User() {
    }

    public User(Integer id, String userName, String password, String email, String job, String level) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.job = job;
        this.level = level;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", job='" + job + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
