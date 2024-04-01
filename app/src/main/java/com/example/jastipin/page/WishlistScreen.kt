package com.example.jastipin.page

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jastipin.R
import com.example.jastipin.ui.theme.accblack
import com.example.jastipin.ui.theme.accgrey
import com.example.jastipin.ui.theme.accyellow
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.nunitoBold
import com.example.jastipin.ui.theme.orange
import com.example.jastipin.ui.theme.outlinebox
import java.time.LocalDate
import java.time.format.DateTimeFormatterBuilder
import java.util.Locale

@Composable
fun WishlistScreen(
    itemIndex: Int?,
    imageId: Array<Int>,
    title2UMKM: Array<String>,
    range2UMKM: Array<String>,
    ratins2UMKM: Array<String>,
    location2UMKM: Array<String>,

    navController: NavController
) {
    val currentDate = LocalDate.now()
    val dateFormatter = DateTimeFormatterBuilder()
        .appendPattern("dd MMMM yyyy")
        .toFormatter(Locale("id", "ID"))
    val formattedDate = currentDate.format(dateFormatter)


    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
        ) {
            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Wishlist",
                        fontSize = 28.sp,
                        fontFamily = nunitoBold,
                        color = accblack
                    )
                    Text(
                        text = "$formattedDate",
                        fontSize = 14.sp,
                        fontFamily = nunitoBold,
                        color = accgrey
                    )
                }
                androidx.compose.material3.Icon(
                    modifier = Modifier.size(38.dp),
                    painter = painterResource(id = R.drawable.carticon),
                    contentDescription = null,
                )
            }
            Spacer(modifier = Modifier.height(60.dp))

            androidx.compose.foundation.lazy.LazyColumn(contentPadding = PaddingValues(2.dp)) {
                val itemCount = imageId.size
                items(itemCount) {
                    wishlistColumnItem(
                        itemIndex = it,
                        image = imageId,
                        titleUMKM = title2UMKM,
                        rangeUMKM = range2UMKM,
                        ratinsUMKM = ratins2UMKM,
                        locationUMKM = location2UMKM,
                    )
                }
            }
        }
    }
}



@Composable
fun wishlistColumnItem(
    itemIndex: Int?,
    image: Array<Int>,
    titleUMKM: Array<String>,
    rangeUMKM: Array<String>,
    ratinsUMKM: Array<String>,
    locationUMKM: Array<String>,
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .border(
                width = 2.dp,
                color = outlinebox,
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 12.dp, vertical = 12.dp),
        ) {
            Image(
                painter = painterResource(id = image[itemIndex!!]),
                contentDescription = null,
                modifier = Modifier
                    .height(95.dp)
                    .width(95.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
            )
            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(
                    text = titleUMKM[itemIndex],
                    fontFamily = nunitoBold,
                    fontSize = 17.sp,
                    color = accblack
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    Text(
                        text = rangeUMKM[itemIndex],
                        fontFamily = nunitoBold,
                        fontSize = 13.sp,
                        color = accgrey
                    )
                    Icon(
                        modifier = Modifier.size(16.dp),
                        imageVector = Icons.Default.Star,
                        tint = accyellow,
                        contentDescription = "Star"
                    )
                    Text(
                        text = ratinsUMKM[itemIndex],
                        fontFamily = nunitoBold,
                        fontSize = 13.sp,
                        color = accgrey
                    )
                }
                Text(
                    text = locationUMKM[itemIndex],
                    fontFamily = nunitoBold,
                    fontSize = 15.sp,
                    color = orange
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        modifier = Modifier
                            .width(110.dp)
                            .height(28.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(backgroundColor = orange)
                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxSize()
                                .align(Alignment.CenterVertically),
                            text = "Tambah Keranjang",
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 9.sp,
                                fontFamily = nunitoBold
                            )
                        )
                    }
                    Icon(
                        painter = painterResource(id = R.drawable.loveicon),
                        contentDescription = null,
                        tint = Color.Red
                    )
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(12.dp))
}

