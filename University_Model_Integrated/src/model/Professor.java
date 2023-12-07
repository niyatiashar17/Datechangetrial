/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author RUTUJA
 */
public class Professor {

    String professorName;
    int professorID;
    String email;
    int contactNo;
    ArrayList<Integer> courseCRNS = new ArrayList<Integer>();
    private String prof_username;
    private String prof_password;

    public String getProf_username() {
        return prof_username;
    }

    public void setProf_username(String prof_username) {
        this.prof_username = prof_username;
    }

    public String getProf_password() {
        return prof_password;
    }

    public void setProf_password(String prof_password) {
        this.prof_password = prof_password;
    }
   
    
    public void addCourse(int crn){
        this.courseCRNS.add(crn);
    }

    public ArrayList<Integer> getCourseCRNS(){
        return this.courseCRNS;
    }
    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getProfessorID() {
        return professorID;
    }

    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

//    public ArrayList<Course> getCoursesTaught() {
//        return coursesTaught;
//    }
//
//    public void setCoursesTaught(ArrayList<Course> coursesTaught) {
//        this.coursesTaught = coursesTaught;
//    }
//    public void addCoursesTaught(Course course){
//    this.coursesTaught.add(course);
//    }
//    
//    public void removeCoursesTaughtByID(int id){
      //  for()
    //}
}
