package com.example.module_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public enum Company {
        A_COMPANY,
        B_COMPANY,
        C_COMPANY
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // A or B or C
        Company service = getService();

        if (service == Company.A_COMPANY || service == Company.B_COMPANY) {
            System.out.println("Hello there");
        } else if(service == Company.C_COMPANY) {
            System.out.println("Hola");
        }
    }

    public Company getService() {
        // ... A_COMPANY or B_COMPANY or C_COMPANY

        // some code
        return Company.A_COMPANY;
    }
}