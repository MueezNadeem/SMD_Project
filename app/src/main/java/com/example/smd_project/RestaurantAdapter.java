package com.example.smd_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
//TODO: Complete Adapter
import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter {
    private ArrayList<Restaurant> Restaurants;

    public RestaurantAdapter (ArrayList<Restaurant> R){
        this.Restaurants=R;
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder{
        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(,parent,false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
