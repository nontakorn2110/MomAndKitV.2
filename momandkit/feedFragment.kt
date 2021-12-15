package com.utcc.momandkit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class feedFragment : Fragment() {

    private lateinit var adapter: MyAdapter
    val data: ArrayList<Post> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_feed, container, false)
        buildDisPlay()
        initRecyclerView(view)
        return view

    }

    private fun initRecyclerView(view: View){
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = MyAdapter(data, this)
        recyclerView.adapter = adapter
    }

    private fun buildDisPlay(){
        data.add(Post(R.drawable.man,"Taro Ko",R.drawable.post1))
        data.add(Post(R.drawable.man,"Taro Ko",R.drawable.post2))
        data.add(Post(R.drawable.man,"Taro Ko",R.drawable.post3))
        data.add(Post(R.drawable.man,"Taro Ko",R.drawable.post4))
        data.add(Post(R.drawable.man,"Taro Ko",R.drawable.post5))
        data.add(Post(R.drawable.man,"Taro Ko",R.drawable.post6))
        data.add(Post(R.drawable.man,"Taro Ko",R.drawable.post7))
        data.add(Post(R.drawable.man,"Taro Ko",R.drawable.post8))
        data.add(Post(R.drawable.man,"Taro Ko",R.drawable.post9))
        data.add(Post(R.drawable.man,"Taro Ko",R.drawable.post10))
        data.add(Post(R.drawable.man,"Taro Ko",R.drawable.post11))
        data.add(Post(R.drawable.man,"Taro Ko",R.drawable.post12))
    }

}