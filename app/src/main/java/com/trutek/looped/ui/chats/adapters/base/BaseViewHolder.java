package com.trutek.looped.ui.chats.adapters.base;

import android.view.View;

public class BaseViewHolder<V> extends BaseClickListenerViewHolder<V> {

    @SuppressWarnings("unchecked")
    public BaseViewHolder(BaseRecyclerViewAdapter adapter, View view) {
        super(adapter, adapter.onRecycleItemClickListener, view);
    }
}