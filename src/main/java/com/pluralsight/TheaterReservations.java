package com.pluralsight;

import java.text.DateFormat;
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

        // name split
        String[] nameParts = name.split("\\s+");
        String firstName = nameParts[0];
        String lastName = nameParts[0];

        // convert date

        // singular ticket if/else
        String ticketCount = tickets == 1 ? "ticket" : "tickets";

        // system output
        System.out.printf("%d tickets reserved for %s under %s%n", tickets, date, name);


    }
}
