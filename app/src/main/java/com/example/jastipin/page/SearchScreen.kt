package com.example.jastipin.page

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.R
import com.example.jastipin.ui.theme.accblack
import com.example.jastipin.ui.theme.accgrey
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.outlinebox
import com.example.jastipin.widget.SearchItemList
import com.example.jastipin.widget.SearchLazyColumn

@Composable
fun SearchScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(grey)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 12.dp)
        ) {
            Spacer(modifier = Modifier.height(40.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .border(
                            width = 1.dp,
                            color = outlinebox,
                            shape = RoundedCornerShape(8.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        imageVector = Icons.Default.ArrowBackIosNew,
                        contentDescription = null,
                        tint = accblack,
                    )
                }
                Box(
                    modifier = Modifier
                        .width(300.dp)
                        .height(60.dp)
                        .background(grey)
                        .border(
                            width = 1.dp,
                            color = outlinebox,
                            shape = RoundedCornerShape(8.dp)
                        )
                ) {

                }
            }
            Spacer(modifier = Modifier.height(60.dp))

            SearchLazyColumn()
        }
    }
}

@Composable
fun SearchLazyColumn() {
    val items = listOf(
        SearchItemList(
            imageResId = R.drawable.searchimage1,
            text1 = "Bakso & Soto Kedai Berkah",
            text2 = "4.9",
            text3 = "Lubuk Linggau"
        ),
        SearchItemList(
            imageResId = R.drawable.searchimage2,
            text1 = "Dapur Nenek Restaurant",
            text2 = "4.9",
            text3 = "Lubuk Linggau"
        ),
        SearchItemList(
            imageResId = R.drawable.searchimage3,
            text1 = "Aroma Restaurant Lubuklinggau",
            text2 = "4.9",
            text3 = "Lubuk Linggau"
        ),
        SearchItemList(
            imageResId = R.drawable.searchimage4,
            text1 = "Seafood 21 dan BURYAM",
            text2 = "4.9",
            text3 = "Lubuk Linggau"
        ),
        SearchItemList(
            imageResId = R.drawable.searchimage5,
            text1 = "Pindang Tulang",
            text2 = "4.9",
            text3 = "Lubuk Linggau"
        ),
        SearchItemList(
            imageResId = R.drawable.searchimage6,
            text1 = "Pagi sore Restaurant",
            text2 = "4.9",
            text3 = "Lubuk Linggau"
        )
    )
    SearchLazyColumn(items = items)
}

@Preview
@Composable
fun vieww() {
    SearchScreen(navController = rememberNavController())
}