package com.sinhvien.shopeefood.Model;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuFoodWeekend {
    private int id_foodWeekend;
    private int img_foodWeekend;
    private String title_foodWeekend;

    public MenuFoodWeekend(int id_foodWeekend, int img_foodWeekend, String title_foodWeekend) {
        this.id_foodWeekend = id_foodWeekend;
        this.img_foodWeekend = img_foodWeekend;
        this.title_foodWeekend = title_foodWeekend;
    }

    public int getId_foodWeekend() {
        return id_foodWeekend;
    }

    public void setId_foodWeekend(int id_foodWeekend) {
        this.id_foodWeekend = id_foodWeekend;
    }

    public int getImg_foodWeekend() {
        return img_foodWeekend;
    }

    public void setImg_foodWeekend(int img_foodWeekend) {
        this.img_foodWeekend = img_foodWeekend;
    }

    public String getTitle_foodWeekend() {
        return title_foodWeekend;
    }

    public void setTitle_foodWeekend(String title_foodWeekend) {
        this.title_foodWeekend = title_foodWeekend;
    }
}
