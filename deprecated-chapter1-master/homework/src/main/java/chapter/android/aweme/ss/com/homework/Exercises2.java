package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.ViewGroup;
/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {
    private TextView mytest;
    private TextView mytest2;
    private Button mybutton1;
    private Button mybutton2;
    private ViewGroup ROOT;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        mytest=findViewById(R.id.textView2);
        mytest2=findViewById(R.id.textView7);
        mybutton1=findViewById(R.id.button);
        mybutton2=findViewById(R.id.button2);
        ROOT=findViewById(R.id.text2);
        int a=getViewCount(ROOT);
        mytest.setText(" "+a);
    }

    public static int getViewCount(View view) {
        //todo 补全你的代码
            int viewCount = 0;
            if (view instanceof ViewGroup) {
                viewCount++;
                ViewGroup vp = (ViewGroup) view;
                for (int i = 0; i < vp.getChildCount(); i++) {
                    View viewchild = vp.getChildAt(i);
                    if (viewchild instanceof ViewGroup) {
                        viewCount += getViewCount(viewchild);
                    } else {
                        viewCount++;
                    }
                }
            }
            return viewCount;
    }
}
