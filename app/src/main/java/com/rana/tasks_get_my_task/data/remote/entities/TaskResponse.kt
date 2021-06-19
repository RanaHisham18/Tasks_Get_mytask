package com.rana.tasks_get_my_task.data.remote.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class TaskResponse {

    val taskStateId: Int? = null
    val priority: Int? = null
    val taskRepeatedPeriod: Int? = null
    val taskGroupId: Int? = null
    val taskId: Int? = null
    val creatorId: Int? = null
    val percentage: Int? = null
    val rate: Int? = null
    val isApproved: Boolean? = null
    val isRepeated: Boolean? = null
    val startDate: String? = null
    val endDate: String? = null
    val title: String? = null
    val creatorname: String? = null
    val creatorProfilePicture: String? = null
}