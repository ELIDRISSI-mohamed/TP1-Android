package com.example.firstapp;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttonBack = findViewById(R.id.buttonBack);
        TextView textView = (TextView) findViewById(R.id.textView);
        Bundle b = getIntent().getExtras();
        String name = b.getString("name");
        textView.setText("Bonjour "+name);


        buttonBack.setOnClickListener(e->{
            Intent intentBack = new Intent(this, MainActivity.class);
            startActivity(intentBack);
        });

    }
}