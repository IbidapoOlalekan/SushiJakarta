package com.example.introtocompose

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import android.text.Layout
import androidx.compose.animation.AnimatedContentScope.SlideDirection.Companion.Start
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Start
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign.Companion.Start
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.introtocompose.ui.theme.Sushi

@Composable
@Preview(showBackground = true)
fun BookingHome(){
   Column(
           modifier = Modifier
               .fillMaxSize()
               .background(color = Sushi)
               .padding(10.dp))

   {
       Text(text = "SUSHI", fontFamily = FontFamily.SansSerif)
       Spacer(modifier = Modifier.height(20.dp))
       Image(painter = painterResource(id = R.drawable.sushi), contentDescription = "sushi",
       Modifier.size(520.dp,520.dp))
       Spacer(modifier = Modifier.height(20.dp))


   }
}


//@SuppressLint("ComposableNaming")
//@Preview(showBackground = true)
//@Composable
//fun previewBookingHome(){
//    BookingHome()
//}