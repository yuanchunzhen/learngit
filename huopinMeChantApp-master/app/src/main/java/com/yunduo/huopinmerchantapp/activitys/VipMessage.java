package com.yunduo.huopinmerchantapp.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.yunduo.huopinmerchantapp.MainActivity;
import com.yunduo.huopinmerchantapp.R;

/**
 * Created by Administrator on 2016/12/1 0001.
 */
public class VipMessage extends AppCompatActivity {
    private ImageButton back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vip_message);
        initView();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(VipMessage.this, MainActivity.class);
//                intent.putExtra("number",2);
//                startActivity(intent);
                finish();
            }
        });
    }
    private void initView(){
        back= (ImageButton) findViewById(R.id.back);
    }
}
