package com.fztkm.fore_act.presentation.components

import androidx.compose.foundation.layout.Arrangement
import android.graphics.Color as AndroidColor
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fztkm.fore_act.domain.TaskGroup
import com.fztkm.fore_act.domain.sampleTaskGroup

@Composable
fun TaskGroupCard(
    taskGroup: TaskGroup,
    modifier: Modifier = Modifier
){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(AndroidColor.parseColor(taskGroup.color))
        ),
        modifier = modifier.height(45.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxHeight().fillMaxWidth().padding(8.dp, 6.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(taskGroup.title,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.Top))
            Text(taskGroup.emoji,
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.Bottom)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTaskGroupCard(){
    TaskGroupCard(taskGroup = sampleTaskGroup, modifier = Modifier.width(200.dp))
}