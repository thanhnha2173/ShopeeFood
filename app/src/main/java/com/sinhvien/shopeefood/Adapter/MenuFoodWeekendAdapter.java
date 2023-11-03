package com.sinhvien.shopeefood.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sinhvien.shopeefood.Model.MenuFoodWeekend;
import com.sinhvien.shopeefood.R;

import java.util.List;

public class MenuFoodWeekendAdapter extends RecyclerView.Adapter<MenuFoodWeekendAdapter.ViewHolder> {

    private List<MenuFoodWeekend> lstMnFoodWeekend;
    private Context context;

    public MenuFoodWeekendAdapter(List<MenuFoodWeekend> lstMnFoodWeekend, Context context) {
        this.lstMnFoodWeekend = lstMnFoodWeekend;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_food_weekend, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MenuFoodWeekend mnFoodWeekend = lstMnFoodWeekend.get(position);
        holder.imgFoodWeekend.setImageResource(mnFoodWeekend.getImg_foodWeekend());
        holder.txtTittleFoodWeekend.setText(mnFoodWeekend.getTitle_foodWeekend());
    }

    @Override
    public int getItemCount() {
        return lstMnFoodWeekend.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView txtTittleFoodWeekend;
        private ImageView imgFoodWeekend;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTittleFoodWeekend = itemView.findViewById(R.id.tittle_foodWeekend);
            imgFoodWeekend = itemView.findViewById(R.id.image_foodWeekend);
        }
    }
}
