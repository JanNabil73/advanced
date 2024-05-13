/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.com.mycompany.online_courses_system;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.List;
public class Site {
     private static List<Courses> c;
     private static List<Users> u;
     private static List<Student> s;
     private static List<Tasks> t;

    public Site() {
        c=new ArrayList<>();
        u=new ArrayList<>();
        t=new ArrayList<>();
        s=new ArrayList<>();
    }

    public static List<Courses> getC() {
        return c;
    }

    public static List<Users> getU() {
        return u;
    }
    public static void SaveTasks(Tasks task){
        //for(Tasks task:s.getCourses().get(s.getCourses().indexOf(c)).getTasks())
            t.add(task);
    }
    public static Tasks GetTasks(String nameOfTask,String nameOfCourse,String nameOfUser){
        int i,j,k; 
        for( i =0 ; i < s.size();i++)
        {
            if((s.get(i)).getName().equals(nameOfUser ))// array of courses 
                break;
        }
        
        for( j =0 ; j < c.size();j++)
        {
            if((s.get(i)).getCourses().get(j).getNameOf_course().equals(nameOfCourse) )// array of courses 
                break;
        }
         for( k =0 ; k < u.size();k++)
        {
            if((s.get(i)).getCourses().get(j).getTasks().get(k).getName().equals(nameOfTask))// array of courses 
                break;
        }
        return ((Student)u.get(i)).getCourses().get(j).getTasks().get(k);
        }
     public static void Add_Course(Courses course){
         c.add(course);
     }
     public static void Add_Users(Users user){
         u.add(user);
     }
     public static void Add_Student(Student student){
         u.add(student);
     }
     public static List<Student> getS() {
        return s;
    }
     public static Courses Get_Course(String nameOfCourse){
         int i;
         for( i =0 ; i < c.size();i++)
        {
            if(c.get(i).getNameOf_course().equals(nameOfCourse) )// array of courses 
                break;
        }
         return c.get(i);
     }
     public static Users Get_User(String nameOfUser){
         int i;
         for( i =0 ; i < u.size();i++)
        {
            if(u.get(i).getName().equals(nameOfUser ))// array of courses 
                break;
        }
         return u.get(i);
     }
     
//     public static Courses Get_Course(String nameOfcourse){
//     
//         for(int i =0 ; i < c.size();i++)
//        {
//            if(c.get(i).getNameOf_course() ==nameOfcourse )// array of courses 
//                return c.get(i);
//        }
////         System.out.println("not exist");
////         return null;
//     }
//     
//     
//     public static Users Get_User(String nameOfUser){
//     
//         for(int i =0 ; i < u.size();i++)
//        {
//            if(u.get(i).getName() ==nameOfUser )// array of courses 
//                return u.get(i);
//        }
////         System.out.println("not exist");
////         return null;
//     }
}
