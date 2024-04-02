package com.example.jastipin.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jastipin.R
import com.example.jastipin.ui.theme.accblack
import com.example.jastipin.ui.theme.accgrey
import com.example.jastipin.ui.theme.accyellow
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.nunitoBold
import com.example.jastipin.ui.theme.orange
import com.example.jastipin.ui.theme.outlinebox

data class Wishlist(
    val itemId: Int,
    val imageResId: Int,
    val namaUMKM: String,
    val jarakUMKM: String,
    val ratingUMKM: String,
    val lokasiUMKM: String,
)

@Composable
fun WishlistLazyColumn(items: List<Wishlist>) {
    LazyColumn {
        items(items) { item ->
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(grey)
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
                        painter = painterResource(id = item.imageResId),
                        contentDescription = null,
                        modifier = Modifier
                            .height(95.dp)
                            .width(95.dp)
                            .clip(shape = RoundedCornerShape(4.dp))
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Column {
                        Text(
                            text = item.namaUMKM,
                            fontFamily = nunitoBold,
                            fontSize = 17.sp,
                            color = accblack
                        )
                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {

                            Text(
                                text = item.jarakUMKM,
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
                                text = item.ratingUMKM,
                                fontFamily = nunitoBold,
                                fontSize = 13.sp,
                                color = accgrey
                            )
                        }
                        Text(
                            text = item.lokasiUMKM,
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
    }
}

@Preview
@Composable
fun previewWishlistColumn() {
    val items = listOf(
        Wishlist(
            itemId = 1,
            imageResId = R.drawable.columnimage3,
            namaUMKM = "Jekko Pizza Nusantara",
            jarakUMKM = "0.64 km",
            lokasiUMKM = "Ngawi",
            ratingUMKM = "4.8"
        ),
        Wishlist(
            itemId = 1,
            imageResId = R.drawable.columnimage3,
            namaUMKM = "Jekko Pizza Nusantara",
            jarakUMKM = "0.64 km",
            lokasiUMKM = "Ngawi",
            ratingUMKM = "4.8"
        )
    )
    WishlistLazyColumn(items = items)
}