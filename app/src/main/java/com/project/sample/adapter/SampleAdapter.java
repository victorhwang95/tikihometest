package com.project.sample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.project.sample.recyclerviewsample.R;

import java.util.ArrayList;

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
        }
    }

    @Override
    public int getItemCount() {
        return Data.size();
    }


    public class SampleViewHolder extends RecyclerView.ViewHolder {
        TextView tvLabel;
        public SampleViewHolder(View itemView) {
            super(itemView);
            tvLabel = itemView.findViewById(R.id.tv_item_sample);
        }
    }
}
