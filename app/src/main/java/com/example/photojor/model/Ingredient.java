package com.example.photojor.model;

import android.graphics.Bitmap;
import android.media.Image;

import java.net.URI;

public class Ingredient {
    String name;
    Bitmap image;
    public Ingredient(String name)
    {
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public Bitmap getImage() {
        return image;
    }
}
