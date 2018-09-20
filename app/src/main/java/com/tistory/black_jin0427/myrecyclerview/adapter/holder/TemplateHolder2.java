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

public class TemplateHolder2 extends MovieViewHolder {

    private Context mContext;
    private ImageView ivMovie;
    private TextView tvTitle, tvContent;

    public TemplateHolder2(View itemView) {
        super(itemView);

        mContext = itemView.getContext();

        ivMovie = itemView.findViewById(R.id.iv_item_movie);

        tvTitle = itemView.findViewById(R.id.tv_item_movie_title);
        tvContent = itemView.findViewById(R.id.tv_item_movie_content);
    }

    @Override
    public void onBindView(Object object) {

        Movie item = (Movie) object;

        Glide.with(mContext)
                .load(item.getUrl())
                .into(ivMovie);

        tvTitle.setText(item.getTitle());
        tvContent.setText(item.getContent());
    }

    public static TemplateHolder2 newInstance(ViewGroup parent) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_holder_2, parent, false);
        return new TemplateHolder2(itemView);

    }
}
