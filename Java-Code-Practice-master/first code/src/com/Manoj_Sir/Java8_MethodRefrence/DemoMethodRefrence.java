package com.Manoj_Sir.Java8_MethodRefrence;

import java.util.Arrays;
import java.util.List;

public class DemoMethodRefrence {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("sumit","sushant","arjun");
        names.forEach(System.out::println);
    }
}
