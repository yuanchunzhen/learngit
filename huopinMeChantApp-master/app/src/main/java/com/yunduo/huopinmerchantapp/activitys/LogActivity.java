package com.yunduo.huopinmerchantapp.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.yunduo.huopinmerchantapp.MainActivity;
import com.yunduo.huopinmerchantapp.R;
import com.yunduo.huopinmerchantapp.customviews.CustomEdit;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2016/10/25 0025.
 */
public class LogActivity extends BaseActivity implements View.OnClickListener{
    private CustomEdit mUser_et;
    private CustomEdit mPwd_et;
    private Button mLog_btn,mInsert_btn;
    private TextView mRegist_tv;
    private ImageView back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        initView();
        mLog_btn.setOnClickListener(this);
        mRegist_tv.setOnClickListener(this);
        mInsert_btn.setOnClickListener(this);
        mUser_et.setTextView("   账号 :");
        mPwd_et.setTextView("   密码 :");
    }


    protected void initView() {
        back= (ImageView) findViewById(R.id.back);
        mUser_et = (CustomEdit) findViewById(R.id.username_et);
        mPwd_et = (CustomEdit) findViewById(R.id.userpwd_et);
//        mUser_et.getEditText().setInputType(InputType.TYPE_CLASS_TEXT);
        mLog_btn = (Button) findViewById(R.id.log_btn);
        mRegist_tv = (TextView) findViewById(R.id.register_tv);
        mInsert_btn= (Button) findViewById(R.id.insert);
    }


@Override
public void onClick(View view) {

    switch (view.getId()){
        case R.id.log_btn:
            Intent intent1=new Intent(LogActivity.this,ShopMain.class);
            startActivity(intent1);
            finish();
            break;
        case R.id.register_tv:
            Intent intent2=new Intent(LogActivity.this,ResetPassWordActivity.class);
            startActivity(intent2);
            finish();
            break;
        case R.id.insert:
            Intent intent3=new Intent(LogActivity.this,SelectActivity.class);
            startActivity(intent3);
            finish();
            break;
    }
}
}
