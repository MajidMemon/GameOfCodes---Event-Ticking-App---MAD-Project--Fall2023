package com.example.mad_ticketing_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class EventAdapter(private val events: List<Event>) :
    RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.card_image)
        val eventNameTextView: TextView = itemView.findViewById(R.id.eventTitle)
        val dateTextView: TextView = itemView.findViewById(R.id.eventDate)
        val monthTextView: TextView = itemView.findViewById(R.id.eventMonth)
        val locationTextView: TextView = itemView.findViewById(R.id.eventLocation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.event_card, parent, false)
        return EventViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val event = events[position]
        holder.imageView.setImageResource(event.imageResource)
        holder.eventNameTextView.text = event.eventName
        holder.dateTextView.text = "${event.date}"
        holder.monthTextView.text = event.month
        holder.locationTextView.text = event.location
    }

    override fun getItemCount(): Int {
        return events.size
    }
}