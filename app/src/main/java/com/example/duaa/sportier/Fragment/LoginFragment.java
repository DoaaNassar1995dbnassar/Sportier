package com.example.duaa.sportier.Fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.duaa.sportier.Activity.MainActivity;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontButtonRegular;
import com.example.duaa.sportier.view.FontTextViewRegular;


public class LoginFragment extends android.app.Fragment {

    View view;


    FontButtonRegular loginButton;
    FragmentTransaction fragmentTransaction;
    FontTextViewRegular register;
    ImageView barImage,search,back,market,notification;
    FontTextViewRegular barTitle;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_login, container, false);
        bindView();
        first();


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ContentFragment contentFragment = new ContentFragment();
                FragmentManager fm = getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.containerContent, contentFragment, "tag").commit();

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterFragment registerFragment = new RegisterFragment();
                FragmentManager fm = getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.containerContent, registerFragment, "tag").commit();
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
        loginButton = view.findViewById(R.id.loginBtn);
        register = view.findViewById(R.id.register);
        barImage = getActivity().findViewById(R.id.barImage);
        barTitle = getActivity().findViewById(R.id.barTitle);
        search = getActivity().findViewById(R.id.search);
        back = getActivity().findViewById(R.id.back);
        market = getActivity().findViewById(R.id.market);
        notification=getActivity().findViewById(R.id.notification);



    }

    public  void first(){
        search.setVisibility(View.GONE);
        barTitle.setText(getString(R.string.login));
        barTitle.setVisibility(View.VISIBLE);
        barImage.setVisibility(View.GONE);
        notification.setVisibility(View.GONE);


    }
}
