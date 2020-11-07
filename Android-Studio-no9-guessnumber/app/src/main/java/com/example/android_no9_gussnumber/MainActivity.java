package com.example.android_no9_gussnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.n1);
        button1.setOnClickListener(click_number1);
        Button button2 = (Button)findViewById(R.id.n2);
        button2.setOnClickListener(click_number2);
        Button button3 = (Button)findViewById(R.id.n3);
        button3.setOnClickListener(click_number3);
        Button button4 = (Button)findViewById(R.id.n4);
        button4.setOnClickListener(click_number4);
        Button button5 = (Button)findViewById(R.id.n5);
        button5.setOnClickListener(click_number5);
        Button button6 = (Button)findViewById(R.id.n6);
        button6.setOnClickListener(click_number6);
        Button button7 = (Button)findViewById(R.id.n7);
        button7.setOnClickListener(click_number7);
        Button button8 = (Button)findViewById(R.id.n8);
        button8.setOnClickListener(click_number8);
        Button button9 = (Button)findViewById(R.id.n9);
        button9.setOnClickListener(click_number9);
        Button button10 = (Button)findViewById(R.id.restart);
        button10.setOnClickListener(click_restart);
    }
    private View.OnClickListener click_number1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView numbers = (TextView)findViewById(R.id.number);
            numbers.setText("1");
        }
    };
    private View.OnClickListener click_number2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView numbers = (TextView)findViewById(R.id.number);
            numbers.setText("2");
        }
    };
    private View.OnClickListener click_number3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView numbers = (TextView)findViewById(R.id.number);
            numbers.setText("3");
        }
    };
    private View.OnClickListener click_number4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView numbers = (TextView)findViewById(R.id.number);
            numbers.setText("4");
        }
    };
    private View.OnClickListener click_number5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView numbers = (TextView)findViewById(R.id.number);
            numbers.setText("5");
        }
    };
    private View.OnClickListener click_number6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView numbers = (TextView)findViewById(R.id.number);
            numbers.setText("6");
        }
    };
    private View.OnClickListener click_number7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView numbers = (TextView)findViewById(R.id.number);
            numbers.setText("7");
        }
    };
    private View.OnClickListener click_number8 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView numbers = (TextView)findViewById(R.id.number);
            numbers.setText("8");
        }
    };
    private View.OnClickListener click_number9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView numbers = (TextView)findViewById(R.id.number);
            numbers.setText("9");
        }
    };
    private View.OnClickListener click_restart = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int count = 0;
        }
    };
    public void click_sent(View v){
        TextView numbers = (TextView)findViewById(R.id.number);
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("NUMBERS", numbers.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);

    }
}