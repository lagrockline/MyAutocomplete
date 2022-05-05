package com.example.myautocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView textView = findViewById(R.id.autocompletePlaces);
    }
}