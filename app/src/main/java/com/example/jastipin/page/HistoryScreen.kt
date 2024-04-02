package com.example.jastipin.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.R
import com.example.jastipin.ui.theme.accgrey
import com.example.jastipin.ui.theme.nunitoBold
import java.time.LocalDate
import java.time.format.DateTimeFormatterBuilder
import java.util.Locale

@Composable
fun HistoryScreen(navController: NavController) {
    val currentDate = LocalDate.now()
    val dateFormatter = DateTimeFormatterBuilder()
        .appendPattern("dd MMMM yyyy")
        .toFormatter(Locale("id", "ID"))
    val formattedDate = currentDate.format(dateFormatter)

    Surface(
        modifier = Modifier.fillMaxSize(),

        color = MaterialTheme.colorScheme.background
    ) {
        Image(
            painter = painterResource(id = R.drawable.iconchat),
            contentDescription = "image description",
            contentScale = ContentScale.None
        )

    }
    Column {


        Text(
            text = "Riwayat",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF1F2A37),

                ),
            modifier = Modifier
                .padding(start = 24.dp, top = 62.dp)
                .width(99.dp)
                .height(27.dp)
        )
        Text(
            text = "17 Maret 2024",
            style = TextStyle(

                fontSize = 12.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFFA8A8A8),
            ),
            modifier = Modifier
                .padding(
                    start = 25.dp, top = 6
                        .dp
                )
                .width(81.dp)
                .height(15.dp)

        )
        Row {


            Box(
                modifier = Modifier
                    .padding(start = 20.dp, top = 26.dp)
                    .width(68.dp)
                    .height(85.dp)
                    .background(color = Color(0xFFFA6541), shape = RoundedCornerShape(size = 8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Column {

                    Text(
                        text = "April",
                        style = TextStyle(
                            fontSize = 9.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(start = 24.dp, end = 22.dp)
                            .width(21.dp)
                            .height(12.dp)
                    )
                    Text(
                        text = "17",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(start = 20.dp, end = 18.dp)
                    )
                    Spacer(modifier = Modifier.height(4.dp)) // Adding some space between the texts
                    Text(
                        text = "Minggu",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(start = 17.dp, end = 7.dp)
                            .width(35.dp)
                            .height(14.dp)
                    )

                }

            }


            Box(
                modifier = Modifier
                    .padding(start = 20.dp, top = 26.dp)
                    .width(68.dp)
                    .height(85.dp)
                    .background(color = Color(0xE5E5E5), shape = RoundedCornerShape(size = 8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Column {

                    Text(
                        text = "April",
                        style = TextStyle(
                            fontSize = 9.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFABABAB),
                            textAlign = TextAlign.Center,
                        )
                    )
                    Text(
                        text = "18",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFABABAB),
                            textAlign = TextAlign.Center,
                        )
                    )
                    Spacer(modifier = Modifier.height(4.dp)) // Adding some space between the texts
                    Text(
                        text = "Senin",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        ),
                    )

                }

            }

            Box(
                modifier = Modifier
                    .padding(start = 20.dp, top = 26.dp)
                    .width(68.dp)
                    .height(85.dp)
                    .background(color = Color(0xE5E5E5), shape = RoundedCornerShape(size = 8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Column {

                    Text(
                        text = "April",
                        style = TextStyle(
                            fontSize = 9.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFABABAB),
                            textAlign = TextAlign.Center,
                        )
                    )
                    Text(
                        text = "19",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFABABAB),
                            textAlign = TextAlign.Center,
                        )
                    )
                    Spacer(modifier = Modifier.height(4.dp)) // Adding some space between the texts
                    Text(
                        text = "Selasa",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFABABAB),
                            textAlign = TextAlign.Center,
                        ),
                    )

                }

            }
            Box(
                modifier = Modifier
                    .padding(start = 20.dp, top = 26.dp)
                    .width(68.dp)
                    .height(85.dp)
                    .background(color = Color(0xE5E5E5), shape = RoundedCornerShape(size = 8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Column {

                    Text(
                        text = "April",
                        style = TextStyle(
                            fontSize = 9.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFABABAB),
                            textAlign = TextAlign.Center,
                        )
                    )
                    Text(
                        text = "20",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFABABAB),
                            textAlign = TextAlign.Center,
                        )
                    )
                    Spacer(modifier = Modifier.height(4.dp)) // Adding some space between the texts
                    Text(
                        text = "Rabu",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFABABAB),
                            textAlign = TextAlign.Center,
                        ),
                    )


                }


            }
            Box(
                modifier = Modifier
                    .padding(start = 20.dp, top = 26.dp)
                    .width(68.dp)
                    .height(85.dp)
                    .background(color = Color(0xE5E5E5), shape = RoundedCornerShape(size = 8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Column {

                    Text(
                        text = "april",
                        style = TextStyle(
                            fontSize = 9.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFABABAB),
                            textAlign = TextAlign.Center,
                        )
                    )
                    Text(
                        text = "2",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFABABAB),
                            textAlign = TextAlign.Center,
                        )
                    )
                    Spacer(modifier = Modifier.height(4.dp)) // Adding some space between the texts
                    Text(
                        text = "Kamis",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFABABAB),
                            textAlign = TextAlign.Center,
                        ),
                    )
                    Box(
                        modifier = Modifier
                            .padding(start = 125.dp, top = 25.dp)
                            .width(165.dp)
                            .height(19.dp)
                            .background(
                                color = Color(0xE5E5E5),
                                shape = RoundedCornerShape(size = 8.dp)
                            ),

                        )

                }

            }


        }

        Column {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .padding(start = 41.dp, top = 65.dp)
                        .size(76.dp)
                        .background(
                            color = Color(0xFFD9D9D9),
                            shape = RoundedCornerShape(8.dp)
                        ),

                    )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "Jekko Pizza Nusantara",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFF1F2A37),
                        ),
                        modifier = Modifier
                            .width(165.dp)
                            .height(19.dp)

                    )
                    Text(
                        text = "0.64 km",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFC3C3C3),
                        ),
                        modifier = Modifier
                            .width(38.dp)
                            .height(12.dp)
                    )
                    Text(
                        text = "4.9",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFC3C3C3),
                        ),
                        modifier = Modifier
                            .width(21.dp)
                            .height(19.dp)
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.iconchat),
                            contentDescription = "image description",
                            contentScale = ContentScale.None,
                            modifier = Modifier
                                .padding(end = 4.dp)
                                .size(12.35294.dp)
                        )
                        Text(
                            text = "Ngawi",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight(700),
                                color = Color(0xFF1F2A37),
                            )
                        )
                    }
                }
            }
        }
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .padding(start = 41.dp, top = 42.dp)
                        .size(76.dp)
                        .background(
                            color = Color(0xFFD9D9D9),
                            shape = RoundedCornerShape(8.dp)
                        )

                )

                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "Jekko Pizza Nusantara",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFF1F2A37),
                        ),
                        modifier = Modifier
                            .width(165.dp)
                            .height(19.dp)
                    )
                    Text(
                        text = "0.64 km",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFC3C3C3),
                        )
                    )
                    Text(
                        text = "4.9",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFC3C3C3),
                        ),
                        modifier = Modifier
                            .width(21.dp)
                            .height(19.dp)
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.iconchat),
                            contentDescription = "image description",
                            contentScale = ContentScale.None,
                            modifier = Modifier
                                .padding(start = 1.dp, end = 4.dp)
                                .size(12.35294.dp)
                        )
                        Text(
                            text = "Ngawi",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight(700),
                                color = Color(0xFF1F2A37),
                            )
                        )
                    }
                }
            }
        }
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(

                    modifier = Modifier
                        .padding(start = 41.dp, top = 42.dp)
                        .size(76.dp)
                        .background(
                            color = Color(0xFFD9D9D9),
                            shape = RoundedCornerShape(8.dp)
                        )
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "Jekko Pizza Nusantara",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFF1F2A37),
                        ),
                        modifier = Modifier
                            .width(165.dp)
                            .height(19.dp)
                    )
                    Text(
                        text = "0.64 km",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFC3C3C3),
                        )
                    )
                    Text(
                        text = "4.9",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFC3C3C3),
                        ),
                        modifier = Modifier.height(19.dp)
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.iconchat),
                            contentDescription = "image description",
                            contentScale = ContentScale.None,
                            modifier = Modifier
                                .padding(end = 4.dp)
                                .size(12.35294.dp)
                        )
                        Text(
                            text = "Ngawi",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight(700),
                                color = Color(0xFF1F2A37),
                            )
                        )
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewHistoryScreen() {
    HistoryScreen(navController = rememberNavController())
}