package com.yunduo.huopinmerchantapp.activitys;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.yunduo.huopinmerchantapp.R;
import com.yunduo.huopinmerchantapp.utils.Const;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2016/10/15 0015.
 */
public class ShopMessagePull extends AppCompatActivity {
    private ImageButton back;
    private Button add_picture_btn,submit_btn;
    private Intent intent;
    private ImageView imageView;
    private static final String path = "/sdcard/" + Const.TEMP_PHOTO_PATH;
    private String resultPath = Environment.getExternalStorageDirectory().getPath()+"/"+System.currentTimeMillis()+".jpg";
    private Uri uri = Uri.parse(path);
    private Uri fianlUri;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_message_pull);
        initView();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopMessagePull.this, ShopMessagePullMain.class);
                startActivity(intent);
                finish();
            }
        });
        add_picture_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] items = new String[]{"从手机选择", "拍照", "取消"};
                AlertDialog.Builder Dialog = new AlertDialog.Builder(ShopMessagePull.this);

                Dialog.setCancelable(true).setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                intent = new Intent(Intent.ACTION_PICK);
                                //打开相册
                                intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
                                startActivityForResult(intent, Const.CODE_ALBUM_FORREQUEST);
                                break;
                            case 1:
                                takePhoto();
                                break;
                            case 2:
                                dialog.dismiss();
                                break;
                        }
                    }
                }).create().show();
            }
        });

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShopMessagePull.this,ShopMessagePullMain.class);
//                Bitmap bmp=((BitmapDrawable)imageView.getDrawable()).getBitmap();
//                ByteArrayOutputStream baos=new ByteArrayOutputStream();
//                bmp.compress(Bitmap.CompressFormat.PNG, 100, baos);
//                byte [] bitmapByte =baos.toByteArray();
//                intent.putExtra("bitmap", bitmapByte);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        back = (ImageButton) findViewById(R.id.back);
        add_picture_btn = (Button) findViewById(R.id.add_picture);
        imageView= (ImageView) findViewById(R.id.imageView);
        submit_btn= (Button) findViewById(R.id.shop_activity);
    }

    public void takePhoto() {
        //打开照相机拍照
        intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, Const.CODE_CAMERA_FORREQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Uri resultUri;
        File file = new File(resultPath);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        resultUri = Uri.fromFile(file);
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            switch (requestCode) {
                case Const.CODE_ALBUM_FORREQUEST:
                   imageView.setImageURI(data.getData());
                    fianlUri = data.getData();
                    cropPhoto(fianlUri, resultUri,260, 360, Const.CODE_CROP_OK);
                    break;
                case Const.CODE_CAMERA_FORREQUEST:
                   imageView.setImageBitmap((Bitmap)data.getParcelableExtra("data"));
                    fianlUri = uri;
                    break;
                case Const.CODE_CROP_OK:
                    imageView.setImageURI(resultUri);
                    break;
            }
        }
//        Bitmap bmp=((BitmapDrawable)order_con_pic.getDrawable()).getBitmap();
//        Intent intent=new Intent(OrderConfirm.this,ShowWebImageActivity.class);
//        ByteArrayOutputStream baos=new ByteArrayOutputStream();
//        bmp.compress(Bitmap.CompressFormat.PNG, 100, baos);
//        byte [] bitmapByte =baos.toByteArray();
//        intent.putExtra("bitmap", bitmapByte);
//        startActivity(intent);

//        imageView = (ZoomableImageView) findViewById(R.id.show_webimage_imageview);
//        Intent intent=getIntent();
//        if(intent !=null)
//        {
//            byte [] bis=intent.getByteArrayExtra("bitmap");
//            Bitmap bitmap=BitmapFactory.decodeByteArray(bis, 0, bis.length);
//            imageView.setImageBitmap(bitmap);
//        }
    }
    //裁剪照片
    public void cropPhoto(Uri uri, Uri resultUri ,int outputx, int outputy, int requestCode) {
        //隐式打开系统裁剪图片的功能
        intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", true);
        intent.putExtra("aspectX", 2);
        intent.putExtra("aspectY", 3);
        intent.putExtra("outputX", outputx);
        intent.putExtra("outputY", outputy);
        intent.putExtra("scale", true);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, resultUri);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        startActivityForResult(intent, requestCode);
    }
}
