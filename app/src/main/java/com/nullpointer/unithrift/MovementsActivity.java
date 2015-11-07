package com.nullpointer.unithrift;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MovementsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movements);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        RelativeLayout rootLayout = (RelativeLayout) findViewById(R.id.movements_rootLayout);

        RelativeButton shipmentButton = new RelativeButton(this, "movements_title.png");
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                (int) (width / 1.5f),
                (int) (width / 1.5f * shipmentButton.getHeightImage() / shipmentButton.getWidthImage()));
        params.setMargins(
                (int) (width * 0.0f),
                (int) (height * 0.0f), 0, 0);
        rootLayout.addView(shipmentButton, params);

        ListView movementsView = (ListView) findViewById(R.id.movements_listView);
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("234", "2343", "Paolo Manca", "Antonello Fodde", "Iphone 6 64GB", "500€"));
        movementsView.setAdapter(new MovementsArrayAdapter(this, "IN", list));

    }
}
