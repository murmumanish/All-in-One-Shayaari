package com.MurmuDevelopers.Shayaari;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShayaariAdaptor extends RecyclerView.Adapter<ViewHolder> {

    private final ArrayList<ShayaariModel> List;
    private final int color;
    public ShayaariAdaptor(ArrayList<ShayaariModel> List , int color) {
        this.List = List;
        this.color = color;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shayaari,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ShayaariModel model = List.get(position);
        holder.textView.setText(model.getUname());
        holder.cardView.setCardBackgroundColor(color);
        holder.cardView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(),ShowShayaariActivity.class);
            intent.putExtra("key", model.getUname());
            v.getContext().startActivity(intent);
        });
    }
    
    @Override
    public int getItemCount() {
        return List.size();
    }

}
