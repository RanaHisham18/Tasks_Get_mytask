package com.rana.tasks_get_my_task.data.remote.service

import com.rana.tasks_get_my_task.Ui.main.TaskData
import retrofit2.http.GET

interface TaskService {
    @GET("Tasks\u200B/GetMyTasks")
    suspend fun fetchTaskData(): List<TaskData>
}


