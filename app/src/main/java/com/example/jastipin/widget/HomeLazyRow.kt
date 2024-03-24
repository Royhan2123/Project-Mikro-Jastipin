package com.example.jastipin.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Start
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jastipin.R
import com.example.jastipin.ui.theme.nunitoBold
import com.example.jastipin.ui.theme.orange

data class ListItem(val imageResId: Int, val text1: String, val text2: String, val text3: String)

@Composable
fun LazyRowWithColumn(items: List<ListItem>) {
    LazyRow {
        items(items) { item ->
            Column(
                modifier = Modifier.padding(end = 18.dp)
                    .width(120.dp)
            ) {
                Image(
                    painter = painterResource(id = item.imageResId),
                    contentDescription = null,
                    modifier = Modifier
                        .width(180.dp)
                        .clip(shape = RoundedCornerShape(6.dp))
                )
                Text(text = item.text1, fontFamily = nunitoBold, fontSize = 10.sp)
                Text(text = item.text2, fontFamily = nunitoBold, fontSize = 14.sp)
                Text(text = item.text3, fontFamily = nunitoBold, fontSize = 12.sp)
            }
        }
    }
}

@Preview
@Composable
fun PreviewLazyRowWithColumn() {
    val items = remember {
        listOf(
            ListItem(
                imageResId = R.drawable.image1,
                text1 = "Text 1A",
                text2 = "Text 2A",
                text3 = "Text 3A"
            ),
            ListItem(
                imageResId = R.drawable.image1,
                text1 = "Text 1B",
                text2 = "Text 2B",
                text3 = "Text 3B"
            ),
            ListItem(
                imageResId = R.drawable.image1,
                text1 = "Text 1C",
                text2 = "Text 2C",
                text3 = "Text 3C"
            )
        )
    }
    LazyRowWithColumn(items = items)
}