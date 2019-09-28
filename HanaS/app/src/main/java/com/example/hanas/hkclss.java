package com.example.hanas;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class hkclss extends Activity {
    private TextView mHelloTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.hk);
        mHelloTextView = findViewById(R.id.textV);
    }
    public void onButtonPressed(View view) {
        mHelloTextView.setText("Hello Kitty!");
    }
}
