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
import android.widget.LinearLayout;

import com.example.duaa.sportier.Adapter.EqualSpacingItemDecoration;
import com.example.duaa.sportier.Adapter.MyAddressAdapter;
import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.ArrayList;


public class MyAddressesFragment extends android.app.Fragment {

    View view;
    FragmentTransaction fragmentTransaction;
    ImageView barImage, search, back, market,notification;
    FontTextViewRegular  barTitle;
    RecyclerView recyclerView;
    LinearLayout addAddress;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_my_addresses, container, false);

        bindView();
        first();

        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("address1");
        arrayList.add("address2");
        arrayList.add("address3");
        arrayList.add("address4");
        arrayList.add("address5");

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


         MyAddressAdapter categoryAdapter = new MyAddressAdapter(getActivity(), arrayList, new CustomItemClickListener() {
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

        addAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AddNewAddressFragment addNewAddressFragment = new AddNewAddressFragment();
                FragmentManager fm = getActivity().getFragmentManager();
                fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.container, addNewAddressFragment, "tag").commit();

            }
        });



        return view;

    }

    public void bindView() {

        recyclerView = view.findViewById(R.id.myAddressList);
        barImage = getActivity().findViewById(R.id.barImage);
        barTitle = getActivity().findViewById(R.id.barTitle);
        search = getActivity().findViewById(R.id.search);
        back = getActivity().findViewById(R.id.back);
        market = getActivity().findViewById(R.id.market);
        notification=getActivity().findViewById(R.id.notification);


        addAddress =view.findViewById(R.id.addAddress);

    }




    public void first() {

        barTitle.setVisibility(View.VISIBLE);
        barImage.setVisibility(View.GONE);
        search.setVisibility(View.GONE);
        barTitle.setText(getString(R.string.myAddresses));
        notification.setVisibility(View.GONE);

    }


}
