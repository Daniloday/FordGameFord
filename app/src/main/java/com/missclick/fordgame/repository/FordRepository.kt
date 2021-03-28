package com.missclick.fordgame.repository

import com.missclick.fordgame.information.DDatabase
import com.missclick.fordgame.information.Enty

class FordRepository(private val DDatabase: DDatabase) : IFordRepository {

    override suspend fun getById(id : Int) : Enty{
        val enty = DDatabase.dao().getById(id)
        return enty
    }

    override suspend fun getAll() : List<Enty>{
        val entities = DDatabase.dao().getAll()
        return entities
    }

    override suspend fun delete(act : Enty){
        DDatabase.dao().delete(act)
    }

    override suspend fun append(act : Enty){
        DDatabase.dao().append(act)
    }

}