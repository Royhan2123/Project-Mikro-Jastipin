package com.example.jastipin.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.outlined.Chat
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.R
import com.example.jastipin.navigation.NavigationScreen
import com.example.jastipin.ui.theme.green
import com.example.jastipin.ui.theme.lightGrey
import com.example.jastipin.ui.theme.nunitoBold
import com.example.jastipin.ui.theme.nunitoMedium
import com.example.jastipin.ui.theme.nunitoRegular
import com.example.jastipin.ui.theme.orange

@Composable
fun FindDriverScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = orange
        ) {}
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp)
                .clip(
                    shape = RoundedCornerShape(
                        topStart = 25.dp,
                        topEnd = 25.dp
                    )
                )
                .clickable {
                           navController.navigate(
                               NavigationScreen.SplashScreenDriver.name
                           )
                },
            color = Color.White,
            elevation = 8.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 20.dp)
            ) {
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(15.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Surface(
                                modifier = Modifier
                                    .width(95.dp)
                                    .height(90.dp)
                                    .clip(CircleShape),
                                color = lightGrey
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.avatar),
                                    contentDescription = "img-avatar",
                                    modifier = Modifier
                                        .width(85.dp)
                                        .height(80.dp),
                                    contentScale = ContentScale.Crop,
                                )
                            }
                            Spacer(modifier = Modifier.width(25.dp))
                            Column {
                                Text(
                                    text = "Ready Driver",
                                    fontSize = 13.sp,
                                    fontFamily = nunitoRegular,
                                )
                                Spacer(modifier = Modifier.height(5.dp))
                                Icon(
                                    imageVector = Icons.Outlined.Chat, contentDescription = "chat",
                                    modifier = Modifier.size(25.dp)
                                )
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "Jay Loves",
                                    fontSize = 20.sp,
                                    fontFamily = nunitoBold,
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(15.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier.fillMaxWidth()

                        ) {
                            Column {
                                Text(
                                    text = "Order#",
                                    fontSize = 13.sp,
                                    fontFamily = nunitoRegular,
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Sembako",
                                    fontSize = 16.sp,
                                    fontFamily = nunitoBold,
                                )
                            }
                            Column {
                                Text(
                                    text = "ETA Delivery",
                                    fontSize = 13.sp,
                                    fontFamily = nunitoRegular,
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "06:00 pm",
                                    fontSize = 16.sp,
                                    fontFamily = nunitoBold,
                                )
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Surface(
                                    modifier = Modifier
                                        .width(10.dp)
                                        .height(10.dp)
                                        .clip(shape = CircleShape),
                                    color = green
                                ) {}
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = "On Time",
                                    fontFamily = nunitoBold,
                                    fontSize = 16.sp
                                )
                            }
                        }
                    }
                }
                Divider()
                
                CardDriver(navController = rememberNavController(), onClick = {})

                Divider()
                CardDriver(navController = rememberNavController(), onClick = {})

                Divider()
                CardDriver(navController = rememberNavController(), onClick = {})

            }
        }

    }
}


@Composable
fun CardDriver(navController: NavController, onClick: () -> Unit) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Surface(
                    modifier = Modifier
                        .width(95.dp)
                        .height(90.dp)
                        .clip(CircleShape),
                    color = lightGrey
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = "img-avatar",
                        modifier = Modifier
                            .width(85.dp)
                            .height(80.dp),
                        contentScale = ContentScale.Crop,
                    )
                }
                Spacer(modifier = Modifier.width(25.dp))
                Column {
                    Text(
                        text = "Ready Driver",
                        fontSize = 13.sp,
                        fontFamily = nunitoRegular,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Icon(
                        imageVector = Icons.Outlined.Chat, contentDescription = "chat",
                        modifier = Modifier.size(25.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Jay Loves",
                        fontSize = 20.sp,
                        fontFamily = nunitoBold,
                    )
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()

            ) {
                Column {
                    Text(
                        text = "Order#",
                        fontSize = 13.sp,
                        fontFamily = nunitoRegular,
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Sembako",
                        fontSize = 16.sp,
                        fontFamily = nunitoBold,
                    )
                }
                Column {
                    Text(
                        text = "ETA Delivery",
                        fontSize = 13.sp,
                        fontFamily = nunitoRegular,
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "06:00 pm",
                        fontSize = 16.sp,
                        fontFamily = nunitoBold,
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        modifier = Modifier
                            .width(10.dp)
                            .height(10.dp)
                            .clip(shape = CircleShape),
                        color = green
                    ) {}
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "On Time",
                        fontFamily = nunitoBold,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewFindDriverScreen() {
    FindDriverScreen(navController = rememberNavController())
}

@Preview
@Composable
fun PreviewCardDriver() {
    CardDriver(navController = rememberNavController(), onClick = {})
}