package com.example.jastipin.widget

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
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
import com.example.jastipin.ui.theme.accblack
import com.example.jastipin.ui.theme.accgrey
import com.example.jastipin.ui.theme.accgrey2
import com.example.jastipin.ui.theme.accyellow
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.nunitoBold
import com.example.jastipin.ui.theme.orange
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

data class SearchItemList(
    val imageResId: Int,
    val text1: String,
    val text2: String,
    val text3: String
)

@Composable
fun SearchLazyColumn(items: List<SearchItemList>) {
    LazyColumn() {
        items(items) { item ->
            Row(
                modifier = Modifier
                    .padding(top = 14.dp, bottom = 14.dp)
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = item.imageResId),
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
                    Text(
                        text = item.text1,
                        fontFamily = nunitoBold,
                        fontSize = 16.sp,
                        color = accblack
                    )
                    Row {
                        Icon(
                            modifier = Modifier.size(16.dp),
                            imageVector = Icons.Default.Star,
                            tint = accyellow,
                            contentDescription = "Star"
                        )
                        Spacer(modifier = Modifier.padding(end = 6.dp))
                        Text(
                            text = item.text2,
                            fontFamily = nunitoBold,
                            fontSize = 13.sp,
                            color = accgrey
                        )
                    }

                    Text(
                        text = item.text3,
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

@Preview
@Composable
fun PreviewLazyColumn() {
    val items = listOf(
        SearchItemList(
            imageResId = R.drawable.columnimage1,
            text1 = "Text 1A",
            text2 = "Text 2A",
            text3 = "Text 3A"
        ),
        SearchItemList(
            imageResId = R.drawable.columnimage2,
            text1 = "Text 1B",
            text2 = "Text 2B",
            text3 = "Text 3B"
        ),
        SearchItemList(
            imageResId = R.drawable.columnimage3,
            text1 = "Text 1C",
            text2 = "Text 2C",
            text3 = "Text 3C"
        )
    )
    SearchLazyColumn(items = items)
}