package com.Manoj_Sir.HashMap;

import java.util.HashMap;

public class HashMapDemo {
    public  void demo(){

//        Syntax for HASHMAP :
//        HashMap <Key_DataType,Value_DataType>obj_name=new HashMap <Key_DataType,Value_DataType>();
        HashMap <Integer,String> hashvalues=new HashMap<Integer,String>();

//        Put
//        Adding VALUE TO HashMap------

        hashvalues.put(1,"Java");
        hashvalues.put(2,"C++");
        hashvalues.put(2,"spring");
        hashvalues.put(3,"Hibernate");

//        Get Method

        System.out.println(hashvalues.get(5));

    }

    public static void main(String[] args) {
        HashMapDemo obj=new HashMapDemo();
        obj.demo();
    }
}
