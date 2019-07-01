package chapter.android.aweme.ss.com.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class talk extends AppCompatActivity {
    private TextView mytest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk);
        Bundle bundle1=this.getIntent().getExtras();
        int i=bundle1.getInt("num");
        mytest=findViewById(R.id.textViewtalk);
        mytest.setText("聊天号码"+(i+1));
    }
}
