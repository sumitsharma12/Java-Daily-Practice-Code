package com.Manoj_Sir.Data;

import java.util.ArrayList;

public class ArrayListWithEmployee {
    public void displayemployee(){
        //    Arraylist <DataType> obj_name=new Arraylist <DataType>();

        ArrayList <Employee> emplist=new ArrayList<Employee>();
        Employee employee1=new Employee("sumit",22,"Accounts");
        Employee employee2=new Employee("sushant",21,"IT");
        Employee employee3=new Employee("rahul",22,"hardware");
        emplist.add(employee1);
        emplist.add(employee2);
        emplist.add(employee3);

        for(Employee details:emplist){

            System.out.println("Employee Name "+details.name);
            System.out.println("Employee Age "+details.age);
            System.out.println("Employee Department "+details.department);
        }

    }

    public static void main(String[] args) {
ArrayListWithEmployee obj =new ArrayListWithEmployee();
obj.displayemployee();
    }
}
