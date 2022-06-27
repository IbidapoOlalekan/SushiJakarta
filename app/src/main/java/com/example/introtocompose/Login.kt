package com.example.introtocompose

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun login(){
    val username by remember{ mutableStateOf("")}
    val password by remember {
        mutableStateOf("")
    }
    
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = "Welcome to your app",
        fontSize = 20.sp,
        fontWeight = Bold
    )
    
    Spacer(modifier = Modifier.height(20.dp))
}

@Preview(showBackground = true)
@Composable
fun previewLogin(){
    login()
}

        