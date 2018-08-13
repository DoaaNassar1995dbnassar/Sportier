package com.example.duaa.sportier.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.Objects.ShoppingCart;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.List;

/**
 * Created by AL-Qema on 01/03/18.
 */

public class PackageAdapter extends RecyclerView.Adapter<PackageAdapter.MyViewHolder> {

    private List<ShoppingCart> shoppingCarts;
    CustomItemClickListener listener;
    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
//        public FontTextViewRegular number;
//        public FontTextViewRegular price;



        public MyViewHolder(View view) {
            super(view);

//            number =  itemView.findViewById(R.id.number);
//            price =  itemView.findViewById(R.id.price);
        }


    }

    public PackageAdapter(Context context, List<ShoppingCart> shoppingCarts, CustomItemClickListener listener) {
        this.context = context;
        this.shoppingCarts = shoppingCarts;
        this.listener = listener;
    }

    public List<ShoppingCart> getItems() {
        return shoppingCarts;
    }


    @Override
    public PackageAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.package_item, parent, false);

        final PackageAdapter.MyViewHolder mViewHolder = new PackageAdapter.MyViewHolder(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                listener.onItemClick(v, mViewHolder.getAdapterPosition());
            }
        });
        return mViewHolder;
    }


    @Override
    public void onBindViewHolder(PackageAdapter.MyViewHolder holder, final int position) {
        ShoppingCart shoppingCart = shoppingCarts.get(position);

//        if(getLanguage().equals("en")){
////            holder.name.setText(category.getName());
//        holder.price.setText(shoppingCart.getPrice());
//        holder.number.setText(shoppingCart.getNumber());

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
        return shoppingCarts.size();
    }

}
