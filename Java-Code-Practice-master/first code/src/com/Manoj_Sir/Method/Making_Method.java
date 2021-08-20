package com.Manoj_Sir.Method;

public class Making_Method {
    public void read(){
        System.out.println("You can read");
    }
    public void write(){
        System.out.println("You can write");
    }
    public void study(){
        System.out.println("You can study");
    }

    public static void main(String[] args) {
        Making_Method obj=new Making_Method();
        obj.read();
        obj.write();
        obj.study();
    }
}
