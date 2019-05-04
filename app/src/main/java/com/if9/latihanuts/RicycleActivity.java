package com.if9.latihanuts;

/**Khoeerul Ageng Oktaviana
 * 10116384
 * AKBIF9
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RicycleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> title = new ArrayList<>();
    ArrayList<String> description = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ricycle);

        id.clear();
        title.clear();
        description.clear();

        id.add("1");
        title.add("Sholat");
        description.add("Jangan lupa sholat 5 waktu.");

        id.add("2");
        title.add("Belajar bahasa Java");
        description.add("Belajar java minimal 2 jam.");

        id.add("3");
        title.add("Tugas Kampus");
        description.add("Bereskan semua tugas kampus.");

        id.add("4");
        title.add("Jam Tidur");
        description.add("Maksimal jam tidur 24.00 WIB.");

        id.add("5");
        title.add("Belajar Kotlin");
        description.add("Jika java sudah paham pindah untuk mempelajari bahasa kotlin.");

        id.add("6");
        title.add("Refreshing");
        description.add("Lakukan hal yang bisa membuat suasana diri menjadi enak.");


        recyclerView = findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        mAdapter = new RecyclerAdapter(getApplicationContext(), id, title, description);
        recyclerView.setAdapter(mAdapter);
    }
}
