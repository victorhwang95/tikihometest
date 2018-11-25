package com.project.sample.recyclerviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.project.sample.adapter.SampleAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> dataSample;
    SampleAdapter adapterSample;
    RecyclerView rcvSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupView();
    }

    private void setupView() {
        dataSample = new ArrayList<>();
        dataSample.add("Label 1");
        dataSample.add("Label2");
        dataSample.add("Label 3");
        dataSample.add("Label4");
        dataSample.add("Label 5");
        dataSample.add("Label6");
        dataSample.add("Label 7");
        adapterSample = new SampleAdapter(dataSample);
        rcvSample = findViewById(R.id.rcv_sample);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rcvSample.setLayoutManager(layoutManager);
        rcvSample.setAdapter(adapterSample);
    }
}
