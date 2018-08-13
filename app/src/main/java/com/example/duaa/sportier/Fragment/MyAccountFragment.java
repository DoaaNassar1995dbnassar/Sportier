package com.example.duaa.sportier.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;


public class MyAccountFragment extends android.app.Fragment {
    View view;
    ImageView ADSImage, categoryImage, specialImage, offerImage, barImage, search, back, market,notification;
    FontTextViewRegular ADSText, categoryText, specialText, offerText, barTitle;
    FragmentTransaction fragmentTransaction;
    CardView editProfile ,changePassword ,myFav ,myOrder ,myAddress,logout;
    LinearLayout addAD,myADS;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_my_accont, container, false);
        bindView();
        first();

        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        changePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        myFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        myAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyAddressesFragment myAddressesFragment = new MyAddressesFragment();
                FragmentManager fm = getActivity().getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.container, myAddressesFragment, "tag").commit();
                first();

            }
        });

        myOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyOrderFragment myOrderFragment = new MyOrderFragment();
                FragmentManager fm = getActivity().getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.container, myOrderFragment, "tag").commit();
                first();


            }
        });

        addAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AddADFragment addADFragment = new AddADFragment();
                FragmentManager fm = getActivity().getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.container, addADFragment, "tag").commit();
                first();


            }
        });
        myADS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyADSFragment myADSFragment = new MyADSFragment();
                FragmentManager fm = getActivity().getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.container, myADSFragment, "tag").commit();
                first();

            }
        });





        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HomeFragment homeFragment = new HomeFragment();
                FragmentManager fm = getActivity().getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.container, homeFragment, "tag").commit();

            }
        });
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

        editProfile=view.findViewById(R.id.editProfile);
        changePassword=view.findViewById(R.id.changePassword);
        myFav =view.findViewById(R.id.myFav);
        myOrder=view.findViewById(R.id.myOrder);
        myAddress=view.findViewById(R.id.myAddress);
        logout=view.findViewById(R.id.logout);

        addAD =view.findViewById(R.id.addAD);
        myADS =view.findViewById(R.id.myADS);



    }


    public void first() {
        ADSImage.setImageResource(R.mipmap.nav_bar_01_ads);
        categoryImage.setImageResource(R.mipmap.nav_bar_02_cats);
        specialImage.setImageResource(R.mipmap.nav_bar_03_special);
        offerImage.setImageResource(R.mipmap.nav_bar_04_offers);

        ADSText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        categoryText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        specialText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        offerText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        barTitle.setVisibility(View.VISIBLE);
        barImage.setVisibility(View.GONE);
        search.setVisibility(View.GONE);
        barTitle.setText(getString(R.string.myAccount));
        notification.setVisibility(View.GONE);

    }


}
