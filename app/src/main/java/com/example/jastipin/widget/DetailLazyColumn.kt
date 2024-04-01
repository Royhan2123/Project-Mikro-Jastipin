package com.example.jastipin.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircleOutline
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jastipin.R
import com.example.jastipin.ui.theme.accblack
import com.example.jastipin.ui.theme.accgrey
import com.example.jastipin.ui.theme.accgrey2
import com.example.jastipin.ui.theme.accyellow
import com.example.jastipin.ui.theme.fontgrey
import com.example.jastipin.ui.theme.nunitoBold
import com.example.jastipin.ui.theme.nunitoMedium
import com.example.jastipin.ui.theme.orange

//data class listDetail(
//    val itemIndex: Int,
//    val imageResId: Array<Int>,
//    val namaUMKM: Array<String>,
//    val jarakUMKM: Array<String>,
//    val ratingUMKM: Array<String>,
//    val lokasiUMKM: Array<String>,
//)

//
//@Composable
//fun DetailLazyColumn(
//    itemIndex: Int,
//    imageResId: Array<Int>,
//    namaUMKM: Array<String>,
//    jarakUMKM: Array<String>,
//    ratingUMKM: Array<String>,
//    lokasiUMKM: Array<String>,
//) {
//    LazyColumn() {
//        Row(
//            modifier = Modifier
//                .padding(top = 14.dp, bottom = 14.dp)
//                .fillMaxWidth()
//        ) {
//            Image(
//                painter = painterResource(id = imageResId[itemIndex]),
//                contentDescription = null,
//                modifier = Modifier
//                    .height(80.dp)
//                    .width(80.dp)
//                    .clip(shape = RoundedCornerShape(4.dp))
//            )
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//
//                Column(
//                    modifier = Modifier
//                        .padding(start = 18.dp)
//                        .align(Alignment.CenterVertically)
//                ) {
//                    Text(
//                        text = namaUMKM[itemIndex],
//                        fontFamily = nunitoBold,
//                        fontSize = 16.sp,
//                        color = accblack
//                    )
//                    Text(
//                        text = jarakUMKM[itemIndex],
//                        fontFamily = nunitoMedium,
//                        fontSize = 13.sp,
//                        color = fontgrey
//                    )
//                    Text(
//                        text = ratingUMKM[itemIndex],
//                        fontFamily = nunitoBold,
//                        fontSize = 14.sp,
//                        color = accblack
//                    )
//                }
//                Icon(
//                    imageVector = Icons.Default.AddCircleOutline,
//                    contentDescription = null,
//                    tint = orange
//                )
//            }
//        }
//    }
//}

//@Preview
//@Composable
//fun viewDetail() {
//    val items = listOf(
//        listDetail(1, R.drawable.detailimage1, "APA", "APA", "APA", "APA"),
//        listDetail(1, R.drawable.detailimage1, "APA", "APA", "APA", "APA"),
//        listDetail(1, R.drawable.detailimage1, "APA", "APA", "APA", "APA")
//
//}

