package com.utcc.momandkit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    private val FeedFrag = feedFragment()
    private val FollowFrag = followFragment()
    private val OtherFrag = otherFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment : Fragment = feedFragment()

        val transaction2 = supportFragmentManager.beginTransaction()
        transaction2.replace(R.id.frameLayout,fragment,"MyAdapter")



        replaceFragment(FeedFrag)
        val buttonNav = findViewById<BottomNavigationView>(R.id.btnNavigation2)
        buttonNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_feed -> replaceFragment(FeedFrag)
                R.id.nav_follow -> replaceFragment(FollowFrag)
                R.id.nav_other -> replaceFragment(OtherFrag)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout,fragment,"main_fragment")
        transaction.commit()
    }



}