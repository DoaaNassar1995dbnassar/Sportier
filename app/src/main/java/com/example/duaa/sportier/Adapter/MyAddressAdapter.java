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
 * Created by AL-Qema on 03/03/18.
 */

public class MyAddressAdapter  extends RecyclerView.Adapter<MyAddressAdapter.MyViewHolder> {

    private List<String> list;
    CustomItemClickListener listener;
    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public FontTextViewRegular date,name;




        public MyViewHolder(View view) {
            super(view);

            date =  itemView.findViewById(R.id.created);
            name=itemView.findViewById(R.id.name);
        }



    }

    public MyAddressAdapter(Context context, List<String> list, CustomItemClickListener listener) {
        this.context = context;
        this.list = list;
        this.listener = listener;
    }

    public List<String> getItems() {
        return list;
    }


    @Override
    public MyAddressAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.address_row, parent, false);

        final MyAddressAdapter.MyViewHolder mViewHolder = new MyAddressAdapter.MyViewHolder(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                listener.onItemClick(v, mViewHolder.getAdapterPosition());
            }
        });
        return mViewHolder;
    }


    @Override
    public void onBindViewHolder(MyAddressAdapter.MyViewHolder holder, final int position) {
//        String category = categoryList.get(position);

        holder.name.setText(list.get(position));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
