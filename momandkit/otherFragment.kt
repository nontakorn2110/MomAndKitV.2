package com.utcc.momandkit

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.content.Intent
import com.utcc.momandkit.databinding.FragmentOtherBinding


class otherFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = FragmentOtherBinding.inflate(layoutInflater)
//        val imgButtonFood = v.findViewById<ImageButton>(R.id.img_btnfood)
//        val imgButtonVaccine = v.findViewById<ImageButton>(R.id.img_btnvaccine)
//        val imgButtonCaution = v.findViewById<ImageButton>(R.id.img_btncaution)

//        imgButtonVaccine

        v.imgBtnfood.setOnClickListener {
            val intentToVaccine = Intent(this@otherFragment.context,Food::class.java)
            startActivity(intentToVaccine)
        }

        v.imgBtnvaccine.setOnClickListener {
            val intentToVaccine = Intent(this@otherFragment.context,MainActivity2::class.java)
            startActivity(intentToVaccine)
        }
        return v.root
    }

}