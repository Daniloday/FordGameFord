package com.missclick.fordgame.information

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Enty::class], version = 3)
abstract class DDatabase : RoomDatabase(){
    abstract fun dao() : DDao
}