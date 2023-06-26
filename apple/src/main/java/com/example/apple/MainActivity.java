package com.example.apple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Apple User");
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getNationality());
    }

    // name, email, nationality
    private String getName() {
        return "Tim";
    }

    private String getEmail() {
        return "abc@gmail.com";
    }

    private String getNationality() {
        return "Ukraine";
    }
}