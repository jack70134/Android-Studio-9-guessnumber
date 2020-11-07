package com.example.android_no9_gussnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        number_answer();
    }
    public void click_back(View v){
        finish();
    }
    private void number_answer(){
        int number;
        Random num = new Random();
        int answer = num.nextInt((10)+1);
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            number = Integer.parseInt(bundle.getString("NUMBERS"));
            TextView TF = (TextView)findViewById(R.id.true_or_false);
            TextView bigger_or_smaller = (TextView)findViewById(R.id.bigger_or_smaller);
            if (number == answer){
                bigger_or_smaller.setText("答對了");
                TF.setText("O");
            }
            else if (number > answer){
                bigger_or_smaller.setText("猜小點");
                TF.setText("X");
            }
            else if (number < answer){
                bigger_or_smaller.setText("猜大點");
                TF.setText("X");
            }
        }
    }
}