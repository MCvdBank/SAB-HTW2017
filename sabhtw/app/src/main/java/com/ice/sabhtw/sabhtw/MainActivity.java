package com.ice.sabhtw.sabhtw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Button handlers

        Button lDashboardButton = (Button) findViewById(R.id.btn_Dashboard);
        lDashboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
//                Intent i = new Intent(MainActivity.this, MainActivity.class);
//                startActivity(i);
            }
        });
        Button lRideButton = (Button) findViewById(R.id.btn_RequestRide);
        lRideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, RequestRideActivity.class);
                startActivity(i);
            }
        });
        Button lBudgetButton = (Button) findViewById(R.id.btn_Budget);
        lBudgetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, BudgetActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        finish();
        System.exit(0);
    }
}
