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
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
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


fun moveToNextTextField(focusRequester: FocusRequester) {
    focusRequester.requestFocus()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForgotPassword2(navController: NavController) {
    val lottieComposition by rememberLottieComposition(
        LottieCompositionSpec.RawRes(
            R.raw.animation_lottie2
        )
    )

    var txtOtp1 by rememberSaveable {
        mutableStateOf("")
    }
    var txtOtp2 by rememberSaveable {
        mutableStateOf("")

    }
    var txtOtp3 by rememberSaveable {
        mutableStateOf("")

    }
    var txtOtp4 by rememberSaveable {
        mutableStateOf("")
    }

    val focusRequester1 = remember { FocusRequester() }
    val focusRequester2 = remember { FocusRequester() }
    val focusRequester3 = remember { FocusRequester() }
    val focusRequester4 = remember { FocusRequester() }
    val keyboardController = LocalSoftwareKeyboardController.current

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
            modifier = Modifier
                .size(350.dp)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = stringResource(id = R.string.verifikasi_otp),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = stringResource(id = R.string.desk_kode_otp),
            fontSize = 12.sp,
        )
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            OutlinedTextField(
                value = txtOtp1,
                onValueChange = {
                    txtOtp1 = it
                    if (txtOtp1.length == 1) {
                        moveToNextTextField(focusRequester2)
                    }
                },
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .focusRequester(focusRequester1),
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
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
                    textAlign = TextAlign.Center,

                ),
                shape = RoundedCornerShape(
                    10.dp
                )
            )
            OutlinedTextField(
                value = txtOtp2,
                onValueChange = {
                    txtOtp2 = it
                    if (txtOtp2.length == 1) {
                        moveToNextTextField(focusRequester3)
                    }
                },
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .focusRequester(focusRequester2),
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
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
                    textAlign = TextAlign.Center,

                ),
                shape = RoundedCornerShape(
                    10.dp
                )
            )
            OutlinedTextField(
                value = txtOtp3,
                onValueChange = {
                    txtOtp3 = it
                    if (txtOtp2.length == 1) {
                        moveToNextTextField(focusRequester4)
                    }
                },
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .focusRequester(focusRequester3),
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
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
                    textAlign = TextAlign.Center,

                ),
                shape = RoundedCornerShape(
                    10.dp
                )
            )
            OutlinedTextField(
                value = txtOtp4,
                onValueChange = {
                    if (it.length <= 1) {
                        txtOtp4 = it
                        if (it.length == 1) {
                            keyboardController?.hide()
                        }
                    } else {
                        txtOtp4 = it.take(1)
                        keyboardController?.hide()
                    }
                },
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .focusRequester(focusRequester4),
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
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
                    textAlign = TextAlign.Center,
                ),
                shape = RoundedCornerShape(
                    10.dp
                )
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                navController.navigate(
                    NavigationScreen.ForgotPasswordDone.name
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
                text = stringResource(id = R.string.kirim),
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
fun PreviewForgotPassword2() {
    ForgotPassword2(navController = rememberNavController())
}

