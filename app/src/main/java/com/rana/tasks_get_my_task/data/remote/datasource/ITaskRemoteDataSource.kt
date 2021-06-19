package com.rana.tasks_get_my_task.data.remote.datasource
import arrow.core.Either
import com.rana.tasks_get_my_task.Ui.main.TaskData

interface ITaskRemoteDataSource {
    suspend fun fetch(): Either<String?, List<TaskData>>
}