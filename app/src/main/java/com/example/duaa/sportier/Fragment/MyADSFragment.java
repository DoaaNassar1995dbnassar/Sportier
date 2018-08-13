package com.example.duaa.sportier.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.duaa.sportier.Adapter.EqualSpacingItemDecoration;
import com.example.duaa.sportier.Adapter.SubSectionAdapter;
import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.Objects.SubSection;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.ArrayList;

public class MyADSFragment extends android.app.Fragment {
    View view;
    ImageView ADSImage, categoryImage, specialImage, offerImage, barImage, search, back, market,notification;
    FontTextViewRegular ADSText, categoryText, specialText, offerText, barTitle;
    FragmentTransaction fragmentTransaction;
    FontTextViewRegular men, women, kids, sports, ADS;


    public static MyADSFragment newInstance(String param1, String param2) {
        MyADSFragment fragment = new MyADSFragment();

        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_my_ad, container, false);
        bindView();
        first();

        fragment();


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                MyAccountFragment myAccountFragment = new MyAccountFragment();
                FragmentManager fm = getActivity().getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.container, myAccountFragment, "tag").commit();


            }
        });

        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragment();
                men();

            }
        });

        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragment();
                women();

            }
        });

        kids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragment();
                kids();


            }
        });


        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragment();
                sports();


            }
        });

        ADS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragment();
                ADS();


            }
        });


        // Inflate the layout for this fragment
        return view;
    }

    public void bindView() {

        barImage = getActivity().findViewById(R.id.barImage);
        barTitle = getActivity().findViewById(R.id.barTitle);
        search = getActivity().findViewById(R.id.search);
        back = getActivity().findViewById(R.id.back);
        market = getActivity().findViewById(R.id.market);
        notification=getActivity().findViewById(R.id.notification);



        categoryImage = getActivity().findViewById(R.id.categoriesImage);
        ADSImage = getActivity().findViewById(R.id.ADSImage);
        specialImage = getActivity().findViewById(R.id.specialImage);
        offerImage = getActivity().findViewById(R.id.offerImage);


        categoryText = getActivity().findViewById(R.id.categoriesText);
        ADSText = getActivity().findViewById(R.id.ADSText);
        specialText = getActivity().findViewById(R.id.specialText);
        offerText = getActivity().findViewById(R.id.offerText);

        men = view.findViewById(R.id.men);
        women = view.findViewById(R.id.women);
        kids = view.findViewById(R.id.kids);
        sports = view.findViewById(R.id.sports);
        ADS = view.findViewById(R.id.ADS);


    }

    public void first() {

        barTitle.setVisibility(View.VISIBLE);
        barImage.setVisibility(View.GONE);
        search.setVisibility(View.GONE);
        barTitle.setText(getString(R.string.myADS));
        notification.setVisibility(View.GONE);

    }

    public void women() {
        men.setBackgroundResource(R.drawable.select_button);
        women.setBackgroundResource(R.drawable.background_button_selected);
        kids.setBackgroundResource(R.drawable.select_button);
        sports.setBackgroundResource(R.drawable.select_button);
        ADS.setBackgroundResource(R.drawable.select_button);

    }

    public void men() {
        men.setBackgroundResource(R.drawable.background_button_selected);
        women.setBackgroundResource(R.drawable.select_button);
        kids.setBackgroundResource(R.drawable.select_button);
        sports.setBackgroundResource(R.drawable.select_button);
        ADS.setBackgroundResource(R.drawable.select_button);

    }

    public void kids() {
        men.setBackgroundResource(R.drawable.select_button);
        women.setBackgroundResource(R.drawable.select_button);
        kids.setBackgroundResource(R.drawable.background_button_selected);
        sports.setBackgroundResource(R.drawable.select_button);
        ADS.setBackgroundResource(R.drawable.select_button);

    }

    public void sports() {
        men.setBackgroundResource(R.drawable.select_button);
        women.setBackgroundResource(R.drawable.select_button);
        kids.setBackgroundResource(R.drawable.select_button);
        sports.setBackgroundResource(R.drawable.background_button_selected);
        ADS.setBackgroundResource(R.drawable.select_button);

    }

    public void ADS() {
        men.setBackgroundResource(R.drawable.select_button);
        women.setBackgroundResource(R.drawable.select_button);
        kids.setBackgroundResource(R.drawable.select_button);
        sports.setBackgroundResource(R.drawable.select_button);
        ADS.setBackgroundResource(R.drawable.background_button_selected);

    }

    public void fragment() {
        MyADSListFragment myADSListFragment = new MyADSListFragment();
        FragmentManager fm = getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.myADSContainer, myADSListFragment, "tag").commit();
    }

}
