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

public class AutumnPlacesActivity extends AppCompatActivity {

    private List<BucketListEntry> autumnPlaces = new ArrayList<>();
    private RecyclerView autumnRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_autumn_places);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recycle_view_autumn_places), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setupAutumnPlacesList();
    }

    private void setupAutumnPlacesList() {
        autumnPlaces = new ArrayList<>(
                List.of(
                        new BucketListEntry(
                                "New England, USA",
                                "Drive scenic routes with brilliant fall foliage colors.",
                                4.7f,
                                R.drawable.autumn_new_england_fall
                        ),
                        new BucketListEntry(
                                "Bavaria, Germany",
                                "Visit fairytale castles and forests tinted with autumn hues.",
                                4.6f,
                                R.drawable.autumn_bavaria_autumn
                        ),
                        new BucketListEntry(
                                "Kyoto, Japan (Autumn)",
                                "See ancient temples framed by stunning fall leaves.",
                                4.8f,
                                R.drawable.autumn_kyoto_autumn
                        ),
                        new BucketListEntry(
                                "Loire Valley, France",
                                "Tour vineyards and châteaux amid autumn colors.",
                                4.7f,
                                R.drawable.autumn_loire_valley_autumn
                        ),
                        new BucketListEntry(
                                "Canadian Rockies",
                                "Hike crisp trails with golden larches and mountain views.",
                                4.8f,
                                R.drawable.autumn_canadian_rockies_autumn
                        )

                )
        );
        autumnRecycleView = findViewById(R.id.recycle_view_autumn_places);
        var adapter = new BucketListEntryAdapter(autumnPlaces);
        autumnRecycleView.setAdapter(adapter);
    }
}