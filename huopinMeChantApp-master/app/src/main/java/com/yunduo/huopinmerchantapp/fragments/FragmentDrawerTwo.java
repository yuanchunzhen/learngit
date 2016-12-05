package com.yunduo.huopinmerchantapp.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yunduo.huopinmerchantapp.R;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class FragmentDrawerTwo extends Fragment {
    private TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment2,container,false);
        textView= (TextView) view.findViewById(R.id.textView);
        return view;
    }
}
