package com.yunduo.huopinmerchantapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;

import com.yunduo.huopinmerchantapp.activitys.BaseActivity;
import com.yunduo.huopinmerchantapp.fragments.DataFragment;
import com.yunduo.huopinmerchantapp.fragments.FormFragment;
import com.yunduo.huopinmerchantapp.fragments.MyFragment;
import com.yunduo.huopinmerchantapp.fragments.ShopFragment;
import com.yunduo.huopinmerchantapp.fragments.VipFragment;

public class MainActivity extends BaseActivity {

    private Fragment[] fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFragments(savedInstanceState);

    }

    /**
     * 初始化  Fragment
     */
    private void initFragments(Bundle savedInstanceState) {
        //  检查横竖屏切换的时候，这个数组对象和内部元素是否置空
        fragments = new Fragment[5];
        FragmentManager manager = getSupportFragmentManager();
        if(savedInstanceState !=null){
            // 代表Activity重新创建，内部的Fragment会自动添加
            int len = fragments.length;

            for (int i = 0; i < len; i++) {
                fragments[i] = manager.findFragmentByTag("f" + i);
            }
        }else{
            fragments[0] = new ShopFragment();
            fragments[1] = new VipFragment();
            fragments[2] = new FormFragment();
            fragments[3] = new DataFragment();
            fragments[4] = new MyFragment();
            // 采用 hide 和 show 的形式,进行的处理  添加
            // 采用 hide 和 show 的形式,进行的处理  添加
            addFrgTrsion(manager,fragments);
        }
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.main_radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //点击状态  修改
                hideAndShowFragments(group,checkedId);
            }
        });
    }

    private void hideAndShowFragments(RadioGroup group, int checkedId) {
        int index=0;
        //Intent intent=getIntent();
        int number=getIntent().getIntExtra("number",0);
        switch (number){
            case 1:
                index = 0;
                break;
            case 2:
                index=1;
                break;
            case 3:
                index=2;
                break;
            case 4:
                index=3;
                break;
            case 5:
                index=4;
                break;
        }
        switch (checkedId) {
            case R.id.main_shop:
                index = 0;
                break;
            case R.id.main_vip:
                index = 1;
                break;
            case R.id.main_form:
                index = 2;
                break;
            case R.id.main_data:
                index = 3;
                break;
            case R.id.main_my:
                index = 4;
                break;
        }
        int length = fragments.length;
        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        for (int i = 0; i < length; i++) {
            if (i == index) {
                tx.show(fragments[i]);
            } else {
                tx.hide(fragments[i]);
            }
        }
        tx.commit();
    }


    private void addFrgTrsion(android.support.v4.app.FragmentManager manager, Fragment[] fragments) {
        FragmentTransaction tx = manager.beginTransaction();
        int length = fragments.length;
        for (int i = 0; i < length; i++) {
            // 添加Fragment，并且指定Tag，利用 Tag，在Activity重新创建的时候
            // 进行恢复，查找
            tx.add(R.id.main_fragment_container, fragments[i], "f" + i);
            tx.hide(fragments[i]);
        }
        tx.show(fragments[0]);
        tx.commit();
    }
}
