package com.example.mad_ticketing_app

import MenuFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mad_ticketing_app.databinding.FragmentCancelledEventsBinding
import com.example.mad_ticketing_app.databinding.FragmentPastEventsBinding

class PastEventsFragment : Fragment() {

    private var _binding: FragmentCancelledEventsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCancelledEventsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Setup your menu buttons and other views here
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}