package com.example.microsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.core.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Microsoft User");
        System.out.println(User.getName());
        System.out.println(User.getEmail());
        System.out.println(User.getNationality());
        System.out.println(User.getLocation());
    }
}