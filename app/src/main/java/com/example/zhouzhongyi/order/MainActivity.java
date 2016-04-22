package com.example.zhouzhongyi.order;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private TextView cup;
    private TextView price;
    private Button plus,subtract,order;
    int cups=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cup = (TextView)findViewById(R.id.cup);
        price = (TextView)findViewById(R.id.preice);
        plus = (Button)findViewById(R.id.plus);
        subtract = (Button) findViewById(R.id.subtract);
        order = (Button)findViewById(R.id.order);


    }

    public void add(View view){

        cups=cups+1;
        display(cups);
    }

    public void sub(View view){
        cups=cups-1;
        display(cups);
    }

    public void sorder(View view){
        displayPrice(cups*5);
    }
    private void display(int number){

        cup.setText(""+number);
    }

    private void displayPrice(int number){

        price.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
