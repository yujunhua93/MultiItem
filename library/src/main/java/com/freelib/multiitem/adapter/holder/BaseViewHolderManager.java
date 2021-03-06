package com.freelib.multiitem.adapter.holder;

import android.view.ViewGroup;

import com.freelib.multiitem.adapter.holder.BaseViewHolder;
import com.freelib.multiitem.adapter.holder.ViewHolderManager;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

/**
 * ViewHolder鐨勭®＄悊绫伙紝榛樿®ら噰鐢▄@link BaseViewHolder}鐨勫疄鐜°
 * <p>
 * Created by free46000 on 2017/3/16.
 */
public abstract class BaseViewHolderManager<T> extends ViewHolderManager<T, BaseViewHolder> {
    @Override
    public abstract void onBindViewHolder(BaseViewHolder holder, T t);

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent) {
        BaseViewHolder viewHolder = new BaseViewHolder(getItemView(parent));
        onCreateViewHolder(viewHolder);
        return viewHolder;
    }

    /**
     * {@link #onCreateViewHolder}
     */
    protected void onCreateViewHolder(@NonNull BaseViewHolder holder) {
    }

}