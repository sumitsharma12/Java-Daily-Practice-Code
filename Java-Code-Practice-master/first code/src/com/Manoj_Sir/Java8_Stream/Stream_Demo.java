package com.Manoj_Sir.Java8_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Demo {

//Printing Even Numbers Using Stream


    public static void main (String[]args) {


ArrayList<Integer> l=new ArrayList<Integer>();
        ArrayList<Integer> l3=new ArrayList<Integer>();
l.add(0);
l.add(5);l.add(10);l.add(20);l.add(25);

//System.out.println(l);


//        Using Stream

List<Integer>l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(l1);


//        This is also a way

        for(Integer l2:l)
        {
            if(l2%2==0)
            {
                l3.add(l2);
            }
        }
        System.out.println(l3);


//        This is also a way we can do

        for(Integer l2:l)
        {
            if(l2%2==0)
            {
                System.out.println(l2);
            }
        }


    }
}
