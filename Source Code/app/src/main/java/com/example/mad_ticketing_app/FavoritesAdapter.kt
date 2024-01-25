package com.example.mad_ticketing_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FavoritesAdapter(private val favoriteItems: List<FavoriteItem>) : RecyclerView.Adapter<FavoritesAdapter.FavoriteViewHolder>() {

    class FavoriteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val eventImage: ImageView = itemView.findViewById<ImageView>(R.id.favoriteEventImage)
        val eventTitle: TextView = itemView.findViewById<TextView>(R.id.favoriteEventTitle)
        val eventCategory: TextView = itemView.findViewById<TextView>(R.id.favoriteEventCategory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.favorites_card, parent, false)
        return FavoriteViewHolder(view)
    }

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        val currentItem = favoriteItems[position]
        holder.eventImage.setImageResource(currentItem.imageResource)
        holder.eventTitle.text = currentItem.eventName
        holder.eventCategory.text = currentItem.eventCategory
    }

    override fun getItemCount(): Int {
        return favoriteItems.size
    }
}