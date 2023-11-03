package com.sinhvien.shopeefood.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sinhvien.shopeefood.Model.Menu;
import com.sinhvien.shopeefood.R;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    private List<Menu> lstMenu;
    private Context context;

    public MenuAdapter(List<Menu> lstMenu, Context context) {
        this.lstMenu = lstMenu;
        this.context = context;
    }

    @NonNull
    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_menu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.ViewHolder holder, int position) {
        Menu menu = lstMenu.get(position);
        holder.imgIcon.setImageResource(menu.getImgIcon());
        holder.txTitle.setText(menu.getTitle());
    }

    @Override
    public int getItemCount() {
        return lstMenu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView txTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.ic_sale);
            txTitle = itemView.findViewById(R.id.txTitle);
        }
    }
}
