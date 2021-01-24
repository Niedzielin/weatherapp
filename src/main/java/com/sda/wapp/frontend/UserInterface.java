package com.sda.wapp.frontend;
// done package into a frontend

import java.util.Scanner;

/**
 * Created by Hyperbook on 24.01.2021
 **/
public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome in our Weather app, Functionalities are on the way.");

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add new location.");
            System.out.println("2. Display my locations.");
            System.out.println("3. Download current Weather data.");
            System.out.println("4. Close app.");
            int headNavigation = scanner.nextInt();
            switch (headNavigation) {
                case 1:
                    System.out.println();
                    HeadMenuNavigation.addNewLocation();
                    break;
                case 2:
                    System.out.println();
                    HeadMenuNavigation.displayUserLocations();
                    break;
                case 3:
                    System.out.println();
                    HeadMenuNavigation.downloadCurrentData();
                    break;
                case 4:
                    System.out.println();
                    return;
            }
        }
    }
}
