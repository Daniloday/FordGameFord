package com.missclick.fordgame.dependencies

import com.missclick.fordgame.ui.GameThree.GameThreeViewModel
import com.missclick.fordgame.ui.gameOne.GameOneViewModel
import com.missclick.fordgame.ui.gameTwo.GameTwoViewModel
import com.missclick.fordgame.ui.loadFragment.LoadViewModel
import com.missclick.fordgame.ui.lose.LoseViewModel
import com.missclick.fordgame.ui.old.dashboard.DashboardViewModel
import com.missclick.fordgame.ui.old.home.HomeViewModel
import com.missclick.fordgame.ui.old.notifications.NotificationsViewModel
import com.missclick.fordgame.ui.win.WinViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appMod = module {
    viewModel {
        DashboardViewModel()
    }
    viewModel {
        HomeViewModel()
    }
    viewModel {
        NotificationsViewModel()
    }
    viewModel {
        LoadViewModel(get())
    }
    viewModel {
        GameOneViewModel(get())
    }
    viewModel {
        GameTwoViewModel(get())
    }
    viewModel {
        GameThreeViewModel(get())
    }
    viewModel {
        LoseViewModel(get())
    }
    viewModel {
        WinViewModel(get())
    }
}