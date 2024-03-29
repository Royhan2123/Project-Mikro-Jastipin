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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.navigation.NavigationScreen
import com.example.jastipin.ui.theme.accblack
import com.example.jastipin.ui.theme.accgrey
import com.example.jastipin.ui.theme.accgrey2
import com.example.jastipin.ui.theme.accyellow
import com.example.jastipin.ui.theme.black
import com.example.jastipin.ui.theme.interRegular
import com.example.jastipin.ui.theme.nunitoBold
import com.example.jastipin.ui.theme.orange
import com.example.jastipin.ui.theme.outlinebox
import com.example.jastipin.widget.SearchViewModel

//data class SearchItemList(
//    val imageResId: Int,
//    val namaumkm: String,
//    val ratingumkm: String,
//    val lokasiumkm: String
//) {
//    fun doesMatchSearchQuery(query: String): Boolean {
//        val matchingCombinations = listOf(
//            "$imageResId",
//            namaumkm,
//            ratingumkm,
//            lokasiumkm
//        )
//
//        return matchingCombinations.any {
//            it.contains(query, ignoreCase = true)
//        }
//    }
//}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavController) {
    val viewModel = viewModel<SearchViewModel>()
    val searchText by viewModel.searchText.collectAsState()
    val products by viewModel.products.collectAsState()
    val isSearching by viewModel.isSearching.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize()
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
                        .size(55.dp)
                        .border(
                            width = 1.dp,
                            color = outlinebox,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clickable {
                            navController.navigate(NavigationScreen.HalamanBottom.name)
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        modifier = Modifier.size(25.dp),
                        imageVector = Icons.Default.ArrowBackIosNew,
                        contentDescription = null,
                        tint = accblack,
                    )
                }
                Box(
                    modifier = Modifier
                        .width(305.dp)
                        .height(55.dp)
                ) {
                    OutlinedTextField(
                        value = searchText,
                        onValueChange = viewModel::onSearchTextChange,
                        placeholder = {
                            Text(text = "Cari Yang Kamu Inginkan...")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(65.dp),
                        textStyle = TextStyle(
                            color = black,
                            fontSize = 15.sp,
                            fontFamily = interRegular
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(50.dp))

            if (isSearching) {
                Box(modifier = Modifier.fillMaxSize()) {
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            } else {
                androidx.compose.foundation.lazy.LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    items(products) { product ->
                        Row(
                            modifier = Modifier
                                .padding(top = 14.dp, bottom = 14.dp)
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = product.imageResId),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(80.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))
                            )
                            Column(
                                modifier = Modifier
                                    .padding(start = 18.dp)
                                    .align(Alignment.CenterVertically)
                            ) {
                                androidx.compose.material.Text(
                                    text = product.namaumkm,
                                    fontFamily = nunitoBold,
                                    fontSize = 16.sp,
                                    color = accblack
                                )
                                Row {
                                    androidx.compose.material.Icon(
                                        modifier = Modifier.size(16.dp),
                                        imageVector = Icons.Default.Star,
                                        tint = accyellow,
                                        contentDescription = "Star"
                                    )
                                    Spacer(modifier = Modifier.padding(end = 6.dp))
                                    androidx.compose.material.Text(
                                        text = product.ratingumkm,
                                        fontFamily = nunitoBold,
                                        fontSize = 13.sp,
                                        color = accgrey
                                    )
                                }

                                androidx.compose.material.Text(
                                    text = product.lokasiumkm,
                                    fontFamily = nunitoBold,
                                    fontSize = 14.sp,
                                    color = orange
                                )
                            }
                        }

                        Divider(color = accgrey2, thickness = 2.dp)
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun vieww() {
    SearchScreen(navController = rememberNavController())
}