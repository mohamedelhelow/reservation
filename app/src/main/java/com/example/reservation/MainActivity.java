package com.example.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.sginin);
        button = (Button) findViewById(R.id.sginup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensginin();
                opensginup();


            }
        });


    }

    public void opensginin() {
        Intent intent = new Intent(this, sgininPage.class);
        startActivity(intent);
    }

    public void opensginup() {
        Intent intent = new Intent(this, sginuppage.class);
        startActivity(intent);
    }


}