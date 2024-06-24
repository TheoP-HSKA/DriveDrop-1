package com.example.drivedrop

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.drivedrop.entities.User
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDAO {

    //using suspend to enable coroutines and async
    @Upsert //Updating and inserting
    suspend fun upsertUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)

    //Using Observable to ensure updates on changes
    @Query("SELECT * FROM user ORDER BY firstName ASC")
    fun getUserOrderedByFirstName(): Flow<List<User>>

    @Query("SELECT * FROM user ORDER BY email ASC")
    fun getUserOrderedByEmail(): Flow<List<User>>

    @Query("SELECT * FROM user ORDER BY userName ASC")
    fun getUserOrderedByUsername(): Flow<List<User>>
}