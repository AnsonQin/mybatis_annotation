package com.anson.mybatis_annotation.entity;

/**
 * @Autho
 * @date 2018/11/4
 */
public class Employee {

    private Integer id;
    private String lastName;
    private String gender;
    private String email;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", last_name='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLast_name() {
        return lastName;
    }

    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
