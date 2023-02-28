package com.pens.livecoding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pens.livecoding.R
import com.pens.livecoding.databinding.ActivityDetailBinding
import com.pens.livecoding.model.Masakan

class DetailActivity : AppCompatActivity() {
    private  lateinit var  binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.apply {
            title = "Detail Masakan"
            setDisplayHomeAsUpEnabled(true)
        }

        val masakan = intent.getParcelableExtra<Masakan>(EXTRA_MASAKAN)

        binding.apply {
            tvJudul.text = masakan?.namaMasakan
            tvArea.text = masakan?.daerah
            tvDeskripsiDetail.text = masakan?.description
            if (masakan != null) {
                imgMeal.setImageResource(masakan.imgMasakan)
            }


        }
    }

    companion object{
        const val EXTRA_MASAKAN = "masakan"
    }
}