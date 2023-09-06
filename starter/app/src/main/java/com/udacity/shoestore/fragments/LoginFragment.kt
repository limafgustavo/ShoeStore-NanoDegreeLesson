package com.udacity.shoestore.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.databinding.FragmentWelcomeBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        binding.apply {
            textSignupLink.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.wecomeFragment)
            }
            buttonLogin.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.wecomeFragment)
            }
        }

        // Inflate the layout for this fragment
        return binding.root
    }


}
