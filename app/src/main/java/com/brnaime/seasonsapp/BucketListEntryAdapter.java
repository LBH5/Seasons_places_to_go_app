package com.brnaime.seasonsapp;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class BucketListEntryAdapter extends RecyclerView.Adapter<BucketListEntryAdapter.BucketListEntryViewHolder> {

    private List<BucketListEntry> entries;

    public BucketListEntryAdapter(List<BucketListEntry> entries) {
        this.entries = entries;
    }

    @Override
    public int getItemCount() {
        return entries.size();
    }

    @NonNull
    @Override
    public BucketListEntryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        var view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket_list_entry,parent,false);
        return new BucketListEntryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListEntryViewHolder holder, int position) {
        holder.bind(entries.get(position),position);
    }


    public static class BucketListEntryViewHolder extends RecyclerView.ViewHolder{

        private ImageView image;
        private TextView heading;
        private TextView description;
        private RatingBar rating;

        public BucketListEntryViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_view_bucket_entry_image);
            heading = itemView.findViewById(R.id.text_view_heading);
            description = itemView.findViewById(R.id.text_view_bucket_entry_description);
            rating = itemView.findViewById(R.id.rating_bar_place_rating);
        }
        public void bind(BucketListEntry entry,int position){
            image.setImageResource(entry.getImageFile());
            var editedHeading = position+1+". "+entry.getHeading();
            heading.setText(editedHeading);
            description.setText(entry.getDescription());
            rating.setRating(entry.getRating());

        }
    }
}
