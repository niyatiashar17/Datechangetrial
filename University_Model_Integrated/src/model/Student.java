/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 91961
 */
public class Student {
    private int std_id;
    private String std_name;
    private String std_addr;
    private int std_phone;
    private String std_email;
    private String std_username;
    private String std_password;
    private ArrayList<Course> courses;

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    
    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public String getStd_addr() {
        return std_addr;
    }

    public void setStd_addr(String std_addr) {
        this.std_addr = std_addr;
    }

    public int getStd_phone() {
        return std_phone;
    }

    public void setStd_phone(int std_phone) {
        this.std_phone = std_phone;
    }

    public String getStd_email() {
        return std_email;
    }

    public void setStd_email(String std_email) {
        this.std_email = std_email;
    }

    public String getStd_username() {
        return std_username;
    }

    public void setStd_username(String std_username) {
        this.std_username = std_username;
    }

    public String getStd_password() {
        return std_password;
    }

    public void setStd_password(String std_password) {
        this.std_password = std_password;
    }

}
