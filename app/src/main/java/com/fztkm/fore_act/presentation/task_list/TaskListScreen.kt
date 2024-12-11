package com.fztkm.fore_act.presentation.task_list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TaskListScreen(

){
    val tasks = listOf(2)
    LazyColumn{

    }
}

@Composable
@Preview(showBackground = true)
fun PreviewTaskScreen(

) {
    Surface() {
        TaskListScreen()
    }
}

