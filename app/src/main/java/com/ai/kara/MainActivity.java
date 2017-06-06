package com.ai.kara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.ai.kara.adapter.Adapter;
import com.ai.kara.domain.Data;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler_view;
    private List<Data> mList = new ArrayList<>();
    private Adapter mAdapter = new Adapter(MainActivity.this,mList);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initView() {
        recycler_view = (RecyclerView) findViewById(R.id.recycler_view);
        recycler_view.setLayoutManager(new StaggeredGridLayoutManager(5,StaggeredGridLayoutManager.HORIZONTAL));
        recycler_view.setAdapter(mAdapter);
        SpacesItemDecoration decoration=new SpacesItemDecoration(16);
        recycler_view.addItemDecoration(decoration);
    }

    private void initData() {
        for(int x = 0;x < 6;x++){
            Data mData = new Data();
            mData.setContent("内容:"+x);
            mList.add(mData);
        }

    }
}
