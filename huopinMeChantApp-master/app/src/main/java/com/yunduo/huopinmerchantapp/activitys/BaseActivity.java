package com.yunduo.huopinmerchantapp.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;

import com.yunduo.huopinmerchantapp.AppAplication;
import com.yunduo.huopinmerchantapp.ActManager;
import com.yunduo.huopinmerchantapp.utils.MyToast;

/**
 * Package_name:com.yunduo.huopinmerchantapp.activitys
 * Author:zhaoQiang
 * Email:zhao_hero@163.com
 * Date:2016/9/13  0:23
 */
public class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActManager.getActManager().addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActManager.getActManager().finishActivity(this);
    }

    //间隔时间
    private static long exectTime = 0;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK &&
                event.getAction() == KeyEvent.ACTION_DOWN){
            if((System.currentTimeMillis()-exectTime)>2000){//第一次点击
                MyToast.ToastInLow(this,"再次点击退出程序").show();
                exectTime = System.currentTimeMillis();
            }else{
                finish();
                ActManager.getActManager().AppExit();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
