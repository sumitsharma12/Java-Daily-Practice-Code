package com.Manoj_Sir.Lambda_Expression;

public interface A {
    void show (int i);
}
class LambdaDemo{
    public static void main(String[] args) {
        A obj;
        obj=(i)-> System.out.println("hello "+i);
        obj.show(22);
    }
}


