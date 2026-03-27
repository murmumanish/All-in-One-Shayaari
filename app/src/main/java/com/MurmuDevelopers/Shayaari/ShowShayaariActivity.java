package com.MurmuDevelopers.Shayaari;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.google.android.material.button.MaterialButton;

public class ShowShayaariActivity extends AppCompatActivity {

    private static final int CARD_COLOR = 0xFFFFCDD2;
    private static final int BUTTON_COLOR = 0xFFFFFFFF;

    private MaterialButton copyBtn, shareBtn;
    private CardView cardView;
    private Toolbar toolbar;
    private String shayaariText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_shayaari);

        initViews();
        setupToolbar();
        loadShayaari();
        setupButtons();
    }

    private void initViews() {
        cardView = findViewById(R.id.cardview1);
        copyBtn = findViewById(R.id.copy_btn);
        shareBtn = findViewById(R.id.share_btn);
        toolbar = findViewById(R.id._toolbar);
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
        // Modern way to handle back press
        toolbar.setNavigationOnClickListener(v -> getOnBackPressedDispatcher().onBackPressed());

        setTitle("Shayaari");
    }

    private void loadShayaari() {
        shayaariText = getIntent().getStringExtra("key");
        cardView.setCardBackgroundColor(CARD_COLOR);

        ((android.widget.TextView) findViewById(R.id.textview1)).setText(shayaariText);
    }

    private void setupButtons() {
        copyBtn.setBackgroundColor(BUTTON_COLOR);
        shareBtn.setBackgroundColor(BUTTON_COLOR);

        copyBtn.setOnClickListener(v -> copyToClipboard(shayaariText));
        shareBtn.setOnClickListener(v -> shareShayaari(shayaariText));
    }

    private void copyToClipboard(String text) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        if (clipboard != null) {
            clipboard.setPrimaryClip(ClipData.newPlainText("Shayaari", text));
            Toast.makeText(this, "Copied to clipboard", Toast.LENGTH_SHORT).show();
        }
    }

    private void shareShayaari(String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        startActivity(Intent.createChooser(intent, "Share Using"));
    }
}