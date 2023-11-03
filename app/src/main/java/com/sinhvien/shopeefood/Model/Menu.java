package com.sinhvien.shopeefood.Model;

import android.widget.ImageView;

import java.util.List;

public class Menu {
    private Integer imgIcon;
    private String title;

    public Menu(Integer imgIcon, String title) {
        this.imgIcon = imgIcon;
        this.title = title;
    }

    public Integer getImgIcon() {
        return imgIcon;
    }

    public void setImgIcon(Integer imgIcon) {
        this.imgIcon = imgIcon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
