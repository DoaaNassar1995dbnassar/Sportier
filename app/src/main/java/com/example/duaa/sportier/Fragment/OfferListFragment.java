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

import com.example.duaa.sportier.Adapter.CategoryAdapter;
import com.example.duaa.sportier.Adapter.EqualSpacingItemDecoration;
import com.example.duaa.sportier.Adapter.OfferAdapter;
import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.Objects.Category;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.ArrayList;


public class OfferListFragment extends android.app.Fragment {

    View view;
    ImageView barImage, search, back, market,notification;
    FontTextViewRegular barTitle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_offer_list, container, false);

        RecyclerView recyclerView =view.findViewById(R.id.offerList);
        bindView();


        final ArrayList<String> categories =new ArrayList<>();
        categories.add("name Category");
        categories.add("name Category");
        categories.add("name Category");
        categories.add("name Category");
        categories.add("name Category");
        categories.add("name Category");
        categories.add("name Category");
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));


        OfferAdapter categoryAdapter =new OfferAdapter(getActivity(),categories, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
//

                OfferFragment offerFragment =new OfferFragment();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.containerContent, offerFragment, "tag").commit();

            }
        });



        recyclerView.setAdapter(categoryAdapter);
        recyclerView.addItemDecoration(new EqualSpacingItemDecoration(10));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();

            }
        });

        return view ;
    }

    public void bindView() {
        barImage = getActivity().findViewById(R.id.barImage);
        barTitle = getActivity().findViewById(R.id.barTitle);
        search = getActivity().findViewById(R.id.search);
        back = getActivity().findViewById(R.id.back);
        market = getActivity().findViewById(R.id.market);
        notification=getActivity().findViewById(R.id.notification);

    }
}