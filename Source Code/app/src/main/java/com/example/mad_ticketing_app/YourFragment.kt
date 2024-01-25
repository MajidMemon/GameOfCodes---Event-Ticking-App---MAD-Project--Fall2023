package com.example.mad_ticketing_app

import android.content.res.ColorStateList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class YourFragment : Fragment() {
    private var upcomingEventsButton: Button? = null
    private var pastEventsButton: Button? = null
    private var cancelledEventsButton: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_events, container, false)

        // Initialize buttons
        upcomingEventsButton = view.findViewById(R.id.upcomingEvents)
        pastEventsButton = view.findViewById(R.id.pastEvents)
        cancelledEventsButton = view.findViewById(R.id.cancelledEvents)

        // Set initial button states
        setSelected(upcomingEventsButton)
        setUnselected(pastEventsButton)
        setUnselected(cancelledEventsButton)

        // Set click listeners for buttons
        upcomingEventsButton?.setOnClickListener { onMenuItemClick(it) }
        pastEventsButton?.setOnClickListener { onMenuItemClick(it) }
        cancelledEventsButton?.setOnClickListener { onMenuItemClick(it) }

        return view
    }

    // Handle button click events
    private fun onMenuItemClick(view: View) {
        when (view.id) {
            R.id.upcomingEvents -> {
                setSelected(upcomingEventsButton)
                setUnselected(pastEventsButton)
                setUnselected(cancelledEventsButton)
            }

            R.id.pastEvents -> {
                setSelected(pastEventsButton)
                setUnselected(upcomingEventsButton)
                setUnselected(cancelledEventsButton)
            }

            R.id.cancelledEvents -> {
                setSelected(cancelledEventsButton)
                setUnselected(upcomingEventsButton)
                setUnselected(pastEventsButton)
            }
        }
    }

    // Helper method to set a button as selected
    private fun setSelected(button: Button?) {
        button?.backgroundTintList =
            ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.accentRed))
        button?.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
    }

    // Helper method to set a button as unselected
    private fun setUnselected(button: Button?) {
        button?.backgroundTintList =
            ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.backgroundGrey))
        button?.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
    }
}
