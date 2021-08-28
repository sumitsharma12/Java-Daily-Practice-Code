package com.Manoj_Sir.Java8_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Double {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        ArrayList<Integer>l3=new ArrayList<>();
        l.add(2);l.add(3);l.add(4);l.add(5);

//        Printing Double of the Number

//      Using Advance for loop First Way

//        for(Integer l2:l){
//            int a=l2*2;
//            System.out.println(a);
//        }

//        Using Advance for loop Second Way

//        for(Integer l2:l){
//         l3.add(l2*2);
//            System.out.println(l3);
//        }


//        using Stream

        List<Integer>ln=l.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(ln);


    }
}
