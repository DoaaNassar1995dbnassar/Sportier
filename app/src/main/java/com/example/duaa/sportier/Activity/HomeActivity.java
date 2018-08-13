package com.example.duaa.sportier.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.duaa.sportier.Adapter.NotificationAdapter;
import com.example.duaa.sportier.Adapter.listMenuNavigationAdapter;
import com.example.duaa.sportier.Fragment.AboutFragment;
import com.example.duaa.sportier.Fragment.ContactUsFragment;
import com.example.duaa.sportier.Fragment.ContentFragment;
import com.example.duaa.sportier.Fragment.LoginFragment;
import com.example.duaa.sportier.Fragment.MyAccountFragment;
import com.example.duaa.sportier.Fragment.NotificationsFragment;
import com.example.duaa.sportier.Fragment.PackageFragment;
import com.example.duaa.sportier.Objects.MenuItemNotification;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    LoginFragment contentFragment;
    FragmentTransaction fragmentTransaction;

    ImageView barImage, search, back, market, menu;
    FontTextViewRegular barTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        bindView();
        contentFragment = new LoginFragment();
        FragmentManager fm = getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.containerContent, contentFragment, "tag").commit();


        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
//        ArrayList<MenuItemNotification>arrayList=new ArrayList<>();
//        arrayList.add(new MenuItemNotification(getString(R.string.home),R.mipmap.side_menu_home));
//        arrayList.add(new MenuItemNotification(getString(R.string.myAccount),R.mipmap.side_menu_my_account));
//        arrayList.add(new MenuItemNotification(getString(R.string.packages),R.mipmap.side_menu_packages));
//        arrayList.add(new MenuItemNotification(getString(R.string.notification),R.mipmap.side_menu_noti));
//        arrayList.add(new MenuItemNotification("",R.mipmap.line4));
//        arrayList.add(new MenuItemNotification(getString(R.string.about),R.mipmap.side_menu_about));
//        arrayList.add(new MenuItemNotification(getString(R.string.contactUs),R.mipmap.side_menu_contact));
//        arrayList.add(new MenuItemNotification("",R.mipmap.line4));
//        arrayList.add(new MenuItemNotification("FAQ",R.mipmap.side_menu_faq));
//        arrayList.add(new MenuItemNotification(getString(R.string.terms),R.mipmap.side_menu_terms));
//        arrayList.add(new MenuItemNotification("",R.mipmap.line4));
//        arrayList.add(new MenuItemNotification(getString(R.string.changeCountry),R.mipmap.side_menu_kuwait));
//        arrayList.add(new MenuItemNotification(getString(R.string.arabicLanguage),R.mipmap.side_menu_lang));
//
//        ListView listView = findViewById(R.id.slider_list);
//        final listMenuNavigationAdapter adapter = new listMenuNavigationAdapter(this,arrayList );
//        listView.setAdapter(adapter);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (drawer.isDrawerOpen(GravityCompat.END)) {
                    drawer.closeDrawer(GravityCompat.END);
                } else {
                    drawer.openDrawer(GravityCompat.END);
                }
            }
        });


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.END)) {
            drawer.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menuNaviLayout; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
//
//        if (id == R.id.packages) {
//            PackageFragment shoppingCartFragment = new PackageFragment();
//            FragmentManager fm = getFragmentManager();
//            fragmentTransaction = fm.beginTransaction();
//            fragmentTransaction.replace(R.id.container, shoppingCartFragment, "tag").commit();
//
//        } else if (id == R.id.about) {
//            AboutFragment aboutFragment = new AboutFragment();
//            FragmentManager fm = getFragmentManager();
//            fragmentTransaction = fm.beginTransaction();
//            fragmentTransaction.replace(R.id.container, aboutFragment, "tag").commit();
//
//        } else if (id == R.id.contact) {
//            ContactUsFragment contactUsFragment = new ContactUsFragment();
//            FragmentManager fm = getFragmentManager();
//            fragmentTransaction = fm.beginTransaction();
//            fragmentTransaction.replace(R.id.container, contactUsFragment, "tag").commit();
//
//        } else if (id == R.id.myAccount) {
//
//            MyAccountFragment myAccontFragment = new MyAccountFragment();
//            FragmentManager fm = getFragmentManager();
//            fragmentTransaction = fm.beginTransaction();
//            fragmentTransaction.replace(R.id.container, myAccontFragment, "tag").commit();
//
//        } else if (id == R.id.notifications) {
//
//            NotificationsFragment notificationsFragment = new NotificationsFragment();
//            FragmentManager fm = getFragmentManager();
//            fragmentTransaction = fm.beginTransaction();
//            fragmentTransaction.replace(R.id.container, notificationsFragment, "tag").commit();
//
//        } else if (id == R.id.home) {
//
//            ContentFragment contentFragment = new ContentFragment();
//            FragmentManager fm = getFragmentManager();
//            fragmentTransaction = fm.beginTransaction();
//            fragmentTransaction.replace(R.id.container, contentFragment, "tag").commit();
//
//        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.END);
        return true;
    }

    public void bindView() {
        barImage = findViewById(R.id.barImage);
        barTitle = findViewById(R.id.barTitle);
        search = findViewById(R.id.search);
        back = findViewById(R.id.back);
        market = findViewById(R.id.market);
        menu = findViewById(R.id.menu);
    }


}
