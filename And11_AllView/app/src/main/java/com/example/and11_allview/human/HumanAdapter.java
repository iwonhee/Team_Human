package com.example.and11_allview.human;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.DetailActivity;
import com.example.and11_allview.MainActivity;
import com.example.and11_allview.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class HumanAdapter extends RecyclerView.Adapter<HumanAdapter.ViewHolder>{
    LayoutInflater inflater;
    ArrayList<HumanDTO> list;
    Context context;

    public HumanAdapter(LayoutInflater inflater, ArrayList<HumanDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 아이템 붙이기 ( 수정 필요 )
        View v = inflater.inflate(R.layout.item_humanf_recv, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        //각각의 아이템에 다른 이미지,테스트 적용
        h.iv_product.setImageResource(list.get(i).iv_product);
        h.tv_title.setText(list.get(i).getTv_title());
        h.tv_intro.setText(list.get(i).getTv_intro());

        String number = list.get(i).getTv_price();
        double amount = Double.parseDouble(number);
        DecimalFormat formatter = new DecimalFormat("#,###");
        String formatted = formatter.format(amount);

        h.tv_price.setText(formatted+"원");

        //클릭 이벤트
        h.lin_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("title", list.get(i).getTv_title());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    // 포지션이 꼬여서 데이터 통제가 안되는 문제 해결법
    @Override
    public long getItemId(int i){
        return i;
    }
    @Override
    public int getItemViewType(int i){
        return i;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //아이템 필드
        ImageView iv_product;
        TextView tv_title, tv_intro, tv_price;
        LinearLayout lin_item;
        public ViewHolder(@NonNull View v) {
            super(v);
            iv_product = v.findViewById(R.id.iv_product);
            tv_title = v.findViewById(R.id.tv_title);
            tv_intro = v.findViewById(R.id.tv_intro);
            tv_price = v.findViewById(R.id.tv_price);
            lin_item = v.findViewById(R.id.lin_item);
        }
    }
}
