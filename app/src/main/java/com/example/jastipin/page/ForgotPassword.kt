package com.example.jastipin.page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.text.style.TextAlign
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
fun ForgotPassword(navController: NavController) {
    var txtAddEmail by rememberSaveable {
        mutableStateOf("")
    }

    val keyboardController = LocalSoftwareKeyboardController.current

    val lottieComposition by rememberLottieComposition(
        LottieCompositionSpec.RawRes(
            R.raw.animation_lottie
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
            .padding(20.dp),
    ) {
        LottieAnimation(
            composition = lottieComposition,
            progress = progress,
            modifier = Modifier.size(350.dp)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Forgot\nPassword?",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = stringResource(id = R.string.desk_forgot_password),
            fontSize = 12.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = txtAddEmail,
            onValueChange = { txtAddEmail = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.masukkan_email_Anda),
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 15.sp
                    ),
                )
            },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                    keyboardController?.hide()
                }
            ),
            textStyle = TextStyle(
                fontSize = 14.sp,
                color = Color.Black,
            ),
            shape = RoundedCornerShape(
                10.dp
            )
        )
        Spacer(modifier = Modifier.height(15.dp))
        Button(
            onClick = {
                navController.navigate(
                    NavigationScreen.ForgotPassword2.name
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
                text = stringResource(id = R.string.lanjut),
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
fun PreviewForgotPassword() {
    ForgotPassword(navController = rememberNavController())
}

