package com.utils;

import com.github.javafaker.Faker;

public class UserNameUtil {

    public static String userName;

    synchronized public static String generateUserName(){

        Faker faker = new Faker();
        userName = (faker.superhero().prefix()+faker.name().firstName()+faker.address().buildingNumber()).substring(0,9);

        return userName;
    }

}
