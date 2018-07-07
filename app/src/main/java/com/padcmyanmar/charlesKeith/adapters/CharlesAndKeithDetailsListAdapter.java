package com.padcmyanmar.charlesKeith.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.charlesKeith.R;
import com.padcmyanmar.charlesKeith.data.vos.NewProductsVO;
import com.padcmyanmar.charlesKeith.viewHolders.CharlesAndKeithDetailsListViewHolder;

import java.util.ArrayList;
import java.util.List;

public class CharlesAndKeithDetailsListAdapter extends RecyclerView.Adapter<CharlesAndKeithDetailsListViewHolder> {
    private List<NewProductsVO> mNewProductsList;


    public CharlesAndKeithDetailsListAdapter() {

        mNewProductsList = new ArrayList<>();
    }

    @NonNull
    @Override
    public CharlesAndKeithDetailsListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_holder_charles_and_keith_details_list,
                parent, false);
        return new CharlesAndKeithDetailsListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CharlesAndKeithDetailsListViewHolder holder, int position) {


    }


    @Override
    public int getItemCount() {
        return 7;
    }


}
