package com.example.drivedrop

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val firstname: String,
    val lastname: String,
    val email: String,
    val password: String,
    val username: String,
    val paymentInfo: String,
    val bio: String,
)