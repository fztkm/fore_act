package com.fztkm.fore_act.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fztkm.fore_act.domain.TaskCategory


@Composable
fun TaskCategoryButton(
    text: String,
    selected: Boolean,
    onClick: () -> Unit,
    shape: Shape,
    modifier: Modifier = Modifier
){
    Button(onClick = {},
        shape = shape,
        colors = if (selected) ButtonDefaults.buttonColors() else ButtonDefaults.outlinedButtonColors(),
        border = if (selected) null else ButtonDefaults.outlinedButtonBorder,
        modifier = modifier
    ) {
        Text(text)
    }
}


@Composable
fun TaskCategorySwitch(modifier: Modifier = Modifier){
    val selectedCategory = remember { mutableStateOf(TaskCategory.TIME_BOUND) }

    Row(){
        TaskCategoryButton(
            text = "Time-bound",
            selected = selectedCategory.value == TaskCategory.TIME_BOUND,
            onClick = { selectedCategory.value = TaskCategory.TIME_BOUND },
            shape = RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp),
            modifier = Modifier.weight(1f)
        )
        TaskCategoryButton(
            text = "On-the-day",
            selected = selectedCategory.value == TaskCategory.ON_THE_DAY,
            onClick = { selectedCategory.value = TaskCategory.ON_THE_DAY },
            shape = RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp),
            modifier = Modifier.weight(1f),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTaskCategorySwitch(){
    TaskCategorySwitch()
}