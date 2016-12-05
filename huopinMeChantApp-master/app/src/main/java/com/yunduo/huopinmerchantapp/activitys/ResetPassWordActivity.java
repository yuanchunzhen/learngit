package com.yunduo.huopinmerchantapp.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.yunduo.huopinmerchantapp.R;
import com.yunduo.huopinmerchantapp.customviews.CustomEdit;

/**
 * Created by Administrator on 2016/10/25 0025.
 */
public class ResetPassWordActivity extends AppCompatActivity {
    private CustomEdit mUser_et;
    private CustomEdit mPwd_et;
    private CustomEdit mNew_userpwd_et;
    private CustomEdit mResetPwd_et;
    private Button mButton;
    private ImageButton backImage_btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_password_activity);
        initView();
        mUser_et.setTextView("   账号 :");
        mPwd_et.setTextView("   原密码 :");
        mNew_userpwd_et.setTextView("   新密码 :");
        mResetPwd_et.setTextView("   确认新密码 :");
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ResetPassWordActivity.this,LogActivity.class);
                startActivity(intent);
                finish();
            }
        });
        backImage_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ResetPassWordActivity.this,LogActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void initView(){
        mUser_et= (CustomEdit) findViewById(R.id.username_et);
        mPwd_et= (CustomEdit) findViewById(R.id.userpwd_et);
        mNew_userpwd_et= (CustomEdit) findViewById(R.id.new_userpwd_et);
        mResetPwd_et= (CustomEdit) findViewById(R.id.reset_userpwd_et);
        mButton= (Button) findViewById(R.id.log_btn);
        backImage_btn= (ImageButton) findViewById(R.id.back);
    }
}
