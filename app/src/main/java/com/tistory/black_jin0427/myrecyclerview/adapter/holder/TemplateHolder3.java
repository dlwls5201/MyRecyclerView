package com.tistory.black_jin0427.myrecyclerview.adapter.holder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tistory.black_jin0427.myrecyclerview.R;
import com.tistory.black_jin0427.myrecyclerview.model.Movie;

public class TemplateHolder3 extends MovieViewHolder {

    private Context mContext;
    private ImageView ivMovie;

    public TemplateHolder3(View itemView) {
        super(itemView);

        mContext = itemView.getContext();

        ivMovie = itemView.findViewById(R.id.iv_item_movie);
    }

    @Override
    public void onBindView(Object object) {

        Movie item = (Movie) object;

        Glide.with(mContext)
                .load(item.getUrl())
                .into(ivMovie);
    }

    public static TemplateHolder3 newInstance(ViewGroup parent) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_holder_3, parent, false);
        return new TemplateHolder3(itemView);

    }
}
