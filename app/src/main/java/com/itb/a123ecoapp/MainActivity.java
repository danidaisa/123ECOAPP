package com.itb.a123ecoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        // Obtém referências para os widgets do layout
        ImageView imageView = findViewById(R.id.imageView2);
        Button button = findViewById(R.id.entrar);

}