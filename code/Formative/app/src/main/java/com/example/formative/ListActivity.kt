package com.example.formative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.formative.databinding.ListeDetailBinding

class ListActivity : AppCompatActivity() {
    private  lateinit var binding: ListeDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ListeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listeName = intent.getStringExtra("Name")
        val listeObjet = intent.getStringExtra("Objet")
        binding.listName.text = listeName
        binding.listObjet.text = listeObjet
    }
}