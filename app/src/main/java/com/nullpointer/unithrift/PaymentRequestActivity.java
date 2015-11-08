package com.nullpointer.unithrift;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PaymentRequestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_request);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        RelativeLayout rootLayout = (RelativeLayout) findViewById(R.id.payment_request_rootLayout);
        TextView titleTextView = (TextView) findViewById(R.id.payment_request_title);
        Typeface tf = Typeface.createFromAsset(getAssets(),
                "Asap-Medium.otf");
        titleTextView.setTypeface(tf);
        Button generateButton = (Button) findViewById(R.id.payment_request_generate_button);

    }
}
