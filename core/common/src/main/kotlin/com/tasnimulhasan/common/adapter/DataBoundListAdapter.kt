package com.tasnimulhasan.common.adapter

import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding

abstract class DataBoundListAdapter<T,V : ViewBinding>(
    diffCallback: DiffUtil.ItemCallback<T>
 ) : ListAdapter<T, DataBoundViewHolder<V>>(diffCallback){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataBoundViewHolder<V> {
        val binding = createBinding(parent)
        return DataBoundViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DataBoundViewHolder<V>, position: Int) {

        bind(holder.binding, getItem(position), position)
    }

    protected abstract fun createBinding(parent: ViewGroup): V
    protected abstract fun bind(binding: V, item: T, position: Int)
}

