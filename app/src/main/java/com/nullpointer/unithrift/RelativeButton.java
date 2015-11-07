package com.nullpointer.unithrift;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.Button;

/**
 * Created by antonello on 07/11/15.
 */
public class RelativeButton extends Button {

    private int width;
    private int height;

    public RelativeButton(Context context, String path) {
        super(context);
        Bitmap background = BitmapUtils.getBitmap(path, getContext());
        this.width = background.getWidth();
        this.height = background.getHeight();
        Drawable d = new BitmapDrawable(getResources(), background);
        setBackground(d);
    }

    public int getWidthImage() {
        return width;
    }

    public int getHeightImage() {
        return height;
    }
}
