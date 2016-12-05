package com.yunduo.huopinmerchantapp.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yunduo.huopinmerchantapp.R;

/**
 * Created by Administrator on 2016/10/25 0025.
 */
public class CustomEdit extends LinearLayout {
    private TextView textView;
    private EditText editText;
    public CustomEdit(Context context) {
        this(context,null);
    }

    public CustomEdit(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CustomEdit(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //初始化
        LayoutInflater.from(context).inflate(R.layout.custom_edit,this);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        textView = (TextView) findViewById(R.id.user_tv);
        editText = (EditText) findViewById(R.id.pwd_tv);
    }
    public void setTextView(String text){
        textView.setText(text);
    }
    public EditText getEditText(){
        return editText;
    }
    public String getEditContent(){
        return editText.getText().toString();
    }
}
