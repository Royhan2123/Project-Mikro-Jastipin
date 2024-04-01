package com.example.jastipin.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
import com.example.jastipin.ui.theme.accyellow
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
fun HomeScreen(
    // Column Parameter
    imageId: Array<Int>,
    nameUMKM: Array<String>,
    descriptionUMKM: Array<String>,
    range2UMKM: Array<String>,
    rating2UMKM: Array<String>,
    alamatUMKM: Array<String>,

    // Row Parameter
    home2RowPhotos: Array<Int>,
    home2RowTitleUMKM: Array<String>,
    home2RowRangeUMKM: Array<String>,
    home2RowRatingUMKM: Array<String>,

    // required Detail
    home2RowDescription: Array<String>,
    home2RowAddressUMKM: Array<String>,

    navController: NavController
) {
    val scrollState = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(vertical = 40.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .scrollable(state = scrollState, orientation = Orientation.Vertical)
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
                        contentDescription = "Star Icon",
                        Modifier
                            .size(35.dp)
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

            androidx.compose.foundation.lazy.LazyRow(contentPadding = PaddingValues(2.dp)) {
                val itemCount = imageId.size
                items(itemCount) {
                    RowItem(
                        homeRowItemIndex = it,
                        homeRowPhotos = home2RowPhotos,
                        homeRowTitleUMKM = home2RowTitleUMKM,
                        homeRowRangeUMKM = home2RowRangeUMKM,
                        homeRowRatingUMKM = home2RowRatingUMKM,
                        homeRowDescription = home2RowDescription,
                        homeRowAddressUMKM = home2RowAddressUMKM,
                        navController = navController
                    )
                }
            }

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
            androidx.compose.foundation.lazy.LazyColumn(contentPadding = PaddingValues(2.dp)) {
                val itemCount = imageId.size
                items(itemCount) {
                    ColumnItem(
                        itemIndex = it,
                        photos = imageId,
                        titleUMKM = nameUMKM,
                        descriptUMKM = descriptionUMKM,
                        rangeUMKM = range2UMKM,
                        ratingUMKM = rating2UMKM,
                        addreessUMKM = alamatUMKM,
                        navController = navController
                    )
                }
            }
        }
    }
}

@Composable
fun RowItem(
    homeRowItemIndex: Int,
    homeRowPhotos: Array<Int>,
    homeRowTitleUMKM: Array<String>,
    homeRowRangeUMKM: Array<String>,
    homeRowRatingUMKM: Array<String>,

    // required Detail
    homeRowDescription: Array<String>,
    homeRowAddressUMKM: Array<String>,

    navController: NavController
) {
    Column(
        modifier = Modifier
            .padding(end = 18.dp)
            .width(183.dp)
            .height(163.dp)
            .clickable {
                navController.navigate("${NavigationScreen.DetailScreen2.name}/$homeRowItemIndex")
            },
    ) {
        Image(
            painter = painterResource(id = homeRowPhotos[homeRowItemIndex]),
            contentDescription = null,
            modifier = Modifier
                .width(183.dp)
                .height(103.dp)
                .clip(shape = RoundedCornerShape(6.dp))
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = homeRowRangeUMKM[homeRowItemIndex],
            fontFamily = nunitoBold,
            fontSize = 12.sp,
            color = accgrey
        )
        Text(
            text = homeRowTitleUMKM[homeRowItemIndex],
            fontFamily = nunitoBold,
            fontSize = 16.sp,
            color = accblack
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(
                imageVector = Icons.Default.Star, contentDescription = null, Modifier.size(15.dp),
                tint = accyellow
            )
            Spacer(modifier = Modifier.padding(end = 2.dp))


            Text(
                text = homeRowRatingUMKM[homeRowItemIndex],
                fontFamily = nunitoBold,
                fontSize = 14.sp,
                color = accgrey
            )
        }
    }
}

@Composable
fun ColumnItem(
    itemIndex: Int,
    photos: Array<Int>,
    titleUMKM: Array<String>,
    descriptUMKM: Array<String>,
    rangeUMKM: Array<String>,
    ratingUMKM: Array<String>,
    addreessUMKM: Array<String>,
    navController: NavController
) {
    Row(
        modifier = Modifier
            .padding(bottom = 18.dp)
            .fillMaxWidth()
            .clickable {
                navController.navigate("${NavigationScreen.DetailScreen.name}/$itemIndex")
            },
    ) {
        Image(
            painter = painterResource(id = photos[itemIndex]),
            contentDescription = null,
            modifier = Modifier
                .height(100.dp)
                .width(100.dp)
                .clip(shape = RoundedCornerShape(4.dp))
        )
        Column(
            modifier = Modifier
                .padding(start = 18.dp)
                .align(Alignment.CenterVertically)
        ) {
            Text(
                text = titleUMKM[itemIndex],
                fontFamily = nunitoBold,
                fontSize = 18.sp,
                color = accblack
            )
            Row(
            ) {
                Text(
                    text = rangeUMKM[itemIndex],
                    fontFamily = nunitoBold,
                    fontSize = 14.sp,
                    color = accgrey
                )
                Spacer(modifier = Modifier.padding(end = 6.dp))
                Icon(
                    modifier = Modifier.size(15.dp),
                    imageVector = Icons.Default.Star,
                    tint = accyellow,
                    contentDescription = "Star"
                )
                Spacer(modifier = Modifier.padding(end = 2.dp))

                Text(
                    text = ratingUMKM[itemIndex],
                    fontFamily = nunitoBold,
                    fontSize = 14.sp,
                    color = accgrey
                )
            }

        }
    }
}



