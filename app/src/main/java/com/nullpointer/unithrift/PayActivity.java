package com.nullpointer.unithrift;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class PayActivity extends Activity {

    private String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        RelativeLayout rootLayout = (RelativeLayout) findViewById(R.id.pay_rootLayout);
        Intent intent = getIntent();
        if (Intent.ACTION_VIEW.equals(intent.getAction())) {
            Uri uri = intent.getData();
            token = uri.getQueryParameter("token");
        }
        TextView titleTextView = (TextView) findViewById(R.id.pay_title);
        Typeface tf = Typeface.createFromAsset(getAssets(), "Asap-Medium.otf");
        titleTextView.setTypeface(tf);

        RelativeButton payButton = new RelativeButton(this, "pay_button.png");
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                (int) (width / 3.4f),
                (int) (width / 3.4f * payButton.getHeightImage() / payButton.getWidthImage()));
        params.setMargins(
                (int) (width * 0.32f),
                (int) (height * 0.46f), 0, 0);
        rootLayout.addView(payButton, params);
    }
}
