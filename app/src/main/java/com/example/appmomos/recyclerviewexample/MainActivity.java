package com.example.appmomos.recyclerviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private List<Data> data;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews()
    {
        RecyclerView recyclerView = findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        /*RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);*/
        data = fill_with_data();
        DataAdapter adapter = new DataAdapter(getApplication(),data);

        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    public List<Data> fill_with_data()
    {

        data = new ArrayList<>();
        data.add(new Data( R.drawable.pic2, "Image 1"));
        data.add(new Data( R.drawable.pic1, "Image 2"));
        data.add(new Data( R.drawable.pic2, "Image 3"));
        data.add(new Data( R.drawable.pic3, "Image 4"));
        data.add(new Data( R.drawable.pic5, "Image 5"));
        data.add(new Data( R.drawable.pic4, "Image 6"));
        data.add(new Data( R.drawable.pic1, "Image 7"));
        data.add(new Data( R.drawable.pic3, "Image 8"));
        data.add(new Data( R.drawable.pic2, "Image 9"));
        return data;
    }

    class Data
    {
        int imageId;
        String txt;

        Data( int imageId, String text)
        {
            this.imageId = imageId;
            this.txt=text;
        }
    }

}


