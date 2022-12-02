package com.example.and11_allview.human;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class HumanAdapter extends RecyclerView.Adapter<HumanAdapter.ViewHolder>{
    LayoutInflater inflater;
    ArrayList<HumanDTO> list;

    public HumanAdapter(LayoutInflater inflater, ArrayList<HumanDTO> list) {
        this.inflater = inflater;
        this.list = list;
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
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    // 포지션이 꼬여서 데이터 통제가 안되는 문제 해결법
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public int getItemViewType(int position){
        return position;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //아이템 필드
        ImageView iv_product;
        TextView tv_title, tv_intro, tv_price;
        public ViewHolder(@NonNull View v) {
            super(v);
            iv_product = v.findViewById(R.id.iv_product);
            tv_title = v.findViewById(R.id.tv_title);
            tv_intro = v.findViewById(R.id.tv_intro);
            tv_price = v.findViewById(R.id.tv_price);
        }
    }
}
