package com.Manoj_Sir.Java8_predefinedFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String>c=s-> System.out.println(s);
        c.accept("Hello");
        c.accept("Durgasoft");
    }
}
