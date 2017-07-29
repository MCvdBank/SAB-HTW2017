package com.ice.sabhtw.sabhtw;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RequestRideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_ride);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button lTaxiButton = (Button) findViewById(R.id.btn_Taxi);
        lTaxiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
//                Intent i = new Intent(RideRequestActivity.this, MainActivity.class);
//                startActivity(i);
                Toast.makeText(RequestRideActivity.this, "Taxi", Toast.LENGTH_SHORT).show();
            }
        });
        Button lBuddyButton = (Button) findViewById(R.id.btn_Buddy);
        lBuddyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(RequestRideActivity.this, BuddyRideActivity.class);
                startActivity(i);
//                Toast.makeText(RideRequestActivity.this, "Buddy", Toast.LENGTH_SHORT).show();
            }
        });


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
