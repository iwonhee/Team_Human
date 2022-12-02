package com.example.and11_allview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.and11_allview.R;
import com.example.and11_allview.human.HumanDTO;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

       Intent intent = getIntent();
        ArrayList<HumanDTO> list = (ArrayList<HumanDTO>)intent.getSerializableExtra("list");
        int position = intent.getIntExtra("position", -1);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

        tv1.append(list.get(position).getTv_title());
        tv2.append(list.get(position).getTv_intro());
        tv3.append(list.get(position).getTv_price());


    }
}