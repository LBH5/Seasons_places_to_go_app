package com.brnaime.seasonsapp;

import androidx.annotation.DrawableRes;

public class BucketListEntry {
    private String heading;
    private  String description;
    private float rating;
    private int imageFile;

    public BucketListEntry(String heading, String description, float rating, @DrawableRes int imageFile) {
        this.heading = heading;
        this.description = description;
        this.rating = rating;
        this.imageFile = imageFile;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageFile() {
        return imageFile;
    }

    public void setImageFile(int imageFile) {
        this.imageFile = imageFile;
    }
}
