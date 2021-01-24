package com.sda.wapp.ConsoleUserInterface;

import java.util.Scanner;

/**
 * Created by Hyperbook on 24.01.2021
 **/
public class HeadMenuNavigation {
    static Scanner scanner = new Scanner(System.in);
    private static String city, longitude,latitude,region,country;
    static void addNewLocation() {
        System.out.println("Please insert Location data");
        System.out.println("1.City");
        System.out.println("2.Longitude");
        System.out.println("3.Latitude");
        System.out.println("4.Region");
        System.out.println("5.Country");
        System.out.println("6.Exit");
        while (true) {
            int cityNavigation = scanner.nextInt();
            switch (cityNavigation) {
                case 1:
                    System.out.println("City:");
                    city = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Longitude");
                    longitude = scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Latitude");
                    latitude = scanner.nextLine();
                break;
                case 4:
                    System.out.println("Region");
                    region = scanner.nextLine();
                break;
                case 5:
                    System.out.println("Country");
                    country = scanner.nextLine();
                break;
                case 6:
                    return;
            }
        }
    }
    static void displayUserLocations() {
        //database merch comeing soon.
    }
    static void downloadCurrentData(){
        //Weather services coming soon.
    }

}
