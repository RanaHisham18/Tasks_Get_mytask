package com.rana.tasks_get_my_task.data.remote.datasource

import arrow.core.Either
import com.rana.tasks_get_my_task.Ui.main.TaskData
import com.rana.tasks_get_my_task.data.remote.service.TaskService

class TaskRemoteDataSource(get: Any) : ITaskRemoteDataSource {
    private val service: TaskService
    ) : ITaskRemoteDataSource {

    override suspend fun fetch(): Either<String?, List<TaskData>> {
        TODO("Not yet implemented")return try {
            val list = service.fetchTaskData().mapNotNull {
//a missing line here(I cant handle it)
            }
            Either.right(list)
        } catch (e: Exception) {
            Either.left(e.message)
        }
    }
    }
}



