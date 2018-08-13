package com.example.duaa.sportier.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.duaa.sportier.Objects.MenuItemNotification;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.ArrayList;

/**
 * Created by AL-Qema on 05/03/18.
 */

public class listMenuNavigationAdapter extends BaseAdapter {
    ArrayList<MenuItemNotification> arrayList;
    Activity con;

    public listMenuNavigationAdapter(Activity con, ArrayList<MenuItemNotification> arrayList1) {
        this.con = con;
        arrayList=arrayList1;
    }


    @Override
    public int getCount() {

        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i , View view, ViewGroup viewGroup) {
        View row;
        final ViewHolder viewHolder;
        if (view == null) {
            LayoutInflater inflater = con.getLayoutInflater();
            row = inflater.inflate(R.layout.menu_navigation_item, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.name = row.findViewById(R.id.name);
            viewHolder.imageView = row.findViewById(R.id.image);
            row.setTag(viewHolder);

        } else {
            row = view;
            viewHolder = (ViewHolder) view.getTag();
        }

        final MenuItemNotification item = arrayList.get(i);
        viewHolder.name.setText(item.getName());
        viewHolder.imageView.setImageResource(item.getImage());

        return row;
    }

    public class ViewHolder {
        FontTextViewRegular name;
        ImageView imageView;
    }
}