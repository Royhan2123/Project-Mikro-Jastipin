package com.example.jastipin.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jastipin.navigation.NavigationScreen
import com.example.jastipin.ui.theme.accblack
import com.example.jastipin.ui.theme.accgrey
import com.example.jastipin.ui.theme.accyellow
import com.example.jastipin.ui.theme.nunitoBold
//
//@Composable
//fun HomeScreen2(
//    imageId: Array<Int>,
//    nameUMKM: Array<String>,
//    range2UMKM: Array<String>,
//    rating2UMKM: Array<String>,
//    navController: NavController,
//    ) {
//    androidx.compose.foundation.lazy.LazyColumn(contentPadding = PaddingValues(12.dp)) {
//        val itemCount = imageId.size
//        items(itemCount) {
//            ColumnItem(
//                itemIndex = it,
//                photos = imageId,
//                titleUMKM = nameUMKM,
//                desc
//                rangeUMKM = range2UMKM,
//                ratingUMKM = rating2UMKM,
//                navController = navController
//            )
//        }
//    }
//}

//@Composable
//fun ColumnItem(
//    itemIndex: Int,
//    photos: Array<Int>,
//    titleUMKM: Array<String>,
//    rangeUMKM: Array<String>,
//    ratingUMKM: Array<String>,
//    navController: NavController
//) {
//    Row(
//        modifier = Modifier
//            .padding(bottom = 18.dp)
//            .fillMaxWidth()
//            .clickable {
//                navController.navigate("${NavigationScreen.DetailScreen.name}/$itemIndex")
//            },
//    ) {
//        Image(
//            painter = painterResource(id = photos[itemIndex]),
//            contentDescription = null,
//            modifier = Modifier
//                .height(100.dp)
//                .width(100.dp)
//                .clip(shape = RoundedCornerShape(4.dp))
//        )
//        Column(
//            modifier = Modifier
//                .padding(start = 18.dp)
//                .align(Alignment.CenterVertically)
//        ) {
//            Text(
//                text = titleUMKM[itemIndex],
//                fontFamily = nunitoBold,
//                fontSize = 18.sp,
//                color = accblack
//            )
//            Row(
//            ) {
//                Text(
//                    text = rangeUMKM[itemIndex],
//                    fontFamily = nunitoBold,
//                    fontSize = 14.sp,
//                    color = accgrey
//                )
//                Spacer(modifier = Modifier.padding(end = 6.dp))
//                Icon(
//                    modifier = Modifier.size(18.dp),
//                    imageVector = Icons.Default.Star,
//                    tint = accyellow,
//                    contentDescription = "Star"
//                )
//                Spacer(modifier = Modifier.padding(end = 2.dp))
//
//                Text(
//                    text = ratingUMKM[itemIndex],
//                    fontFamily = nunitoBold,
//                    fontSize = 14.sp,
//                    color = accgrey
//                )
//            }
//
//        }
//    }
//}