package com.example.visprog_labweek2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprog_labweek2.ui.theme.VisProg_LabWeek2Theme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisProg_LabWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainActivityNo2()
                }
            }
        }
    }
}

@Composable
fun MainActivityNo2() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
    ) {
        NavBar2()
        Item(text1 = "Nike Casual", text2 = "Air Max", rate = "4", price = "$ 100.5", qty = "+ 5 -", color = Color.Gray, imageResource = R.drawable.sepatu_removebg_preview)
        Item(text1 = "Nike Casual", text2 = "Air Jordan", rate = "5", price = "$ 300.5", qty = "+ 1 -", color = Color(0xFFEB9C53), imageResource = R.drawable.pair_trainers_removebg_preview)
        Item(text1 = "Nike Casual", text2 = "Mercurial", rate = "2", price = "$ 20.5", qty = "+ 2 -", color = Color(0xFF5470EC), imageResource = R.drawable.new_pair_white_sneakers_isolated_white_removebg_preview)
        Info(text1 = "Delivery Charge", text2 = "Free Delivery", decoration = TextDecoration.Underline)
        Info(text1 = "Total Amount", text2 = "$421.5", decoration = TextDecoration.None)
        Button()
    }
}

@Composable
fun NavBar2(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,

        ) {
        Image(
            painter = painterResource(id = R.drawable.baseline_arrow_back_24),
            contentDescription = "arrow",
            modifier = Modifier.size(30.dp, 30.dp)
        )
        Text(
            text = "Your Cart",
            style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold, fontFamily = Poppins)
        )
        Image(
            painter = painterResource(id = R.drawable.baseline_menu_24),
            contentDescription = "menu",
            modifier = Modifier.size(30.dp, 30.dp)
        )
    }
}

@Composable
fun MyDivider(){
    Divider(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        color = Color.Gray,
        thickness = 1.dp
    )
}

@Composable
fun Item(text1 : String, text2 : String, rate : String, price : String, qty : String, color: Color, imageResource : Int ){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        ) {
        Box(
            modifier = Modifier
                .padding(5.dp)
                .background(color, RoundedCornerShape(12.dp))
        ){
            Image(
                painter = painterResource(id = imageResource),
                contentDescription = "sepatu",
                modifier = Modifier.size(140.dp, 140.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(start = 10.dp, top = 3.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = text1,
                style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Medium, color = Color.Gray, fontFamily = Poppins),
            )
            Text(
                text = text2,
                style = TextStyle(fontSize = 25.sp, fontWeight = FontWeight.Bold, fontFamily = Poppins)
            )
            Row(
            ) {
                Text(
                    text = rate,
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Medium, fontFamily = Poppins)
                )
                Image(
                    painter = painterResource(id = R.drawable.baseline_star_24),
                    contentDescription = "Bintang",
                    modifier = Modifier
                        .size(20.dp, 20.dp)
                        .padding(start = 2.dp)
                )
                Text(
                    text = " - Authentic",
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Medium, fontFamily = Poppins)
                )
            }
            Text(
                text = price,
                style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold, fontFamily = Poppins),
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                ) {
                Text(
                    text = qty,
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Medium, fontFamily = Poppins),
                    modifier = Modifier.padding(end = 130.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.baseline_delete_forever_24),
                    contentDescription = "Bintang",
                    modifier = Modifier.size(20.dp, 20.dp)
                )
            }
        }
    }
    MyDivider()
}

@Composable
fun Info(text1: String, text2: String, decoration: TextDecoration){
    Row(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .padding(top = 15.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(
            text = text1,
            modifier = Modifier.padding(top = 1.dp),
            style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Medium, color = Color.DarkGray, fontFamily = Poppins)
        )
        Text(
            text = text2,
            modifier = Modifier.padding(top = 1.dp),
            style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Medium, color = Color.DarkGray, textDecoration = decoration, fontFamily = Poppins),
        )
    }
    MyDivider()
}

@Composable
fun Button() {
    Row(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 18.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = Color.White,
                )
                .border(
                width = 2.dp,
                color = Color(0xFF2A3442),
                shape = RoundedCornerShape(12.dp)
                )
                .padding(horizontal = 25.dp)
        ) {
            Text(
                text = "$421.5",
                style = TextStyle(
                    color = Color(0xFF2A3442),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = Poppins
                ),
                modifier = Modifier.padding(10.dp)
            )
        }
        Box(
            modifier = Modifier
                .background(
                    color = Color(0xFF2A3442),
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(horizontal = 50.dp)
        ) {
            Text(
                text = "Continue",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = Poppins
                ),
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainActivity2Preview() {
    VisProg_LabWeek2Theme {
        MainActivityNo2()
    }
}