package com.example.smd_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
//TODO: Complete Adapter
public class TransportAdapter extends RecyclerView.Adapter {
    private ArrayList<Transportation> TP;
    public class TransportViewHolder extends RecyclerView.ViewHolder{
        public TransportViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
    public TransportAdapter(ArrayList<Transportation> T){
        this.TP=T;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(,parent,false);

        return new TransportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
