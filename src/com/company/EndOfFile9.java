package com.company;

import java.util.Scanner;

public class EndOfFile9 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = 1;
        while(scan.hasNext()) {
            System.out.println(y + " " + scan.nextLine());
            y++;
        }
        scan.close();
    }

}
