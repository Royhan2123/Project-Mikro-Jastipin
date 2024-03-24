package com.example.jastipin.page

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Colors
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jastipin.R
import com.example.jastipin.ui.theme.accblack
import com.example.jastipin.ui.theme.accgrey
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.interRegular
import com.example.jastipin.ui.theme.nunitoBold
import com.example.jastipin.ui.theme.nunitoMedium
import com.example.jastipin.ui.theme.nunitoRegular
import com.example.jastipin.ui.theme.nunitoSemiBold
import com.example.jastipin.ui.theme.orange
import com.example.jastipin.widget.LazyRowWithColumn
import com.example.jastipin.widget.ListItem

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = grey)
            .padding(vertical = 40.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                ) {
                    Text(text = "Lokasi Saya", fontSize = 16.sp, fontFamily = nunitoRegular)
                    Text(
                        text = "Jl. Raya Jayabaya No. 10",
                        fontSize = 17.sp,
                        fontFamily = nunitoBold
                    )
                }
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star Icon", Modifier.size(45.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star Icon", Modifier.size(45.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .background(Color.White)
                    .border(
                        BorderStroke(
                            color = Color.LightGray,
                            width = 1.dp
                        )
                    )
            ) {
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp)
                )
                Row(
                    modifier = Modifier.align(Alignment.CenterStart),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(
                        onClick = {},
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                            tint = accgrey
                        )
                    }
                    Text(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(vertical = 15.dp),
                        text = "Jl. Raya Jayabaya No. 10",
                        fontSize = 12.sp,
                        fontFamily = interRegular,
                        color = accgrey
                    )
                }
            }

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 15.dp),
                text = "Kategori",
                fontSize = 17.sp,
                fontFamily = nunitoBold,
                color = accblack
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .background(accgrey)
                ) {
                    Text(text = "pp")
                }
                Box(
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .background(accgrey)
                ) {
                    Text(text = "pp")
                }
                Box(
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .background(accgrey)
                ) {
                    Text(text = "pp")
                }
                Box(
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .background(accgrey)
                ) {
                    Text(text = "pp")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Column {
                    Text(
                        text = "Rating Tertinggi",
                        fontSize = 17.sp,
                        fontFamily = nunitoBold,
                        color = accblack
                    )
                    Text(
                        text = "Rating makanan terbaik buat kamu",
                        fontSize = 11.sp,
                        fontFamily = nunitoMedium,
                        color = accgrey
                    )
                }
                TextButton(
                    onClick = { /* Tindakan ketika tombol ditekan */ },
                ) {
                    Text(
                        text = "Lihat Selengkapnya",
                        fontSize = 12.sp,
                        fontFamily = nunitoSemiBold,
                        color = orange
                    )
                }
            }

            LazyRow()
        }
    }
}

@Composable
fun LazyRow() {
    val items = remember {
        listOf(
            ListItem(
                imageResId = R.drawable.image1,
                text1 = "Text 1A",
                text2 = "Text 2A",
                text3 = "Text 3A"
            ),
            ListItem(
                imageResId = R.drawable.image1,
                text1 = "Text 1B",
                text2 = "Text 2B",
                text3 = "Text 3B"
            ),
            ListItem(
                imageResId = R.drawable.image1,
                text1 = "Text 1C",
                text2 = "Text 2C",
                text3 = "Text 3C"
            )
        )
    }
    LazyRowWithColumn(items = items)
}

@Preview
@Composable
fun View() {
    HomeScreen()
}


