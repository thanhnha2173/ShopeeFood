package com.sinhvien.shopeefood.Model;

public class MenuDeliciosFood {
    private int id_MenuDeliciosFood;
    private String tittle_DeliciosFood;
    private int imgDeliciosFood;

    public MenuDeliciosFood(int id_MenuDeliciosFood, String tittle_DeliciosFood, int imgDeliciosFood) {
        this.id_MenuDeliciosFood = id_MenuDeliciosFood;
        this.tittle_DeliciosFood = tittle_DeliciosFood;
        this.imgDeliciosFood = imgDeliciosFood;
    }

    public int getId_MenuDeliciosFood() {
        return id_MenuDeliciosFood;
    }

    public void setId_MenuDeliciosFood(int id_MenuDeliciosFood) {
        this.id_MenuDeliciosFood = id_MenuDeliciosFood;
    }

    public String getTittle_DeliciosFood() {
        return tittle_DeliciosFood;
    }

    public void setTittle_DeliciosFood(String tittle_DeliciosFood) {
        this.tittle_DeliciosFood = tittle_DeliciosFood;
    }

    public int getImgDeliciosFood() {
        return imgDeliciosFood;
    }

    public void setImgDeliciosFood(int imgDeliciosFood) {
        this.imgDeliciosFood = imgDeliciosFood;
    }
}
