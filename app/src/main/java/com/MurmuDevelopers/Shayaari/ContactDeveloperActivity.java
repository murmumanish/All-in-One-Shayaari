package com.MurmuDevelopers.Shayaari;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.appbar.AppBarLayout;

import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactDeveloperActivity extends AppCompatActivity {

    private final Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_developer);


        AppBarLayout _app_bar = findViewById(R.id._app_bar);
        CoordinatorLayout _coordinator = findViewById(R.id._coordinator);
        Toolbar _toolbar = findViewById(R.id._toolbar);
        setSupportActionBar(_toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        _toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        LinearLayout linear1 = findViewById(R.id.linear1);
        CardView cardview1 = findViewById(R.id.cardview1);
        CardView cardview2 = findViewById(R.id.cardview2);
        CardView cardview3 = findViewById(R.id.cardview3);
        CircleImageView circleimageview1 = findViewById(R.id.circleimageview1);
        TextView textview1 = findViewById(R.id.textview1);
        CircleImageView circleimageview2 = findViewById(R.id.circleimageview2);
        TextView textview2 = findViewById(R.id.textview2);
        CircleImageView circleimageview3 = findViewById(R.id.circleimageview3);
        TextView textview3 = findViewById(R.id.textview3);

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
