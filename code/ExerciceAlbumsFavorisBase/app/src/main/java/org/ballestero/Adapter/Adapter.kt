package org.ballestero.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.ballestero.AlbumActivity
import org.ballestero.databinding.MonItemBinding
import org.ballestero.Models.Album

class MonAdapter : ListAdapter<Album, MonAdapter.MonItemViewHolder>(MonItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout mon_item.xml
    inner class MonItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Album) {
            binding.tvElement.text = item.name // On affiche l'élément dans le TextView
            binding.tvArtistName.text = item.artistName
            binding.root.setOnClickListener {
                val intent = Intent(binding.root.context, AlbumActivity::class.java)
                intent.putExtra("AlbumName", item.name)
                intent.putExtra("ArtistName", item.artistName)
                binding.root.context.startActivity(intent)
            }
            binding.btDelete.setOnClickListener {
                val liste = currentList.toMutableList()
                // Trouver index de l'éléments
                val index = liste.indexOf(item)
                // suppriemer
                liste.removeAt(index)
                submitList(liste)
            }
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

object MonItemDiffCallback : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem.id == newItem.id &&
        return oldItem.name == newItem.name &&
        return oldItem.artistName == newItem.artistName
    }
}