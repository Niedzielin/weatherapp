package com.sda.wapp.ConsoleUserInterface; // todo ConsoleUserInterface is unnecessary
// todo package into a frontend

import java.util.Scanner;

/**
 * Created by Hyperbook on 24.01.2021
 **/
public class HeadMenuNavigation {

    private static String city, longitude, latitude, region, country; // todo move to the method scope

    static void addNewLocation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert Location data");
        System.out.println("1.City");
        System.out.println("2.Longitude");
        System.out.println("3.Latitude");
        System.out.println("4.Region");
        System.out.println("5.Country");
        System.out.println("6.Exit");

        while (true) {
            String cityNavigation = scanner.next();
            switch (cityNavigation) {
                case "1":
                    System.out.println("City:");
                    city = scanner.next();
                    break;
                case "2":
                    System.out.println("Longitude");
                    longitude = scanner.next();
                    break;
                case "3":
                    System.out.println("Latitude");
                    latitude = scanner.next();
                    break;
                case "4":
                    System.out.println("Region");
                    region = scanner.next();
                    break;
                case "5":
                    System.out.println("Country");
                    country = scanner.next();
                    break;
                case "6":
                    return;
            }
        }
    }

    static void displayUserLocations() {
        //database merch coming soon.
    }

    static void downloadCurrentData() {
        //Weather services coming soon.
    }
}
