package com.tistory.black_jin0427.myrecyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import com.tistory.black_jin0427.myrecyclerview.adapter.MovieAdapter;
import com.tistory.black_jin0427.myrecyclerview.adapter.MovieItemDecoration;
import com.tistory.black_jin0427.myrecyclerview.data.SampleData;

public class MainActivity extends AppCompatActivity {

    private MovieAdapter adapter = new MovieAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recycleView 초기화
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        //불규칙 레이아웃
        StaggeredGridLayoutManager staggeredGridLayoutManager
                = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        //그리드 레이아웃
        GridLayoutManager gridLayoutManager
                = new GridLayoutManager(this,2);

        //가로 레이아웃
        LinearLayoutManager horizonalLayoutManager
                = new LinearLayoutManager(this, LinearLayout.HORIZONTAL, false);

        //세로 레이아웃
        LinearLayoutManager linearLayoutManager
                = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);

        //아이템 데코레이셔
        recyclerView.addItemDecoration(new MovieItemDecoration(this));

        //아이템 로드
        adapter.setItems(new SampleData().getItems());

    }
}
