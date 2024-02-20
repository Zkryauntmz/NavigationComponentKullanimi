package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentkullanimi.databinding.FragmentDetayBinding
import com.example.navigationcomponentkullanimi.databinding.FragmentFourBinding


class FourFragment : Fragment() {
    private  lateinit var binding: FragmentFourBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFourBinding.inflate(inflater, container, false)
        val bundle : FourFragmentArgs by navArgs() // delegate

        binding.textViewY.text="${bundle.mesaj} "

        binding.buttonY.setOnClickListener{
            val gecis= FourFragmentDirections.gecisY(mesaj = "Y sayfasına Hosgeldiniz")
            Navigation.findNavController(it).navigate(gecis)
        }


        // Inflate the layout for this fragment
        return binding.root
    }

}