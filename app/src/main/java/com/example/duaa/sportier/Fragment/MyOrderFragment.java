package com.example.duaa.sportier.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.duaa.sportier.Adapter.EqualSpacingItemDecoration;
import com.example.duaa.sportier.Adapter.OrderAdapter;
import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.ArrayList;


public class MyOrderFragment extends android.app.Fragment {

    View view;
    RecyclerView recyclerView ;
    ImageView ADSImage, categoryImage, specialImage, offerImage, barImage, search, back, market,notification;
    FontTextViewRegular ADSText, categoryText, specialText, offerText, barTitle;
    FragmentTransaction fragmentTransaction;

    public static MyOrderFragment newInstance(String param1, String param2) {
        MyOrderFragment fragment = new MyOrderFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_my_order, container, false);
        bindView();
        first();
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("order");
        arrayList.add("order");
        arrayList.add("order");
        arrayList.add("order");
        arrayList.add("order");
        arrayList.add("order");

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        OrderAdapter categoryAdapter = new OrderAdapter(getActivity(), arrayList, new CustomItemClickListener() {
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

                MyAccountFragment myAccontFragment = new MyAccountFragment();
                FragmentManager fm = getActivity().getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.container, myAccontFragment, "tag").commit();

            }
        });

        return view;
    }


    public void bindView (){

        recyclerView =view.findViewById(R.id.orderList);
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



    public void first() {

        barTitle.setVisibility(View.VISIBLE);
        barImage.setVisibility(View.GONE);
        search.setVisibility(View.GONE);
        barTitle.setText(getString(R.string.myOrder));
        notification.setVisibility(View.GONE);

    }
}