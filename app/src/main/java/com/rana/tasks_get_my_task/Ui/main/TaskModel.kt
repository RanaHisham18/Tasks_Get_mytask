package com.rana.tasks_get_my_task.Ui.main

sealed class HomeState {
    object Loading : HomeState()
    data class Error(val errorMessage: String) : HomeState()
    data class Success(val jobsList: List<TaskData>) : HomeState() }

data class TaskData(
    val taskStateId: Int? = null,
    val priority: Int? = null,
    val taskRepeatedPeriod: Int? = null,
    val taskGroupId: Int? = null,
    val taskId: Int? = null,
    val creatorId: Int? = null,
    val percentage: Int? = null,
    val rate: Int? = null,
    val isApproved: Boolean? = null,
    val isRepeated: Boolean? = null,
    val startDate: String? = null,
    val endDate: String? = null,
    val title: String? = null,
    val creatorname: String? = null,
    val creatorProfilePicture: String? = null
)