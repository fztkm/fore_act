package com.fztkm.fore_act.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fztkm.fore_act.domain.Task
import com.fztkm.fore_act.domain.sample_task
import com.fztkm.fore_act.presentation.ui.theme.Fore_actTheme

@Composable
fun TaskCard(
    task: Task
){
    Card(){
        Row(verticalAlignment = Alignment.CenterVertically){
            IconButton(onClick = {}){
                Icon(
                    Icons.Default.CheckCircle,
                    contentDescription = null,
                )
            }
            Column(modifier = Modifier.weight(1f)){
                Text(task.title, style = MaterialTheme.typography.titleMedium)

            }
            Text(task.dueDate ?: "", style = MaterialTheme.typography.bodySmall)
            IconButton(onClick = {}){
                Icon(
                    Icons.Default.Edit,
                    contentDescription = null,
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewTaskCard(){
    Fore_actTheme {
        TaskCard(task = sample_task)
    }
}