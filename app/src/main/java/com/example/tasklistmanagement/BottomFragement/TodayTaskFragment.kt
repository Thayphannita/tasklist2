package com.example.tasklistmanagement.BottomFragement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.tasklistmanagement.R
import com.example.tasklistmanagement.ui.home.HomeViewModel


class TodayTaskFragment : Fragment() {

    private lateinit var todayViewModel: TodayViewModel

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        todayViewModel =
//            ViewModelProviders.of(this).get(TodayViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_today_task, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home)
//        todayViewModel.text.observe(this, Observer {
//            textView.text = it
//        })

        // Inflate the layout for this fragment
       return inflater.inflate(R.layout.fragment_today_task, container, false)

    }

}