/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yuga
 */
public class Course {
        private String title;
        private String subjectDescription;
        private int courseNumber;
        private String section;
        private String language;
        private int hours;
        private int crn;
        private String instructor;
        private String meetingTimes;
        private String campus;
        private String onlineremote;
        private int employerrating;
        private int Studentrating;
        private int grade;
        private String term;

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public int getcourseNumber() {
        return courseNumber;
    }

    public void setcourseNumber(int courseName) {
        this.courseNumber = courseName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getCrn() {
        return crn;
    }

    public void setCrn(int crn) {
        this.crn = crn;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getMeetingTimes() {
        return meetingTimes;
    }

    public void setMeetingTimes(String meetingTimes) {
        this.meetingTimes = meetingTimes;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getOnlineremote() {
        return onlineremote;
    }

    public void setOnlineremote(String onlineremote) {
        this.onlineremote = onlineremote;
    }

    public int getEmployerrating() {
        return employerrating;
    }

    public void setEmployerrating(int employerrating) {
        this.employerrating = employerrating;
    }

    public int getStudentrating() {
        return Studentrating;
    }

    public void setStudentrating(int Studentrating) {
        this.Studentrating = Studentrating;
    }
    @Override
    public String toString(){
        return title;
    }
    
}
