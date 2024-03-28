package com.example.jastipin.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.R
import com.example.jastipin.navigation.NavigationScreen
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.interMedium
import com.example.jastipin.ui.theme.interSemiBold
import com.example.jastipin.ui.theme.lightOrange
import com.example.jastipin.ui.theme.orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(
    navController: NavController,
    onLoginClicked: () -> Unit,
) {
    var txtEmail by rememberSaveable {
        mutableStateOf("")
    }
    var txtPassword by rememberSaveable {
        mutableStateOf("")
    }
    var txtName by rememberSaveable {
        mutableStateOf("")
    }
    var txtKonfirmPassword by rememberSaveable {
        mutableStateOf("")
    }
    var txtAlamat by rememberSaveable {
        mutableStateOf("")
    }
    var txtNomorTelepon by rememberSaveable {
        mutableStateOf("")
    }
    val keyboardController = LocalSoftwareKeyboardController.current

    var obsucureText by remember {
        mutableStateOf(true)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())
            .padding(20.dp),
    ) {
        OutlinedTextField(
            value = txtName,
            onValueChange = { txtName = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.nama),
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 15.sp,
                        fontFamily = interMedium,
                        fontWeight = FontWeight.Medium
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
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = txtEmail,
            onValueChange = { txtEmail = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.email),
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 15.sp,
                        fontFamily = interMedium,
                        fontWeight = FontWeight.Medium
                    ),
                )
            },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
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
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = txtNomorTelepon,
            onValueChange = { txtNomorTelepon = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.nomor_telepon),
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 15.sp,
                        fontFamily = interMedium,
                        fontWeight = FontWeight.Medium
                    ),
                )
            },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone,
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
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = txtAlamat,
            onValueChange = { txtAlamat = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.alamat),
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 15.sp,
                        fontFamily = interMedium,
                        fontWeight = FontWeight.Medium
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
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = txtPassword,
            onValueChange = { txtPassword = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.kata_sandi),
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 15.sp,
                        fontFamily = interMedium,
                        fontWeight = FontWeight.Medium
                    ),
                )
            },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
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
            ),
            visualTransformation = if (obsucureText)
                PasswordVisualTransformation()
            else VisualTransformation.None,
            trailingIcon = {
                IconButton(onClick = {
                    obsucureText = !obsucureText
                }) {
                    val visibilityIcon = if (obsucureText)
                        Icons.Filled.VisibilityOff
                    else Icons.Filled.Visibility

                    val description = if (obsucureText)
                        "Hide Password"
                    else "Show Password"

                    Icon(
                        imageVector = visibilityIcon,
                        contentDescription = description
                    )
                }
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = txtKonfirmPassword,
            onValueChange = { txtKonfirmPassword = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.konfirmasi_kata_sandi),
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 15.sp,
                        fontFamily = interMedium,
                        fontWeight = FontWeight.Medium
                    ),
                )
            },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
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
            ),
            visualTransformation = if (obsucureText)
                PasswordVisualTransformation()
            else VisualTransformation.None,
            trailingIcon = {
                IconButton(onClick = {
                    obsucureText = !obsucureText
                }) {
                    val visibilityIcon = if (obsucureText)
                        Icons.Filled.VisibilityOff
                    else Icons.Filled.Visibility

                    val description = if (obsucureText)
                        "Hide Password"
                    else "Show Password"

                    Icon(
                        imageVector = visibilityIcon,
                        contentDescription = description
                    )
                }
            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                navController.popBackStack(
                    NavigationScreen.HalamanBottom.name,
                    inclusive = false
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
                text = stringResource(id = R.string.daftar),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 15.sp,
                    fontFamily = interSemiBold,
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            Alignment.CenterVertically
        ) {
            Divider(
                modifier = Modifier
                    .width(110.dp)
                    .clip(
                        shape = RoundedCornerShape(
                            size = 20.dp
                        )
                    ),
                color = lightOrange,
                thickness = 2.dp
            )
            Text(
                text = stringResource(id = R.string.atau),
                fontSize = 15.sp,
                color = grey,
                fontFamily = interSemiBold,
                fontWeight = FontWeight.SemiBold
            )
            Divider(
                modifier = Modifier
                    .width(110.dp)
                    .clip(
                        shape = RoundedCornerShape(
                            size = 20.dp
                        )
                    ),
                color = lightOrange,
                thickness = 2.dp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            Alignment.CenterVertically
        ) {
            Surface(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(
                        shape = RoundedCornerShape(
                            size = 8.dp
                        )
                    )
                    .border(
                        width = 1.dp,
                        color = lightOrange,
                        shape = RoundedCornerShape(
                            size = 8.dp
                        )
                    ),
                color = Color.White
            ) {
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = stringResource(
                        id = R.string.google
                    ),
                    modifier = Modifier
                        .size(30.dp)
                        .scale(0.5f),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Surface(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(
                        shape = RoundedCornerShape(
                            size = 8.dp
                        )
                    )
                    .border(
                        width = 1.dp,
                        color = lightOrange,
                        shape = RoundedCornerShape(
                            size = 8.dp
                        )
                    ),
                color = Color.White
            ) {
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = stringResource(
                        id = R.string.facebook
                    ),
                    modifier = Modifier
                        .size(30.dp)
                        .scale(0.5f),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Surface(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(
                        shape = RoundedCornerShape(
                            size = 8.dp
                        )
                    )
                    .border(
                        width = 1.dp,
                        color = lightOrange,
                        shape = RoundedCornerShape(
                            size = 8.dp
                        )
                    ),
                color = Color.White
            ) {
                Image(
                    painter = painterResource(id = R.drawable.twitter),
                    contentDescription = stringResource(
                        id = R.string.twitter
                    ),
                    modifier = Modifier
                        .size(30.dp)
                        .scale(0.5f),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(
                    id = R.string.sudah_punya_akun
                ),
                fontSize = 13.sp,
                color = grey,
                fontFamily = interSemiBold,
                fontWeight = FontWeight.SemiBold
            )
            TextButton(onClick = {
                onLoginClicked()
            }) {
                Text(
                    text = stringResource(id = R.string.masuk),
                    fontSize = 13.sp,
                    color = orange,
                    fontFamily = interSemiBold,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewSignUpScreen() {
    SignUpScreen(navController = rememberNavController(), onLoginClicked = {})
}