package com.MurmuDevelopers.Shayaari;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;


import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

    private DrawerLayout _drawer;

    private final ArrayList<HashMap<String, Object>> map = new ArrayList<>();

    private final Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        AppBarLayout _app_bar = findViewById(R.id._app_bar);
        CoordinatorLayout _coordinator = findViewById(R.id._coordinator);
        Toolbar _toolbar = findViewById(R.id._toolbar);
        setSupportActionBar(_toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);




        LinearLayout _nav_view = findViewById(R.id._nav_view);

        LinearLayout linear1 = findViewById(R.id.linear1);
        ScrollView vscroll1 = findViewById(R.id.vscroll1);
        LinearLayout linear2 = findViewById(R.id.linear2);
        LinearLayout first_Row = findViewById(R.id.First_Row);
        LinearLayout second_Row = findViewById(R.id.Second_Row);
        LinearLayout third_Row = findViewById(R.id.Third_Row);
        ImageView imageview7 = findViewById(R.id.imageview7);
        CardView cardview1 = findViewById(R.id.cardview1);
        CardView cardview2 = findViewById(R.id.cardview2);
        ImageView imageview1 = findViewById(R.id.imageview1);
        TextView textview1 = findViewById(R.id.textview1);
        ImageView imageview2 = findViewById(R.id.imageview2);
        TextView textview2 = findViewById(R.id.textview2);
        CardView cardview3 = findViewById(R.id.cardview3);
        CardView cardview4 = findViewById(R.id.cardview4);
        ImageView imageview3 = findViewById(R.id.imageview3);
        TextView textview3 = findViewById(R.id.textview3);
        ImageView imageview4 = findViewById(R.id.imageview4);
        TextView textview4 = findViewById(R.id.textview4);
        CardView cardview5 = findViewById(R.id.cardview5);
        CardView cardview6 = findViewById(R.id.cardview6);
        ImageView imageview5 = findViewById(R.id.imageview5);
        TextView textview5 = findViewById(R.id.textview5);
        ImageView imageview6 = findViewById(R.id.imageview6);
        TextView textview6 = findViewById(R.id.textview6);
        LinearLayout _drawer_drawer_bg = _nav_view.findViewById(R.id.drawer_bg);
        LinearLayout _drawer_logo_bg = _nav_view.findViewById(R.id.logo_bg);
        LinearLayout _drawer_title_bg = _nav_view.findViewById(R.id.title_bg);
        LinearLayout _drawer_bg_drawer = _nav_view.findViewById(R.id.bg_drawer);
        LinearLayout _drawer_developer_bg = _nav_view.findViewById(R.id.developer_bg);
        ImageView _drawer_logo_img = _nav_view.findViewById(R.id.logo_img);
        TextView _drawer_title_txt = _nav_view.findViewById(R.id.title_txt);
        CardView _drawer_home = _nav_view.findViewById(R.id.home);
        CardView _drawer_share = _nav_view.findViewById(R.id.share);
        CardView _drawer_contact_developer = _nav_view.findViewById(R.id.contact_developer);
        CardView _drawer_setting = _nav_view.findViewById(R.id.setting);
        ImageView _drawer_home_pic = _nav_view.findViewById(R.id.home_pic);
        TextView _drawer_home_text = _nav_view.findViewById(R.id.home_text);
        ImageView _drawer_share_img = _nav_view.findViewById(R.id.share_img);
        TextView _drawer_share_txt = _nav_view.findViewById(R.id.share_txt);
        ImageView _drawer_call_img = _nav_view.findViewById(R.id.call_img);
        TextView _drawer_call_txt = _nav_view.findViewById(R.id.call_txt);
        ImageView _drawer_setting_img = _nav_view.findViewById(R.id.setting_img);
        TextView _drawer_setting_txt = _nav_view.findViewById(R.id.setting_txt);
        TextView _drawer_developer_txt = _nav_view.findViewById(R.id.developer_txt);


        cardview1.setCardBackgroundColor(0xFFEAC9E8);
        cardview2.setCardBackgroundColor(0xFFF0F1A5);
        cardview3.setCardBackgroundColor(0xFFC1A4F8);
        cardview4.setCardBackgroundColor(0xFFEDC0D2);
        cardview5.setCardBackgroundColor(0xFFB6FAA5);
        cardview6.setCardBackgroundColor(0xFF43CBFF);
        _drawer_home.setCardBackgroundColor(0xFFFFCDD2);
        _drawer_share.setCardBackgroundColor(0xFFFFCDD2);
        _drawer_contact_developer.setCardBackgroundColor(0xFFFFCDD2);
        _drawer_setting.setCardBackgroundColor(0xFFFFCDD2);


        _toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                //Toast.makeText(HomeActivity.this, "Drawer Clicked!", Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        });
        _drawer = findViewById(R.id._drawer);
        ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(HomeActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
        _drawer.addDrawerListener(_toggle);
        _toggle.syncState();




        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                Intent intent = new Intent(HomeActivity.this, ShayaariListActivity.class);
                intent.putExtra("json_file", "attitude.json");
                intent.putExtra("title", "Attitude Shayari");
                intent.putExtra("color", 0xFFEAC9E8);
                startActivity(intent);
            }
        });

        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                Intent intent = new Intent(HomeActivity.this, ShayaariListActivity.class);
                intent.putExtra("json_file", "funny.json");
                intent.putExtra("title", "Funny Shayari");
                intent.putExtra("color", 0xFFF0F1A5);
                startActivity(intent);
            }
        });

        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                Intent intent = new Intent(HomeActivity.this, ShayaariListActivity.class);
                intent.putExtra("json_file", "romantic.json");
                intent.putExtra("title", "Romantic Shayari");
                intent.putExtra("color", 0xFFC1A4F8);
                startActivity(intent);
            }
        });

        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                Intent intent = new Intent(HomeActivity.this, ShayaariListActivity.class);
                intent.putExtra("json_file", "love.json");
                intent.putExtra("title", "Love Shayari");
                intent.putExtra("color", 0xFFEDC0D2);
                startActivity(intent);
            }
        });

        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                Intent intent = new Intent(HomeActivity.this, ShayaariListActivity.class);
                intent.putExtra("json_file", "dosti.json");
                intent.putExtra("title", "Dosti Shayari");
                intent.putExtra("color", 0xFFB6FAA5);
                startActivity(intent);
            }
        });

        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                Intent intent = new Intent(HomeActivity.this, ShayaariListActivity.class);
                intent.putExtra("json_file", "girls.json");
                intent.putExtra("title", "Girls Shayari");
                intent.putExtra("color", 0xFF43CBFF);
                startActivity(intent);
            }
        });

        _drawer_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                //Toast.makeText(HomeActivity.this, "Drawer Closed!", Toast.LENGTH_SHORT).show();
                _drawer.closeDrawer(GravityCompat.START);
            }
        });

        _drawer_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://t.me/allinoneshayaari"));
                startActivity(intent);
                //SketchwareUtil.showMessage(getApplicationContext(), "Join our Telegram Group for Latest Update! ");
                Toast.makeText(HomeActivity.this, "Join our Telegram Group for Latest Update! ", Toast.LENGTH_SHORT).show();
            }
        });

        _drawer_contact_developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                intent.setClass(getApplicationContext(), ContactDeveloperActivity.class);
                startActivity(intent);
            }
        });

        _drawer_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                //SketchwareUtil.showMessage(getApplicationContext(), "It will be available soon! ");
                Toast.makeText(HomeActivity.this, "It will be available soon! ", Toast.LENGTH_SHORT).show();
            }
        });













    }

    public void onBackPressed() {

        if (_drawer.isDrawerOpen(GravityCompat.START)) {
            _drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


}