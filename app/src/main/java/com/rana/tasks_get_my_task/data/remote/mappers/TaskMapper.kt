package com.rana.tasks_get_my_task.data.remote.mappers

import com.rana.tasks_get_my_task.Ui.main.TaskData
import com.rana.tasks_get_my_task.data.remote.entities.TaskResponse

fun TaskResponse.totask(): TaskData {

    return TaskData(
        taskStateId = taskStateId,
        priority = priority,
        taskRepeatedPeriod = taskRepeatedPeriod,
        taskGroupId = taskGroupId,
        taskId = taskId,
        creatorId = creatorId,
        percentage = percentage,
        rate = rate,
        isApproved = isApproved,
        isRepeated = isRepeated,
        startDate = startDate,
        endDate = endDate,
        title = title,
        creatorname = creatorname,
        creatorProfilePicture = creatorProfilePicture
    )

}