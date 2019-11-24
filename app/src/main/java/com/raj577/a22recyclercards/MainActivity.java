package com.raj577.a22recyclercards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();

        exampleList.add(new ExampleItem(R.drawable.node,"Clicked in studio"));
        exampleList.add(new ExampleItem(R.drawable.oner,"Clicked In rome"));
        exampleList.add(new ExampleItem(R.drawable.twor,"Clicked In itely"));
        exampleList.add(new ExampleItem(R.drawable.threer,"Clicked In greece"));
        exampleList.add(new ExampleItem(R.drawable.fourr,"Clicked In senoraterio"));
        exampleList.add(new ExampleItem(R.drawable.fiver,"Clicked In tuio"));
        exampleList.add(new ExampleItem(R.drawable.sixr,"Clicked In india"));


        //Config for RView
        recyclerView = findViewById(R.id.recyclerview);
      

        //Performance
        recyclerView.setHasFixedSize(true);


        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
