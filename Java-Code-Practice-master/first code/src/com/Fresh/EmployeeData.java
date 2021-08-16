package com.Fresh;

public class EmployeeData {
    int a;
    String b;
    public EmployeeData(int a,String b){
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {
   EmployeeData obj=new EmployeeData(22,"sumit");
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
