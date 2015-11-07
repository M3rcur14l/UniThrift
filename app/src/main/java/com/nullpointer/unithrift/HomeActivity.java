package com.nullpointer.unithrift;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.RelativeLayout;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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
                (int) (height * 0.40f), 0, 0);
        rootLayout.addView(feedbackButton, params);

        RelativeButton movementsButton = new RelativeButton(this, "home_movements.png");
        params = new RelativeLayout.LayoutParams(
                (int) (width / 7.5f),
                (int) (width / 7.5f * movementsButton.getHeightImage() / movementsButton.getWidthImage()));
        params.setMargins(
                (int) (width * 0.42f),
                (int) (height * 0.42f), 0, 0);
        rootLayout.addView(movementsButton, params);
    }
}
