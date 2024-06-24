package com.example.motionmoney.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NormalText(value:String){
    Text(text = value, modifier = Modifier.fillMaxWidth().heightIn(min = 80.dp))

}
