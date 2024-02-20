package com.example.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var  binding :FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        //binding.textViewAnasayfa.text="Merhaba"
        binding.buttonDetay2.setOnClickListener{
            val gecis= AnasayfaFragmentDirections.detayGecis(mesaj = "A sayfasına Hosgeldiniz" )
            Navigation.findNavController(it).navigate(gecis)
        }

        binding.buttonX.setOnClickListener{
            val gecis= AnasayfaFragmentDirections.detayGecis(mesaj = "X sayfasına hosgeldiniz" )
            Navigation.findNavController(it).navigate(gecis)
        }

            // Inflate the layout for this fragment
        return binding.root
    }

}
