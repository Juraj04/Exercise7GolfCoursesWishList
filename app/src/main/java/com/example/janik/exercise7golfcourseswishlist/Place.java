package com.example.janik.exercise7golfcourseswishlist;

import android.content.Context;

/**
 * Created by janik on 12.10.2017.
 */

public class Place {
    public String name;
    public String imageName;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}
