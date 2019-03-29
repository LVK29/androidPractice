package com.lvk.block08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void enter(View v){
         RatingBar ratingBar=(RatingBar)findViewById(R.id.ratingBar);
         float rating=ratingBar.getRating();
        // Toast.makeText(getApplicationContext(),rating+" stars.",Toast.LENGTH_SHORT).show();
         Intent takeMeToSecondActivity= new Intent();
         takeMeToSecondActivity.setClass(this,SecondActivity.class);
         takeMeToSecondActivity.putExtra("numStars",rating);
         startActivity(takeMeToSecondActivity);
         finish();
     }
}
