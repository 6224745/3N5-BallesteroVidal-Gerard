package org.ballestero

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.ballestero.Models.Album
import org.ballestero.databinding.AlbumDetailBinding

class AlbumActivity : AppCompatActivity() {
    private  lateinit var binding: AlbumDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AlbumDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val albumName = intent.getStringExtra("AlbumName")
        val artistName = intent.getStringExtra("ArtistName")
        binding.AlbumName.text = albumName
        binding.ArtistName.text = artistName
    }
}