package com.Manoj_Sir.Java8_MethodRefrence;

import java.util.Locale;

interface Parser{
    String parse(String str);
}

class StringParser{
    public String convert(String s){
        if (s.length()<=3)
            s=s.toUpperCase();
        else
            s=s.toLowerCase();
        return s;
    }
}

class MyPrinter{
    public void print(String str,Parser p){
        str=p.parse(str);
        System.out.println(str);
    }
}


public class DemoCode {
    public static void main(String[] args) {
        StringParser sp=new StringParser();
        String str="Nav";
        MyPrinter mp=new MyPrinter();
        mp.print(str,(sp::convert));
    }
}
