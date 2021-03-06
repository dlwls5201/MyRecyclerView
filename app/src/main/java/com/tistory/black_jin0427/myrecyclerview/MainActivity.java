package com.tistory.black_jin0427.myrecyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tistory.black_jin0427.myrecyclerview.adapter.MovieAdapter;
import com.tistory.black_jin0427.myrecyclerview.data.SampleData;

public class MainActivity extends AppCompatActivity {

    private MovieAdapter adapter = new MovieAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recycleView 초기화
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        //아이템 로드
        adapter.setItems(new SampleData().getItems());

    }
}
