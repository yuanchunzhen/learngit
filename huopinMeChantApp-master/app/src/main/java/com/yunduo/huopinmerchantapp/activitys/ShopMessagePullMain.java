package com.yunduo.huopinmerchantapp.activitys;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.yunduo.huopinmerchantapp.R;

/**
 * Created by Administrator on 2016/10/15 0015.
 */
public class ShopMessagePullMain extends AppCompatActivity {
    private ImageButton back;
    private Button activity_btn;
    private ListView listView;
    private SimpleAdapter simpleAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_message_pull_main);
        initView();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShopMessagePullMain.this,ShopMain.class);
                startActivity(intent);
                finish();
            }
        });
        activity_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShopMessagePullMain.this,ShopMessagePull.class);
                startActivity(intent);
                finish();
            }
        });
//        simpleAdapter=new SimpleAdapter(this,data,R.layout.shop_message_pull_main_item, R.id.item_image,R.id.item_text);
//        listView.setAdapter(simpleAdapter);
//        ImageView imageView = (ImageView) findViewById(R.id.item_image);
//            Intent intent=getIntent();
//        if(intent !=null)
//        {
//            byte [] bis=intent.getByteArrayExtra("bitmap");
//            Bitmap bitmap= BitmapFactory.decodeByteArray(bis, 0, bis.length);
//            imageView.setImageBitmap(bitmap);
//        }
    }
    private void initView(){
        back= (ImageButton) findViewById(R.id.back);
        activity_btn= (Button) findViewById(R.id.shop_activity);
        listView= (ListView) findViewById(R.id.listView);
    }
}
