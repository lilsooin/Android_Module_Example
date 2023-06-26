package com.example.core;

public class User {

    private static String name = "Tim";
    private static String email = "abd@gmail.com";
    private static String nationality = "Ukraine";
    private static short age = 30;
    private static String sex = "Male";
    private static String location = "London";

    public static String getName() {
        return name;
    }

    public static String getEmail() {
        return email;
    }

    public static String getNationality() {
        return nationality;
    }

    public static short getAge() {
        return age;
    }

    public static String getSex(){
        return sex;
    }

    public static String getLocation(){
        return location;
    }
}
