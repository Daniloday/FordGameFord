package com.missclick.fordgame.dependencies

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import com.missclick.fordgame.information.DDatabase
import com.missclick.fordgame.repository.FordRepository
import com.missclick.fordgame.repository.IFordRepository
import org.koin.dsl.module

val dataMod = module {
    single {
        repository(get())
    }
    single {
        roomDB(get())
    }
}

fun repository(database: DDatabase): IFordRepository {
    return FordRepository(database)
}

fun roomDB(context: Context) : DDatabase {
    return Room.databaseBuilder(context, DDatabase::class.java, "room")
        .fallbackToDestructiveMigration()
        .build()
}