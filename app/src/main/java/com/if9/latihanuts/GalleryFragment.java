package com.if9.latihanuts;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**Khoeerul Ageng Oktaviana
 * 10116384
 * AKBIF9
 */





public class GalleryFragment extends Fragment {
    List<gallery> lstgallery ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_ricycle_gallery, container, false);

        lstgallery = new ArrayList<>();
        lstgallery.add(new gallery("Batik Indonesia",R.drawable.batik));
        lstgallery.add(new gallery("Dota 2",R.drawable.dota));
        lstgallery.add(new gallery("Logo",R.drawable.logo));
        lstgallery.add(new gallery("PUBG",R.drawable.pubg));
        lstgallery.add(new gallery("Profile",R.drawable.profile));
        lstgallery.add(new gallery("pubgmobile",R.drawable.pubgmobile));



        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.recycler_view);
        RicycleGalleryAdapter myAdapter = new RicycleGalleryAdapter(this.getContext(),lstgallery);
        myrv.setLayoutManager(new GridLayoutManager(this.getActivity(),3));
        myrv.setAdapter(myAdapter);

        return view;
    }
}
