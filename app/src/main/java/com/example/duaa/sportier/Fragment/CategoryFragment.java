package com.example.duaa.sportier.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.duaa.sportier.Activity.HomeActivity;
import com.example.duaa.sportier.Adapter.CategoryAdapter;
import com.example.duaa.sportier.Adapter.EqualSpacingItemDecoration;
import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.Objects.Category;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.ArrayList;


public class CategoryFragment extends android.app.Fragment {

    public static CategoryFragment categoryFragment;
    View view;
    FontTextViewRegular men, women, kids, sports, personalADS;
    RecyclerView recyclerView ;
    ImageView barImage, search, back, market;
    FontTextViewRegular barTitle;
    FragmentTransaction fragmentTransaction;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);

    }

    public static CategoryFragment newInstance() {
        categoryFragment = new CategoryFragment();
        return categoryFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_category, container, false);
        bindView();
        fragment();
        men();

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

        personalADS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment();
                personalADS();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();

            }
        });


        return view;
    }

    public void bindView() {
        men = view.findViewById(R.id.men);
        women = view.findViewById(R.id.women);
        kids = view.findViewById(R.id.kids);
        sports = view.findViewById(R.id.sports);
        personalADS = view.findViewById(R.id.personalADS);

        barImage = getActivity().findViewById(R.id.barImage);
        barTitle = getActivity().findViewById(R.id.barTitle);
        search = getActivity().findViewById(R.id.search);
        back = getActivity().findViewById(R.id.back);
        market = getActivity().findViewById(R.id.market);



    }

    public void women() {
        men.setBackgroundResource(R.drawable.select_button);
        women.setBackgroundResource(R.drawable.background_button_selected);
        kids.setBackgroundResource(R.drawable.select_button);
        sports.setBackgroundResource(R.drawable.select_button);
        personalADS.setBackgroundResource(R.drawable.select_button);

    }

    public void men() {
        men.setBackgroundResource(R.drawable.background_button_selected);
        women.setBackgroundResource(R.drawable.select_button);
        kids.setBackgroundResource(R.drawable.select_button);
        sports.setBackgroundResource(R.drawable.select_button);
        personalADS.setBackgroundResource(R.drawable.select_button);

    }

    public void kids() {
        men.setBackgroundResource(R.drawable.select_button);
        women.setBackgroundResource(R.drawable.select_button);
        kids.setBackgroundResource(R.drawable.background_button_selected);
        sports.setBackgroundResource(R.drawable.select_button);
        personalADS.setBackgroundResource(R.drawable.select_button);

    }

    public void sports() {
        men.setBackgroundResource(R.drawable.select_button);
        women.setBackgroundResource(R.drawable.select_button);
        kids.setBackgroundResource(R.drawable.select_button);
        sports.setBackgroundResource(R.drawable.background_button_selected);
        personalADS.setBackgroundResource(R.drawable.select_button);

    }

    public void personalADS() {
        men.setBackgroundResource(R.drawable.select_button);
        women.setBackgroundResource(R.drawable.select_button);
        kids.setBackgroundResource(R.drawable.select_button);
        sports.setBackgroundResource(R.drawable.select_button);
        personalADS.setBackgroundResource(R.drawable.background_button_selected);

    }

    public void fragment() {
        SectionFragment sectionFragment = new SectionFragment();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.categoryContainer, sectionFragment, "tag").commit();
    }

}
