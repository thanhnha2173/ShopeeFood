package com.sinhvien.shopeefood.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.sinhvien.shopeefood.Adapter.MenuAdapter;
import com.sinhvien.shopeefood.Adapter.MenuCollectionAdapter;
import com.sinhvien.shopeefood.Adapter.MenuDlFoodAdapter;
import com.sinhvien.shopeefood.Model.Menu;
import com.sinhvien.shopeefood.Model.MenuCollection;
import com.sinhvien.shopeefood.Model.MenuDeliciosFood;
import com.sinhvien.shopeefood.R;
import com.sinhvien.shopeefood.fragment.FavoriteFragment;
import com.sinhvien.shopeefood.fragment.HomeFragment;
import com.sinhvien.shopeefood.fragment.NotificationFragment;
import com.sinhvien.shopeefood.fragment.OrderFragment;
import com.sinhvien.shopeefood.fragment.UserFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView mnBottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mnBottom = findViewById(R.id.navBottomView);
        loadFragment(new HomeFragment());
        mnBottom.setOnItemSelectedListener(getListener());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return true;
    }

    @NonNull
    private NavigationBarView.OnItemSelectedListener getListener() {
        return item->{
            Fragment fragment;
            switch (item.getItemId()){
                case R.id.home:
                    fragment = new HomeFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.order:
                    fragment = new OrderFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.favorite:
                    fragment = new FavoriteFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.notification:
                    fragment = new NotificationFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.user_menu:
                    fragment = new UserFragment();
                    loadFragment(fragment);
                    return true;
                default:
                    return true;
            }
        };
    }
    void loadFragment(Fragment fmNew){
        FragmentTransaction fmTran = getSupportFragmentManager().beginTransaction();
        fmTran.replace(R.id.main_fragment, fmNew);
        fmTran.addToBackStack(null);
        fmTran.commit();
    }
}