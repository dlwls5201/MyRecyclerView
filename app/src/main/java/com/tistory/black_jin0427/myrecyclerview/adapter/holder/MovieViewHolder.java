package com.tistory.black_jin0427.myrecyclerview.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class MovieViewHolder<ITEM> extends RecyclerView.ViewHolder {

    public MovieViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void onBindView(ITEM item);

}
