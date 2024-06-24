package com.example.drivedrop

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.drivedrop.entities.User

@Database(
    entities = [User::class],
    version = 1
)

abstract class UserDatabase: RoomDatabase() {

    abstract val dao : UserDAO
}