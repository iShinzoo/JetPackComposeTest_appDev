package com.example.jetpackcomposetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetest.ui.theme.JetPackComposeTestTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}

//@Composable
//@Preview
//fun Greeting() {
//    Text(
//        text = "Hello Krishna",
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        color = Color.Blue,
//        modifier = Modifier.background(Color.Green)
//            .fillMaxWidth() // to set width as a match parent
//            .fillMaxHeight() // to set height as match parent
//            .padding(start = 20.dp,top = 20.dp)
//            //.fillMaxSize()   to set height and width as a match parent
//    )
//}

//@Composable
//@Preview
//fun Greeting() {
//    Row (
//        modifier = Modifier.fillMaxSize()
//            .background(Color.Cyan),
//        horizontalArrangement = Arrangement.SpaceAround,
//       verticalAlignment = Alignment.CenterVertically
//    ){
//        Text(
//            text = "Hello",
//            fontSize = 30.sp,
//            fontWeight = FontWeight.Bold,
//            color = Color.Blue,
//        )
//        Text(
//            text = "Krick",
//            fontSize = 30.sp,
//            fontWeight = FontWeight.Bold,
//            color = Color.Blue,
//        )
//        Text(
//            text = "Crazy",
//            fontSize = 30.sp,
//            fontWeight = FontWeight.Bold,
//            color = Color.Blue,
//        )
//    }
//}
//@Composable
//@Preview
//fun Greeting() {
//    Column(
//        modifier = Modifier.fillMaxSize()
//            .background(Color.Cyan),
//        verticalArrangement = Arrangement.SpaceAround,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ){
//        Text(
//            text = "Hello",
//            fontSize = 30.sp,
//            fontWeight = FontWeight.Bold,
//            color = Color.Blue,
//        )
//        Text(
//            text = "Krick",
//            fontSize = 30.sp,
//            fontWeight = FontWeight.Bold,
//            color = Color.Blue,
//        )
//        Text(
//            text = "Crazy",
//            fontSize = 30.sp,
//            fontWeight = FontWeight.Bold,
//            color = Color.Blue,
//        )
//    }
//}

@Composable
@Preview
fun Greeting() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan),
        contentAlignment = Alignment.TopEnd
    ){
        Box(modifier = Modifier.size(200.dp, 400.dp)
            .background(Color.Green),
            contentAlignment = Alignment.Center
        ){
            Box(modifier = Modifier.size(100.dp, 200.dp)
                .background(Color.Red)
            )
        }
    }
}
