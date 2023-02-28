package com.pens.livecoding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.pens.livecoding.adapter.MasakanAdapter
import com.pens.livecoding.databinding.ActivityMainBinding
import com.pens.livecoding.model.masakanList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.apply {
            title = "Masakan Indonesia"
        }

        val masakanAdapter = MasakanAdapter(masakanList)

        binding.rvMasakan.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = masakanAdapter
        }
    }
}