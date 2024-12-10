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
        val ListeName = intent.getStringExtra("Name")
        val ListeObjet = intent.getStringExtra("Objet")
        binding.Name.text = ListeName
        binding.Objet.text = ListeObjet
    }
}