package com.company;

import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar12 {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int month = in.nextInt();
            int day = in.nextInt();
            int year = in.nextInt();


            LocalDate date = LocalDate.of(year, month, day);
            System.out.print(date.getDayOfWeek());
        }
    }

