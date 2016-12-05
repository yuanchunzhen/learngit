package com.yunduo.huopinmerchantapp.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.yunduo.huopinmerchantapp.R;

/**
 * Created by Administrator on 2016/11/8 0008.
 */
public class PassWordActivity extends AppCompatActivity {
    private ImageView back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pass_word_activity);
        initView();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PassWordActivity.this,LogActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void initView(){
        back= (ImageView) findViewById(R.id.back);
    }
}
