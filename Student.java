/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.com.mycompany.online_courses_system;


/**
 *
 * @author demia
 */
//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Student extends Users implements Comparable<Student> {
static private int No_of_stud ;
private List<Courses> courses;
//private List<Double> coursegrade;

    public Student( String name, String email, String college, String department, int age, String gender, String password ) { 
        super(name, email, college, department, age, gender, password);
        No_of_stud++;
  //      this.coursegrade=new ArrayList<>();
        //this.courses = new ArrayList<>();
        //this.Final_Grade = Final_Grade;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
        for(Courses c:courses)
        Site.Add_Course(c);
    }

    


//    public double getFinal_Grade() {
////        if(!logedIn ){
////            System.out.println("not loged in");
////            return -1;
////           }
//        for(Courses c:courses){
//        Final_Grade+=this.getCourseGrade(c);
//        try {
//        double finalGrade = Final_Grade/courses.size() ; 
//        return finalGrade;
//        }catch(ArithmeticException e)
//        {
//            e.printStackTrace();
//            return 0;
//        }  
//    }
       //    public double getFinal_Grade() {
////        if(!logedIn ){
////            System.out.println("not loged in");
////            return -1;
////           }
//        for(Courses c:courses){
//        Final_Grade+=this.getCourseGrade(c);
//        try {
//        double finalGrade = Final_Grade/courses.size() ; 
//        return finalGrade;
//        }catch(ArithmeticException e)
//        {
//            e.printStackTrace();
//            return 0;
//        }  
//    } 
        
    public double getCourseGradePercentage(Courses course) {
        double courseGrade=0;
        double fullcoursegrade=0;
        int i;
        for( i =0 ; i < courses.size();i++){
        if(courses.get(i).getNameOf_course().equals(course.getNameOf_course()) )// array of courses 
                break;
        }
        for(int j=0;j<course.getTasks().size();j++){
            courseGrade+=Site.GetTasks(this.getName() , course.getNameOf_course() ,course.getTasks().get(i).getName()).getGrade();
            fullcoursegrade+=course.getTasks().get(j).getFullmark();
        }
        try {
         return (courseGrade/fullcoursegrade*100);
        }catch(ArithmeticException e)
        {
            e.printStackTrace();
             return 0;
        }  
    }
    

    public List<Courses> getCourses() {
        return courses;
    }


    public static int getNo_of_stud() {
        return No_of_stud;
    }

    public static void setNo_of_stud(int No_of_stud) {
        Student.No_of_stud = No_of_stud;
    }
    
@Override
    public int compareTo(Student s){
    if(this.finalGrade()>s.finalGrade())
            return 1;
    else if(this.finalGrade()<s.finalGrade())
            return -1;
    else 
        return 0;
    
    }
    public void addCourses (Courses course)
    {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return;
//           }
       this.courses.add(course);
       for(Tasks t:course.getTasks()){
       Site.SaveTasks(t);
       }
       Site.Add_Course(course);
    }
    public double finalGrade(){
        double Final_Grade=0;
        for(Courses c:this.courses){
            Final_Grade+=this.getCourseGradePercentage(c);
        }
        try{
            return Final_Grade/this.courses.size();
        }catch(ArithmeticException e){
            e.printStackTrace();
            return 0;
        }
    }
}