package com.example.photojor.model;

import android.graphics.Bitmap;

public class Step {
    String description;
    Bitmap image;
    public Step(String description, Bitmap image) {
        this.description = description;
        this.image = image;
    }

    public Bitmap getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
