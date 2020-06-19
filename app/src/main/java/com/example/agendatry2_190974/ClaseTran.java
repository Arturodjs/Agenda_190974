package com.example.agendatry2_190974;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ClaseTran extends AppCompatActivity {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImagePath = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_lista);
        initImageBitmaps();
    }
    private void initImageBitmaps(){
       mImagePath.add("https://image.shutterstock.com/image-photo/passport-picture-laughing-guy-grey-600w-254469691.jpg");
       mNames.add("Carlos O.");

        mImagePath.add("https://image.shutterstock.com/image-photo/passport-photo-asian-female-natural-600w-692128333.jpg");
        mNames.add("Isamar F.");

        mImagePath.add("https://image.shutterstock.com/image-photo/passport-picture-asian-young-woman-600w-789673348.jpg");
        mNames.add("Jeanette U.");

        mImagePath.add("https://image.shutterstock.com/image-photo/portrait-smiling-latin-guy-beard-600w-238720855.jpg");
        mNames.add("Jesus A.");

        mImagePath.add("https://image.shutterstock.com/image-photo/smiling-turkish-guy-600w-207985393.jpg");
        mNames.add("Victor H.");

        initRecycleView();
    }
    private void initRecycleView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_Contact);
        AdaptadorRecycler adaptadorRecycler = new AdaptadorRecycler(this, mNames, mImagePath);
        recyclerView.setAdapter(adaptadorRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}