package com.example.duaa.sportier.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.duaa.sportier.Interface.CustomItemClickListener;
import com.example.duaa.sportier.Objects.Category;
import com.example.duaa.sportier.Objects.SubSection;
import com.example.duaa.sportier.R;
import com.example.duaa.sportier.view.FontTextViewRegular;

import java.util.List;

/**
 * Created by AL-Qema on 28/02/18.
 */

public class SubSectionAdapter extends RecyclerView.Adapter<SubSectionAdapter.MyViewHolder> {

    private List<SubSection> subSections;
    CustomItemClickListener listener;
    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public FontTextViewRegular name,oldPrice,offerPrice;
        public ImageView image;
        LinearLayout linearLayout;


        public MyViewHolder(View view) {
            super(view);

            image =itemView.findViewById(R.id.sectionImage);
            name = itemView.findViewById(R.id.productName);
            oldPrice=itemView.findViewById(R.id.oldPrice);
            offerPrice=itemView.findViewById(R.id.offerPrice);
            linearLayout=itemView.findViewById(R.id.linearLayout);

        }


    }

    public SubSectionAdapter(Context context, List<SubSection> subSections, CustomItemClickListener listener) {
        this.context = context;
        this.subSections = subSections;
        this.listener = listener;
    }

    public List<SubSection> getItems() {
        return subSections;
    }


    @Override
    public SubSectionAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sub_section_row, parent, false);

        final SubSectionAdapter.MyViewHolder mViewHolder = new SubSectionAdapter.MyViewHolder(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                listener.onItemClick(v, mViewHolder.getAdapterPosition());
            }
        });
        return mViewHolder;
    }


    @Override
    public void onBindViewHolder(SubSectionAdapter.MyViewHolder holder, final int position) {
        SubSection subSection = subSections.get(position);

        holder.name.setText(subSection.getName());
        holder.oldPrice.setText(subSection.getOldPrice());
        holder.offerPrice.setText(subSection.getNewPrice());
        holder.linearLayout.setVisibility(View.GONE);



    }

    @Override
    public int getItemCount() {
        return subSections.size();
    }

}
