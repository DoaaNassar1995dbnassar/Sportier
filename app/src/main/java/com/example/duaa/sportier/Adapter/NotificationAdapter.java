package com.example.duaa.sportier.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.Objects.Category;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.List;

/**
 * Created by AL-Qema on 02/03/18.
 */

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.MyViewHolder> {

    private List<String> categoryList;
    CustomItemClickListener listener;
    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public FontTextViewRegular name;
        public ImageView image;



        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) itemView.findViewById(R.id.categoriesImage);
            name = (FontTextViewRegular) itemView.findViewById(R.id.categoryName);
        }


    }

    public NotificationAdapter(Context context, List<String> categoryList, CustomItemClickListener listener) {
        this.context = context;
        this.categoryList = categoryList;
        this.listener = listener;
    }

    public List<String> getItems() {
        return categoryList;
    }


    @Override
    public NotificationAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notification_item, parent, false);

        final NotificationAdapter.MyViewHolder mViewHolder = new NotificationAdapter.MyViewHolder(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                listener.onItemClick(v, mViewHolder.getAdapterPosition());
            }
        });
        return mViewHolder;
    }


    @Override
    public void onBindViewHolder(NotificationAdapter.MyViewHolder holder, final int position) {
//



    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

}
