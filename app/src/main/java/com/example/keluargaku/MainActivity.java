package com.example.keluargaku;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        adapter = new KeluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Eko Poerwati Ningsih", "Ibu", R.drawable.ibuk));
        keluargaArrayList.add(new Keluarga("M Koyin", "Ayah", R.drawable.bapak));
        keluargaArrayList.add(new Keluarga("Muhammad Ilham Ali", "Saya", R.drawable.ilham));
        keluargaArrayList.add(new Keluarga("Ton Badawi", "Kakak Pertama", R.drawable.badawi));
        keluargaArrayList.add(new Keluarga("Agus Sudarmawan", "Kakak Kedua", R.drawable.agus));
        keluargaArrayList.add(new Keluarga("Aby Yazid Albustomi", "Adik", R.drawable.yazid));

    }

}