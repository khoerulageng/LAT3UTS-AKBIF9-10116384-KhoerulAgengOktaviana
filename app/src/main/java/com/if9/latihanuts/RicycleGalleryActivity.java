package com.if9.latihanuts;

/**Khoeerul Ageng Oktaviana
 * 10116384
 * AKBIF9
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class RicycleGalleryActivity extends AppCompatActivity {

    List<gallery> lstgallery ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ricycle_gallery);

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recycler_view);
        RicycleGalleryAdapter myAdapter = new RicycleGalleryAdapter(this,lstgallery);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);
    }
}
