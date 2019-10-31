package com.example.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hotelReservation extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_reservation);




        button =(Button) findViewById(R.id.hotelReservation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openhotel();


            }
        });


    }
    public void openhotel()
    {
        Intent intent = new Intent(this, hotel.class);
        startActivity(intent);
    }
}


