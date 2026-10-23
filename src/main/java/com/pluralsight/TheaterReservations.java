package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    static void main() {
        // init scanner
        Scanner myScanner = new Scanner(System.in);

        // user input
        System.out.println("Please enter your name: ");
        String name = myScanner.nextLine().trim();

        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String date = myScanner.nextLine();

        System.out.println("How many tickets would you like? ");
        int tickets = myScanner.nextInt();


        // convert date
        // split name


        // singular ticket if/else
        String ticketCount = tickets == 1 ? "ticket" : "tickets";

        // system output
        System.out.printf("%d tickets reserved for %s under %s%n", tickets, date, name);


    }
}
