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


public class AddNewAddressFragment extends android.app.Fragment {
    View view;
    FragmentTransaction fragmentTransaction;
    ImageView  barImage, search, back, market,notification;
    FontTextViewRegular  barTitle;


    public static AddNewAddressFragment newInstance(String param1, String param2) {
        AddNewAddressFragment fragment = new AddNewAddressFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_add_new_address, container, false);
        bindView();
        first();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyAddressesFragment myAddressesFragment =new MyAddressesFragment();
                FragmentManager fm = getActivity().getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.container, myAddressesFragment, "tag").commit();

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


    }


    public void first() {

        barTitle.setVisibility(View.VISIBLE);
        barImage.setVisibility(View.GONE);
        search.setVisibility(View.GONE);
        barTitle.setText(getString(R.string.addNewAddress));
        notification.setVisibility(View.GONE);

    }

}
