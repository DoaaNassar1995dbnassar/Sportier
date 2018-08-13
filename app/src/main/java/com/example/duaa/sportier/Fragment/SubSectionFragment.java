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
import com.example.duaa.sportier.Adapter.SubSectionAdapter;
import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.Objects.Category;
import com.example.duaa.sportier.Objects.SubSection;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.ArrayList;


public class SubSectionFragment extends android.app.Fragment {

    View view;
    RecyclerView recyclerView;
    ImageView barImage, search, back, market,notification;
    FontTextViewRegular barTitle;
    FragmentTransaction fragmentTransaction;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sub_section, container, false);
        bindView();

        final ArrayList<SubSection> subSections = new ArrayList<>();
        subSections.add(new SubSection("name Category", "123", "220"));
        subSections.add(new SubSection("name Category", "123", "220"));
        subSections.add(new SubSection("name Category", "123", "220"));
        subSections.add(new SubSection("name Category", "123", "220"));
        subSections.add(new SubSection("name Category", "123", "220"));
        subSections.add(new SubSection("name Category", "123", "220"));


        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));


        SubSectionAdapter categoryAdapter = new SubSectionAdapter(getActivity(), subSections, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {

                ItemFragment itemFragment = new ItemFragment();
                fragment(itemFragment);
//
            }
        });
        recyclerView.setAdapter(categoryAdapter);
        recyclerView.addItemDecoration(new EqualSpacingItemDecoration(10));
//        recyclerView.addOnScrollListener(createInfiniteScrollListener());

        categoryAdapter.notifyDataSetChanged();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CategoryFragment categoryFragment =new CategoryFragment();
                fragment(categoryFragment);
            }
        });

        return view;
    }


    public void bindView() {
        recyclerView = view.findViewById(R.id.subSectionList);
        barImage = getActivity().findViewById(R.id.barImage);
        barTitle = getActivity().findViewById(R.id.barTitle);
        search = getActivity().findViewById(R.id.search);
        back = getActivity().findViewById(R.id.back);
        market = getActivity().findViewById(R.id.market);

    }

    public void fragment(android.app.Fragment fragment) {
        FragmentManager fm = getActivity().getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment, "tag").commit();
    }
}
