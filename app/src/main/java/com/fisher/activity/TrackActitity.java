package com.fisher.activity;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.fisher.R;

public class TrackActitity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        initView();

    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        setSupportActionBar(toolbar);
        //显示左上角的返回按钮
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //不使用左下角的大标题
        //通常有Tablayout的话就不用大标题了
        collapsingToolbarLayout.setTitleEnabled(false);

        //        设置一些recyclerView的内容
        //        List<String> strings = new ArrayList<>();
        //        for (int i = 0; i < 20; i++) {
        //            strings.add(i + "");
        //        }
        //        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //        recyclerView.setLayoutManager(linearLayoutManager);
        //        recyclerView.setHasFixedSize(true);
        //        ListAdapter mAdapter = new ListAdapter(strings);
        //        recyclerView.setAdapter(mAdapter);

    }

}