package com.padcmyanmar.charlesKeith.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.charlesKeith.R;
import com.padcmyanmar.charlesKeith.viewHolders.CharlesAndKeithShowNextItemsListViewHolder;

public class CharlesAndKeithShowNextItemsListAdapter extends RecyclerView.Adapter<CharlesAndKeithShowNextItemsListViewHolder> {
    @NonNull
    @Override
    public CharlesAndKeithShowNextItemsListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_holder_charles_and_keith_next_items_list,
                parent, false);
        return new CharlesAndKeithShowNextItemsListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CharlesAndKeithShowNextItemsListViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 10;
    }
}
