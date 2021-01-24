package com.sda.wapp.ConsoleUserInterface;

import java.util.Scanner;

/**
 * Created by Hyperbook on 24.01.2021
 **/
public class HeadMenuNavigation {
    static Scanner scanner = new Scanner(System.in);

    static void addNewLocation() {
        System.out.println("City:");
        String city = scanner.nextLine();
        System.out.println("Add geographic coordinates");
        System.out.println("Longitude");
        String longitude = scanner.nextLine();
        System.out.println("Latitude");
        String latitude = scanner.nextLine();
        System.out.println("Region");
        String region = scanner.nextLine();
        System.out.println("Country");
        String country = scanner.nextLine();
    }
    static void displayUserLocations() {
        //database merch comeing soon.
    }
    static void downloadCurrentData(){
        //Weather services coming soon.
    }

}
