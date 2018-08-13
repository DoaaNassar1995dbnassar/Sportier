package com.example.duaa.sportier.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.List;

/**
 * Created by AL-Qema on 02/03/18.
 */

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.MyViewHolder> {

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

    public OrderAdapter(Context context, List<String> categoryList, CustomItemClickListener listener) {
        this.context = context;
        this.categoryList = categoryList;
        this.listener = listener;
    }

    public List<String> getItems() {
        return categoryList;
    }


    @Override
    public OrderAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order_row, parent, false);

        final OrderAdapter.MyViewHolder mViewHolder = new OrderAdapter.MyViewHolder(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                listener.onItemClick(v, mViewHolder.getAdapterPosition());
            }
        });
        return mViewHolder;
    }


    @Override
    public void onBindViewHolder(OrderAdapter.MyViewHolder holder, final int position) {
        String category = categoryList.get(position);
//        if(getLanguage().equals("en")){
//            holder.name.setText(category.getName());
//        holder.name.setVisibility(View.GONE);
//        }else {
//            holder.name.setText(category.getTitle_ar());
//        }
//        Picasso.with(holder.image.getContext())
//                .load(category.getUrl()).fit().centerInside()
////                .placeholder(R.drawable.placeholder)
////                .error(R.drawable.placeholder)
//                .into(holder.image);



    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

}
