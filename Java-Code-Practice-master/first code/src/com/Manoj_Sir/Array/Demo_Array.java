package com.Manoj_Sir.Array;

public class Demo_Array {

//    First way to print an Array
    public void marks(){
        int [] arr=new int[4];
        arr[0]=22;
        arr[1]=34;
        arr[2]=76;
        arr[3]=90;
        System.out.println(arr[0]);
    }

//    Second way to print array
public void names(){
        String [] arrs;
        arrs=new String[2];
        arrs[0]="sumit";
        arrs[1]="anuj";
    System.out.println(arrs[1]);
}

//Third way to print Array
public void rollno(){
        int [] ar={23,45,67,87,32};
        for(int i=1;i<ar.length;i++){
            System.out.println("Age of roll no "+ i +" "+ar[i]);
        }
}

//Fourth way to print Array( Advance way )
    public void lists(){
        int [] er={23,56,72,12};
        for(int dr:er){
            System.out.println("Advance way to print array "+dr);
        }
    }

    public static void main(String[] args) {
        Demo_Array obj=new Demo_Array();
        obj.marks();
        obj.names();
        obj.rollno();
        obj.lists();
    }
}
