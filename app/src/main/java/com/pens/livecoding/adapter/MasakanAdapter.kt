package com.pens.livecoding.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pens.livecoding.databinding.ItemRowsBinding
import com.pens.livecoding.model.Masakan
import com.pens.livecoding.ui.DetailActivity

class MasakanAdapter(private val masakanList: List<Masakan>):
    RecyclerView.Adapter<MasakanAdapter.MasakanViewHolder>() {
    inner class MasakanViewHolder(private val binding: ItemRowsBinding):
        RecyclerView.ViewHolder(binding.root) {
            fun bind(data: Masakan){
                binding.apply {
                    imgMeal.setImageResource(data.imgMasakan)
                    tvJudul.text = data.namaMasakan
                    tvDaerah.text = data.daerah

                    binding.cardMeal.setOnClickListener(){
                        val intent =Intent(cardMeal.context, DetailActivity::class.java)
                        intent.putExtra(DetailActivity.EXTRA_MASAKAN, data)
                        cardMeal.context.startActivity(intent)
                    }
                }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MasakanViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val rowBinding = ItemRowsBinding.inflate(layoutInflater, parent, false)
        return MasakanViewHolder(rowBinding)
    }

    override fun getItemCount(): Int {
        return masakanList.size
    }

    override fun onBindViewHolder(holder: MasakanViewHolder, position: Int) {
        return holder.bind(masakanList[position])
    }
}