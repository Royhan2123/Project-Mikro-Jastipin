package com.example.jastipin.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.R
import com.example.jastipin.ui.theme.accblack
import com.example.jastipin.ui.theme.fontgrey
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.nunitoBold
import com.example.jastipin.ui.theme.outlinebox

@Composable
fun AccountScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Akun",
            style = TextStyle(
                fontSize = 30.sp,
                color = accblack,
                fontFamily = nunitoBold
            ),
        )
        Spacer(modifier = Modifier.height(60.dp))

        Image(
            modifier = Modifier.size(150.dp),
            painter = painterResource(id = R.drawable.woman1),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Nika Santana",
            style = TextStyle(
                fontSize = 24.sp,
                color = accblack,
                fontFamily = nunitoBold

            ),
        )
        Text(
            text = "nikasantana02",
            style = TextStyle(
                fontSize = 16.sp,
                color = Color(0xff8D8D8D),
                fontFamily = nunitoBold

            ),
        )
        Spacer(modifier = Modifier.height(55.dp))

        Divider(thickness = 2.dp)

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(30.dp),
                painter = painterResource(id = R.drawable.gmailicon),
                contentDescription = "image description",
                contentScale = ContentScale.None,
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "nikasantana02@gmail.com",
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color(0xff8D8D8D),
                    fontFamily = nunitoBold
                ),
            )
        }

        Spacer(modifier = Modifier.height(8.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(30.dp),
                painter = painterResource(id = R.drawable.contacticon),
                contentDescription = "image description",
                contentScale = ContentScale.None,
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "081345111921",
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color(0xff8D8D8D),
                    fontFamily = nunitoBold
                ),
            )
        }

        Spacer(modifier = Modifier.height(8.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(30.dp),
                painter = painterResource(id = R.drawable.locationicon),
                contentDescription = "image description",
                contentScale = ContentScale.None,
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Lubuklinggau",
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color(0xff8D8D8D),
                    fontFamily = nunitoBold
                ),
            )
        }
    }
}

@Preview
@Composable
fun view() {
    AccountScreen(navController = rememberNavController())
}