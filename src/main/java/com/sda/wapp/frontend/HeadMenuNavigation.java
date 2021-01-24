package com.sda.wapp.frontend; // done ConsoleUserInterface is unnecessary
// done package into a frontend

import com.sda.wapp.backend.HibernateUtils;
import com.sda.wapp.backend.Location;
import com.sda.wapp.backend.LocationController;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sda.wapp.backend.HibernateUtils;
import com.sda.wapp.backend.Location;
import com.sda.wapp.backend.LocationController;
import com.sda.wapp.backend.LocationRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by Hyperbook on 24.01.2021
 **/
public class HeadMenuNavigation {
    static Location location;

    public static void addNewLocation() {
        Scanner scanner = new Scanner(System.in);
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String city="",longitude="",latitude="",region="",country="";

        while (true) {


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
                    city  = scanner.next();
                    LocationController.validateCity(city);
                    break;
                case "2":
                    System.out.println("Longitude");
                    longitude = scanner.next();
                    LocationController.validateLongitude(longitude);
                    break;
                case "3":
                    System.out.println("Latitude");
                    latitude = scanner.next();
                    LocationController.validateLatitude(latitude);
                    break;
                case "4":
                    System.out.println("Region");
                    region = scanner.next();
                    LocationController.validateRegion(region);
                    break;
                case "5":
                    System.out.println("Country");
                    country = scanner.next();
                    LocationController.validateCountry(country);
                    break;
                case "6":
                    location = new Location(city,longitude,latitude,region,country);
                    session.persist(location);
                    transaction.commit();
                    session.close();
                    return;
            }


        }
    }





    static void displayUserLocations() throws SQLException {
        LocationRepository.queryOne();
        //There may be more of custom query this is a reason code is not implemented in this place.

    }

    static void downloadCurrentData() {
        //Weather services coming soon.
    }

}
