package com.example.androidmaster.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmaster.R

class CategoriesAdapter(private val categories:List<TaskCategory>, private val onItemSelected:(Int) -> Unit):RecyclerView.Adapter<CategoriesViewsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false)
        return CategoriesViewsHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriesViewsHolder, position: Int) {
        holder.render(categories[position], onItemSelected)
    }

    override fun getItemCount() = categories.size
}