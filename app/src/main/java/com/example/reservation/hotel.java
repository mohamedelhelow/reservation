package com.example.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hotel extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);


        button =(Button) findViewById(R.id.dusit);
        button =(Button) findViewById(R.id.four);
        button =(Button) findViewById(R.id.inter);
        button =(Button) findViewById(R.id.hilton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opensucced();


            }
        });




    }
    public void opensucced()
    {
        Intent intent = new Intent(this, succed.class);
        startActivity(intent);
    }



}
