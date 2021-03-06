package com.zappos.namanrajpal.ilovezappos;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class CustomBindingAdapter {


    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView imageView, String url) {
        Picasso.with(imageView.getContext()).load(url).into(imageView);
    }
    //Used for visiblity of previous and next buttons
    @BindingAdapter({"visibilityOnIndex"})
    public static void toggleVisibility(View view, int index) {
        view.setVisibility(index > 0 ? View.VISIBLE : View.GONE);
    }
}
