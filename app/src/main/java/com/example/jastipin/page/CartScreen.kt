package com.example.jastipin.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
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
import com.example.jastipin.ui.theme.fontgrey
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.nunitoBold
import com.example.jastipin.ui.theme.orange

@Composable
fun CartScreen(
    navController: NavController,
) {
    val checked = remember { mutableStateOf(true) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(grey)
    )
    {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .height(80.dp)
                    .padding(horizontal = 50.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBackIosNew,
                    contentDescription = null,
                    Modifier.size(22.dp)
                )
                Text(
                    text = "Keranjang",
                    style = TextStyle(
                        fontSize = 24.sp,
                        color = accblack,
                        fontFamily = nunitoBold,
                    ),
                )
                Text(text = "")
            }

            Spacer(modifier = Modifier.height(40.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(horizontal = 6.dp, vertical = 15.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = checked.value,
                    onCheckedChange = { isChecked -> checked.value = isChecked }
                )
                Image(
                    painter = painterResource(id = R.drawable.detailimage),
                    contentDescription = null,
                    Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(
                        text = "Ayam Bakar",
                        style = TextStyle(
                            fontSize = 16.sp,
                            color = accblack,
                            fontFamily = nunitoBold,
                        ),
                    )
                    Text(
                        text = "Rp 13.000,-",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = fontgrey,
                            fontFamily = nunitoBold,
                        ),
                    )
                    Row(
                        modifier = Modifier
                            .height(35.dp)
                            .width(80.dp)
                            .padding(vertical = 6.dp)
                            .background(Color(0xffFFE4DD))
                            .border(
                                width = 2.dp,
                                color = Color(0xffFFE4DD),
                                shape = RoundedCornerShape(10.dp)
                            ),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "-",
                            style = TextStyle(
                                fontSize = 14.sp,
                                color = accblack,
                                fontFamily = nunitoBold,
                            ),
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        Text(
                            text = "1",
                            style = TextStyle(
                                fontSize = 14.sp,
                                color = accblack,
                                fontFamily = nunitoBold,
                            ),
                        )
                        Spacer(modifier = Modifier.width(15.dp))

                        Text(
                            text = "+",
                            style = TextStyle(
                                fontSize = 14.sp,
                                color = accblack,
                                fontFamily = nunitoBold,
                            ),
                        )
                    }
                }
                Spacer(modifier = Modifier.width(120.dp))
                Icon(
                    modifier = Modifier.align(Alignment.Top),
                    imageVector = Icons.Default.Delete,
                    contentDescription = null,
                    tint = accgrey,
                )
            }
            Spacer(modifier = Modifier.height(350.dp))
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 14.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            text = "Total",
                            style = TextStyle(
                                fontSize = 20.sp,
                                color = accblack,
                                fontFamily = nunitoBold,
                            ),
                        )
                        Text(
                            text = "Rp 13.000,-",
                            style = TextStyle(
                                fontSize = 14.sp,
                                color = orange,
                                fontFamily = nunitoBold,
                            ),
                        )
                    }
                    Button(
                        modifier = Modifier
                            .width(110.dp)
                            .height(35.dp),
                        onClick = {
                            navController.navigate(
                                NavigationScreen.FindDriverScreen.name
                            )
                        },
                        colors = ButtonDefaults.buttonColors(backgroundColor = orange)
                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 15.dp)
                                .clickable {
                                    navController.navigate(
                                        NavigationScreen.FindDriverScreen.name
                                    )
                                },
                            text = "Pesan",
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 15.sp,
                                fontFamily = nunitoBold,
                            )
                        )
                    }
                }
            }
        }

    }
}

@Preview
@Composable
fun viewCart() {
    CartScreen(navController = rememberNavController())
}

@Composable
fun SimpleDialog(
    showDialog: Boolean,
    onYesClicked: () -> Unit,
    onNoClicked: () -> Unit
) {
    if (showDialog) {
        AlertDialog(
            onDismissRequest = { /* Tidak melakukan apa-apa ketika dialog ditutup */ },
            title = { Text("Judul Dialog") },
            text = { Text("Ini adalah deskripsi dialog yang sederhana.") },
            confirmButton = {
                Button(
                    onClick = {
                        onYesClicked()
                    }
                ) {
                    Text("Ya")
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        onNoClicked()
                    }
                ) {
                    Text("Tidak")
                }
            }
        )
    }
}
