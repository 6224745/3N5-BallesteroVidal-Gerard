package com.example.formative

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.formative.databinding.MonItemBinding

class Adapter : ListAdapter<Liste, Adapter.MonItemViewHolder>(MonItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout mon_item.xml
    inner class MonItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Liste) {
            binding.tvName.text = item.name // On affiche l'élément dans le TextView
            binding.tvObjet.text = item.objet
            binding.root.setOnClickListener {
                val intent = Intent(binding.root.context, ListActivity::class.java)
                intent.putExtra("Name", item.name)
                intent.putExtra("Objet", item.objet)
                binding.root.context.startActivity(intent)
            }
            //binding.btDelete.setOnClickListener {
            //    val liste = currentList.toMutableList()
                // Trouver index de l'éléments
            //    val index = liste.indexOf(item)
                // suppriemer
            //    liste.removeAt(index)
            //    submitList(liste)
            //}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonItemViewHolder {
        val binding: MonItemBinding = MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MonItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MonItemViewHolder, position: Int) {
        val album = getItem(position)
        holder.bind(album)
    }


}

object MonItemDiffCallback : DiffUtil.ItemCallback<Liste>() {
    override fun areItemsTheSame(oldItem: Liste, newItem: Liste): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Liste, newItem: Liste): Boolean {
        return oldItem.id == newItem.id &&
                return oldItem.name == newItem.name &&
                        return oldItem.objet == newItem.objet
    }
}