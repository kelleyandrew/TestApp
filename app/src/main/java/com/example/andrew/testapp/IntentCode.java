package com.example.andrew.testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class IntentCode extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_code);

        Intent myintent = new Intent(this, Q1Activity.class);
        this.startActivity(myintent);
    }
}
