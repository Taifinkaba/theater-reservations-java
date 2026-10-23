package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    static void main() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = myScanner.nextLine().trim();

        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String date = myScanner.nextLine();

        System.out.println("How many tickets would you like? ");
        int tickets = myScanner.nextInt();

        System.out.printf("%d tickets reserved for %s under %s%n", tickets, date, name);


    }
}
