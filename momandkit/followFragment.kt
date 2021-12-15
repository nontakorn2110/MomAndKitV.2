package com.utcc.momandkit

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.utcc.momandkit.databinding.FragmentOtherBinding


class followFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_follow, container, false)
        val btnDev = v.findViewById<Button>(R.id.btn_2)
        val btnAdd = v.findViewById<Button>(R.id.btn_1)

        btnAdd.setOnClickListener {
            val intentToAdd = Intent(this@followFragment.context,addchild::class.java)
            startActivity(intentToAdd)
        }

        btnDev.setOnClickListener {
            val intentToDev = Intent(this@followFragment.context,month1_2::class.java)
            startActivity(intentToDev)
        }

        return v
    }


}