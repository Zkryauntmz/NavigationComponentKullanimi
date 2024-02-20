package com.example.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding
import com.example.navigationcomponentkullanimi.databinding.FragmentDetayBinding
import kotlin.math.log


class DetayFragment : Fragment() {
private  lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDetayBinding.inflate(inflater, container, false)
        val bundle : DetayFragmentArgs by navArgs() // delegate

        binding.textViewDetay.text="${bundle.mesaj} "

        binding.buttonB.setOnClickListener{
            val gecis= DetayFragmentDirections.gecisB(mesaj = "B sayfasına Hosgeldiniz")
            Navigation.findNavController(it).navigate(gecis)
        }



        // Inflate the layout for this fragment
        return binding.root
    }


}