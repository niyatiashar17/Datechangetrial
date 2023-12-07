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
public class ProfessorRecord {
            private ArrayList<Professor> proflist;

    public ArrayList<Professor> getProflist() {
        return proflist;
    }

    public void setProflist(ArrayList<Professor> proflist) {
        this.proflist = proflist;
    }
    public ProfessorRecord () {
        this.proflist = new ArrayList<Professor>();
    }
    
     public Professor addProfessor(){
        
        Professor newProfessor = new Professor();
        proflist.add(newProfessor);
        return newProfessor;
    }
    public void deleteProfessor(Professor pf){
        proflist.remove(pf);
    }

}
