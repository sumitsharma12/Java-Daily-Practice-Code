package com.Manoj_Sir.Studentlist;

import java.util.ArrayList;

public class StudentDetails {
    public void studentdata(){
        //    Arraylist <DataType> obj_name=new Arraylist <DataType>();
        ArrayList <Student> listofstudents=new ArrayList<Student>();
        Student student1=new Student("rahul",12,45,22);
        Student student2=new Student("aman",11,45,10);
        listofstudents.add(student1);
        listofstudents.add(student2);
        for(Student list:listofstudents){
            System.out.println(list.name);
            System.out.println(list.age);
            System.out.println(list.marks);
            System.out.println(list.rollnumber);
        }
    }

    public static void main(String[] args) {
        StudentDetails obj=new StudentDetails();
        obj.studentdata();
    }
}
