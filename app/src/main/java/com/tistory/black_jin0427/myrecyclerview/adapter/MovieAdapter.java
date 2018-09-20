package com.tistory.black_jin0427.myrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tistory.black_jin0427.myrecyclerview.R;
import com.tistory.black_jin0427.myrecyclerview.adapter.holder.MovieViewHolder;
import com.tistory.black_jin0427.myrecyclerview.adapter.holder.TemplateHolder1;
import com.tistory.black_jin0427.myrecyclerview.adapter.holder.TemplateHolder2;
import com.tistory.black_jin0427.myrecyclerview.adapter.holder.TemplateHolder3;
import com.tistory.black_jin0427.myrecyclerview.model.Movie;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    private ArrayList<Movie> items = new ArrayList<>();

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        switch (viewType) {

            case 1: return TemplateHolder1.newInstance(parent);

            case 2: return TemplateHolder2.newInstance(parent);

            case 3: return TemplateHolder3.newInstance(parent);

            default: return TemplateHolder1.newInstance(parent);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder viewHolder, int position) {
        viewHolder.onBindView(items.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setItems(ArrayList<Movie> items) {
        this.items = items;
    }
}
