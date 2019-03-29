package com.lvk.block08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent caller=new Intent();
        Bundle bundle = getIntent().getExtras();
        float getRating = bundle.getFloat("numStars");
      //  float getRating= caller.getFloatExtra("numStars",0);
        TextView text=(TextView)findViewById(R.id.textView2);
        text.setText("YO YO YO only "+getRating+" for LVK?");

    }
}
