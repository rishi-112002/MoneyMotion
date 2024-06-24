package com.example.motionmoney.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.motionmoney.components.NormalText


@Composable
fun MoneyMotionApp(){
    Surface(modifier = Modifier.fillMaxSize() , color = Color.White) {
NormalText(value = "hey there")
    }
}
