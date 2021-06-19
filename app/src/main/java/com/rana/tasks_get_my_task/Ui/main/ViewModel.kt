package com.rana.tasks_get_my_task.Ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import arrow.core.Either
import androidx.lifecycle.viewModelScope
import com.rana.tasks_get_my_task.data.remote.datasource.ITaskRemoteDataSource

class ViewModel(
    private val remoteDataSource: ITaskRemoteDataSource,
) : ViewModel() {
    private val _stateLiveData: MutableLiveData<HomeState> = MutableLiveData(HomeState.Loading)
    val stateLiveData: LiveData<HomeState> = _stateLiveData

    init {
        viewModelScope.launch {
            when (val jobsResult = remoteDataSource.fetch()) {
                is Either.Left -> _stateLiveData.value = HomeState.Error(jobsResult.a ?: "")
                is Either.Right -> _stateLiveData.value = HomeState.Success(jobsResult.b)
            }
        }
    }

}