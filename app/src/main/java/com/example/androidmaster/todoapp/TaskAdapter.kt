package com.example.androidmaster.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmaster.R

class TaskAdapter(private val tasks:List<Task>) : RecyclerView.Adapter<TaskViewsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task, parent, false)
        return TaskViewsHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewsHolder, position: Int) {
        holder.render(tasks[position])
    }

    override fun getItemCount() = tasks.size
}