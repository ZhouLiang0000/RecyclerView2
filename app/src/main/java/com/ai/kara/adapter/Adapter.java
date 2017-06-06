package com.ai.kara.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ai.kara.R;
import com.ai.kara.domain.Data;

import java.util.List;

/**
 * Created by zhouliang on 2017/6/6.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.mViewHolder> {
    private List<Data> mList;
    private Context mContext;
    public Adapter(Context context,List<Data> data) {
        this.mList = data;
        this.mContext = context;
    }

    @Override
    public void onBindViewHolder(mViewHolder holder, int position) {
        holder.mImageView.setImageResource(R.mipmap.ic_launcher);
        holder.mTextView.setText(mList.get(position).getContent());
    }

    @Override
    public mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_view_item,parent,false);
        return new mViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class mViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTextView;
        public mViewHolder(View view) {
            super(view);
            mImageView = (ImageView) view.findViewById(R.id.recycler_view_item_iv);
            mTextView = (TextView) view.findViewById(R.id.recycler_view_item_tv);
        }
    }
}
