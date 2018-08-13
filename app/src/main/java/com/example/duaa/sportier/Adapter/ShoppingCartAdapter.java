package com.example.duaa.sportier.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.Objects.ShoppingCart;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.List;

/**
 * Created by AL-Qema on 01/03/18.
 */

public class ShoppingCartAdapter extends RecyclerView.Adapter<ShoppingCartAdapter.MyViewHolder> {

    private List<ShoppingCart> shoppingCarts;
    CustomItemClickListener listener;
    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public FontTextViewRegular number;
        public FontTextViewRegular price;



        public MyViewHolder(View view) {
            super(view);

            number =  itemView.findViewById(R.id.number);
            price =  itemView.findViewById(R.id.price);
        }


    }

    public ShoppingCartAdapter(Context context, List<ShoppingCart> shoppingCarts, CustomItemClickListener listener) {
        this.context = context;
        this.shoppingCarts = shoppingCarts;
        this.listener = listener;
    }

    public List<ShoppingCart> getItems() {
        return shoppingCarts;
    }


    @Override
    public ShoppingCartAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.shopping_row, parent, false);

        final ShoppingCartAdapter.MyViewHolder mViewHolder = new ShoppingCartAdapter.MyViewHolder(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                listener.onItemClick(v, mViewHolder.getAdapterPosition());
            }
        });
        return mViewHolder;
    }


    @Override
    public void onBindViewHolder(ShoppingCartAdapter.MyViewHolder holder, final int position) {
        ShoppingCart shoppingCart = shoppingCarts.get(position);

        holder.price.setText(shoppingCart.getPrice());
        holder.number.setText(shoppingCart.getNumber());




    }

    @Override
    public int getItemCount() {
        return shoppingCarts.size();
    }

}
