package com.missclick.fordgame.ui.lose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.missclick.fordgame.information.Enty
import com.missclick.fordgame.repository.IFordRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoseViewModel(private val repository: IFordRepository) : ViewModel() {

    fun delete(score : String){
        viewModelScope.launch(Dispatchers.IO){
            repository.delete(Enty(id = 1,score = score))
        }
    }
}