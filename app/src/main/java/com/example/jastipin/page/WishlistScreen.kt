package com.example.jastipin.page

import androidx.compose.foundation.background
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
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.R
import com.example.jastipin.ui.theme.accblack
import com.example.jastipin.ui.theme.accgrey
import com.example.jastipin.ui.theme.accgrey2
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.nunitoBold
import com.example.jastipin.widget.Wishlist
import com.example.jastipin.widget.WishlistLazyColumn
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.util.Locale

@Composable
fun WishlistScreen(navController: NavController) {
    val currentDate = LocalDate.now()
    val dateFormatter = DateTimeFormatterBuilder()
        .appendPattern("dd MMMM yyyy")
        .toFormatter(Locale("id", "ID"))
    val formattedDate = currentDate.format(dateFormatter)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(grey)
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

            WishlistColumn()
        }
    }
}

@Composable
fun WishlistColumn() {
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
            itemId = 2,
            imageResId = R.drawable.columnimage3,
            namaUMKM = "Jekko Pizza Nusantara",
            jarakUMKM = "0.64 km",
            lokasiUMKM = "Ngawi",
            ratingUMKM = "4.8"
        )
    )
    WishlistLazyColumn(items = items)
}

@Preview
@Composable
fun test() {
    WishlistScreen(navController = rememberNavController())
}