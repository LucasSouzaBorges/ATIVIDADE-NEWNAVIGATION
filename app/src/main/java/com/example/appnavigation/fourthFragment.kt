package com.example.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

class fourthFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fourth, container, false)

        view.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fourthFragment_to_sixthFragment)
        }

        return view

    }
}