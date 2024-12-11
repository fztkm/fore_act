package com.fztkm.fore_act.domain


data class TaskGroup(
    val id: Int,
    val emoji: String,
    val title: String,
    val color: String,
    val description: String,
    val tasks: List<Task>,
)

val sampleTaskGroup = TaskGroup(
    id = 1,
    emoji = "🥳",
    title = "ProjectX",
    color = "#FF40d1cc",
    description = "This is a sample task group.",
    tasks = listOf(sampleTask, sampleTask, sampleTask)
)