package com.sda.wapp.backend;

import com.mysql.cj.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Hyperbook on 24.01.2021
 **/
public class LocationController {
    public static boolean validateCity(String city) {
        String regex ="";
        Pattern p = Pattern.compile(regex);
        if (city==null|| StringUtils.isNullOrEmpty(city)){
            return false;
        }
        Matcher m = p.matcher(city);
        return m.matches();
    }
    public static boolean validateLongitude(String longitude) {
        String regex ="";
        Pattern p = Pattern.compile(regex);
        if (longitude==null||StringUtils.isNullOrEmpty(longitude)){
            return false;
        }
        Matcher m = p.matcher(longitude);
        return m.matches();
    }
    public static boolean validateLatitude(String latitude) {
        String regex ="";
        Pattern p = Pattern.compile(regex);
        if (latitude==null||StringUtils.isNullOrEmpty(latitude)){
            return false;
        }
        Matcher m = p.matcher(latitude);
        return m.matches();
    }
    public static boolean validateRegion(String region) {
        String regex ="";
        Pattern p = Pattern.compile(regex);
        if (region==null||StringUtils.isNullOrEmpty(region)){
            return false;
        }
        Matcher m = p.matcher(region);
        return m.matches();
    }
    public static boolean validateCountry(String country) {
        String regex ="";
        Pattern p = Pattern.compile(regex);
        if (country==null||StringUtils.isNullOrEmpty(country)){
            return false;
        }
        Matcher m = p.matcher(country);
        return m.matches();
    }
}
