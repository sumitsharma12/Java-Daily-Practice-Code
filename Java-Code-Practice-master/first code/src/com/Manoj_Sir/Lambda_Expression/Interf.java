package com.Manoj_Sir.Lambda_Expression;

public interface Interf {
    public void m1();
}
class Test{
    int x=10;
    public void m2(){
        int y=20;
        Interf i=()->{
            int x=888;   //Here Value will be change as 888 .
//            int y=999; //It is a compile time error .
            System.out.println(x);
            System.out.println(y);
        };
        i.m1();
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.m2();
    }
}
