package com.example.microsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Microsoft User");
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getNationality());
        System.out.println(getLocation());
    }

    // name, email, nationality, location
    private String getName() {
        return "Tim";
    }

    private String getEmail() {
        return "abc@gmail.com";
    }

    private String getNationality() {
        return "Ukraine";
    }

    private String getLocation() {
        return "London";
    }
}