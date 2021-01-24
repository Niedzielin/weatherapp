package com.sda.wapp.frontend; // done ConsoleUserInterface is unnecessary
// done package into a frontend

import com.sda.wapp.backend.HibernateUtils;
import com.sda.wapp.backend.Location;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Scanner;

/**
 * Created by Hyperbook on 24.01.2021
 **/
public class HeadMenuNavigation {


    static void addNewLocation() {

        Scanner scanner = new Scanner(System.in);
        Location location = new Location(city,longitude,latitude,region,country);
        while (true) {
            SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            String city,longitude,latitude,region,country;
            System.out.println("Please insert Location data");
            System.out.println("1.City");
            System.out.println("2.Longitude");
            System.out.println("3.Latitude");
            System.out.println("4.Region");
            System.out.println("5.Country");
            System.out.println("6.Exit");
            String locationNavigation = scanner.next();

            switch (locationNavigation) {
                case "1":
                    System.out.println("City:");
                    location(city)  = scanner.next();
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

                    session.persist(location);
                    transaction.commit();
                    session.close();
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
