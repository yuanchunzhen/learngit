package com.yunduo.huopinmerchantapp.activitys;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.yunduo.huopinmerchantapp.MainActivity;
import com.yunduo.huopinmerchantapp.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/5 0005.
 */
public class VipMain extends AppCompatActivity {
    private ImageButton back;
    private Button button;
    private FrameLayout frameLayout1,frameLayout2;
    private Button submit;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vip_main);
        initView();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(VipMain.this, MainActivity.class);
//                intent.putExtra("number",2);
//                startActivity(intent);
                finish();
            }
        });

    }
    //初始化布局
    private void initView() {
        back= (ImageButton) findViewById(R.id.back);
        button= (Button) findViewById(R.id.shop_sumbit);
        frameLayout1= (FrameLayout) findViewById(R.id.homepage_head_fl);
        frameLayout2= (FrameLayout) findViewById(R.id.homepage_head_f2);
//        mListDiscount = new ArrayList<>();
//        mListRecommend = new ArrayList<>();

        //不让listview抢焦点
       // mLvRecommend.setFocusable(false);
        //mLvDiscount.setFocusable(false);
       // getdata();

      //  moveTaskToBack(true);
       // closeContextMenu();
        //listview 条目监听
//        mLvDiscount.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
////                Intent intent = new Intent(this, GoodsDetailsActivity.class);
////                intent.putExtra("GoodsDetailsnID", mListDiscount.get(position).getCommodityId());
//               // startActivity(intent);
//            }
//        });
//
//        mLvRecommend.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
////                Intent intent = new Intent(this, GoodsDetailsActivity.class);
////                intent.putExtra("GoodsDetailsnID", mListRecommend.get(position).getCommodityId());
////                startActivity(intent);
//            }
//        });
    }

    //顶部填充viewfliper + recylerview
//    private void getdata() {
//        FragmentManager fm = getFragmentManager();
//        //开启事务
//        FragmentTransaction transaction = fm.beginTransaction();
//        Fragment hpHead = new HpHead1Fragment();
//        Fragment hpHead2 = new HpHead2Fragment();
//        //用fragment  含有viewflipper填充
//        transaction.replace(R.id.homepage_head_fl, hpHead);
//        //用fragment  含有RecylerView填充
//        transaction.replace(R.id.homepage_head_f2, hpHead2);
//        transaction.commit();
//        //okhttpUtils,get,加载
//        OkHttpUtils.get().url(Const.HPLV_URL).build().execute(new Callback<HpLvBean>() {
//            @Override
//            public HpLvBean parseNetworkResponse(okhttp3.Response response) throws Exception {
//                String str = response.body().string();
////                Log.e("str", str);
//                Gson gson = new Gson();
//                hpLvBean = new HpLvBean();
//                hpLvBean = gson.fromJson(str, HpLvBean.class);
//                return hpLvBean;
//            }

//            @Override
//            public void onError(okhttp3.Call call, Exception e) {
//                Log.e("e", e.getMessage());
//                mScrollView.setVisibility(View.INVISIBLE);
//                mRelativeLayout.setVisibility(View.VISIBLE);
//                mTextView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        mRelativeLayout.setVisibility(View.INVISIBLE);
//                        getdata();
//                    }
//                });
//
//            }
//
//            @Override
//            public void onResponse(okhttp3.Call call, HpLvBean hpLvBean) {
//                mScrollView.setVisibility(View.VISIBLE);
//                mListDiscount = hpLvBean.getResult().get(0).getCommodities();
//                Log.e("mListDiscount:", mListDiscount.size() + "");
//                mListRecommend = hpLvBean.getResult().get(1).getCommodities();
//                mLvDiscount.setAdapter(new HpLvAdapter(mListDiscount));
//                mLvRecommend.setAdapter(new HpLvAdapter(mListRecommend));
//
//                //在一个布局中使用上下两个listview，需要使用scrollView包裹LinearLayout，
//                // 将两个listview放到LinearLayout里面
//                //使用到工具类DoubleListViewUtils（需要注意，条目布局最外层必须是LinearLayout）
//                //必须在setAdapter之后使用
//                DoubleListViewUtils.setListViewHeightBasedOnChildren(mLvDiscount);
//                DoubleListViewUtils.setListViewHeightBasedOnChildren(mLvRecommend);
//            }
//
//        });
  //  }
}
