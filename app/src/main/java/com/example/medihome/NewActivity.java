package com.example.medihome;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        ActionBar actionbar = getSupportActionBar();
        TextView nDetailTv = findViewById(R.id.textView);
        TextView nDetailTv2 = findViewById(R.id.textView2);

        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");
        String mContent2 = intent.getStringExtra("contentTv2");

        actionbar.setTitle(mActionBarTitle);

        nDetailTv.setText(mContent);
        nDetailTv.setText(mContent);
        nDetailTv2.setText(mContent2);

    }
}