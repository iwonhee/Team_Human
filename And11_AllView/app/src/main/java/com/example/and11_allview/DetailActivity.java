package com.example.and11_allview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.and11_allview.human.HumanFragment;

public class DetailActivity extends AppCompatActivity {
    Button btn_return_main, btn_return_list;
    TextView tv_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btn_return_list = findViewById(R.id.btn_return_list);
        btn_return_main = findViewById(R.id.btn_return_main);
        tv_title  = findViewById(R.id.tv_title);

        Intent i = getIntent();
        String title = i.getStringExtra("title");
        tv_title.setText(title + "(을)를 선택했습니다");

        //메인화면으로 돌아가기
        btn_return_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //목록으로 돌아가기
        btn_return_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new HumanFragment()).commit();
            }
        });

    }
}