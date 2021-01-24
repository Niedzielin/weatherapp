package com.sda.wapp.backend;
import javax.persistence.*;

/**
 * Created by Hyperbook on 24.01.2021
 **/
@Entity
@Table(name="location_table")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String city;
    @Column(nullable = false)
    String longitude;
    @Column(nullable = false)
    String latitude;
    @Column
    String region;
    @Column(nullable = false)
    String country;
    public Location(){

    }

    public Location(String city, String longitude, String latitude, String region, String country) {
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
        this.region = region;
        this.country = country;
    }
}
