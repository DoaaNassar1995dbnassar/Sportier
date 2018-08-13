package com.example.duaa.sportier.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.duaa.sportier.Adapter.EqualSpacingItemDecoration;
import com.example.duaa.sportier.Adapter.MyADSAdapter;
import com.example.duaa.sportier.Adapter.SubSectionAdapter;
import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.Objects.SubSection;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.ArrayList;


public class MyADSListFragment extends android.app.Fragment {

    View view ;
    ImageView barImage, search, back, market,notification;
    FontTextViewRegular barTitle;
    FragmentTransaction fragmentTransaction;
    RecyclerView recyclerView;


    public static MyADSListFragment newInstance(String param1, String param2) {
        MyADSListFragment fragment = new MyADSListFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.fragment_my_adslist, container, false);
        bindView();
        first();

        final ArrayList<SubSection> subSections = new ArrayList<>();
        subSections.add(new SubSection("name Category", "123", "220"));
        subSections.add(new SubSection("name Category", "123", "220"));
        subSections.add(new SubSection("name Category", "123", "220"));
        subSections.add(new SubSection("name Category", "123", "220"));
        subSections.add(new SubSection("name Category", "123", "220"));
        subSections.add(new SubSection("name Category", "123", "220"));


        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));


        MyADSAdapter categoryAdapter = new MyADSAdapter(getActivity(), subSections, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {

//
//
            }
        });
        recyclerView.setAdapter(categoryAdapter);
        recyclerView.addItemDecoration(new EqualSpacingItemDecoration(10));
        // Inflate the layout for this fragment
        return view;
    }



    public void bindView() {

        barImage = getActivity().findViewById(R.id.barImage);
        barTitle = getActivity().findViewById(R.id.barTitle);
        search = getActivity().findViewById(R.id.search);
        back = getActivity().findViewById(R.id.back);
        market = getActivity().findViewById(R.id.market);
        recyclerView=view.findViewById(R.id.myADSList);
        notification=getActivity().findViewById(R.id.notification);






    }

    public void first() {

        barTitle.setVisibility(View.VISIBLE);
        barImage.setVisibility(View.GONE);
        search.setVisibility(View.GONE);
        barTitle.setText(getString(R.string.myADS));
        notification.setVisibility(View.GONE);


    }

}
