package com.sinhvien.shopeefood.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sinhvien.shopeefood.R;

public class SearchFood extends AppCompatActivity {
    private TextView txtCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_food);

        txtCancel = findViewById(R.id.txtCancel);
        clickToNextActivity();
    }

    private void clickToNextActivity() {
        txtCancel.setOnClickListener(onClickToCancelSearch());
    }

    @NonNull
    private View.OnClickListener onClickToCancelSearch() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SearchFood.this, MainActivity.class);
                startActivity(i);
            }
        };
    }
}