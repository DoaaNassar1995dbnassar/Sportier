package com.example.duaa.sportier.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import static com.example.duaa.sportier.Constants.FONTS_APP;


public class FontEditTextViewRegular extends AppCompatEditText {
    public FontEditTextViewRegular(Context context) {
        super(context);
        Typeface face= Typeface.createFromAsset(context.getAssets(), FONTS_APP);
        this.setTypeface(face);
    }

    public FontEditTextViewRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face= Typeface.createFromAsset(context.getAssets(), FONTS_APP);
        this.setTypeface(face);
    }

    public FontEditTextViewRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface face= Typeface.createFromAsset(context.getAssets(), FONTS_APP);
        this.setTypeface(face);
    }

    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);


    }
}
