package com.example.businessclientapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList<Business> businesses;

    public Adapter(ArrayList<Business> businesses) {
        this.businesses = businesses;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView businessName;
        TextView businessLocation;
        TextView businessNumber;
        TextView businessStatus;

        public ViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);

            businessName = (TextView) itemView.findViewById(R.id.BusinessName);
            businessLocation = (TextView) itemView.findViewById(R.id.businessLocation);
            businessNumber = (TextView) itemView.findViewById(R.id.businessPhoneNumber);
            businessStatus = (TextView) itemView.findViewById(R.id.businessStatus);
        }
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.business_item_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull Adapter.ViewHolder holder, int position) {
        Business item = businesses.get(position);

        holder.businessNumber.setText(String.valueOf(item.getPhoneNumber()));
        holder.businessName.setText(item.getBusinessName());
        holder.businessLocation.setText(item.getLocation());

        if (item.opened) {
            holder.businessStatus.setText("Opened");
            holder.businessStatus.setTextColor(Color.GREEN);
        } else {
            holder.businessStatus.setText("Closed");
            holder.businessStatus.setTextColor(Color.RED);
        }
    }

    @Override
    public int getItemCount() {
        return businesses.size();
    }

}
