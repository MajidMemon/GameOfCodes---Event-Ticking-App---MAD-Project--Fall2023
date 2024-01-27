package com.example.mad_ticketing_app


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mad_ticketing_app.databinding.ActivityUserEventsBinding




data class Event(val imageResource: Int, val eventName: String, val price: Int, val date: Int, val month: String, val location: String)

class UserEvents : AppCompatActivity() {

    private lateinit var binding: ActivityUserEventsBinding

    private val homeFragment = HomeFragment()
    private val eventsFragment = EventsFragment()
    private val favoritesFragment = FavoritesFragment()

    private val fragmentManager = supportFragmentManager
    private var activeFragment: Fragment = homeFragment


//    OnCreate method




    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        val recyclerView = findViewById<RecyclerView>(R.id.eventCardRecycler)

        super.onCreate(savedInstanceState)
        binding = ActivityUserEventsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigationView = binding.bottomNavigationView

        val addeventbtn = findViewById<Button>(R.id.addeventbutton)
        addeventbtn.setOnClickListener {
            val intent = Intent(this, Activity_add_event::class.java)
            startActivity(intent)
        }
        // Set up the item selection listener
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    switchFragment(homeFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.events -> {
                    switchFragment(eventsFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.favorites -> {
                    switchFragment(favoritesFragment)
                    return@setOnItemSelectedListener true
                }
                else -> false
            }
        }

//        Recycler View for Events
        val events = ArrayList<Event>()

        events.add(Event(R.layout.event_card, "Event 1", 50, 25, "May", "Location 1"))


        // Initialize the RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this)


        // Create the adapter and set it to the RecyclerView

        val adapter = EventAdapter(events)

        recyclerView.adapter = adapter


    }

    private fun switchFragment(targetFragment: Fragment) {
        fragmentManager.beginTransaction().hide(activeFragment).show(targetFragment).commit()
        activeFragment = targetFragment
    }
}
