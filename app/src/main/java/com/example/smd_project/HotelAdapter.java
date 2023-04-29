package com.example.smd_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
//TODO: Complete Adapter
public class HotelAdapter extends RecyclerView.Adapter {
    private ArrayList<Hotel> Hotels;

    public HotelAdapter(ArrayList<Hotel> H){
        this.Hotels=H;
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder{

        public HotelViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(,parent,false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
