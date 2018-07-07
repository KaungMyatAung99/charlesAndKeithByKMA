package com.padcmyanmar.charlesKeith.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toolbar;

import com.padcmyanmar.charlesKeith.R;
import com.padcmyanmar.charlesKeith.adapters.CharlesAndKeithDetailsListAdapter;
import com.padcmyanmar.charlesKeith.adapters.CharlesAndKeithShowNextItemsListAdapter;

public class CharlesAndKeithDetailsListActivity extends BaseActivity {
    private CharlesAndKeithDetailsListAdapter mcharlesAndKeithDetailsListAdapter;
    private CharlesAndKeithShowNextItemsListAdapter charlesAndKeithShowNextItemsListAdapter;

    /* @BindView(R.id.iv_shoe_show_one)
      ImageView ivShoeShowOne;
  */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charles_and_keith_details_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setActionBar(toolbar);

     /*  ButterKnife.bind(this, this);

        int productsId = getIntent().getIntExtra(NewProductsConstants.PRODUCT_ID, 1);
        Log.d("CharlesAndKeithDetails", "productsId : " + productsId);*/


        RecyclerView rvDetailsList = findViewById(R.id.rv_charles_and_keith_details_list);
        mcharlesAndKeithDetailsListAdapter = new CharlesAndKeithDetailsListAdapter();
        rvDetailsList.setAdapter(mcharlesAndKeithDetailsListAdapter);
        rvDetailsList.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));

        RecyclerView rvShowNextItems = findViewById(R.id.rv_charles_and_keith_next_items_list);
        charlesAndKeithShowNextItemsListAdapter = new CharlesAndKeithShowNextItemsListAdapter();
        rvShowNextItems.setAdapter(charlesAndKeithShowNextItemsListAdapter);
        rvShowNextItems.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.HORIZONTAL, false));


   /*    NewProductsVO newProducts = NewProductsModel.getObjInstance().getNewProductsById(productsId);
        bindData(newProducts);*/


    }


 /*   private void bindData(NewProductsVO newProducts) {
        Glide.with(ivShoeShowOne.getContext())
                .load(newProducts.getProductImage())
                .into(ivShoeShowOne);

    }*/
}
