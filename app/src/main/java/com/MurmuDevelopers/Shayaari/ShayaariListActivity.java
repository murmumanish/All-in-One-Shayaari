package com.MurmuDevelopers.Shayaari;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;

public class ShayaariListActivity extends AppCompatActivity {

    private ArrayList<ShayaariModel> shayaariList;

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.shayaari_view);

        RecyclerView recyclerView = findViewById(R.id.recyclerview1);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Get Data from Intent

        String jsonFile = getIntent().getStringExtra("json_file");
        String title = getIntent().getStringExtra("title");
        int color = getIntent().getIntExtra("color",0);


        Toolbar toolbar = findViewById(R.id._toolbar);
        setSupportActionBar(toolbar); // Make it the ActionBar

        // Set the title dynamically
        Objects.requireNonNull(getSupportActionBar()).setTitle(title);
        
        // Set the Color
        toolbar.setTitleTextColor(ContextCompat.getColor(this, android.R.color.white));


        // Set the Data
        loadJson(jsonFile);

       // Passing Shayaari List and Color
        recyclerView.setAdapter(new ShayaariAdaptor(shayaariList,color));

    }

    private void loadJson(String fileName){
        try {
            InputStream inputStream = getAssets().open(fileName);
            int size = inputStream.available();
            byte[] buffer = new byte[size];

            int bytesRead = 0;
            while (bytesRead < size) {
                int result = inputStream.read(buffer, bytesRead, size - bytesRead);
                if (result == -1) break;  // End of stream
                bytesRead += result;
            }
            inputStream.close();

            String json = new String(buffer, StandardCharsets.UTF_8);

            Type type = new TypeToken<ArrayList<ShayaariModel>>() {}.getType();

            shayaariList = new Gson().fromJson(json,type);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

