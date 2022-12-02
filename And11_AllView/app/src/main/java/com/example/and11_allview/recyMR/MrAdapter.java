package com.example.and11_allview.recyMR;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;
import com.example.and11_allview.recylerMelon.MelonDTO;

import java.util.ArrayList;

public class MrAdapter extends RecyclerView.Adapter<MrAdapter.ViewHolder>{

    LayoutInflater inflater;
    ArrayList<MelonDTO> list;

    public MrAdapter(LayoutInflater inflater, ArrayList<MelonDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // item 붙이기
        View v = inflater.inflate(R.layout.item_recy_melon, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        //필드
        public ViewHolder(@NonNull View v) {
            super(v);

        }
    }
}
