package com.sinhvien.shopeefood.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.sinhvien.shopeefood.R;
import com.sinhvien.shopeefood.UI.LoginOrRegisterActivity;

public class UserFragment extends Fragment {
    private Button btnLoginOrRegister;

    public UserFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_user, container, false);
        anhXa(v);
        clickToNextActivity();
        return v;
    }

    private void anhXa(View v) {
        btnLoginOrRegister = v.findViewById(R.id.btnLoginOrRegister);
    }

    private void clickToNextActivity() {
        btnLoginOrRegister.setOnClickListener(clickToNextLoginRegister());
    }

    @NonNull
    private View.OnClickListener clickToNextLoginRegister() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), LoginOrRegisterActivity.class);
                startActivity(i);
            }
        };
    }
}
