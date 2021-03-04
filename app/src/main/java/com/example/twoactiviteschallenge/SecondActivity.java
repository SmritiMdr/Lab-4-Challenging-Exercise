package com.example.twoactiviteschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView text_view_heading;
    private TextView text_view_content;
    private String heading;
    private String content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text_view_heading=findViewById(R.id.heading);
        text_view_content=findViewById(R.id.content);

        Intent intent=getIntent();
        int btn_no = intent.getIntExtra(MainActivity.EXTRA_MESSAGE,0);

        if(btn_no== 1){
            content=getResources().getString(R.string.button_1_content);
            heading=getResources().getString(R.string.button_1_heading);
        }

        else if(btn_no== 2){
            content=getResources().getString(R.string.button_2_content);
            heading=getResources().getString(R.string.button_2_heading);
        }

        else if(btn_no== 3){
            content=getResources().getString(R.string.button_3_content);
            heading=getResources().getString(R.string.button_3_heading);
        }

        text_view_heading.setText(heading);
        text_view_content.setText(content);
    }
}