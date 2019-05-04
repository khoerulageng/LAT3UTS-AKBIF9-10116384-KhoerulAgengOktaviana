package com.if9.latihanuts;

/**Khoeerul Ageng Oktaviana
 * 10116384
 * AKBIF9
 */


import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class ProfileFragment extends Fragment  implements  OnMapReadyCallback{
    MaterialDialog dialog;





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);



        TextView txtig = (TextView) view.findViewById(R.id.txtInstagram);
        TextView txtemail = (TextView) view.findViewById(R.id.txtEmail);
        TextView txtfb = (TextView) view.findViewById(R.id.txtFacebook);

        txtemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:kherulageng1998@gmail.com"));
                startActivity(intent);
            }
        });

        txtfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/agengditdot"));
                    startActivity(intent);
                } catch(Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/agengditdot")));
                }
            }
        });

        txtig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://instagram.com/_u/khoerulageng");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/khoerulageng")));
                }
            }
        });



        LinearLayout line = (LinearLayout) view.findViewById(R.id.linear);

        line.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                dialog = new MaterialDialog.Builder(getActivity())
                        .title("About")
                        .content("GAME ADDICTED V1.0")
                        .positiveText("Done")
                        .onPositive(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

                            }
                        })
                        .cancelable(false)
                        .titleColorRes(R.color.colorPrimaryDark)
                        .contentColorRes(R.color.colorBlack)
                        .backgroundColorRes(R.color.colorWhite)
                        .positiveColor(getResources().getColor(R.color.colorPrimaryDark))
                        .show();



            }

        });




        SupportMapFragment mMapFragment = SupportMapFragment.newInstance();
        FragmentTransaction fragmentTransaction =
                getChildFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.map, mMapFragment);
        fragmentTransaction.commit();
        mMapFragment.getMapAsync((OnMapReadyCallback) this);

        return view;

    }


    public void onMapReady(GoogleMap googleMap) {
        LatLng ageng = new LatLng(-6.891970, 107.615582);
        googleMap.addMarker(new MarkerOptions()
                .position(ageng)
                .title("Kostan"));
        googleMap.setMinZoomPreference(6.0f);
        googleMap.setMaxZoomPreference(14.0f);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(ageng));
    }

}
