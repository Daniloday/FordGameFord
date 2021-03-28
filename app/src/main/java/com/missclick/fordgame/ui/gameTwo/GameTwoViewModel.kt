package com.missclick.fordgame.ui.gameTwo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.missclick.fordgame.information.Enty
import com.missclick.fordgame.repository.IFordRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GameTwoViewModel(private val repository: IFordRepository) : ViewModel() {

    fun append(score : String){
        viewModelScope.launch(Dispatchers.IO){
            repository.append(Enty(score = score))
        }
    }
}