package com.financial.bala.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.financial.bala.R;

public class CollectionAdapter extends RecyclerView.Adapter {
    private final Context mContext;

    public CollectionAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.collection_adapter, parent, false);
        return new CollectionHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class CollectionHolder extends RecyclerView.ViewHolder {
        public CollectionHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
