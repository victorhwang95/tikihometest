package com.project.sample.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.project.sample.recyclerviewsample.R;

import java.util.ArrayList;
import java.util.Random;

public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.SampleViewHolder> {

    ArrayList<String> Data;

    public SampleAdapter(ArrayList<String> data) {
        Data = data;
    }

    @Override
    public SampleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_sample,viewGroup,false);
        return new SampleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SampleViewHolder sampleViewHolder, int i) {
        if (Data != null){
            sampleViewHolder.tvLabel.setText(Data.get(i));
            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            sampleViewHolder.layout.setBackgroundColor(color);
            String keyWord = sampleViewHolder.tvLabel.getText().toString();
            String[] wordArray= sampleViewHolder.tvLabel.getText().toString().split(" ");
            if(wordArray.length >= 2)
            {
                keyWord=wordArray[0]+"\n";
                for (int j =1;j < wordArray.length; j++)
                {
                    keyWord=keyWord+wordArray[j];
                }
                sampleViewHolder.tvLabel.setText(keyWord);
            }
        }
    }

    @Override
    public int getItemCount() {
        return Data.size();
    }


    public class SampleViewHolder extends RecyclerView.ViewHolder {
        TextView tvLabel;
        LinearLayout layout;
        public SampleViewHolder(View itemView) {
            super(itemView);
            tvLabel = itemView.findViewById(R.id.tv_item_sample);
            layout = itemView.findViewById(R.id.backgroundItem);

        }
    }
}
