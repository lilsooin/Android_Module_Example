package com.example.module_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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

        switch (getService()) {
            case A_COMPANY:
                System.out.println("Welcome to A company");
                break;

            case B_COMPANY:
                System.out.println("Welcome to B company");
                break;

            case C_COMPANY:
                System.out.println("Welcome to C company");
                break;

            default:
                break;
        }
    }

    public Company getService() {
        // ... A_COMPANY or B_COMPANY or C_COMPANY

        return Company.A_COMPANY;
    }
}