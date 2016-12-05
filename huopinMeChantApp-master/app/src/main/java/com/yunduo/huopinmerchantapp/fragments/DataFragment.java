package com.yunduo.huopinmerchantapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yunduo.huopinmerchantapp.R;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class DataFragment extends Fragment {
    public  DataFragment(){
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_data,container,false);
        return view;
    }
}
