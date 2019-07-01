package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.List;
import java.util.ArrayList;
import android.widget.ArrayAdapter;


/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity implements View.OnClickListener{
    private Button mybutton1;
    private Button mybutton2;
    private Button mybutton3;
    private Button mybutton4;
    private ViewGroup G1;
    private ListView G2;
    private List<listway> myBeanList = new ArrayList<>();
    private Context context;
    private List<String> list=null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        mybutton1=findViewById(R.id.Button1);
        mybutton2=findViewById(R.id.Button2);
        mybutton3=findViewById(R.id.Button3);
        mybutton4=findViewById(R.id.Button4);
        G1=findViewById(R.id.header);
        G2=findViewById(R.id.rv_list);
        mybutton1.setOnClickListener(this);
        mybutton2.setOnClickListener(this);
        mybutton3.setOnClickListener(this);
        mybutton4.setOnClickListener(this);
        init();
        myadpat adapter = new myadpat(this,R.layout.mytest,myBeanList);
        G2.setAdapter(adapter);
        G2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle = new Bundle();
                bundle.putInt("num", position);
                Intent intent = new Intent();
                intent.putExtras(bundle);
                intent.setClass(Exercises3.this, talk.class);
                startActivity(intent);
                }
        });
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Button1:
                startActivity(new Intent(this, button1.class));
                break;
            case R.id.Button2:
                startActivity(new Intent(this, button2.class));
                break;
            case R.id.Button3:
                startActivity(new Intent(this, button3.class));
                break;
            case R.id.Button4:
                startActivity(new Intent(this, button4.class));
                break;
        }
    }

    private void init(){
        listway bean1 = new listway("a1",R.mipmap.ic_launcher);
        myBeanList.add(bean1);

        listway bean2 = new listway("a2",R.mipmap.ic_launcher);
        myBeanList.add(bean2);

        listway bean3 = new listway("a3",R.mipmap.ic_launcher);
        myBeanList.add(bean3);

        listway bean4 = new listway("a4",R.mipmap.ic_launcher);
        myBeanList.add(bean4);

        listway bean5 = new listway("a5",R.mipmap.ic_launcher);
        myBeanList.add(bean5);

        listway bean6 = new listway("a6",R.mipmap.ic_launcher);
        myBeanList.add(bean6);

        listway bean7 = new listway("a7",R.mipmap.ic_launcher);
        myBeanList.add(bean7);

        listway bean8 = new listway("a8",R.mipmap.ic_launcher);
        myBeanList.add(bean8);

        listway bean9 = new listway("a9",R.mipmap.ic_launcher);
        myBeanList.add(bean9);
    }



}
