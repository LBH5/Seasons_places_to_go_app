package com.brnaime.seasonsapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SummerPlacesActivity extends AppCompatActivity {

    private List<BucketListEntry> summerPlaces = new ArrayList<>();
    private RecyclerView summerRecycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_summer_places);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recycle_view_summer_places), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setupSummerPlacesList();
    }

    private void setupSummerPlacesList() {
        summerPlaces = new ArrayList<>(
                List.of(
                        new BucketListEntry(
                                "Santorini, Greece",
                                "Relax on scenic beaches overlooking the Aegean Sea.",
                                4.9f,
                                R.drawable.summer_santorini
                        ),
                        new BucketListEntry(
                                "Amalfi Coast, Italy",
                                "Drive or hike along dramatic coastal cliffs and vibrant towns.",
                                4.8f,
                                R.drawable.summer_amalfi_coast
                        ),
                        new BucketListEntry(
                                "Bali, Indonesia",
                                "Experience tropical beaches, rice terraces, and serene temples.",
                                4.7f,
                                R.drawable.summer_bali
                        ),
                        new BucketListEntry(
                                "Banff National Park, Canada",
                                "See turquoise lakes and majestic mountains in summer bloom.",
                                4.9f,
                                R.drawable.summer_banff
                        ),
                        new BucketListEntry(
                                "Iceland (Ring Road)",
                                "Tour waterfalls, volcanoes, and geothermal wonders.",
                                4.8f,
                                R.drawable.summer_iceland
                        )
                )
        );
        summerRecycleView = findViewById(R.id.recycle_view_summer_places);
        var adapter  = new BucketListEntryAdapter(summerPlaces);
        summerRecycleView.setAdapter(adapter);
    }
}