package com.example.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class FragmentFirst : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
            //inflate the layout for this fragment
            val view = inflater.inflate(R.layout.fragment_first, container, false)
            val Botao1: Button = view.findViewById(R.id.btn1)
            val Botao2: Button = view.findViewById(R.id.btn2)

            Botao1.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_fragmentFirst_to_fragmentSecond)
            }

        Botao2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentFirst_to_thirdFragment)
        }


            return view

    }
}