package com.brnaime.seasonsapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private CardView springPlaces;
    private CardView summerPlaces;
    private CardView autumnPlaces;
    private CardView winterPlaces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setupClickListeners();
    }

    private void setupClickListeners() {
        springPlaces = findViewById(R.id.card_view_spring);
        summerPlaces = findViewById(R.id.card_view_summer);
        autumnPlaces = findViewById(R.id.card_view_autumn);
        winterPlaces = findViewById(R.id.card_view_winter);

        springPlaces.setOnClickListener(v -> {
            var springPlacesIntent = new Intent(MainActivity.this, SpringPlacesActivity.class);
            startActivity(springPlacesIntent);
        });

        summerPlaces.setOnClickListener(v -> {
            var springPlacesIntent = new Intent(MainActivity.this, SummerPlacesActivity.class);
            startActivity(springPlacesIntent);
        });

        autumnPlaces.setOnClickListener(v -> {
            var springPlacesIntent = new Intent(MainActivity.this, AutumnPlacesActivity.class);
            startActivity(springPlacesIntent);
        });

        winterPlaces.setOnClickListener(v -> {
            var springPlacesIntent = new Intent(MainActivity.this, WinterPlacesActivity.class);
            startActivity(springPlacesIntent);
        });
    }
}