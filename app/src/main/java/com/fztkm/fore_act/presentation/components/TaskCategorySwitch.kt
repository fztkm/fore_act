package com.fztkm.fore_act.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fztkm.fore_act.domain.TaskCategory


@Composable
fun TaskCategorySwitch(modifier: Modifier = Modifier){
    val selectedCategory = remember { mutableStateOf(TaskCategory.TIME_BOUND) }

    Row(){
        Button(onClick = {}, shape = RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp)) {
            Text("Time-bound")
        }
        Button(onClick = {}, shape = RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp)) {
            Text("On-the-day")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTaskCategorySwitch(){
    TaskCategorySwitch()
}