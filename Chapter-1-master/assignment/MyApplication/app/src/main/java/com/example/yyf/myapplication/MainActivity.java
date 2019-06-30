package com.example.yyf.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Toast;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.EditText;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;



public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button button1;
    private ImageView image_choose;
    private int i=0;
    private Switch mSwitch;
    private EditText mViewShow;
    private TextView mViewShow2;
    private RadioButton rb;
    String str1="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        class MyClick implements View.OnClickListener {
            @Override
            public void onClick(View view) {
                i++;
                button1.setText("点击了" + i + "次");
                Log.d("MainActivity","1");
            }
        }
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new MyClick());


        rb = (RadioButton) findViewById(R.id.radioButton);

        class MyClick2 implements View.OnClickListener {
            @Override
            public void onClick(View view) {
                rb.setText("allow");
                Log.d("MainActivity","right");
            }
        }
        image_choose=(ImageView) findViewById(R.id.imageView1);
        image_choose.setOnClickListener(new MyClick2());

        mSwitch = (Switch) findViewById(R.id.switch1);
        mSwitch.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // 开启switch，设置提示信息
                    mSwitch.setText("OPEN");
                    Log.d(TAG, "打开");
                } else {
                    // 关闭swtich，设置提示信息
                    mSwitch.setText("CLOSE");
                    Log.d(TAG, "关闭");
                }
            }
        });
        mViewShow = (EditText)findViewById(R.id.editText2);
        mViewShow2 = (TextView)findViewById(R.id.textView3);
        mViewShow.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    Log.i(TAG, "输入文本之前的状态");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                str1=mViewShow.getText().toString();
                Log.d(TAG, "文本显示");
                mViewShow2.setText(str1);
            }
        });





    }
}
