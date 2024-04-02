package com.example.jastipin.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.R
import com.example.jastipin.navigation.NavigationScreen
import com.example.jastipin.ui.theme.accblack
import com.example.jastipin.ui.theme.accgrey
import com.example.jastipin.ui.theme.interRegular
import com.example.jastipin.ui.theme.nunitoBold
import com.example.jastipin.ui.theme.nunitoMedium
import com.example.jastipin.ui.theme.nunitoRegular
import com.example.jastipin.ui.theme.nunitoSemiBold
import com.example.jastipin.ui.theme.orange
import com.example.jastipin.ui.theme.outlinebox
import com.example.jastipin.widget.ItemList
import com.example.jastipin.widget.LazyColumnWithRows
import com.example.jastipin.widget.LazyRowWithColumn
import com.example.jastipin.widget.ListItem

@Composable
fun HomeScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 40.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
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
                Row(
                    modifier = Modifier.align(Alignment.CenterVertically)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.iconumkm),
                        contentDescription = "Star Icon", Modifier.size(35.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(
                        painter = painterResource(id = R.drawable.iconchat),
                        contentDescription = "Star Icon", Modifier.size(35.dp)
                            .clickable {

                            }
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .border(
                        width = 1.dp,
                        color = outlinebox,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clickable {
                        navController.navigate(NavigationScreen.SearchScreen.name)
                    }
            ) {
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
                        modifier = Modifier.align(Alignment.CenterVertically),
                        text = "Cari Produk Yang Kamu Inginkan",
                        fontSize = 13.sp,
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
                Column {
                    Box(
                        modifier = Modifier
                            .height(70.dp)
                            .width(70.dp)
                            .border(
                                width = 1.dp,
                                color = outlinebox,
                                shape = RoundedCornerShape(8.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.nearby),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                        )
                    }

                    Text(
                        modifier = Modifier
                            .padding(top = 6.dp)
                            .align(Alignment.CenterHorizontally),
                        text = "Terdekat",
                        fontSize = 12.sp,
                        fontFamily = nunitoSemiBold,
                        color = accblack,
                    )
                }

                Column {
                    Box(
                        modifier = Modifier
                            .height(70.dp)
                            .width(70.dp)
                            .border(
                                width = 1.dp,
                                color = outlinebox,
                                shape = RoundedCornerShape(8.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.discount),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                        )
                    }

                    Text(
                        modifier = Modifier
                            .padding(top = 6.dp)
                            .align(Alignment.CenterHorizontally),
                        text = "Murah",
                        fontSize = 12.sp,
                        fontFamily = nunitoSemiBold,
                        color = accblack,
                    )
                }

                Column {
                    Box(
                        modifier = Modifier
                            .height(70.dp)
                            .width(70.dp)
                            .border(
                                width = 1.dp,
                                color = outlinebox,
                                shape = RoundedCornerShape(8.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bestseller),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                        )
                    }

                    Text(
                        modifier = Modifier
                            .padding(top = 6.dp)
                            .align(Alignment.CenterHorizontally),
                        text = "Paling Laku",
                        fontSize = 12.sp,
                        fontFamily = nunitoSemiBold,
                        color = accblack,
                    )
                }

                Column {
                    Box(
                        modifier = Modifier
                            .height(70.dp)
                            .width(70.dp)
                            .border(
                                width = 1.dp,
                                color = outlinebox,
                                shape = RoundedCornerShape(8.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.healthy),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                        )
                    }

                    Text(
                        modifier = Modifier
                            .padding(top = 6.dp)
                            .align(Alignment.CenterHorizontally),
                        text = "Sehat",
                        fontSize = 12.sp,
                        fontFamily = nunitoSemiBold,
                        color = accblack,
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
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

            Spacer(modifier = Modifier.height(25.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "Termurah Hari ini",
                        fontSize = 17.sp,
                        fontFamily = nunitoBold,
                        color = accblack
                    )
                    Text(
                        text = "Pesan dan manfaatin promonya",
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
            LazyColumn()
        }
    }
}

@Composable
fun LazyRow() {
    val items = remember {
        listOf(
            ListItem(
                imageResId = R.drawable.image1,
                text1 = "0.64 km - 4 menit",
                text2 = "Warung Steak Medan",
                text3 = "Text 3A"
            ),
            ListItem(
                imageResId = R.drawable.image2,
                text1 = "1.02 km - 5 menit",
                text2 = "Ayam Penyet Bu Ilis",
                text3 = "Text 3B"
            ),
            ListItem(
                imageResId = R.drawable.image3,
                text1 = "0.64 km - 5 menit",
                text2 = "Nasi Padang Putri Ujung",
                text3 = "Text 3C"
            )
        )
    }
    LazyRowWithColumn(items = items)
}

@Composable
fun LazyColumn() {
    val items = listOf(
        ItemList(
            imageResId = R.drawable.columnimage1,
            text1 = "Nasi Padang Putri Ujung",
            text2 = "0.64 km",
            text3 = "4.6"
        ), ItemList(
            imageResId = R.drawable.columnimage2,
            text1 = "Ayam Bakar Krakatau",
            text2 = "4.64 km",
            text3 = "4.1"
        ), ItemList(
            imageResId = R.drawable.columnimage3,
            text1 = "Martabak Golden",
            text2 = "8.64 km",
            text3 = "4.2"
        )
    )
    LazyColumnWithRows(items = items)
}

@Preview
@Composable
fun view() {
    HomeScreen(navController = rememberNavController())
}


