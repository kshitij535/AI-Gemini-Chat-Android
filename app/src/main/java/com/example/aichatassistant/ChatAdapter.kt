package com.example.aichatassistant

import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter(private val list: List<Message>) :
    RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {

    class ChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val messageText: TextView = itemView.findViewById(R.id.messageText)
        val container: LinearLayout = itemView.findViewById(R.id.messageContainer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_message, parent, false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val msg = list[position]
        holder.messageText.text = msg.text

        val params = holder.messageText.layoutParams as LinearLayout.LayoutParams
        if (msg.isUser) {
            holder.container.gravity = Gravity.END
            holder.messageText.setBackgroundResource(android.R.color.holo_blue_light)
        } else {
            holder.container.gravity = Gravity.START
            holder.messageText.setBackgroundResource(android.R.color.darker_gray)
        }
        holder.messageText.layoutParams = params
    }

    override fun getItemCount(): Int = list.size
}