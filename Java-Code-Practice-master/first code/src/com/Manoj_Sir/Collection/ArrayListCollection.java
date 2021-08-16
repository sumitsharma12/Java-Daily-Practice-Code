package com.Manoj_Sir.Collection;
import java.util.*;

public class ArrayListCollection {

    public void displaylist(){
//        Array list Syntax :
//        Arraylist obj_name=new Arraylist();

        ArrayList list=new ArrayList();
        list.add("Test "); //0th position
        list.add("Test 1"); //1st position
        list.add("Test 2"); //2nd position

//        Advance For Loop
        for(Object val:list){
            System.out.println(val);
        }
    }

//    Generic List-------

public void displaylistWithGeneric(){
//        Generic list Syntax :
//    Arraylist <DataType> obj_name=new Arraylist <DataType>();
ArrayList <Integer> gen=new ArrayList<Integer>();
gen.add(22);
gen.add(564);
gen.add(89);
gen.add(76);

for(Integer val:gen){
    System.out.println(val);
}

ArrayList <String> stringgenlist=new ArrayList<String>();
stringgenlist.add("Delhi");
stringgenlist.add("Mumbai");

 for(String strlist:stringgenlist){
     System.out.println(strlist);
 }
}
    public static void main(String[] args) {
        ArrayListCollection obj=new ArrayListCollection();
        obj.displaylist();
        obj.displaylistWithGeneric();
    }
}
