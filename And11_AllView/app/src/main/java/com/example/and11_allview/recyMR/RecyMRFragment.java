package com.example.and11_allview.recyMR;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and11_allview.R;
import com.example.and11_allview.recylerMelon.MelonDTO;

import java.util.ArrayList;

public class RecyMRFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recy_mr, container, false);

        RecyclerView recy_mr = v.findViewById(R.id.recy_mr);

        ArrayList<MelonDTO> list = new ArrayList<>();
        list.add(new MelonDTO("사건의 평션", "윤하", R.drawable.img1));
        list.add(new MelonDTO("FRAGILE", "LE SSERAFIM", R.drawable.img2));
        list.add(new MelonDTO("Hyper boy", "NewJeans", R.drawable.img3));
        list.add(new MelonDTO("Mxde", "(여자)아이들", R.drawable.img4));
        list.add(new MelonDTO("Before LIKE", "IVE(아이브)", R.drawable.img5));

        recy_mr.setAdapter(new MrAdapter(inflater, list));
        //리사이클러뷰 매니저
        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext(), RecyclerView.VERTICAL, false
        );
        recy_mr.setLayoutManager(manager);

        return v;
    }
}