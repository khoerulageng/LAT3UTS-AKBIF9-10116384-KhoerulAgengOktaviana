package com.if9.latihanuts;

/**Khoeerul Ageng Oktaviana
 * 10116384
 * AKBIF9
 */


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;



public class DailyFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> title = new ArrayList<>();
    ArrayList<String> description = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_ricycle, container, false);

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

        id.add("7");
        title.add("Menonton Anime");
        description.add("Sabtu dan Minggu jadwal untuk menonton anime.");

        id.add("8");
        title.add("Mencuci Baju");
        description.add("Jika mempunyai waktu luang usahakan mencuci baju yang sudah kotor.");

        id.add("9");
        title.add("Menjemur Kasur");
        description.add("1 minggu sekali diwajibkan untuk menjemur kasur.");

        id.add("10");
        title.add("Menabung");
        description.add("Tidak boleh boros menggunakan uang dalam 1 hari. ");

        recyclerView = view.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecyclerAdapter(getActivity().getApplicationContext(), id, title, description);
        recyclerView.setAdapter(mAdapter);

        return view;
    }
}
