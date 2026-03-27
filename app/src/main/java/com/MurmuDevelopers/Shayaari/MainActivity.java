package com.MurmuDevelopers.Shayaari;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Initialize views
        LinearLayout background = findViewById(R.id.Background);
        LinearLayout linear_Background = findViewById(R.id.Linear_Background);
        LinearLayout linear_Bottom = findViewById(R.id.Linear_Bottom);
        ImageView app_Logo = findViewById(R.id.App_Logo);
        TextView app_Version = findViewById(R.id.App_Version);

        // Set status bar color if supported
        //if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
        Window w = getWindow();
        w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        w.setStatusBarColor(0xFFFFCDD2);
        //}

        // Animate logo fade-in
        ObjectAnimator animator = ObjectAnimator.ofFloat(app_Logo, "alpha", 0f, 1f);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(1);
        animator.setDuration(2000);

        // Intent to move to HomeActivity
        intent = new Intent(this, HomeActivity.class);

        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(@NonNull Animator animator) {
            }

            @Override
            public void onAnimationEnd(@NonNull Animator animator) {
                startActivity(intent);
                finishAffinity();
            }

            @Override
            public void onAnimationCancel(@NonNull Animator animator) {
            }

            @Override
            public void onAnimationRepeat(@NonNull Animator animator) {
            }
        });

        animator.start();
    }
}