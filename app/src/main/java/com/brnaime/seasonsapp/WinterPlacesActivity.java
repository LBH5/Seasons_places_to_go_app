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

public class WinterPlacesActivity extends AppCompatActivity {

    private List<BucketListEntry> winterPlaces = new ArrayList<>();
    private RecyclerView winterRecycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_winter_places);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recycle_view_winter_places), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setupWinterPlacesList();
    }

    private void setupWinterPlacesList() {
        winterPlaces = new ArrayList<>(
                List.of(
                        new BucketListEntry(
                                "Lapland, Finland",
                                "See the Northern Lights and enjoy snowy wilderness.",
                                5.0f,
                                R.drawable.winter_lapland_winter
                        ),
                        new BucketListEntry(
                                "Iceland (Winter)",
                                "Explore ice caves, glaciers, and frozen waterfalls.",
                                4.9f,
                                R.drawable.winter_iceland_winter
                        ),
                        new BucketListEntry(
                                "Zermatt, Switzerland",
                                "Ski near the Matterhorn and relax in alpine villages.",
                                4.9f,
                                R.drawable.winter_zermatt_winter
                        ),
                        new BucketListEntry(
                                "Québec City, Canada",
                                "Enjoy charming historic streets and winter festivals.",
                                4.7f,
                                R.drawable.winter_quebec_city_winter
                        ),
                        new BucketListEntry(
                                "Hokkaido, Japan",
                                "Experience snow festivals, onsens, and powder powder snow.",
                                4.8f,
                                R.drawable.winter_hokkaido_winter
                        )
                )
        );
        winterRecycleView = findViewById(R.id.recycle_view_winter_places);
        var adapter = new BucketListEntryAdapter(winterPlaces);
        winterRecycleView.setAdapter(adapter);
    }
}