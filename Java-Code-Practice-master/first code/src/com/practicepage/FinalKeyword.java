package com.practicepage;

public class FinalKeyword {
    public void first(){
        final int AGE=22;
        System.out.println(AGE);
    }
    public void second (){
         int AGE=24;
        System.out.println(AGE);
    }

    public static void main(String[] args) {
        final int AGE=66;
        System.out.println(AGE);

        FinalKeyword obj=new FinalKeyword();
        obj.first();
        obj.second();
    }
}
