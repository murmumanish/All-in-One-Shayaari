package com.MurmuDevelopers.Shayaari;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder{

    CardView cardView;
    TextView textView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        cardView = itemView.findViewById(R.id.cardview1);
        textView = itemView.findViewById(R.id.textview1);
    }
}
