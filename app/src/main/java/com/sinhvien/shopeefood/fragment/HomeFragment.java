package com.sinhvien.shopeefood.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.sinhvien.shopeefood.Adapter.MenuAdapter;
import com.sinhvien.shopeefood.Adapter.MenuCollectionAdapter;
import com.sinhvien.shopeefood.Adapter.MenuDlFoodAdapter;
import com.sinhvien.shopeefood.Adapter.MenuFoodWeekendAdapter;
import com.sinhvien.shopeefood.Model.Menu;
import com.sinhvien.shopeefood.Model.MenuCollection;
import com.sinhvien.shopeefood.Model.MenuDeliciosFood;
import com.sinhvien.shopeefood.Model.MenuFoodWeekend;
import com.sinhvien.shopeefood.R;
import com.sinhvien.shopeefood.UI.MainActivity;
import com.sinhvien.shopeefood.UI.SearchFood;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private RecyclerView rcView, rcCollection, rcDeliciosFood, rcFoodWeekend;
    private MenuAdapter menuAdapter;
    private MenuCollectionAdapter mnCollectionAdapter;
    private MenuDlFoodAdapter mnDeliciosFoodAdapter;
    private MenuFoodWeekendAdapter mnFoodWeekendAdapter;
    private List<Menu> lstMenu;
    private List<MenuCollection> lstMnCollection;
    private List<MenuDeliciosFood> lstMnDeliciosFood;
    private List<MenuFoodWeekend> lstMnFoodWeekend;
    private SearchView srView;
    private ImageSlider imageSlider, imageSlider2;
    private TextView txtShowAll, txtShowAllDeliciousFood, txtContentDeliciousFood, txtContentFood;

    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        anhXa(v);
        slideShowAuto();

        listChooseMenu();
        if(lstMenu.size() > 0){
            menuAdapter = new MenuAdapter(lstMenu, getContext());
            rcView.setAdapter(menuAdapter);
            rcView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        }

        listChooseCollection();
        if(lstMnCollection.size()>0){
            mnCollectionAdapter = new MenuCollectionAdapter(lstMnCollection, getContext());
            rcCollection.setAdapter(mnCollectionAdapter);
            rcCollection.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        }

        listDeliciosFood();
        if(lstMnDeliciosFood.size()>0){
            mnDeliciosFoodAdapter = new MenuDlFoodAdapter(lstMnDeliciosFood, getContext());
            rcDeliciosFood.setAdapter(mnDeliciosFoodAdapter);
            rcDeliciosFood.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        }
        listFoodWeekend();
        if(lstMnFoodWeekend.size()>0){
            mnFoodWeekendAdapter = new MenuFoodWeekendAdapter(lstMnFoodWeekend, getContext());
            rcFoodWeekend.setAdapter(mnFoodWeekendAdapter);
            rcFoodWeekend.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        }
        splitTextIfTooLong();
        onClickToNextActivity();
        return v;
    }

    private void anhXa(View v){
        rcView = v.findViewById(R.id.rcViewHorizontal);
        rcCollection = v.findViewById(R.id.rcCollection);
        rcDeliciosFood = v.findViewById(R.id.rcDeliciosFood);
        rcFoodWeekend = v.findViewById(R.id.rcFoodWeekend);
        srView = v.findViewById(R.id.searchView);
        imageSlider = v.findViewById(R.id.imageSlider);
        imageSlider2 = v.findViewById(R.id.imageSlider2);
        txtShowAll = v.findViewById(R.id.show_all);
        txtShowAllDeliciousFood = v.findViewById(R.id.showAll_deliciouFood);
        txtContentDeliciousFood = v.findViewById(R.id.deliciouFood_content);
        txtContentFood = v.findViewById(R.id.content_food);
    }

    private void splitTextIfTooLong() {
        String titleDelicousFood = txtContentDeliciousFood.getText().toString();
        String contentDeliousFood = txtContentFood.getText().toString();
        if (titleDelicousFood.length() >= 31 && contentDeliousFood.length() >= 64) {
            titleDelicousFood = titleDelicousFood.substring(0, 30) + "...";
            contentDeliousFood = contentDeliousFood.substring(0,63) + "...";
        }
        txtContentDeliciousFood.setText(titleDelicousFood);
        txtContentFood.setText(contentDeliousFood);
    }


    private void listChooseMenu() {

        lstMenu = new ArrayList<>();

        lstMenu.add(new Menu(R.drawable.ic_sale, "Giảm giá"));
        lstMenu.add(new Menu(R.drawable.ic_sale, "Giảm giá"));
        lstMenu.add(new Menu(R.drawable.ic_sale, "Giảm giá"));
        lstMenu.add(new Menu(R.drawable.ic_sale, "Giảm giá"));
        lstMenu.add(new Menu(R.drawable.ic_sale, "Giảm giá"));
        lstMenu.add(new Menu(R.drawable.ic_sale, "Giảm giá"));
        lstMenu.add(new Menu(R.drawable.ic_sale, "Giảm giá"));
        lstMenu.add(new Menu(R.drawable.ic_sale, "Giảm giá"));
        lstMenu.add(new Menu(R.drawable.ic_sale, "Giảm giá"));
    }

    private void listChooseCollection() {
        lstMnCollection = new ArrayList<>();

        lstMnCollection.add(new MenuCollection(1,"Phá cỗ Trung Thu, giảm tới 888.000Đ", R.drawable.image6));
        lstMnCollection.add(new MenuCollection(2,"Phá cỗ Trung Thu, giảm tới 888.000Đ", R.drawable.image7));
        lstMnCollection.add(new MenuCollection(3,"Phá cỗ Trung Thu, giảm tới 888.000Đ", R.drawable.image8));
        lstMnCollection.add(new MenuCollection(4,"Phá cỗ Trung Thu, giảm tới 888.000Đ", R.drawable.image9));

    }

    private void onClickToNextActivity() {
        srView.setOnClickListener(onClickToSearchFood());
        txtShowAll.setOnClickListener(onClickToShowAllCollection());
        txtShowAllDeliciousFood.setOnClickListener(clickToShowAllDeliciosFood());
    }

    private void slideShowAuto() {
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.image, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image5, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
        imageSlider2.setImageList(slideModels, ScaleTypes.FIT);
    }

    private void listDeliciosFood() {
        lstMnDeliciosFood = new ArrayList<>();

        lstMnDeliciosFood.add(new MenuDeliciosFood(1,"Phá cỗ Trung Thu, giảm tới 888.000Đ", R.drawable.image6));
        lstMnDeliciosFood.add(new MenuDeliciosFood(1,"Phá cỗ Trung Thu, giảm tới 888.000Đ", R.drawable.image6));
        lstMnDeliciosFood.add(new MenuDeliciosFood(1,"Phá cỗ Trung Thu, giảm tới 888.000Đ", R.drawable.image6));
        lstMnDeliciosFood.add(new MenuDeliciosFood(1,"Phá cỗ Trung Thu, giảm tới 888.000Đ", R.drawable.image6));
        lstMnDeliciosFood.add(new MenuDeliciosFood(1,"Phá cỗ Trung Thu, giảm tới 888.000Đ", R.drawable.image6));

    }

    private void listFoodWeekend() {
        lstMnFoodWeekend = new ArrayList<>();

        lstMnFoodWeekend.add(new MenuFoodWeekend(1,R.drawable.image5, "Phá cỗ Trung Thu, giảm tới 888.000Đ"));
        lstMnFoodWeekend.add(new MenuFoodWeekend(1,R.drawable.image5, "Phá cỗ Trung Thu, giảm tới 888.000Đ"));
        lstMnFoodWeekend.add(new MenuFoodWeekend(1,R.drawable.image5, "Phá cỗ Trung Thu, giảm tới 888.000Đ"));
        lstMnFoodWeekend.add(new MenuFoodWeekend(1,R.drawable.image5, "Phá cỗ Trung Thu, giảm tới 888.000Đ"));
        lstMnFoodWeekend.add(new MenuFoodWeekend(1,R.drawable.image5, "Phá cỗ Trung Thu, giảm tới 888.000Đ"));
        lstMnFoodWeekend.add(new MenuFoodWeekend(1,R.drawable.image5, "Phá cỗ Trung Thu, giảm tới 888.000Đ"));
        lstMnFoodWeekend.add(new MenuFoodWeekend(1,R.drawable.image5, "Phá cỗ Trung Thu, giảm tới 888.000Đ"));
    }

    @NonNull
    private View.OnClickListener onClickToSearchFood() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), SearchFood.class);
                startActivity(i);
            }
        };
    }

    @NonNull
    private View.OnClickListener onClickToShowAllCollection() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
    }

    @NonNull
    private View.OnClickListener clickToShowAllDeliciosFood() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
    }
}