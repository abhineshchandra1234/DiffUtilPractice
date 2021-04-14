package com.eegrab.diffutilpractice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.eegrab.diffutilpractice.databinding.FragmentFirstBinding


class FirstFragment : Fragment(R.layout.fragment_first) {

    private val myAdapter by lazy { MyAdapter() }
    private lateinit var binding: FragmentFirstBinding
    var employeeList = mutableListOf<Employee>()

    val TAG = "Main"


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentFirstBinding.bind(view)

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = myAdapter
        }

        binding.buttonSubmit.setOnClickListener {
            var employee_name = binding.editTextEmployeeName.text.toString().trim()
            var employee_id = binding.editTextEmployeeId.text.toString().trim()

            employeeList.add(Employee(employee_id,employee_name))
            Log.d(TAG, "list is $employeeList")
            val listEmployee = employeeList.toList()
            myAdapter.setData(listEmployee)
        }
    }
}