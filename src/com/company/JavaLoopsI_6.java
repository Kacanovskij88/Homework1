package com.company;

import java.util.Scanner;

public class JavaLoopsI_6 {


    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int s =1; s<=10; s++) {
            int result = N*s;
            System.out.printf("%d x %d = %d\n",N,s,result);

        }

        scanner.close();
    }
}

