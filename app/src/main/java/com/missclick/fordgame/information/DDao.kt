package com.missclick.fordgame.information

import androidx.room.*

@Dao
interface DDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun append(act: Enty)

    @Query("SELECT * FROM room WHERE id = :id")
    fun getById(id : Int) : Enty

    @Query("SELECT * FROM room")
    fun getAll() : List<Enty>

    @Delete
    fun delete(act: Enty)

}