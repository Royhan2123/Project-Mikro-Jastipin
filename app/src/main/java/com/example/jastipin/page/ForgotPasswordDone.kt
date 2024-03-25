package com.example.jastipin.page

import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.jastipin.R
import com.example.jastipin.navigation.NavigationScreen
import com.example.jastipin.ui.theme.orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForgotPasswordDone(navController: NavController) {
    val lottieComposition by rememberLottieComposition(
        LottieCompositionSpec.RawRes(
            R.raw.animation_lottie3
        )
    )

    val progress by animateLottieCompositionAsState(
        composition = lottieComposition,
        iterations = LottieConstants.IterateForever,
        isPlaying = true
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        LottieAnimation(
            composition = lottieComposition,
            progress = progress,
            modifier = Modifier.size(350.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Reset Password\nBerhasil!",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = stringResource(id = R.string.password_reset),
            fontSize = 12.sp,
        )
        Spacer(modifier = Modifier.height(100.dp))
        Button(
            onClick = {
                navController.navigate(
                    NavigationScreen.SignInScreen.name
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(
                orange
            ),
            shape = RoundedCornerShape(
                size = 20.dp
            )
        ) {
            Text(
                text = stringResource(id = R.string.lanjutkan),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 15.sp
                )
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewForgotPasswordDone() {
    ForgotPasswordDone(navController = rememberNavController())
}

