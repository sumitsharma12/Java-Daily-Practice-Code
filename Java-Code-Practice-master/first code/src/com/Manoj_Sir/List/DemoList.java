package com.Manoj_Sir.List;
import java.util.*;
public class DemoList {
public void demo(){
    ArrayList list=new ArrayList();
    list.add("sumit");
    list.add("sushant");
    list.add(22);
    list.add(56);

//    External Loop--------------------------

//    for(Object arr:list){
//        System.out.println(arr);
//    }

//    for(int i=0;i<list.size();i++){
//        System.out.println(list.get(i));
//    }

//    Internal Loop ---  Java 8  ------------------------

//    list.forEach(i-> System.out.println(i));




//    list.remove(1);

//    for(Object arrs:list){
//        System.out.println(arrs);
//    }

}

    public static void main(String[] args) {
        DemoList obj=new DemoList();
        obj.demo();
    }
}
