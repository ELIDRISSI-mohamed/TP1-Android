package com.example.firstapp;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName;
    private Button btnEnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnv = findViewById(R.id.btnEnv);
        btnEnv.setOnClickListener(e->{
            editTextName = findViewById(R.id.editTextName);
            String name = editTextName.getText().toString();

            if(name.isEmpty()){
                Toast.makeText(this, "name is empty", Toast.LENGTH_LONG).show();
            }
            else {
                Bundle bundle = new Bundle();
                bundle.putString("name", name);
                Intent intent = new Intent(this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}