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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Outline.Rectangle
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprog_labweek2.ui.theme.VisProg_LabWeek2Theme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisProg_LabWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainActivityNo3()
                }
            }
        }
    }
}

@Composable
fun MainActivityNo3() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4BFBE)),
    ) {
        NavBar3()
        Header3()
        Title()
    }
}

@Composable
fun NavBar3(){
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
    }
}

@Composable
fun Header3(){
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .size(170.dp, 170.dp)
                .padding(bottom = 10.dp),
            painter = painterResource(id = R.drawable.registerlogo),
            contentDescription = "Sepatu",
        )
    }
}

@Composable
fun Title(){
    Column(
        modifier = Modifier
            .background(
                shape = RoundedCornerShape(topStart = 55.dp, topEnd = 55.dp),
                color = Color(0xFFF0F0F0)
            )
            .fillMaxWidth()
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            text = "Create New Account",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Medium, color = Color.DarkGray, fontFamily = Poppins, textAlign = TextAlign.Center)
        )
        Body3()
    }
}


@Composable
fun Body3(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                color = Color.White
            )
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 130.dp)
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                modifier = Modifier
                    .size(30.dp, 30.dp),
                painter = painterResource(id = R.drawable.facebook_icon),
                contentDescription = "facebook",
            )
            Image(
                modifier = Modifier
                    .size(30.dp, 30.dp),
                painter = painterResource(id = R.drawable.google_icon),
                contentDescription = "google",
            )
            Image(
                modifier = Modifier
                    .size(30.dp, 30.dp),
                painter = painterResource(id = R.drawable.x_icon),
                contentDescription = "x",
            )
        }
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            text = "or use your email account",
            style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal, color = Color.Gray, fontFamily = Poppins, textAlign = TextAlign.Center)
        )
        Form("Name", "Ex: Richie Reuben")
        Form("Email", "Ex: richie@gmail.com")
        Form2()
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .background(
                        color = Color(0xFFD66362),
                        shape = RoundedCornerShape(12.dp)
                    )
                    .padding(horizontal = 20.dp)
            ) {
                Text(
                    text = "Register",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = Poppins
                    ),
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            text = "Already hava an account",
            style = TextStyle(fontSize = 13.sp, fontWeight = FontWeight.Medium, color = Color.Gray, fontFamily = Poppins, textAlign = TextAlign.Center)
        )
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "Login Here",
            style = TextStyle(fontSize = 13.sp, fontWeight = FontWeight.Medium, color = Color(0xFFD66362), fontFamily = Poppins, textAlign = TextAlign.Center)
        )
    }
}

@Composable
fun Form(text1:String, text2:String){
    Column(
        modifier = Modifier
            .padding(horizontal = 15.dp)
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, bottom = 5.dp),
            text = text1,
            style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Medium, color = Color.DarkGray, fontFamily = Poppins, textAlign = TextAlign.Left)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = Color.Gray,
                    shape = MaterialTheme.shapes.medium
                )
                .padding(start = 15.dp)
        ){
            Text(
                modifier = Modifier
                    .padding(vertical = 10.dp),
                text = text2,
                style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Medium, color = Color.Gray, fontFamily = Poppins, textAlign = TextAlign.Left)
            )
        }
    }
}

@Composable
fun Form2(){
    Column(
        modifier = Modifier
            .padding(horizontal = 15.dp)
            .padding(bottom = 15.dp)
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, bottom = 5.dp),
            text = "Password",
            style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Medium, color = Color.DarkGray, fontFamily = Poppins, textAlign = TextAlign.Left)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = Color.Gray,
                    shape = MaterialTheme.shapes.medium
                )
                .padding(start = 15.dp, end = 10.dp)
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier
                        .padding(vertical = 10.dp),
                    text = "Enter Password",
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Medium, color = Color.Gray, fontFamily = Poppins, textAlign = TextAlign.Left)
                )
                Image(
                    modifier = Modifier
                        .size(45.dp, 45.dp)
                        .padding(vertical = 10.dp),
                    painter = painterResource(id = R.drawable.baseline_remove_red_eye_24),
                    contentDescription = "x",
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainActivity3Preview() {
    VisProg_LabWeek2Theme {
        MainActivityNo3()
    }
}