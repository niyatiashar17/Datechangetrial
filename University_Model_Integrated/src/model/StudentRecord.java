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
public class StudentRecord {
        private ArrayList<Student> stdlist;
   public StudentRecord() {
        this.stdlist = new ArrayList<Student>();

    }

    public ArrayList<Student> getStdlist() {
        return stdlist;
    }

    public void setStdlist(ArrayList<Student> stdlist) {
        this.stdlist = stdlist;
    }
  
    public Student addNewStudent(){
        
        Student newStudent = new Student();
        stdlist.add(newStudent);
        return newStudent;
    }
    public void deleteVitals(Student st){
        stdlist.remove(st);
    }
}
