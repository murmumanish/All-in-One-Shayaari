package com.MurmuDevelopers.Shayaari;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;



import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;


import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

    private DrawerLayout drawer;


    private final Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);



        Toolbar toolbar = findViewById(R.id._toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);




        LinearLayout nav_view = findViewById(R.id._nav_view);


        CardView cardview1 = findViewById(R.id.cardview1);
        CardView cardview2 = findViewById(R.id.cardview2);

        CardView cardview3 = findViewById(R.id.cardview3);
        CardView cardview4 = findViewById(R.id.cardview4);

        CardView cardview5 = findViewById(R.id.cardview5);
        CardView cardview6 = findViewById(R.id.cardview6);

        CardView drawer_home = nav_view.findViewById(R.id.home);
        CardView drawer_share = nav_view.findViewById(R.id.share);
        CardView drawer_contact_developer = nav_view.findViewById(R.id.contact_developer);
        CardView drawer_setting = nav_view.findViewById(R.id.setting);



        cardview1.setCardBackgroundColor(0xFFEAC9E8);
        cardview2.setCardBackgroundColor(0xFFF0F1A5);
        cardview3.setCardBackgroundColor(0xFFC1A4F8);
        cardview4.setCardBackgroundColor(0xFFEDC0D2);
        cardview5.setCardBackgroundColor(0xFFB6FAA5);
        cardview6.setCardBackgroundColor(0xFF43CBFF);
        drawer_home.setCardBackgroundColor(0xFFFFCDD2);
        drawer_share.setCardBackgroundColor(0xFFFFCDD2);
        drawer_contact_developer.setCardBackgroundColor(0xFFFFCDD2);
        drawer_setting.setCardBackgroundColor(0xFFFFCDD2);


        toolbar.setNavigationOnClickListener(v -> {
            if (drawer != null && drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START, true);
            } else {
                finish(); // same as super.onBackPressed()
            }
        });
        drawer = findViewById(R.id._drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(HomeActivity.this, drawer, toolbar, R.string.app_name, R.string.app_name);
        drawer.addDrawerListener(toggle);
        toggle.syncState();




        cardview1.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, ShayaariListActivity.class);
            intent.putExtra("json_file", "attitude.json");
            intent.putExtra("title", "Attitude Shayari");
            intent.putExtra("color", 0xFFEAC9E8);
            startActivity(intent);
        });

        cardview2.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, ShayaariListActivity.class);
            intent.putExtra("json_file", "funny.json");
            intent.putExtra("title", "Funny Shayari");
            intent.putExtra("color", 0xFFF0F1A5);
            startActivity(intent);
        });

        cardview3.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, ShayaariListActivity.class);
            intent.putExtra("json_file", "romantic.json");
            intent.putExtra("title", "Romantic Shayari");
            intent.putExtra("color", 0xFFC1A4F8);
            startActivity(intent);
        });

        cardview4.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, ShayaariListActivity.class);
            intent.putExtra("json_file", "love.json");
            intent.putExtra("title", "Love Shayari");
            intent.putExtra("color", 0xFFEDC0D2);
            startActivity(intent);
        });

        cardview5.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, ShayaariListActivity.class);
            intent.putExtra("json_file", "dosti.json");
            intent.putExtra("title", "Dosti Shayari");
            intent.putExtra("color", 0xFFB6FAA5);
            startActivity(intent);
        });

        cardview6.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, ShayaariListActivity.class);
            intent.putExtra("json_file", "girls.json");
            intent.putExtra("title", "Girls Shayari");
            intent.putExtra("color", 0xFF43CBFF);
            startActivity(intent);
        });

        drawer_home.setOnClickListener(view -> drawer.closeDrawer(GravityCompat.START));

        drawer_share.setOnClickListener(view -> {
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://t.me/allinoneshayaari"));
            startActivity(intent);
            Toast.makeText(HomeActivity.this, "Join our Telegram Group for Latest Update! ", Toast.LENGTH_SHORT).show();
        });

        drawer_contact_developer.setOnClickListener(view -> {
            intent.setClass(getApplicationContext(), ContactDeveloperActivity.class);
            startActivity(intent);
        });

        drawer_setting.setOnClickListener(view -> Toast.makeText(HomeActivity.this, "It will be available soon! ", Toast.LENGTH_SHORT).show());


    }

}