package com.example.jastipin.page

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme.shapes
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.R
import com.example.jastipin.ui.theme.black
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.lightGrey
import com.example.jastipin.ui.theme.lightSkin
import com.example.jastipin.ui.theme.nunitoBold
import com.example.jastipin.ui.theme.nunitoMedium
import com.example.jastipin.ui.theme.orange
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material3.Icon
import com.example.jastipin.navigation.NavigationScreen


data class HalamanChatScreenModel(
    val image: Int,
    val name: String,
    val description: String,
)

@Composable
fun dataSource(): List<HalamanChatScreenModel> {
    return remember {
        listOf(
            HalamanChatScreenModel(
                image = R.drawable.avatar,
                name = "Bapak Mika",
                description = "Iya pakkkk",
            ),
            HalamanChatScreenModel(
                image = R.drawable.avatar,
                name = "Bapak Suroso",
                description = "Terimahkasih pakkkk",
            ),
            HalamanChatScreenModel(
                image = R.drawable.avatar_girl,
                name = "Bu Karina",
                description = "Sesuai alamat ya mbakk",
            )
        )
    }
}

@Composable
fun CardHalamanChatScreen(item: HalamanChatScreenModel, onItemClicked: () -> Unit) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp),
        color = Color.White,
        elevation = 8.dp
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                modifier = Modifier
                    .height(80.dp)
                    .width(80.dp),
                color = Color.Gray,
                shape = shapes.medium
            ) {
                Image(
                    painter = painterResource(id = item.image),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = item.name,
                    fontFamily = nunitoBold,
                    fontSize = 16.sp,
                    color = black
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = item.description,
                    fontFamily = nunitoBold,
                    fontSize = 16.sp,
                    color = Color.Gray
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HalamanChatScreen(navController: NavController) {
    val items = dataSource()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                        Text(
                            text = "Chat",
                            fontFamily = nunitoBold,
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.width(250.dp)
                        )
                },
                windowInsets = WindowInsets(
                    top = 30.dp,
                ),
                backgroundColor = Color.White,
                elevation = 10.dp,
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBackIos,
                        contentDescription = "back",
                        modifier = Modifier
                            .size(25.dp)
                            .offset(x = 15.dp)
                            .clickable {
                                navController.popBackStack()
                            }
                    )
                },
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(
                    top = 100.dp
                )
                .clickable {
                    navController.navigate(
                        NavigationScreen.ChatScreen.name
                    )
                }
        ) {
            items(items) { item ->
                CardHalamanChatScreen(item = item) {
                    navController.navigate(
                        NavigationScreen.ChatScreen.name
                    )
                }
            }
        }
    }
}


@Composable
fun ChatScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            color = orange
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
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
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Bapak Mika",
                        fontFamily = nunitoBold,
                        fontSize = 18.sp,
                        color = Color.White
                    )
                    Text(
                        text = "UMKM Makanan",
                        fontFamily = nunitoBold,
                        fontSize = 10.sp,
                        color = Color.White
                    )
                }
                Column {
                    Icon(imageVector = Icons.Default.Cancel,
                        contentDescription = "back",
                        modifier = Modifier
                            .size(35.dp)
                            .clickable {
                                navController.popBackStack()
                            },
                        tint = Color.White)
                    Spacer(modifier = Modifier.height(50.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .width(120.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Surface(
                modifier = Modifier
                    .width(120.dp)
                    .height(25.dp)
                    .clip(
                        shape = RoundedCornerShape(
                            size = 20.dp
                        )
                    )
                    .align(Alignment.Center),
                color = orange
            ) {
                Text(
                    text = "03-04-2024",
                    textAlign = TextAlign.Center,
                    fontFamily = nunitoBold,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.Center),
                    fontSize = 15.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            Row {
                Surface(
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                        .clip(CircleShape),
                    color = lightGrey
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = "img-avatar",
                        modifier = Modifier
                            .width(60.dp)
                            .height(60.dp),
                        contentScale = ContentScale.Crop,
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = "Bapak Mika",
                        fontFamily = nunitoBold,
                        fontSize = 18.sp,
                        color = black
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Surface(
                        modifier = Modifier
                            .width(160.dp)
                            .height(30.dp)
                            .clip(
                                shape = RoundedCornerShape(
                                    size = 10.dp
                                )
                            ),
                        color = lightSkin
                    ) {
                        Text(
                            text = "Permisi",
                            fontFamily = nunitoMedium,
                            fontSize = 13.sp,
                            color = black,
                            textAlign = TextAlign.Justify,
                            modifier = Modifier.padding(5.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Surface(
                            modifier = Modifier
                                .width(160.dp)
                                .height(30.dp)
                                .clip(
                                    shape = RoundedCornerShape(
                                        size = 10.dp
                                    )
                                ),
                            color = lightSkin
                        ) {
                            Text(
                                text = "Sesuai alamat yaaa kaa",
                                fontFamily = nunitoMedium,
                                fontSize = 13.sp,
                                color = black,
                                textAlign = TextAlign.Justify,
                                modifier = Modifier.padding(5.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "19:55",
                            fontFamily = nunitoMedium,
                            fontSize = 10.sp,
                            color = black,
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(25.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "19:56",
                        fontFamily = nunitoMedium,
                        fontSize = 10.sp,
                        color = black,
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Surface(
                        modifier = Modifier
                            .width(110.dp)
                            .height(30.dp)
                            .clip(
                                shape = RoundedCornerShape(
                                    size = 10.dp
                                )
                            ),
                        color = lightSkin
                    ) {
                        Text(
                            text = "Iya pakkkk",
                            fontFamily = nunitoMedium,
                            fontSize = 13.sp,
                            color = black,
                            textAlign = TextAlign.End,
                            modifier = Modifier.padding(5.dp)
                        )
                    }
                }

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewHalamanChatScreen() {
    HalamanChatScreen(rememberNavController())
}

@Preview(showSystemUi = true)
@Composable
fun PreviewChatScreen() {
    ChatScreen(rememberNavController())
}

