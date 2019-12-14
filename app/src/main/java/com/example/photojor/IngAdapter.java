package com.example.photojor;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.photojor.model.Ingredient;

import java.util.List;

public class IngAdapter extends ArrayAdapter<Ingredient> {

    public IngAdapter(@NonNull Context context, List array) {
        super(context, R.layout.ingredient_item,array);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Ingredient ing=getItem(position);

        if(convertView==null)
        {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.ingredient_item,null);
        }
        ((TextView)(convertView.findViewById(R.id.ingName))).setText(ing.getName());
        ((ImageView)(convertView.findViewById(R.id.ingImage))).setImageBitmap(ing.getImage());
        return convertView;
    }
}
