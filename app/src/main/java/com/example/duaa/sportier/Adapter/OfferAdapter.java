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
 * Created by AL-Qema on 27/02/18.
 */

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.MyViewHolder> {

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

    public OfferAdapter(Context context, List<String> categoryList, CustomItemClickListener listener) {
        this.context = context;
        this.categoryList = categoryList;
        this.listener = listener;
    }

    public List<String> getItems() {
        return categoryList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_category, parent, false);

        final MyViewHolder mViewHolder = new MyViewHolder(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                listener.onItemClick(v, mViewHolder.getAdapterPosition());
            }
        });
        return mViewHolder;
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

            holder.name.setVisibility(View.GONE);
//



    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

}
