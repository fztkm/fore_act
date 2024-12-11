package com.fztkm.fore_act.domain


enum class TaskCategory{
    TIME_BOUND,
    ON_THE_DAY;

    fun fromString(value: String): TaskCategory{
        return when(value){
            "TIME_BOUND" -> TIME_BOUND
            "ON_THE_DAY" -> ON_THE_DAY
            else -> throw IllegalArgumentException("Invalid task category: $value")
        }
    }
}

enum class TaskProgress(val value: Int){
    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10)
}

enum class TaskStatus{
    TODO,
    IN_PROGRESS,
    DONE;
    fun fromString(value: String): TaskStatus {
        return when (value) {
            "TODO" -> TODO
            "IN_PROGRESS" -> IN_PROGRESS
            "DONE" -> DONE
            else -> throw IllegalArgumentException("Invalid task status: $value")
        }
    }
}

data class Task(
    val id: Int,
    val taskGroupId: Int,
    val title: String,
    val description: String,
    val dueDate: String? = null,
    val category: TaskCategory,
    val progress: TaskProgress,
    val status: TaskStatus,
    val repeat: TaskRepeat? = null,
    val subtasks: List<Task>? = null,
)

val sampleTask = Task(
    id = 1,
    taskGroupId = 1,
    title = "Task 1",
    description = "Description 1",
    dueDate = "2024/12/24",
    category = TaskCategory.TIME_BOUND,
    progress = TaskProgress.ZERO,
    status = TaskStatus.TODO,
)
