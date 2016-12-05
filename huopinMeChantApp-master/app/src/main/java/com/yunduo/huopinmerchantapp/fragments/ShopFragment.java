package com.yunduo.huopinmerchantapp.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.yunduo.huopinmerchantapp.R;
import com.yunduo.huopinmerchantapp.activitys.LogActivity;
import com.yunduo.huopinmerchantapp.activitys.SelectActivity;
import com.yunduo.huopinmerchantapp.activitys.ShopMain;

/**
 * 商铺
 */
public class ShopFragment extends Fragment {

    private Button shopBtn;
    public ShopFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_shop, container, false);
        shopBtn= (Button) view.findViewById(R.id.shop_btn);
        shopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), LogActivity.class);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }

}
