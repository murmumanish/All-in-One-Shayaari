package com.MurmuDevelopers.Shayaari;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;


import java.util.Objects;


public class ContactDeveloperActivity extends AppCompatActivity {

    private final Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_developer);



        Toolbar toolbar = findViewById(R.id._toolbar);

        // Setting Up Toolbar
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        // Modern way to handle back press
        toolbar.setNavigationOnClickListener(v -> getOnBackPressedDispatcher().onBackPressed());

        CardView cardview1 = findViewById(R.id.cardview1);
        CardView cardview2 = findViewById(R.id.cardview2);
        CardView cardview3 = findViewById(R.id.cardview3);


        setTitle("Contact Developer");
        cardview1.setCardBackgroundColor(0xFFFFCDD2);
        cardview2.setCardBackgroundColor(0xFFFFCDD2);
        cardview3.setCardBackgroundColor(0xFFFFCDD2);

        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/manish222261/"));
                startActivity(intent);
            }
        });

        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/manish222261"));
                startActivity(intent);
            }
        });

        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://t.me/allinoneshayaariofficial"));
                startActivity(intent);
            }
        });
    }



}
