package com.sinhvien.shopeefood.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sinhvien.shopeefood.Model.MenuCollection;
import com.sinhvien.shopeefood.R;

import java.util.List;

public class MenuCollectionAdapter extends RecyclerView.Adapter<MenuCollectionAdapter.ViewHolder> {
    private List<MenuCollection> lstMnCollection;
    private Context context;

    public MenuCollectionAdapter(List<MenuCollection> lstMnCollection, Context context) {
        this.lstMnCollection = lstMnCollection;
        this.context = context;
    }

    @NonNull
    @Override
    public MenuCollectionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_collection_food, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuCollectionAdapter.ViewHolder holder, int position) {
        MenuCollection menuCollection = lstMnCollection.get(position);
        holder.imgCollection.setImageResource(menuCollection.getImg_menu_Collection());
        String titleCollection = menuCollection.getTitle_menuCollection();
        if (titleCollection.length() >= 29) {
            titleCollection = titleCollection.substring(0, 28) + "...";
        }
        holder.txtTittle.setText(titleCollection);
    }

    @Override
    public int getItemCount() {
        return lstMnCollection.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgCollection;
        private TextView txtTittle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCollection = itemView.findViewById(R.id.image_collection);
            txtTittle = itemView.findViewById(R.id.title_collection);
        }
    }
}
