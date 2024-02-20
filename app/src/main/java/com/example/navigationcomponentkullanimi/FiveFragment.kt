package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentkullanimi.databinding.FragmentFiveBinding
import com.example.navigationcomponentkullanimi.databinding.FragmentThirdBinding


class FiveFragment : Fragment() {
    private lateinit var binding: FragmentFiveBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFiveBinding.inflate(inflater, container, false)


        binding.buttonXx.setOnClickListener{
            val gecis= FiveFragmentDirections.Gerigecis(mesaj = "Y sayfasına Hosgeldiniz" )
            Navigation.findNavController(it).navigate(gecis)
        }
        // Inflate the layout for this fragment
        return binding.root
    }

    }
