package com.example.duaa.sportier.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.duaa.sportier.Activity.MainActivity;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;


public class RegisterFragment extends android.app.Fragment {

    View view;
    ImageView barImage, search, back, market,notification;
    FontTextViewRegular barTitle;
    FragmentTransaction fragmentTransaction ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_register, container, false);

        bindView();
        first();


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginFragment contentFragment =new LoginFragment();
                FragmentManager fm = getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.containerContent, contentFragment, "tag").commit();
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

    }

    public void first() {
        barTitle.setText(R.string.registerNew);

    }

}
