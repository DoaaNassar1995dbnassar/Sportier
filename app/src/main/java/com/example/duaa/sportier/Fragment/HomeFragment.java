package com.example.duaa.sportier.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;


public class HomeFragment extends android.app.Fragment {

    View view;
    CategoryFragment categoryFragment;
    ImageView ADSImage ,categoryImage,specialImage,offerImage,barImage,search,back,market,notification;
    FontTextViewRegular ADSText ,categoryText ,specialText ,offerText ,barTitle;
    FragmentTransaction fragmentTransaction;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        bindView();
        ADS();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getActivity().finish();

            }
        });


        return view;
    }


    public void ADS() {

        ADSImage.setImageResource(R.mipmap.nav_bar_01_ads_selected);
        categoryImage.setImageResource(R.mipmap.nav_bar_02_cats);
        specialImage.setImageResource(R.mipmap.nav_bar_03_special);
        offerImage.setImageResource(R.mipmap.nav_bar_04_offers);

        ADSText.setTextColor(getResources().getColor(R.color.red));
        categoryText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        specialText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        offerText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        barTitle.setVisibility(View.GONE);
        barImage.setVisibility(View.VISIBLE);
        search.setVisibility(View.VISIBLE);
        notification.setVisibility(View.GONE);

    }

    public void bindView() {

        barImage = getActivity().findViewById(R.id.barImage);
        barTitle = getActivity().findViewById(R.id.barTitle);
        search = getActivity().findViewById(R.id.search);
        back = getActivity().findViewById(R.id.back);
        market = getActivity().findViewById(R.id.market);


        categoryImage = getActivity().findViewById(R.id.categoriesImage);
        ADSImage = getActivity().findViewById(R.id.ADSImage);
        specialImage = getActivity().findViewById(R.id.specialImage);
        offerImage = getActivity().findViewById(R.id.offerImage);


        categoryText = getActivity().findViewById(R.id.categoriesText);
        ADSText = getActivity().findViewById(R.id.ADSText);
        specialText = getActivity().findViewById(R.id.specialText);
        offerText = getActivity().findViewById(R.id.offerText);
        notification=getActivity().findViewById(R.id.notification);



    }
}