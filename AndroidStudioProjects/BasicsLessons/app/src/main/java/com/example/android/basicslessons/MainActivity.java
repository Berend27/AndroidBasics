package com.example.android.basicslessons;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = new TextView(this);
        textView.setText("Hello Java World!");
        textView.setTextColor(getResources().getColor(R.color.TechRed));
        textView.setTextSize(16);
        setContentView(textView);
    }
}
