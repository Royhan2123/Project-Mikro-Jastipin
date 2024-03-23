package com.example.jastipin.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.TabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.R
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.orange

@Composable
fun SignInScreen(navController: NavController) {
    var selectTabIndex by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.Start
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(230.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.umkm1),
                contentDescription = "umkm-1",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(229.dp)
                    .clip(
                        shape = RoundedCornerShape(
                            bottomStart = 18.dp,
                            bottomEnd = 18.dp
                        )
                    )
            )
            Surface(
                modifier = Modifier
                    .height(24.dp)
                    .width(300.dp)
                    .align(Alignment.CenterEnd)
                    .padding(
                        end = 14.dp,
                    )
                    .offset(
                        y = 50.dp
                    ),
                shape = RoundedCornerShape(
                    size = 20.dp
                ),
                color = Color.White.copy(alpha = 0.8f),
            ) {
                Text(
                    text = stringResource(
                        id = R.string.image_umkm1
                    ),
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    color = orange,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            TabRow(
                selectedTabIndex = selectTabIndex,
                backgroundColor = grey
            ) {
                Tab(selected = selectTabIndex == 0,
                    onClick = {
                        selectTabIndex = 0
                    }) {
                    Text(text = stringResource(id = R.string.home))
                }
                Tab(selected = selectTabIndex == 1,
                    onClick = {
                        selectTabIndex = 1
                    }) {
                    Text(text = stringResource(id = R.string.daftar))
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewSignInScreen() {
    SignInScreen(navController = rememberNavController())
}