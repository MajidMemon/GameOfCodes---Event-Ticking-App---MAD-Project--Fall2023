package com.example.mad_ticketing_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class EventsFragment : Fragment() {

    private lateinit var upcomingEventsButton: Button
    private lateinit var pastEventsButton: Button
    private lateinit var cancelledEventsButton: Button

    private lateinit var upcomingFragment: UpcomingEventsFragment
    private lateinit var pastFragment: PastEventsFragment
    private lateinit var cancelledFragment: CancelledEventsFragment

    private var currentFragment: Fragment? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_upcoming_events, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        upcomingFragment = UpcomingEventsFragment()
        pastFragment = PastEventsFragment()
        cancelledFragment = CancelledEventsFragment()

        upcomingEventsButton = view.findViewById(R.id.upcomingEvents)
        pastEventsButton = view.findViewById(R.id.pastEvents)
        cancelledEventsButton = view.findViewById(R.id.cancelledEvents)

        // Set the initial fragment to Upcoming
        replaceFragment(upcomingFragment)
        updateButtonStyles(upcomingEventsButton)

        // Set click listeners for buttons
        upcomingEventsButton.setOnClickListener {
            replaceFragment(upcomingFragment)
            updateButtonStyles(it)
        }

        pastEventsButton.setOnClickListener {
            replaceFragment(pastFragment)
            updateButtonStyles(it)
        }

        cancelledEventsButton.setOnClickListener {
            replaceFragment(cancelledFragment)
            updateButtonStyles(it)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        childFragmentManager.beginTransaction().apply {
            // Hide the currently displayed fragment
            currentFragment?.let {
                hide(it)
            }
            // Check if the fragment is added, and add it if not
            if (!fragment.isAdded) {
                add(R.id.fragment_container, fragment)
            }
            // Show the selected fragment
            show(fragment)
            commit()
        }
        currentFragment = fragment
    }


    private fun updateButtonStyles(selectedButton: View) {
        val buttons = listOf(upcomingEventsButton, pastEventsButton, cancelledEventsButton)
        buttons.forEach { button ->
            if (button.id == selectedButton.id) {
                button.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.accentRed))
                button.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
            } else {
                button.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.backgroundGrey))
                button.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
            }
        }
    }
}
