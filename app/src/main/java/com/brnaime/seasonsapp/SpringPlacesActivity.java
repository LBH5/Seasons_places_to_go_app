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

public class SpringPlacesActivity extends AppCompatActivity {

    private List<BucketListEntry> springPlaces = new ArrayList<>();
    private RecyclerView springRecycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spring_places);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recycle_view_spring_places), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setupSpringPlacesList();
    }

    private void setupSpringPlacesList() {
        springPlaces = new ArrayList<>(
                List.of(
                        new BucketListEntry(
                                "Kyoto, Japan",
                                "Witness iconic cherry blossoms and ancient temples in full bloom.",
                                4.9f,
                                R.drawable.spring_kyoto_cherry_blossom
                        ),
                        new BucketListEntry(
                                "Amsterdam, Netherlands",
                                "Explore colorful tulip fields and the famed Keukenhof Gardens.",
                                4.8f,
                                R.drawable.spring_keukenhof
                        ),
                        new BucketListEntry(
                                "Washington, D.C., USA",
                                "Celebrate the National Cherry Blossom Festival in the U.S. capital.",
                                4.7f,
                                R.drawable.spring_washington_dc_cherry_blossom
                        ),
                        new BucketListEntry(
                                "Hallerbos Forest, Belgium",
                                "Walk through a magical forest carpeted with bluebells each spring.",
                                4.6f,
                                R.drawable.spring_hallerbos_bluebells
                        ),
                        new BucketListEntry(
                                "Seville, Spain",
                                "Enjoy festivals and orange blossoms under sunny skies.",
                                4.5f,
                                R.drawable.spring_seville_spring
                        )
                )
        );
        springRecycleView = findViewById(R.id.recycle_view_spring_places);
        var adapter = new BucketListEntryAdapter(springPlaces);
        springRecycleView.setAdapter(adapter);
    }
}