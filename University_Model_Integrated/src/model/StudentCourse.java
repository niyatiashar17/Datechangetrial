/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author yuga
 */
public class StudentCourse {

    private ArrayList<Course> studentregisterdetails;
    private ArrayList<Course> studentSpringdetails;

    public StudentCourse() {

        this.studentregisterdetails = new ArrayList<Course>();
        this.studentSpringdetails = new ArrayList<Course>();
    }
    
    
    public ArrayList<Course> getStudentSpringdetails() {
        return studentSpringdetails;
    }

    public void setStudentSpringdetails(ArrayList<Course> studentSpringdetails) {
        this.studentSpringdetails = studentSpringdetails;
    }

    public ArrayList<Course> getStudentregisterdetails() {
        return studentregisterdetails;
    }

    public void setStudentregisterdetails(ArrayList<Course> studentregisterdetails) {
        this.studentregisterdetails = studentregisterdetails;
    }

    public Course addFallCourse() {
        Course course = new Course();
        studentregisterdetails.add(course);
        
        return course;
    }

    public Course addSpringCourse() {
        Course course = new Course();
        studentSpringdetails.add(course);
        return course;
    }

    public void deleteFallCourse(Course course) {
        studentregisterdetails.remove(course);
    }

    public void deleteSpringCourse(Course course) {
        studentSpringdetails.remove(course);
    }

    public Course addFallRegisterCourses() {
        Course register = new Course();
        studentregisterdetails.add(register);
        return register;

    }

    

    public Course addSpringRegisterCourses() {
        Course register = new Course();
        studentSpringdetails.add(register);
        return register;

    }
}
