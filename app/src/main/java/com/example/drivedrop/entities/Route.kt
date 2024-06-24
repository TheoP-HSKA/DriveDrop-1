package com.example.drivedrop.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Blob

@Entity
data class Route (
    @PrimaryKey(autoGenerate = true)
    val routeId: Int? = null,
    //reference to driverID
    val driverId : Int,
    //reference to ownerID
    val ownerId : Int,
    val checkpointsLocation : List<String>,
    val checkpointsTime : List<String>,
    val checkpointsPicture : List<Blob>,
)