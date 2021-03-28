package com.missclick.fordgame.ui.gameOne

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.missclick.fordgame.repository.IFordRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GameOneViewModel(private val repository: IFordRepository) : ViewModel() {

    fun conversation(){
        viewModelScope.launch(Dispatchers.IO){
            repository.getAll()
        }
    }
}