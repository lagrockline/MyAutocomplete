package com.example.myautocomplete;

import android.content.Context;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context ctx = getApplicationContext();
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        ArrayList<String>addressList = new ArrayList<>();

    }//FIN onCreate
}