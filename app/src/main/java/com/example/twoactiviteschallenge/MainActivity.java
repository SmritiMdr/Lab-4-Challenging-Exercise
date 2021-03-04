package com.example.twoactiviteschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";

    private Button btn_one;
    private Button btn_two;
    private Button btn_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_one=findViewById(R.id.button1);
        btn_two=findViewById(R.id.button2);
        btn_three=findViewById(R.id.button3);

    }

    public void launchSecondActivity(View view){
        Intent intent=new Intent(this, SecondActivity.class);
        switch(view.getId())
        {
            case R.id.button1:
                intent.putExtra(EXTRA_MESSAGE,1);
                startActivity(intent);
                break;

            case R.id.button2:
                intent.putExtra(EXTRA_MESSAGE,2);
                startActivity(intent);
                break;

            case R.id.button3:
                intent.putExtra(EXTRA_MESSAGE,3);
                startActivity(intent);
                break;
        }
    }
}