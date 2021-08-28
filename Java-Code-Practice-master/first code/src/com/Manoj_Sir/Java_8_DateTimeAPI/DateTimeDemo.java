package com.Manoj_Sir.Java_8_DateTimeAPI;

import java.time.*;


public class DateTimeDemo {


    public static void main(String[] args) {

        LocalDate d=LocalDate.now();
        System.out.println("Today's Date is "+d);   //It will show Local date of Today

        LocalDate ld=LocalDate.of(1994, Month.NOVEMBER,13);
        System.out.println("setting Date "+ld); //Setting Date by Your self .

        LocalTime lt=LocalTime.now();
        System.out.println("Today's Time  is "+lt);  //It will show Local time of today

        LocalTime slt=LocalTime.of(12,50,55,77);
        System.out.println("Setting Time is "+slt); //Setting  time by yourself

        LocalDateTime t= LocalDateTime.now();
        System.out.println("Today's Date and time  is "+t); //It will show local date and time of today

        LocalTime tj=LocalTime.now(ZoneId.of("Asia/Kuwait"));
        System.out.println("Asia/Kuwait Local time is "+tj); //It will show the country time you want to  see

        Instant i=Instant.now();
        System.out.println(i); //It will show machine readable gmt time


//        For Getting All the zone id's -----
//        for(String S:ZoneId.getAvailableZoneIds())
//        {
//            System.out.println(S);
//        }
//-----------------------------------------------------

    }
}
