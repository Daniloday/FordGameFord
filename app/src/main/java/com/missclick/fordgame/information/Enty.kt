package com.missclick.fordgame.information

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "room")
data class Enty(
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    var id : Int? = null,

    @ColumnInfo(name = "action")
    var score : String
)
