package com.example.appmomos.recyclerviewexample;

import android.content.Context;
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
    List<MainActivity.Data> android;
    Context context;

    public DataAdapter(Context context, List<MainActivity.Data> android)
    {
        this.android = android;
        this.context = context;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i)
    {
        viewHolder.tv_android.setText(android.get(i).txt);
        Picasso.with(context).load(android.get(i).imageId).into(viewHolder.img_android);
    }

    @Override
    public int getItemCount()
    {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView tv_android;
        public ImageView img_android;

        public ViewHolder(View view)
        {
            super(view);
            tv_android = (TextView)view.findViewById(R.id.tv_android);
            img_android = (ImageView) view.findViewById(R.id.img_android);
        }
    }

}