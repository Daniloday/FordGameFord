package com.missclick.fordgame.repository

import com.missclick.fordgame.information.Enty

interface IFordRepository {
    suspend fun getById(id : Int) : Enty
    suspend fun getAll() : List<Enty>
    suspend fun delete(act : Enty)
    suspend fun append(act : Enty)
}