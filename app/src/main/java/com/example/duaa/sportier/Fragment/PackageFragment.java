package com.example.duaa.sportier.Fragment;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.example.duaa.sportier.Adapter.EqualSpacingItemDecoration;
import com.example.duaa.sportier.Adapter.OfferAdapter;
import com.example.duaa.sportier.Adapter.PackageAdapter;
import com.example.duaa.sportier.Adapter.RecycleViewIndicator;
import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.Objects.ShoppingCart;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.ArrayList;

@SuppressLint("WrongConstant")
@RequiresApi(api = Build.VERSION_CODES.M)
public class PackageFragment extends android.app.Fragment {
    View view ;
    RecyclerView recyclerView;
    FragmentTransaction fragmentTransaction;
    ImageView ADSImage, categoryImage, specialImage, offerImage, barImage, search, back, market,notification;
    FontTextViewRegular ADSText, categoryText, specialText, offerText, barTitle;
    PagerIndicator pagerIndicator ;


    public static PackageFragment newInstance(String param1, String param2) {
        PackageFragment fragment = new PackageFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_package, container, false);

        bindView();
        first();



        final ArrayList<ShoppingCart> arrayList = new ArrayList<>();
        arrayList.add(new ShoppingCart("123", "123", "image"));
        arrayList.add(new ShoppingCart("123", "123", "image"));
        arrayList.add(new ShoppingCart("123", "123", "image"));
        arrayList.add(new ShoppingCart("123", "123", "image"));
        arrayList.add(new ShoppingCart("123", "123", "image"));
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);


        PackageAdapter categoryAdapter =new PackageAdapter(getActivity(),arrayList, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
//

            }
        });


        linearLayoutManager.findFirstVisibleItemPosition();
        recyclerView.setAdapter(categoryAdapter);
        recyclerView.addItemDecoration(new RecycleViewIndicator());

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HomeFragment homeFragment = new HomeFragment();
                FragmentManager fm = getActivity().getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.container, homeFragment, "tag").commit();
                ADS();

            }
        });

        return view;
    }

    public void bindView (){
        recyclerView=view.findViewById(R.id.recycleView);
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
        pagerIndicator=view.findViewById(R.id.custom_indicator);
        notification=getActivity().findViewById(R.id.notification);



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
        barTitle.setText(getString(R.string.packages));
        notification.setVisibility(View.GONE);

    }

}