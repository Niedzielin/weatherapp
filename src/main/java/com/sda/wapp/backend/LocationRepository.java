package com.sda.wapp.backend;

import java.sql.*;

/**
 * Created by Hyperbook on 24.01.2021
 **/
public class LocationRepository {

    public static void queryOne() {
        System.out.println("-------- MySQL JDBC Connection Testing ------------");


        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/weatherapp?serverTimezone=Europe/Warsaw", "root",
                            "000000");
        } catch (SQLException e) {
            for(Throwable ex : e) {
                System.err.println("Error occurred " + ex);
            }
            e.printStackTrace();
        }

        if (connection != null) {
            System.out.println("Connected to database!");
        } else {
            System.out.println("Failed to make connection!");
        }

        try {
            Statement stmt = connection.createStatement();
            String query = "select * from location_table ;";
            //person is the table name
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String id = rs.getObject(1).toString();
                String city = rs.getObject(2).toString();
                String longitude = rs.getObject(3).toString();
                String latitude = rs.getObject(4).toString();
                String region = rs.getObject(5).toString();
                String country = rs.getObject(6).toString();
                System.out.println("ID: " + id + " City: " + city + " Longitude: " + longitude + " Latitude: " + latitude +
                        " Region: " + region + " Country " + country);

            }
        } catch (SQLException e) {
            e.printStackTrace();
            for(Throwable ex : e) {
                System.err.println("Error occurred " + ex);
            }
            System.out.println("Error in fetching data");
        }
    }
}
