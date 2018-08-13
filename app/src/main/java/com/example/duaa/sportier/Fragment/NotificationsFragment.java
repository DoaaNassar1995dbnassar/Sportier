package com.example.duaa.sportier.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.duaa.sportier.Adapter.EqualSpacingItemDecoration;
import com.example.duaa.sportier.Adapter.NotificationAdapter;
import com.example.duaa.sportier.Adapter.OrderAdapter;
import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.ArrayList;

public class NotificationsFragment extends android.app.Fragment {
    RecyclerView recyclerView;
    View view;
    ImageView ADSImage ,categoryImage,specialImage,offerImage,barImage,search,back,market,notification;
    FontTextViewRegular ADSText ,categoryText ,specialText ,offerText ,barTitle;
    FragmentTransaction fragmentTransaction ;

    public static NotificationsFragment newInstance(String param1, String param2) {
        NotificationsFragment fragment = new NotificationsFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_notifications, container, false);

        bindView();
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("order");
        arrayList.add("order");
        arrayList.add("order");
        arrayList.add("order");
        arrayList.add("order");
        arrayList.add("order");
        first();

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        NotificationAdapter categoryAdapter = new NotificationAdapter(getActivity(), arrayList, new CustomItemClickListener() {

            @Override
            public void onItemClick(View v, int position) {
//
//000
//                OfferFragment offerFragment =new OfferFragment();
//                FragmentManager fm = getActivity().getFragmentManager();
//                FragmentTransaction fragmentTransaction = fm.beginTransaction();
//                fragmentTransaction.replace(R.id.container, offerFragment, "tag").commit();

            }
        });


        recyclerView.setAdapter(categoryAdapter);
        recyclerView.addItemDecoration(new EqualSpacingItemDecoration(10));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HomeFragment homeFragment =new HomeFragment();
                FragmentManager fm = getActivity().getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.container, homeFragment, "tag").commit();
                ADS();

            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    public void bindView() {
        recyclerView = view.findViewById(R.id.notificationList);
        barImage = getActivity().findViewById(R.id.barImage);
        barTitle = getActivity().findViewById(R.id.barTitle);
        search = getActivity().findViewById(R.id.search);
        back = getActivity().findViewById(R.id.back);
        market = getActivity().findViewById(R.id.market);
        notification=getActivity().findViewById(R.id.notification);



        categoryImage =getActivity().findViewById(R.id.categoriesImage);
        ADSImage =getActivity().findViewById(R.id.ADSImage);
        specialImage=getActivity().findViewById(R.id.specialImage);
        offerImage=getActivity().findViewById(R.id.offerImage);


        categoryText =getActivity().findViewById(R.id.categoriesText);
        ADSText =getActivity().findViewById(R.id.ADSText);
        specialText=getActivity().findViewById(R.id.specialText);
        offerText =getActivity().findViewById(R.id.offerText);

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

    }

    public void first(){
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
        barTitle.setText(getString(R.string.notification));
        notification.setVisibility(View.VISIBLE);

    }


}
