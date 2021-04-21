package com.eegrab.diffutilpractice

import androidx.recyclerview.widget.DiffUtil

class MyDiffUtil (
    private val oldList: List<Employee>,
    private val newList: List<Employee>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].employee_id == newList[newItemPosition].employee_id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
//        return when {
//            oldList[oldItemPosition].employee_id != newList[newItemPosition].employee_id -> {
//                false
//            }
//            oldList[oldItemPosition].employee_name != newList[newItemPosition].employee_name -> {
//                false
//            }
//            else -> true
//        }
        return oldList == newList
    }

}