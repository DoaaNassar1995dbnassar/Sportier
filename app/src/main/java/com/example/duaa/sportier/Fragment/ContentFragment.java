package com.example.duaa.sportier.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;


public class ContentFragment extends android.app.Fragment implements NavigationView.OnNavigationItemSelectedListener {

    View view;
    LinearLayout ADSLayout, categoryLayout, specialLayout, offerLayout;
    ImageView ADSImage, categoryImage, specialImage, offerImage, barImage, search, back, market, notification;
    FontTextViewRegular ADSText, categoryText, specialText, offerText, barTitle;
    FragmentTransaction fragmentTransaction;
    HomeFragment homeFragment;
    NavigationView navigationView;

    public static ContentFragment newInstance(String param1, String param2) {
        ContentFragment fragment = new ContentFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_content, container, false);
        bindView();
        first();
//        NavigationView navigationView = (NavigationView) getActivity().findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        homeFragment = new HomeFragment();
        fragment(homeFragment);

        ADSLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                homeFragment = new HomeFragment();
                fragment(homeFragment);
                ADS();

            }
        });

        categoryLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CategoryFragment categoryFragment = new CategoryFragment();
                fragment(categoryFragment);
                Category();

            }
        });

        specialLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CategoryFragment categoryFragment = new CategoryFragment();
                fragment(categoryFragment);

                special();

            }
        });


        offerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OfferListFragment offerListFragment = new OfferListFragment();
                fragment(offerListFragment);
                offer();

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();

            }
        });

        market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShoppingCartFragment shoppingCartFragment = new ShoppingCartFragment();
                fragment(shoppingCartFragment);
                shoppingCart();


            }
        });


        // Inflate the layout for this fragment
        return view;
    }


    public void bindView() {

        categoryLayout = view.findViewById(R.id.categories);
        ADSLayout = view.findViewById(R.id.ADS);
        specialLayout = view.findViewById(R.id.special);
        offerLayout = view.findViewById(R.id.offer);

        categoryImage = view.findViewById(R.id.categoriesImage);
        ADSImage = view.findViewById(R.id.ADSImage);
        specialImage = view.findViewById(R.id.specialImage);
        offerImage = view.findViewById(R.id.offerImage);


        categoryText = view.findViewById(R.id.categoriesText);
        ADSText = view.findViewById(R.id.ADSText);
        specialText = view.findViewById(R.id.specialText);
        offerText = view.findViewById(R.id.offerText);

        barImage = getActivity().findViewById(R.id.barImage);
        barTitle = getActivity().findViewById(R.id.barTitle);
        search = getActivity().findViewById(R.id.search);
        back = getActivity().findViewById(R.id.back);
        market = getActivity().findViewById(R.id.market);
        notification = getActivity().findViewById(R.id.notification);

        navigationView = (NavigationView) getActivity().findViewById(R.id.nav_view);


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
        notification.setVisibility(View.GONE);

    }

    public void Category() {

        ADSImage.setImageResource(R.mipmap.nav_bar_01_ads);
        categoryImage.setImageResource(R.mipmap.nav_bar_02_cats_selected);
        specialImage.setImageResource(R.mipmap.nav_bar_03_special);
        offerImage.setImageResource(R.mipmap.nav_bar_04_offers);

        ADSText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        categoryText.setTextColor(getResources().getColor(R.color.red));
        specialText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        offerText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        barTitle.setVisibility(View.GONE);
        barImage.setVisibility(View.VISIBLE);
        search.setVisibility(View.VISIBLE);
        notification.setVisibility(View.GONE);

    }

    public void special() {

        ADSImage.setImageResource(R.mipmap.nav_bar_01_ads);
        categoryImage.setImageResource(R.mipmap.nav_bar_02_cats);
        specialImage.setImageResource(R.mipmap.nav_bar_03_special_selected);
        offerImage.setImageResource(R.mipmap.nav_bar_04_offers);

        ADSText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        categoryText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        specialText.setTextColor(getResources().getColor(R.color.red));
        offerText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        barTitle.setVisibility(View.GONE);
        barImage.setVisibility(View.VISIBLE);
        search.setVisibility(View.VISIBLE);
        notification.setVisibility(View.GONE);


    }


    public void offer() {

        ADSImage.setImageResource(R.mipmap.nav_bar_01_ads);
        categoryImage.setImageResource(R.mipmap.nav_bar_02_cats);
        specialImage.setImageResource(R.mipmap.nav_bar_03_special);
        offerImage.setImageResource(R.mipmap.nav_bar_04_offers_selected);

        ADSText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        categoryText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        specialText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        offerText.setTextColor(getResources().getColor(R.color.red));

        barTitle.setText("Offers");
        barTitle.setVisibility(View.VISIBLE);
        barImage.setVisibility(View.GONE);
        search.setVisibility(View.GONE);
        notification.setVisibility(View.GONE);


    }

    public void first() {
        search.setVisibility(View.VISIBLE);
        barTitle.setVisibility(View.GONE);
        barImage.setVisibility(View.VISIBLE);
        notification.setVisibility(View.GONE);


    }

    public void shoppingCart() {

        ADSImage.setImageResource(R.mipmap.nav_bar_01_ads);
        categoryImage.setImageResource(R.mipmap.nav_bar_02_cats);
        specialImage.setImageResource(R.mipmap.nav_bar_03_special);
        offerImage.setImageResource(R.mipmap.nav_bar_04_offers);

        ADSText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        categoryText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        specialText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        offerText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        barTitle.setText(getString(R.string.shoppingCart));
        barTitle.setVisibility(View.VISIBLE);
        barImage.setVisibility(View.GONE);
        search.setVisibility(View.GONE);
        notification.setVisibility(View.GONE);


    }

    public void fragment(android.app.Fragment fragment) {
        FragmentManager fm = getActivity().getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment, "tag").commit();
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.packages) {
            PackageFragment shoppingCartFragment = new PackageFragment();
            FragmentManager fm = getFragmentManager();
            fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.container, shoppingCartFragment, "tag").commit();

        } else if (id == R.id.about) {
            AboutFragment aboutFragment = new AboutFragment();
            FragmentManager fm = getFragmentManager();
            fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.container, aboutFragment, "tag").commit();

        } else if (id == R.id.contact) {
            ContactUsFragment contactUsFragment = new ContactUsFragment();
            FragmentManager fm = getFragmentManager();
            fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.container, contactUsFragment, "tag").commit();

        } else if (id == R.id.myAccount) {

            MyAccountFragment myAccontFragment = new MyAccountFragment();
            FragmentManager fm = getFragmentManager();
            fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.container, myAccontFragment, "tag").commit();

        } else if (id == R.id.notifications) {

            NotificationsFragment notificationsFragment = new NotificationsFragment();
            FragmentManager fm = getFragmentManager();
            fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.container, notificationsFragment, "tag").commit();

        } else if (id == R.id.home) {

            ContentFragment contentFragment = new ContentFragment();
            FragmentManager fm = getFragmentManager();
            fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.container, contentFragment, "tag").commit();

        }


        DrawerLayout drawer = (DrawerLayout) getActivity().findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.END);
        return true;
    }
}
