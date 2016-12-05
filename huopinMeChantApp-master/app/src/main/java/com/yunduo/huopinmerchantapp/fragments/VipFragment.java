package com.yunduo.huopinmerchantapp.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.yunduo.huopinmerchantapp.R;
import com.yunduo.huopinmerchantapp.activitys.LogActivity;
import com.yunduo.huopinmerchantapp.activitys.VipMain;
import com.yunduo.huopinmerchantapp.activitys.VipMessage;

/**
 * 会员
 */
public class VipFragment extends Fragment {

private Button textView1,textView2,textView3;
    public VipFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_vip, container, false);
        textView1= (Button) view.findViewById(R.id.text_mod);
        textView2= (Button) view.findViewById(R.id.text_message);
        textView3= (Button) view.findViewById(R.id.text_card);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent0=new Intent(getActivity(), VipMain.class);
                getActivity().startActivity(intent0);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(getActivity(), VipMessage.class);
                getActivity().startActivity(intent2);
               // Intent intent=new Intent(getActivity(),)
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return view;
    }

}
