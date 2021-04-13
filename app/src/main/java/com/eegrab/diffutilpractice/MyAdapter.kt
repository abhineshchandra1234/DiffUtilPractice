package com.eegrab.diffutilpractice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eegrab.diffutilpractice.databinding.FragmentFirstBinding
import com.eegrab.diffutilpractice.databinding.RecyclerItemLayoutBinding

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private var oldEmployeeList = emptyList<Employee>()

    class MyViewHolder(val binding: RecyclerItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            RecyclerItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            textViewEmployeeId.text = oldEmployeeList[position].employee_id
            textViewEmployeeName.text = oldEmployeeList[position].employee_name
        }
    }

    override fun getItemCount(): Int {
        return oldEmployeeList.size
    }
}