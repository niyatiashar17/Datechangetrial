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
public class CourseHistory {

    private ArrayList<Course> coursedetails;
    //private ArrayList<Course> studentregisterdetails;
    private ArrayList<Course> courseSpringdetails;

    public ArrayList<Course> getCoursedetails() {
        return coursedetails;
    }

    public void setCoursedetails(ArrayList<Course> coursedetails) {
        this.coursedetails = coursedetails;
    }

    public ArrayList<Course> getCourseSpringdetails() {
        return courseSpringdetails;
    }

    public void setCourseSpringdetails(ArrayList<Course> courseSpringdetails) {
        this.courseSpringdetails = courseSpringdetails;
    }

    public CourseHistory() {
        this.coursedetails = new ArrayList<Course>();
        this.courseSpringdetails = new ArrayList<Course>();
//        this.studentregisterdetails = new ArrayList<Course>();
        Course c1 = new Course();
        c1.setTitle("DMDD");
        c1.setSubjectDescription("Data Architecture Management");
        c1.setcourseNumber(6210);
        c1.setSection("08");
        c1.setLanguage("English");
        c1.setHours(4);
        c1.setCrn(15025);
        c1.setInstructor("Manuel Montrond");
        c1.setMeetingTimes("Monday06:10 PM - 09:40 PM");
        c1.setCampus("Boston");
        c1.setOnlineremote("Offline");
        c1.setEmployerrating(0);
        c1.setStudentrating(0);
        c1.setGrade(0);
                c1.setTerm("Spring 2024");

        this.coursedetails.add(c1);

        Course c2 = new Course();
        c2.setTitle("AED");
        c2.setSubjectDescription(" Application Engineering and Development");
        c2.setcourseNumber(5100);
        c2.setSection("09");
        c2.setLanguage("English");
        c2.setHours(4);
        c2.setCrn(15026);
        c2.setInstructor("Kal Bugrara");
        c2.setMeetingTimes("Wednesday 03:10 PM - 06:00 PM");
        c2.setCampus("Boston");
        c2.setOnlineremote("Offline");
        c2.setEmployerrating(5);
        c2.setStudentrating(4);
        c2.setGrade(0);
                c2.setTerm("Fall 2023");
        this.coursedetails.add(c2);

        Course c3 = new Course();
        c3.setTitle("DS");
        c3.setSubjectDescription("Data Science");
        c3.setcourseNumber(5600);
        c3.setSection("09");
        c3.setLanguage("English");
        c3.setHours(4);
        c3.setCrn(15027);
        c3.setInstructor("Nicholas Brown");
        c3.setMeetingTimes("Monday 11:45 PM - 2:45 PM");
        c3.setCampus("Boston");
        c3.setOnlineremote("Offline+Online");
        c3.setEmployerrating(0);
        c3.setStudentrating(0);
        c3.setGrade(0);
        c3.setTerm("Fall 2023");
        this.coursedetails.add(c3);

        Course c4 = new Course();
        c4.setTitle("ENCP");
        c4.setSubjectDescription("Career Management");
        c4.setcourseNumber(6200);
        c4.setSection("10");
        c4.setLanguage("English");
        c4.setHours(2);
        c4.setCrn(15028);
        c4.setInstructor("Marrian Matriany");
        c4.setMeetingTimes("Friday 11:45 PM - 1:00 PM");
        c4.setCampus("Boston");
        c4.setOnlineremote("Offline+Online");
        c4.setEmployerrating(4);
        c4.setStudentrating(4);
        c4.setGrade(0);
        c4.setTerm("Spring 2024");
        this.coursedetails.add(c4);

        Course c5 = new Course();
        c5.setTitle("Lab5100");
        c5.setSubjectDescription("Lab for INFO 5100");
        c5.setcourseNumber(5200);
        c5.setSection("11");
        c5.setLanguage("English");
        c5.setHours(3);
        c5.setCrn(12113);
        c5.setInstructor("Daniel Smith");
        c5.setMeetingTimes("Sunday 11:45 PM - 1:00 PM");
        c5.setCampus("Boston");
        c5.setOnlineremote("Online");
        c5.setEmployerrating(4);
        c5.setStudentrating(4);
        c5.setGrade(0);
        c5.setTerm("Spring 2024");
        this.coursedetails.add(c5);

        Course c6 = new Course();
        c6.setTitle("DSE");
        c6.setSubjectDescription("Data Science Engineering Methods and Tools");
        c6.setcourseNumber(6105);
        c6.setSection("12");
        c6.setLanguage("English");
        c6.setHours(4);
        c6.setCrn(13309);
        c6.setInstructor("Dino Konstan");
        c6.setMeetingTimes("Tuesday & Friday 9:50 - 11:30 AM");
        c6.setCampus("Boston");
        c6.setOnlineremote("Offline");
        c6.setEmployerrating(0);
        c6.setStudentrating(0);
        c6.setGrade(0);
        c6.setTerm("Fall 2023");
        this.coursedetails.add(c6);

        Course c7 = new Course();
        c7.setTitle("WEB");
        c7.setSubjectDescription("Web Design and User Experience Engineering");
        c7.setcourseNumber(6150);
        c7.setSection("12");
        c7.setLanguage("English");
        c7.setHours(4);
        c7.setCrn(13310);
        c7.setInstructor("Samuel Casey");
        c7.setMeetingTimes("Tuesday & Friday 9:50 - 11:30 AM");
        c7.setCampus("Boston");
        c7.setOnlineremote("Offline");
        c7.setEmployerrating(3);
        c7.setGrade(0);
        c7.setStudentrating(3);
        c7.setTerm("Fall 2023");
        this.coursedetails.add(c7);

        Course c8 = new Course();
        c8.setTitle("CNN");
        c8.setSubjectDescription("Introduction to Computer Networks");
        c8.setCourseNumber(3201);
        c8.setSection("34");
        c8.setLanguage("English");
        c8.setHours(3);
        c8.setCrn(54321);
        c8.setInstructor("Alice Johnson");
        c8.setMeetingTimes("Monday & Wednesday 10:00 - 11:30 AM");
        c8.setCampus("Chicago");
        c8.setOnlineremote("Offline");
        c8.setEmployerrating(4);
        c8.setStudentrating(4);
        c8.setGrade(0);
        c8.setTerm("Spring 2024");
        this.coursedetails.add(c8);

        Course c9 = new Course();
        c9.setTitle("PSA");
        c9.setSubjectDescription("High-performance parallel computing, General algorithms");
        c9.setCourseNumber(4102);
        c9.setSection("08");
        c9.setLanguage("English");
        c9.setHours(3);
        c9.setCrn(98765);
        c9.setInstructor("Handan Liu");
        c9.setMeetingTimes("Wednesday & Friday 2:00 - 3:30 PM");
        c9.setCampus("Seattle");
        c9.setOnlineremote("Offline");
        c9.setEmployerrating(4);
        c9.setStudentrating(4);
        c9.setGrade(0);
        c9.setTerm("Fall 2023");
        this.coursedetails.add(c9);

        Course c10 = new Course();
        c10.setTitle("MIS");
        c10.setSubjectDescription("Data Architecture and Management, Information Systems");
        c10.setCourseNumber(2203);
        c10.setSection("98");
        c10.setLanguage("English");
        c10.setHours(2);
        c10.setCrn(76543);
        c10.setInstructor("Erin White");
        c10.setMeetingTimes("Thursday 1:00 - 3:00 PM");
        c10.setCampus("San Francisco");
        c10.setOnlineremote("Offline");
        c10.setEmployerrating(3);
        c10.setStudentrating(5);
        c10.setGrade(0);
        c10.setTerm("Spring 2024");
        this.coursedetails.add(c10);

        Course c11 = new Course();
        c11.setTitle("HCI");
        c11.setSubjectDescription("Human-Computer Interaction");
        c11.setcourseNumber(6210);
        c11.setSection("34");
        c11.setLanguage("English");
        c11.setHours(4);
        c11.setCrn(15025);
        c11.setInstructor("Arji Rached");
        c11.setMeetingTimes("Monday06:10 PM - 09:40 PM");
        c11.setCampus("Boston");
        c11.setOnlineremote("Offline");
        c11.setEmployerrating(0);
        c11.setStudentrating(0);
        c11.setGrade(0);
        c11.setTerm("Fall 2023");
        this.courseSpringdetails.add(c1);

        Course c12 = new Course();
        c12.setTitle("IS Security");
        c12.setSubjectDescription("Information System Security");
        c12.setcourseNumber(4321);
        c12.setSection("03");
        c12.setLanguage("English");
        c12.setHours(3);
        c12.setCrn(15028);
        c12.setInstructor("Alice Smith");
        c12.setMeetingTimes("Tuesday 10:00 AM - 12:30 PM");
        c12.setCampus("Seattle");
        c12.setOnlineremote("Offline");
        c12.setEmployerrating(4);
        c12.setStudentrating(5);
        c12.setGrade(0);
         c12.setTerm("Spring 2024");
        this.courseSpringdetails.add(c12);
//        Course c1 = new Course("title" ,"subjectDescription","courseName","section","language","hours","crn","instructor","meetingTimes","campus","onlineremote","employerrating","Studentrating");

        Course c13 = new Course();
        c13.setTitle("DSS");
        c13.setSubjectDescription("Database Management Systems");
        c13.setcourseNumber(5432);
        c13.setSection("04");
        c13.setLanguage("English");
        c13.setHours(3);
        c13.setCrn(15029);
        c13.setInstructor("John Davis");
        c13.setMeetingTimes("Thursday 2:00 PM - 4:30 PM");
        c13.setCampus("Boston");
        c13.setOnlineremote("Offline");
        c13.setEmployerrating(5);
        c13.setStudentrating(4);
        c13.setGrade(0);
         c13.setTerm("Fall 2023");
        this.courseSpringdetails.add(c13);

        Course c14 = new Course();
        c14.setTitle("IPM");
        c14.setSubjectDescription("Information System Project Management");
        c14.setcourseNumber(6543);
        c14.setSection("05");
        c14.setLanguage("English");
        c14.setHours(3);
        c14.setCrn(15030);
        c14.setInstructor("Sara Johnson");
        c14.setMeetingTimes("Wednesday 5:00 PM - 7:30 PM");
        c14.setCampus("Boston");
        c14.setOnlineremote("Offline");
        c14.setEmployerrating(4);
        c14.setStudentrating(4);
        c14.setGrade(0);
        c14.setTerm("Fall 2023");
        this.courseSpringdetails.add(c14);

        Course c15 = new Course();
        c15.setTitle("WEB");
        c15.setSubjectDescription("Web Application Development");
        c15.setcourseNumber(7654);
        c15.setSection("06");
        c15.setLanguage("English");
        c15.setHours(3);
        c15.setCrn(15031);
        c15.setInstructor("Michael Turner");
        c15.setMeetingTimes("Monday 2:00 PM - 4:30 PM");
        c15.setCampus("Boston");
        c15.setOnlineremote("Offline+Online");
        c15.setEmployerrating(3);
        c15.setStudentrating(4);
        c15.setGrade(0);
        c15.setTerm("Fall 2023");
        this.courseSpringdetails.add(c15);

        Course c16 = new Course();
        c16.setTitle("DA");
        c16.setSubjectDescription("Data Analytics and Visualization");
        c16.setcourseNumber(8765);
        c16.setSection("07");
        c16.setLanguage("English");
        c16.setHours(3);
        c16.setCrn(15032);
        c16.setInstructor("Linda Williams");
        c16.setMeetingTimes("Tuesday 5:00 PM - 7:30 PM");
        c16.setCampus("Boston");
        c16.setOnlineremote("Offline+Online");
        c16.setEmployerrating(5);
        c16.setStudentrating(5);
        c16.setGrade(0);
        c16.setTerm("Spring 2024");
        this.courseSpringdetails.add(c16);

        Course c17 = new Course();
        c17.setTitle("MIE");
        c17.setSubjectDescription("Mechanical and Industrial Engineering");
        c17.setcourseNumber(9876);
        c17.setSection("15");
        c17.setLanguage("English");
        c17.setHours(3);
        c17.setCrn(15033);
        c17.setInstructor("Robert Martinez");
        c17.setMeetingTimes("Thursday 5:00 PM - 7:30 PM");
        c17.setCampus("San Francisco");
        c17.setOnlineremote("Offline");
        c17.setEmployerrating(4);
        c17.setStudentrating(4);
        c17.setGrade(0);
        c17.setTerm("Fall 2023");
        this.courseSpringdetails.add(c17);

        Course c18 = new Course();
        c18.setTitle("BI");
        c18.setSubjectDescription("Business Intelligence and Data Warehousing");
        c18.setcourseNumber(1234);
        c18.setSection("11");
        c18.setLanguage("English");
        c18.setHours(3);
        c18.setCrn(15035);
        c18.setInstructor("Emily Clark");
        c18.setMeetingTimes("Wednesday 10:00 AM - 12:30 PM");
        c18.setCampus("Seattle");
        c18.setOnlineremote("Offline+Online");
        c18.setEmployerrating(5);
        c18.setStudentrating(4);
        c18.setGrade(0);
        c18.setTerm("Fall 2023");
        this.courseSpringdetails.add(c18);

        Course c19 = new Course();
        c19.setTitle("Information Systems Ethics");
        c19.setSubjectDescription("Ethical Issues in Information Systems");
        c19.setcourseNumber(5678);
        c19.setSection("12");
        c19.setLanguage("English");
        c19.setHours(3);
        c19.setCrn(15036);
        c19.setInstructor("Karen Lee");
        c19.setMeetingTimes("Thursday 3:00 PM - 5:30 PM");
        c19.setCampus("Boston");
        c19.setOnlineremote("Offline");
        c19.setEmployerrating(4);
        c19.setStudentrating(5);
        c19.setGrade(0);
        c19.setTerm("Fall 2023");
        this.courseSpringdetails.add(c19);

        Course c20 = new Course();
        c20.setTitle("BDA");
        c20.setSubjectDescription("Big Data Analytics and Technologies");
        c20.setcourseNumber(9876);
        c20.setSection("14");
        c20.setLanguage("English");
        c20.setHours(3);
        c20.setCrn(15038);
        c20.setInstructor("Laura Davis");
        c20.setMeetingTimes("Monday 10:00 AM - 12:30 PM");
        c20.setCampus("San Francisco");
        c20.setOnlineremote("Offline");
        c20.setEmployerrating(4);
        c20.setStudentrating(5);
        c20.setGrade(0);
        c20.setTerm("Fall 2023");
        this.courseSpringdetails.add(c20);

    }

//    
//    public ArrayList<Course> getStudentregisterdetails() {
//        return studentregisterdetails;
//    }
//
//    public void setStudentregisterdetails(ArrayList<Course> studentregisterdetails) {
//        this.studentregisterdetails = studentregisterdetails;
//    }
    public ArrayList<Course> getCourseList() {
        return coursedetails;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.coursedetails = courseList;
    }

    public void addCourse(Course c) {
        this.coursedetails.add(c);
    }

    public void deleteCourse(Course course) {
        coursedetails.remove(course);
    }

    public Course search(String instructor, String title, String region, String language) {
        for (Course course : coursedetails) {
            if (course.getInstructor().equals(instructor) && course.getTitle().equals(title) && course.getCampus().equals(region) && course.getLanguage().equals(language)) {
                return course;
            }
        }
        for (Course course : courseSpringdetails) {
            if (course.getInstructor().equals(instructor) && course.getTitle().equals(title) && course.getCampus().equals(region) && course.getLanguage().equals(language)) {
                return course;
            }
        }
        return null;
    }
        public Course searchByCRN(int CRN) {
        for (Course course : coursedetails) {
            if (course.getCrn()==CRN) {
                return course;
            }
        }
        for (Course course : courseSpringdetails) {
            if (course.getCrn()==CRN) {
                return course;
            }
        }
        return null;
    }
//    public Course addRegisterCourses(){
//        Course register = new Course();
//        studentregisterdetails.add(register);
//        return register;
//    }
}

