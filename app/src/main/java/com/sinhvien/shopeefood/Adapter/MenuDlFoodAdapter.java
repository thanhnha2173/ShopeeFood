package com.sinhvien.shopeefood.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sinhvien.shopeefood.Model.MenuDeliciosFood;
import com.sinhvien.shopeefood.R;

import java.util.List;

public class MenuDlFoodAdapter extends RecyclerView.Adapter<MenuDlFoodAdapter.ViewHolder> {
    private List<MenuDeliciosFood> lstMnDeliciosFood;
    private Context context;

    public MenuDlFoodAdapter(List<MenuDeliciosFood> lstMnDeliciosFood, Context context) {
        this.lstMnDeliciosFood = lstMnDeliciosFood;
        this.context = context;
    }

    @NonNull
    @Override
    public MenuDlFoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_delicios_food, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuDlFoodAdapter.ViewHolder holder, int position) {
        MenuDeliciosFood mnDeliciosFood = lstMnDeliciosFood.get(position);
        holder.imgDeliciosFood.setImageResource(mnDeliciosFood.getImgDeliciosFood());
        holder.txtDeliciosFood.setText(mnDeliciosFood.getTittle_DeliciosFood());
    }

    @Override
    public int getItemCount() {
        return lstMnDeliciosFood.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgDeliciosFood;
        private TextView txtDeliciosFood;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgDeliciosFood = itemView.findViewById(R.id.image_deliciosFood);
            txtDeliciosFood = itemView.findViewById(R.id.tittle_deliciosFood);
        }
    }
}
