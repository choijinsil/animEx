package com.example.administrator.animEx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_alpha, tv_rotate;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 객체화
        tv_alpha = findViewById(R.id.tv_alpha);
        tv_rotate = findViewById(R.id.tv_rotate);


    }

    // 메뉴를 사용하기 위한것
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();    // 전개, 메뉴를 전개시켜라!
        inflater.inflate(R.menu.manu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Alpha메뉴를 클릭했을때
        if(item.getItemId()==R.id.alpha){
            //tv_alpha 실행
            anim=AnimationUtils.loadAnimation(this,R.anim.alpha);
            tv_alpha.startAnimation(anim);
        }else if(item.getItemId()==R.id.rotate){     // Rotate메뉴를 클릭했을때
            anim=AnimationUtils.loadAnimation(this,R.anim.rotate);
            tv_rotate.startAnimation(anim);
        }

//        tv_alpha.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "까꿍", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        tv_rotate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "로테이트다", Toast.LENGTH_SHORT).show();
//            }
//        });


        return super.onOptionsItemSelected(item);
    }
}
