package com.Manoj_Sir.Java8_predefinedFunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String>s=()->{
            String[] s1={"sumit","durga","manoj","zafar"};
            int x=(int) (Math.random()*3+1);
            return s1[x];
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());

    }
}
