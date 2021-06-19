package com.rana.tasks_get_my_task.DI

import com.rana.tasks_get_my_task.Ui.main.ViewModel
import com.rana.tasks_get_my_task.data.remote.datasource.ITaskRemoteDataSource
import com.rana.tasks_get_my_task.data.remote.datasource.TaskRemoteDataSource
import com.rana.tasks_get_my_task.data.remote.service.TaskService
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val taskModule = module {
    viewModel { ViewModel(get()) }
    single<ITaskRemoteDataSource> { TaskRemoteDataSource(get()) }
    single { createJobsService(get()) }
}

fun createJobsService(retrofit: Retrofit): TaskService {
    return retrofit.create(TaskService::class.java) }
