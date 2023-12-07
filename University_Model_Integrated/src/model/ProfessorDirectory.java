/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.CourseHistory;
import java.util.ArrayList;

/**
 *
 * @author RUTUJA
 */
public class ProfessorDirectory {
    
   private ArrayList<Professor> professorDirectory;
   public ProfessorDirectory(){
       this.professorDirectory = new ArrayList<Professor>();
       Professor pro1=new Professor();
       pro1.setProf_username("Manuel Montrond");
       pro1.setProfessorID(1);
       pro1.setEmail("Manuel@email.com");
       pro1.setContactNo(745397453);
       pro1.addCourse(6210);
       this.professorDirectory.add(pro1);
       
       
       Professor pro2=new Professor();
       pro2.setProfessorName("Kal Bugrara");
       pro2.setProfessorID(2);
       pro2.setEmail("Kal@email.com");
       pro2.setContactNo(753489211);
       pro2.addCourse(5100);
       this.professorDirectory.add(pro2);
       
       Professor pro3=new Professor();
       pro3.setProfessorName("Marrian Matriany");
       pro3.setProfessorID(3);
       pro3.setEmail("MMatriany@email.com");
       pro3.setContactNo(734589212);
       pro3.addCourse(6200);
       this.professorDirectory.add(pro3);
       
       Professor pro4=new Professor();
       pro4.setProfessorName("Daniel Smith");
       pro4.setProfessorID(4);
       pro4.setEmail("DSmith@email.com");
       pro4.setContactNo(763498211);
       pro4.addCourse(5200);
       pro4.addCourse(6105);
       this.professorDirectory.add(pro4);
       
       Professor pro6=new Professor();
       pro6.setProfessorName("Alice Johnson");
       pro6.setProfessorID(5);
       pro6.setEmail("AliceJ@email.com");
       pro6.setContactNo(754321211);
       pro6.addCourse(3201);      
       this.professorDirectory.add(pro6);
       
       Professor pro7=new Professor();
       pro7.setProfessorName("Mary Brown");
       pro7.setProfessorID(6);
       pro7.setEmail("AliceJ@email.com");
       pro7.setContactNo(754354321);
       pro7.addCourse(4102); 
   this.professorDirectory.add(pro7);
       
       Professor pro8=new Professor();
       pro8.setProfessorName("Sarah White");
       pro8.setProfessorID(7);
       pro8.setEmail("AliceJ@email.com");
       pro8.setContactNo(867354321);
       pro8.addCourse(2203); 
       
       this.professorDirectory.add(pro8);
       
       Professor pro9=new Professor();
       pro8.setProfessorName("Eric John");
       pro8.setProfessorID(7);
       pro8.setEmail("AliceJ@email.com");
       pro8.setContactNo(868324321);
       pro8.addCourse(8532); 
       
       this.professorDirectory.add(pro9);
       
       Professor pro10=new Professor();
       pro8.setProfessorName("Dino Kontans");
       pro8.setProfessorID(7);
       pro8.setEmail("DinoK3@email.com");
       pro8.setContactNo(867834321);
       pro8.addCourse(8976); 
       
       this.professorDirectory.add(pro10);
       
   }
   public ArrayList<Professor> getProfessorList(){
       return professorDirectory;
   }

    public ArrayList<Professor> getProfessorDirectory() {
        return professorDirectory;
    }

    public void setProfessorDirectory(ArrayList<Professor> professorDirectory) {
        this.professorDirectory = professorDirectory;
    }
     public Professor addProfessor(){
        
        Professor newProfessor = new Professor();
        professorDirectory.add(newProfessor);
        return newProfessor;
    }
    public void deleteProfessor(Professor pf){
        professorDirectory.remove(pf);
    }

}
