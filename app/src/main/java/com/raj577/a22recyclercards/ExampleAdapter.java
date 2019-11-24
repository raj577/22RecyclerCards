package com.raj577.a22recyclercards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    //Step 6.2-
        private ArrayList<ExampleItem> mExampleList;



    //Step 1-
    public static class ExampleViewHolder extends RecyclerView.ViewHolder{

        //Step 4-
            public ImageView imageView;
            public TextView textView;



        //Step 2-
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);


            //Step 4-
                    imageView = itemView.findViewById(R.id.imageView);
                    textView = itemView.findViewById(R.id.textView);


        }
    }


    //Step 6.1-
    //To how many items to create
    public ExampleAdapter(ArrayList<ExampleItem> exampleList){
        mExampleList = exampleList;
    }


    //Step 3-
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        //Step 5-
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item,parent,false);
                ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
                return exampleViewHolder;


//        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int position) {
        //Step 7-
        ExampleItem currentItem = mExampleList.get(position);
        exampleViewHolder.imageView.setImageResource(currentItem.getmImageResourse());
        exampleViewHolder.textView.setText(currentItem.getMtext());


    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }


}
