package com.Manoj_Sir.Interface;

public class DemoInterface2 implements DemoInterface{
    @Override
    public void m1() {
        System.out.println("Display m1 ");
        System.out.println(DemoInterface.a);
        System.out.println(DemoInterface.b);
        DemoInterface.abc();

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    public static void main(String[] args) {
        DemoInterface2 obj=new DemoInterface2();
        obj.m1();
        obj.show();

    }
}
