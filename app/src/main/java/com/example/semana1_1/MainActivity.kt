package com.example.semana1_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                principal()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun principal() {
    LazyColumn{
        items(1){
            Column() {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp)
                ){
                    Text(text = "SUPER HEROES",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        color=Color.Blue);
                }
                /*Imagen 1*/
                Box(modifier = Modifier
                    .height(200.dp)
                    .fillMaxSize()
                    //.background(color = Color.Yellow)
                )
                {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://2.bp.blogspot.com/-HQmDasF5AtI/WJtRLQ8NQMI/" +
                                    "AAAAAAAAT2Y/PgxlnXq8rdEs8O3U2fIinTq6ZdBL-XE4wCLcB/s1600/" +
                                    "2015092400520363346.jpg")
                            .transformations(CircleCropTransformation())
                            .build(),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp)
                ){
                    Text(text = "Superman",
                        fontWeight = FontWeight.Bold);
                }
                /*fin de imagen 1*/
                /*Imagen 2*/
                Box(modifier = Modifier
                    .height(200.dp)
                    .fillMaxSize()
                    //.background(color = Color.Yellow)
                )
                {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://i.blogs.es/fed263/el-increible-h" +
                                    "ulk/1366_2000.jpeg")
                            .transformations(CircleCropTransformation())
                            .build(),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )

                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp)
                ){
                    Text(text = "Producto",
                        fontWeight = FontWeight.Bold);
                }
                /*fin de imagen 2*/
                /*Imagen 3*/
                Box(modifier = Modifier
                    .height(200.dp)
                    .fillMaxSize()
                    //.background(color = Color.Yellow)
                )
                {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://es.web.img3.acsta.net/r_654_368/" +
                                    "newsv7/15/12/30/22/22/404398.jpg")
                            .transformations(CircleCropTransformation())
                            .build(),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )

                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp)
                ){
                    Text(text = "Hombre Araña",
                        fontWeight = FontWeight.Bold);
                }
                /*fin de imagen 3*/
            }

        }
    }

}