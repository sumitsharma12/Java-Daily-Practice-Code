package com.Manoj_Sir.HashSet;

import java.util.HashSet;

public class FirstHash {
    public void first(){
//        Hashset <DataType> obj_name=new Hashset <DataType>();
        HashSet <Integer> list=new HashSet<Integer>();
        list.add(22);
        list.add(43);
        list.add(41);
        list.add(22);

        for(Integer value:list){
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        FirstHash obj=new FirstHash();
        obj.first();
    }
}
