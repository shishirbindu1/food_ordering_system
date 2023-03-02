package com.example.food_ordering_system;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OrderDetail extends AppCompatActivity {

        TextView listView, priceView;
        String list_choice;
        Double price_bd, price_usd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);
        listView = (TextView) findViewById(R.id.listView);
        priceView = (TextView) findViewById((R.id.priceView));

        //getting the passed value from mainActivity

        Bundle bundle =getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price_bd = bundle.getDouble("price");

        //converting price in usd
        listView.setText(list_choice);
        priceView.setText(price_bd.toString());



    }
}