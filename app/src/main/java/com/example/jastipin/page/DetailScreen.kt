package com.example.jastipin.page

import android.content.Context
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.os.bundleOf
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import androidx.navigation.NavController
import com.example.jastipin.R
import com.example.jastipin.navigation.NavigationScreen
import com.example.jastipin.ui.theme.accblack
import com.example.jastipin.ui.theme.accgrey
import com.example.jastipin.ui.theme.accyellow
import com.example.jastipin.ui.theme.fontgrey
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.interBold
import com.example.jastipin.ui.theme.interMedium
import com.example.jastipin.ui.theme.interRegular
import com.example.jastipin.ui.theme.orange
import kotlinx.coroutines.launch


@Composable
fun DetailScreen(
    // received data column
    itemIndex: Int?,
    photos: Array<Int>,
    descriptionnsUMKM: Array<String>,
    namesUMKM: Array<String>,
    rangesUMKM: Array<String>,
    ratingsUMKM: Array<String>,
    addresssUMKM: Array<String>,

    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth(),

            ) {
            Image(
                painter = painterResource(id = photos[itemIndex!!]),
                contentDescription = null
            )

            Spacer(modifier = Modifier.height(18.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                androidx.compose.material.Text(
                    text = namesUMKM[itemIndex],
                    fontSize = 24.sp,
                    fontFamily = interBold,
                    color = accblack
                )
                Spacer(modifier = Modifier.height(8.dp))

                androidx.compose.material.Text(
                    text = descriptionnsUMKM[itemIndex],
                    fontSize = 14.sp,
                    fontFamily = interRegular,
                    color = fontgrey
                )
                Spacer(modifier = Modifier.height(12.dp))

                androidx.compose.material.Text(
                    text = addresssUMKM[itemIndex],
                    fontSize = 13.sp,
                    fontFamily = interMedium,
                    color = accblack
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(15.dp),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.stargroupicon),
                        contentDescription = null,
                        tint = accyellow
                    )
                    Spacer(modifier = Modifier.width(6.dp))

                    androidx.compose.material.Text(
                        text = ratingsUMKM[itemIndex],
                        fontSize = 14.sp,
                        fontFamily = interMedium,
                        color = accblack
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    androidx.compose.material.Text(
                        text = "|",
                        fontSize = 14.sp,
                        fontFamily = interMedium,
                        color = accgrey
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    androidx.compose.material.Text(
                        text = "166 Terjual",
                        fontSize = 14.sp,
                        fontFamily = interMedium,
                        color = accblack
                    )
                }
                Column(
                    modifier = Modifier
                        .width(120.dp)
                        .height(80.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Spacer(modifier = Modifier.height(10.dp))
                    androidx.compose.material.Text(
                        text = "Produk",
                        fontSize = 13.sp,
                        fontFamily = interBold,
                        color = accblack
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Divider(color = orange, thickness = 2.dp)
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 30.dp, horizontal = 25.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SmallFloatingActionButton(
                onClick = {
                    navController.navigate(BottomNavigationScreen.HomeScreen.title)
                },
                containerColor = grey.copy(alpha = 0.8f),
                contentColor = accblack
            ) {
                Icon(
                    Icons.Filled.ArrowBackIosNew,
                    "Small floating action button.",
                    Modifier.size(20.dp)
                )
            }
            SmallFloatingActionButton(
                onClick = {
//                    navController.navigate(NavigationScreen.HomeScreen.name)
                },
                containerColor = grey.copy(alpha = 0.8f),
                contentColor = accblack
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.carticon),
                    contentDescription = null,
                    Modifier.size(25.dp)
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 210.dp, horizontal = 25.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "")
            FloatingActionButton(
                modifier = Modifier.size(50.dp),
                onClick = {
                    navController.navigate("${BottomNavigationScreen.WishlistScreen.title}/$itemIndex")
                },
                backgroundColor = Color.White
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.loveicon),
                    contentDescription = null,
                    Modifier.size(25.dp),
                    tint = Color.Red
                )
            }
        }
    }
}





