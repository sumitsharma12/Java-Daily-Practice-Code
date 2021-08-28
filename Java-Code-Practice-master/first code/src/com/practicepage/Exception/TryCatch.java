package com.practicepage.Exception;

public class TryCatch {
    public void first(int num1,int num2){
        try {

            int result=num1/num2;
            System.out.println(result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        TryCatch obj=new TryCatch();
        obj.first(40,0);
    }
}
