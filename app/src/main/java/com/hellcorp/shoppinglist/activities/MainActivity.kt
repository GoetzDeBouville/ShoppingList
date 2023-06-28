package com.hellcorp.shoppinglist.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hellcorp.shoppinglist.fragments.FragmentManager
import com.hellcorp.shoppinglist.fragments.NoteFragment
import com.hellcorp_studio.shoppinglist.R
import com.hellcorp_studio.shoppinglist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setBottomNavListener()
    }

    private fun setBottomNavListener() {
        binding.bNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.settings -> {
                    Log.e("Settings onclick", "Settings")
                }
                R.id.notes -> {
                    FragmentManager.setFragment(NoteFragment.newInstance(), this)
                }
                R.id.shop_list -> {
                    Log.e("shop_list onclick", "shop_list")
                }
                R.id.new_item -> {
                    Log.e("new_item onclick", "new_item")
                }
            }
            true
        }
    }
}