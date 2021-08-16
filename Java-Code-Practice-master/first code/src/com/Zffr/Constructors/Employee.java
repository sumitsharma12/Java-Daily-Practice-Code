package com.Zffr.Constructors;

public class Employee {
    int id;
    String name;
    String branch;

    public Employee (int id,String name,String branch){
        this.id=id;
        this.name=name;
        this.branch=branch;

    }
    public Employee(){
        System.out.println("hello world");
    }
    public Employee(String name2){
        String a=name2;
        System.out.println(a);

    }

    public static void main(String[] args) {
        Employee obj=new Employee(22,"sumit","sales");
        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(obj.branch);
          new Employee();
          new Employee("hello parametrized constructor");
    }

}
