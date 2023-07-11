package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
import static java.time.format.DateTimeFormatter.ofLocalizedDate;

public class Main {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate date=LocalDate.of(1945,05, 8);
        System.out.println(date);
        LocalDate year=LocalDate.of(1945,05,8);
        System.out.println(year);
       //Exercise 1  LocalDate of the current day and print it out
        LocalDate day=LocalDate.now();
        System.out.println(day);

        System.out.println("IS this year a leap year = "+day.isLeapYear());
        LocalDateTime timeStamp= LocalDateTime.now();
        System.out.println(timeStamp);


        // Exercise 2 Create a LocalDate of the current day and print it out in the following
        // pattern-using DateTimeFormatter:Tors-dag 29 mars.

        System.out.println("timeStamp = "+timeStamp.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("timeStamp = "+timeStamp.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("timeStamp = "+timeStamp.format(DateTimeFormatter.ofPattern("eeee dd MM y ")));


        //Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO format.
        LocalDate today=LocalDate.now();
        DayOfWeek dayOfWeek=today.getDayOfWeek();
        System.out.println("Day of the week ="+dayOfWeek);
        System.out.println("Local date on last monday ="+dayOfWeek.minus(8));
        LocalDate lastMonday=today.minusDays(8);

        System.out.println(lastMonday);

        //Create a LocalDate object from a String by using the .parse() method.
        LocalDate localDate_Object=LocalDate.parse("2023-07-11");
        System.out.println(localDate_Object);

       // The date time api provides enums for time units such as day and month
       //Create a LocalDate of 1945-05-08 and extract the day of week for that date.
        Year day1= Year.now().minusYears(1945);

        System.out.println(day1);
        System.out.println("DAY OF THE WEEK 1945-05-08 IS = "+date.getDayOfWeek());

        //Exercise6
        // Create a LocalDate of current date plus 10 years and minus 10 months.
        // From that date extract the month and print it out

        LocalDate current_Date=LocalDate.now();
        System.out.println(current_Date);
        LocalDate current_Date1= current_Date.plusYears(10).minusMonths(10);
        System.out.println("CURRENT DATE PLUS 10 YEARS AND MINUS 10 MONTHS = "+current_Date1);
        System.out.println("The month is = "+current_Date1.getMonth());
        System.out.println("The day of the week is = "+current_Date1.getDayOfWeek());

        //Exercise7
        //Using the LocalDate from exercise 6 and your birthdate,
        // create a Period between your birthdate and the date from exercise 5.
        // Print out the elapsed years, months and days.

        LocalDate birthday=LocalDate.of(1990,11,24);
        System.out.println(birthday);
        Period period=Period.between(LocalDate.of(1990,11,24),LocalDate.of(2023,07,11));
        System.out.println("elapsed years = "+period);

        //Exercise 8
        //Create a period of 4 years,7 months and 29 days.
        // Then create a LocalDate of current date and add the period you created to the current date.

        Period p1=Period.ofYears(4).plusMonths(7).plusDays(29);
        LocalDate d1=LocalDate.of(1990,1,1);
        System.out.println("date ="+d1 );
        LocalDate result=d1.plus(p1);
        System.out.println("result after adding period ="+result);

        //Exercise 9
        //Create a LocalTime object of the current time.
        LocalTime time=LocalTime.now();
        System.out.println("Current time is ="+time);

        //Exercise 10
        //Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.
        int nano=LocalTime.now().getSecond();
        int milli=LocalTime.now().getNano();
        System.out.println("Nano seconds ="+milli);
        System.out.println(" seconds from current time = "+nano);

        //Exercise 11
        //Create a LocalTime object from a String using the .parse() method.
        //LocalTime t1= LocalTime.parse();


    }

}