package com.Manoj_Sir.HashMap;

import java.util.HashMap;

public class HashMapEmployee {
    public void data(){
//        HashMap <Key_DataType,Value_DataType>obj_name=new HashMap <Key_DataType,Value_DataType>();

        HashMap <Integer,Employee> employedetail=new HashMap<Integer,Employee>();
        Employee emp1=new Employee("manoj",23432);
        Employee emp2=new Employee("sonu",879);

        employedetail.put(1,emp1);
        employedetail.put(2,emp2);

        Employee obj=employedetail.get(2);
        System.out.println(obj.name);
        System.out.println(obj.id);

        obj=employedetail.get(1);
        System.out.println(obj.name);
        System.out.println(obj.id);

    }

    public static void main(String[] args) {
      HashMapEmployee object=new HashMapEmployee();
      object.data();
    }
}
