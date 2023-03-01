package com.example.food_ordering_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button pizzaButton, burgerButton, pastryButton;

    //Declaring a string to take my choice in it

    String choices = "";
    Double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzaButton = (Button) findViewById(R.id.pizzaButton);
        burgerButton = (Button) findViewById(R.id.burgerButton);
        pastryButton = (Button) findViewById(R.id.pastryButton);
    }

    //we have used string for list of cart
    public void add_to_list(View view){

        if(view==findViewById(R.id.pizzaButton))
        {
            choices = choices + "pizza"+ "\n";
            price = price+1200;
        }

        else if(view==findViewById(R.id.burgerButton))
        {
            choices = choices + "burger"+ "\n";
            price = price +200;
        }
        if(view==findViewById(R.id.pastryButton))
        {
            choices = choices + "pastry"+ "\n";
            price = price +80;
        }
    }

    public void placeOrder(View view){

        Intent i = new Intent(MainActivity.this, OrderDetail.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        i.putExtras(bundle);
        startActivity(i);

        //making choices

    }
}