package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding
import com.example.navigationcomponentkullanimi.databinding.FragmentFourBinding
import com.example.navigationcomponentkullanimi.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
  private lateinit var binding: FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)


        binding.buttonYgit.setOnClickListener{
            val gecis= ThirdFragmentDirections.GecisYy(mesaj = "X sayfasına Hosgeldiniz" )
            Navigation.findNavController(it).navigate(gecis)
        }
        // Inflate the layout for this fragment
        return binding.root
    }


    }
