/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.com.mycompany.online_courses_system;


/**
 *
 * @author hp
 */
public class Assignment implements Tasks,Cloneable{
    double fullmark;
    double Grade;
    String Name ;
    Time Deadline ;

    public Assignment() {
    }

    
    public Assignment(double fullmark, String Name, Time Deadline) {
        this.fullmark = fullmark;
        this.Name = Name;
        this.Deadline = Deadline;
    }
       
     @Override
    public double getGrade(){
        return Grade ;

    }  
   
   @Override
   public String getName(){
    return Name ;
  
  } 
   @Override
    public Time getDeadLine(){
        return Deadline ;
    }
   @Override
    public double getFullmark(){
         return fullmark ;
  
    } 

    @Override
    public void setGrade(int grade) {
        this.Grade = grade;
    }
}