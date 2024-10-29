package org.ballestero

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.ballestero.Adapter.MonAdapter
import org.ballestero.Models.Album
import  org.ballestero.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MonAdapter
    private val items: MutableList<Album> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i("ALLO", "Yooooooo ")
        setupRecycler()
        fillRecycler()
    }
    private fun setupRecycler() {
        adapter = MonAdapter() // Créer l'adapteur
        binding.rvMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
    }
    private fun fillRecycler() {
        val album = listOf(
            Album(id = 1, name = "Antigéographiquement", artistName = "Jérôme 50"),
            Album(id = 2, name = "J'ai Bu", artistName = "Québec"),
            Album(id = 3, name = "Darlène", artistName = "Hubert"),
            Album(id = 4, name = "jkbskjhbkcdj", artistName = "Les Louanges"),
            Album(id = 5, name = "Jaune", artistName = "hkfdygdsf"))
        items.addAll(album)
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}