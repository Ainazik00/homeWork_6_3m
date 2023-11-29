package com.example.homework_6_3m

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val dataList = listOf(
            Person("John Doe", "https://cdn-icons-png.flaticon.com/512/3135/3135768.png"),
            Person("Jane Smith", "https://cdn-icons-png.flaticon.com/512/3135/3135823.png"),
            Person("Janna Johnson", "https://cdn-icons-png.flaticon.com/512/3170/3170753.png"),
            Person("Benjamin Wilson", "https://cdn-icons-png.flaticon.com/512/4128/4128196.png"),
            Person("Ethan Robinson", "https://cdn-icons-png.flaticon.com/512/236/236832.png"),
            Person("Isabella Brown", "https://cdn-icons-png.flaticon.com/512/6997/6997662.png"),
            Person("James Miller", "https://cdn-icons-png.flaticon.com/512/9193/9193737.png"),
            Person("Noah Murphy", "https://cdn-icons-png.flaticon.com/512/9308/9308310.png"),

        )

        val adapter = PersonAdapter(requireContext(), dataList)
        recyclerView.adapter = adapter

        return view
    }
}
