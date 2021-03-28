package com.missclick.fordgame.ui.GameThree

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.missclick.fordgame.repository.IFordRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GameThreeViewModel(private val repository: IFordRepository) : ViewModel() {

    fun sign(id : Int){
        viewModelScope.launch(Dispatchers.IO){
            repository.getById(id)
        }
    }

}