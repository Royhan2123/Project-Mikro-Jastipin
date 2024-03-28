package com.example.jastipin.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.R
import com.example.jastipin.navigation.NavigationScreen
import com.example.jastipin.ui.theme.black
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.interMedium
import com.example.jastipin.ui.theme.orange

@Composable
fun SplashScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.splash_jastipin),
            contentDescription = stringResource(id = R.string.splash_screen),
            modifier = Modifier
                .width(180.dp)
                .height(60.dp),
            contentScale = ContentScale.Crop
        )
        Button(
            onClick = {
                navController.navigate(NavigationScreen.HalamanSignInScreen.name) {
                    popUpTo(NavigationScreen.SplashScreen.name) {
                        inclusive = true
                    }
                }
            },
            modifier = Modifier
                .width(180.dp)
                .height(45.dp)
                .offset(y = 200.dp),
            colors = ButtonDefaults.buttonColors(orange),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(
                text = stringResource(id = R.string.masuk),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 15.sp
                )
            )
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = stringResource(id = R.string.masuk),
                tint = Color.White,
                modifier = Modifier.size(20.dp)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 280.dp)
                .padding(bottom = 20.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = stringResource(id = R.string.from),
                    fontFamily = interMedium,
                    fontSize = 12.sp,
                    color = grey)
                Text(text = stringResource(id = R.string.abhinaya_team),
                    fontFamily = interMedium,
                    fontSize = 15.sp,
                    color = black)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewSplashScreen() {
    SplashScreen(navController = rememberNavController())
}