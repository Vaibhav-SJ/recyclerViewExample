package com.example.appmomos.recyclerviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>
{
    private List<MainActivity.Data> android;
    private Context context;

    DataAdapter(Context context, List<MainActivity.Data> android)
    {
        this.android = android;
        this.context = context;
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder viewHolder, int i)
    {
        viewHolder.tv_android.setText(android.get(i).txt);
        Picasso.with(context).load(android.get(i).imageId).into(viewHolder.img_android);
    }

    @Override
    public int getItemCount()
    {
        return android.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tv_android;
        ImageView img_android;

        ViewHolder(View view)
        {
            super(view);
            tv_android = view.findViewById(R.id.tv_android);
            img_android = view.findViewById(R.id.img_android);
        }
    }

}