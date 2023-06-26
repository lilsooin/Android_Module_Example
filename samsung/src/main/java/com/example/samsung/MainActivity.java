package com.example.samsung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Samsung User");
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getAge());
        System.out.println(getSex());
        System.out.println(getNationality());
    }

    // name, email, age, sex, nationality
    private String getName() {
        return "Tim";
    }

    private String getEmail() {
        return "abc@gmail.com";
    }
    private short getAge() {
        return 30;
    }

    private String getSex(){
        return "Male";
    }

    private String getNationality() {
        return "Ukraine";
    }
}