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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprog_labweek2.ui.theme.VisProg_LabWeek2Theme

val Poppins = FontFamily(
    listOf(
        Font(R.font.poppins_semibold, FontWeight.SemiBold),
        Font(R.font.poppins_regular, FontWeight.Normal),
        Font(R.font.poppins_medium, FontWeight.Medium),
        Font(R.font.poppins_bold, FontWeight.Bold)
    )
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisProg_LabWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainActivityNo1()
                }
            }
        }
    }
}

@Composable
fun MainActivityNo1() {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        NavBar()
        Header()
        Body()
    }
}

@Composable
fun NavBar(){
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
            text = "Adidas",
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
fun Header(){
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.drawable.fashion_shoes_sneakers_removebg_preview),
            contentDescription = "Sepatu",
            modifier = Modifier.size(500.dp, 340.dp)
        )
    }
}

@Composable
fun Body(){
    Column(
        modifier = Modifier
            .background(
                shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
                color = Color(0xFF2A3442)
            )
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Text(
            text = "Adidas Ultra Boost",
            style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Normal, color = Color.White, fontFamily = Poppins)
        )
        Row(
            modifier = Modifier.padding(top = 10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.baseline_star_24),
                contentDescription = "Bintang",
            )
            Text(
                text = "5.0",
                style = TextStyle(color = Color.White, fontSize = 20.sp, fontFamily = Poppins),
                modifier = Modifier.padding(start = 18.dp)
            )
            Text(
                text = "(666 reviews)",
                style = TextStyle(color = Color.Gray, fontSize = 20.sp, fontFamily = Poppins),
                modifier = Modifier.padding(start = 18.dp)
            )
        }
        Text(
            text = "Dapatkan gaya klasik yang tak pernah mati dengan Sepatu Sneakers Kanvas Berkualitas Tinggi kami!",
            modifier = Modifier.padding(top = 10.dp),
            style = TextStyle(color = Color.White, fontSize = 17.sp, fontFamily = Poppins),
        )
        Text(
            text = "Read More...",
            modifier = Modifier.padding(top = 10.dp),
            style = TextStyle(color = Color.White, fontSize = 17.sp, textDecoration = TextDecoration.Underline, fontFamily = Poppins),
        )
        Row(
            modifier = Modifier
                .padding(top = 28.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = "$320.0" ,
                style = TextStyle(color = Color.White, fontSize = 40.sp, fontWeight = FontWeight.SemiBold, fontFamily = Poppins),
                modifier = Modifier.padding(start = 20.dp),
            )
            Box(
                modifier = Modifier
                    .padding(end = 20.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(12.dp)
                    )
            ) {
                Text(
                    text = "Add to Cart",
                    style = TextStyle(color = Color(0xFF2A3442), fontSize = 20.sp, fontWeight = FontWeight.Medium, fontFamily = Poppins),
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    VisProg_LabWeek2Theme {
        MainActivityNo1()
    }
}