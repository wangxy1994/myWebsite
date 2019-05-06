package com.wangxy;

public class User {

    private  String userName;
    private  Integer userAge;
    private  String sex;


    public User(String userName, Integer userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public User() {

    }

    public String getUserName() {
        return userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", sex='" + sex + '\'' +
                '}';
    }
}
