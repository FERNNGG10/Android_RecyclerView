package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.adapters.DeporteAdapter;
import com.example.myapplication.models.Deporte;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Deporte>Lista_deportes = new ArrayList<>();
        Lista_deportes.add(new Deporte("Futbol","Inglaterra"));
        Lista_deportes.add(new Deporte("Basketball","EU"));
        Lista_deportes.add(new Deporte("Box","Inglaterra"));

        DeporteAdapter da= new DeporteAdapter(Lista_deportes);
        RecyclerView rc = findViewById(R.id.reDeporte);
        rc.setAdapter(da);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);

    }
}