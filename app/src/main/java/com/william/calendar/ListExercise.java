package com.william.calendar;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.william.calendar.Adapter.RecyclerViewAdapter;
import com.william.calendar.Model.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ListExercise extends AppCompatActivity {

    private List<Exercise> exerciseList = new ArrayList<>();
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exercises);

        initData();

        recyclerView = (RecyclerView)findViewById(R.id.list_ex);
        adapter = new RecyclerViewAdapter(exerciseList,this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void initData() {
        exerciseList.add(new Exercise(R.drawable.low_lunge_pose, "Low Lunge Pose"));
        exerciseList.add(new Exercise(R.drawable.king_pigeon_pose, "King pigeon Pose"));
        exerciseList.add(new Exercise(R.drawable.facing_dog_pose, "Facing Dog Pose"));
        exerciseList.add(new Exercise(R.drawable.cobra_pose, "Cobra Pose"));
        exerciseList.add(new Exercise(R.drawable.camel_pose, "Camel Pose"));


    }
}