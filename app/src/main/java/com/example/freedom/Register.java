package com.example.freedom;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    AutoCompleteTextView autocourse;
    String[] course = new String[]{"B.Tech", "M.Tech", "B.Arch"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        autocourse = findViewById(R.id.autocourse);
        autocourse.setAdapter(new ArrayAdapter<>(Register.this, android.R.layout.simple_list_item_1, course));
    }
}
