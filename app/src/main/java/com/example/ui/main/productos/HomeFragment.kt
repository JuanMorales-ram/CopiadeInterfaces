package com.example.ui.main.productos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ui.R


class HomeFragment : Fragment() {
   private val listaProductos = listOf(
           Product("Camisa Casual", "Camisa echa 100%", 19.99, R.drawable.camisa_basica),
           Product("Rompevientos Negro", "Rompevientos para salir, tela antifluido", 29.99, R.drawable.rompevientos_negro),
           Product("Saco Tejido Gris", "Saco pesado echo en lana", 39.99, R.drawable.saco_tejido),
           Product("Pantalon Negro Cargo", "Pantalon ancho cargo", 30.99, R.drawable.cargo_negro),
   )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_productos)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerView.adapter = ProductoAdapter(listaProductos)
        return view
    }




}