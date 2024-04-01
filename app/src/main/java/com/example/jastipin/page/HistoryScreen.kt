package com.example.jastipin.page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column {
                Text(
                    text = stringResource(id = R.string.riwayat),
                    fontSize = 25.sp,
                    fontFamily = nunitoBold,
                )
                Text(
                    text = formattedDate,
                    fontSize = 14.sp,
                    fontFamily = nunitoBold,
                    color = accgrey
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewHistoryScreen() {
    HistoryScreen(navController = rememberNavController())
}