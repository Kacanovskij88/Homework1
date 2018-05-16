package com.company;

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            int arr = scan.nextInt();
            a[i] = arr;

        }
        scan.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
