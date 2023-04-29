package com.example.smd_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
//TODO: Complete Adapter


public class PlacesAdapter extends RecyclerView.Adapter {
    private ArrayList<Place> Places;

    public class PlacesViewHolder extends RecyclerView.ViewHolder{

        public PlacesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
    public PlacesAdapter(ArrayList<Place> p){
        this.Places=p;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view= LayoutInflater.from(parent.getContext()).inflate(,parent,false);

        return new PlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PlacesViewHolder VW=(PlacesViewHolder) holder.
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
