package com.example.drivedrop.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Blob
import java.util.Date

@Entity
data class Car (
    @PrimaryKey(autoGenerate = false)
    val carId: String,
    //reference to ownerID
    val time : Date,
    val startLocation : String,
    val destination : String,
    val carDetails : String,
    val pictures : List<Blob>,
    val ratings : String,
)