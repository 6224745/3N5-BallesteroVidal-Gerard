package com.example.formative

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.formative.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    private lateinit var adapter: Adapter
    private val items: MutableList<Liste> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i("ALLO", "Yooooooo ")
        setupRecycler()
        fillRecycler()
    }
    private fun setupRecycler() {
        adapter = Adapter() // Créer l'adapteur
        binding.rvMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
    }
    private fun fillRecycler() {
        val album = listOf(
            Liste(id = 1, name = "Android 1.1", objet = "Petit Four"),
            Liste(id = 2, name = "Android 1.5", objet = "Cupcake"),
            Liste(id = 3, name = "Android 2.0", objet = "Eclair"),
            Liste(id = 4, name = "Android 3.0", objet = "Honeycamb"),
            Liste(id = 5, name = "JauAndroid 4.0", objet = "Ice cream sandwich"),
            Liste(id = 6, name = "JauAndroid 5.0", objet = "Lollipop"))
        items.addAll(album)
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}