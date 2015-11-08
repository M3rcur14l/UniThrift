package com.nullpointer.unithrift;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.RelativeLayout;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        RelativeLayout rootLayout = (RelativeLayout) findViewById(R.id.home_rootLayout);

        RelativeButton shipmentButton = new RelativeButton(this, "home_shipment.png");
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                (int) (width / 4.5f),
                (int) (width / 4.5f * shipmentButton.getHeightImage() / shipmentButton.getWidthImage()));
        params.setMargins(
                (int) (width * 0.02f),
                (int) (height * 0.48f), 0, 0);
        rootLayout.addView(shipmentButton, params);

        RelativeButton feedbackButton = new RelativeButton(this, "home_feedbacks.png");
        params = new RelativeLayout.LayoutParams(
                (int) (width / 7.5f),
                (int) (width / 7.5f * feedbackButton.getHeightImage() / feedbackButton.getWidthImage()));
        params.setMargins(
                (int) (width * 0.25f),
                (int) (height * 0.43f), 0, 0);
        rootLayout.addView(feedbackButton, params);

        RelativeButton movementsButton = new RelativeButton(this, "home_movements.png");
        params = new RelativeLayout.LayoutParams(
                (int) (width / 7.5f),
                (int) (width / 7.5f * movementsButton.getHeightImage() / movementsButton.getWidthImage()));
        params.setMargins(
                (int) (width * 0.45f),
                (int) (height * 0.45f), 0, 0);
        rootLayout.addView(movementsButton, params);

        RelativeButton searchButton = new RelativeButton(this, "home_search.png");
        params = new RelativeLayout.LayoutParams(
                (int) (width / 7.0f),
                (int) (width / 7.0f * searchButton.getHeightImage() / searchButton.getWidthImage()));
        params.setMargins(
                (int) (width * 0.80f),
                (int) (height * 0.43f), 0, 0);
        rootLayout.addView(searchButton, params);

        RelativeButton requestPaymentButton = new RelativeButton(this, "home_request.png");
        params = new RelativeLayout.LayoutParams(
                (int) (width / 8.5f),
                (int) (width / 8.5f * requestPaymentButton.getHeightImage() / requestPaymentButton.getWidthImage()));
        params.setMargins(
                (int) (width * 0.52f),
                (int) (height * 0.55f), 0, 0);
        rootLayout.addView(requestPaymentButton, params);

        movementsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, MovementsActivity.class));
            }
        });

        requestPaymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, PaymentRequestActivity.class));
            }
        });

    }
}
