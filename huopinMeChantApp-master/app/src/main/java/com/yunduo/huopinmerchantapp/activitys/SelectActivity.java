package com.yunduo.huopinmerchantapp.activitys;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.yunduo.huopinmerchantapp.R;
import com.yunduo.huopinmerchantapp.fragments.FragmentDrawerOne;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class SelectActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private DrawerLayout drawerLayout;
    private ListView listView;
    private List<String> list;
    private ArrayAdapter<String> adapter;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private String title;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_activity);

        title= (String) getTitle();
        initView();

        list=new ArrayList<>();
        list.add("餐饮");
        list.add("丽人");
        list.add("休闲娱乐");
        list.add("生活服务");
        list.add("电商购物");
        list.add("运动健身");
        list.add("酒店");
        list.add("旅游");
        list.add("教育培训");
        list.add("购物");
        list.add("会议宴会");
        list.add("结婚");
        list.add("亲子");
        list.add("爱车");
        list.add("医疗");
        list.add("家装");
        list.add("K歌");
        list.add("电影");
        list.add("宠物");
        list.add("其他");

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.drawable.zuqiu,R.string.drawer_open,R.string.drawer_close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
//                getActionBar().setTitle("请选择");
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
//                getActionBar().setTitle(title);
            }
        };

        drawerLayout.setDrawerListener(actionBarDrawerToggle);

    }

    private void initView(){
        drawerLayout= (DrawerLayout) findViewById(R.id.drawer_layout);
        listView= (ListView) findViewById(R.id.left_drawer);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        Fragment fragment1=new FragmentDrawerOne();
        Bundle bundle=new Bundle();
        bundle.putString("text",list.get(position));
        fragment1.setArguments(bundle);
        android.app.FragmentManager fragmentManager=getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frame,fragment1).commit();
        Intent intent=new Intent(SelectActivity.this,PassWordActivity.class);
        startActivity(intent);
        finish();
        drawerLayout.closeDrawer(listView);
    }
}
