package com.Manoj_Sir.HashSet;

import java.util.HashSet;

public class EmployeeList {
    public void first(){
        HashSet <Employee> newlist=new HashSet<Employee>();
        Employee employee1=new Employee("sumit",22,"It");
        Employee employee2=new Employee("sushant",22,"sales");
        newlist.add(employee1);
        newlist.add(employee2);

        for (Employee value:newlist){
            System.out.println(value.name);
            System.out.println(value.age);
            System.out.println(value.department);
        }
    }

    public static void main(String[] args) {
        EmployeeList obj=new EmployeeList();
        obj.first();
    }
}
