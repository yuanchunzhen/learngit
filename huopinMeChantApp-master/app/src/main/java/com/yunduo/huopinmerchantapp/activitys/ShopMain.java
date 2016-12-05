package com.yunduo.huopinmerchantapp.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.yunduo.huopinmerchantapp.MainActivity;
import com.yunduo.huopinmerchantapp.R;

/**
 * Created by Administrator on 2016/10/15 0015.
 */
public class ShopMain extends AppCompatActivity {
    private ImageButton back_btn;
    private Button shop_sumbit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_main);
        initView();
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShopMain.this, LogActivity.class);
                startActivity(intent);
                finish();
            }
        });
        shop_sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShopMain.this,ShopMessagePullMain.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void initView(){
        back_btn= (ImageButton) findViewById(R.id.back);
        shop_sumbit= (Button) findViewById(R.id.shop_sumbit);
    }
}
