package com.example.jastipin.page

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.TabRow
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.SupervisorAccount
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.SupervisorAccount
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import androidx.compose.ui.graphics.vector.ImageVector
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.R
import com.example.jastipin.navigation.NavigationScreen
import com.example.jastipin.ui.theme.grey
import com.example.jastipin.ui.theme.interBold
import com.example.jastipin.ui.theme.interMedium
import com.example.jastipin.ui.theme.interSemiBold
import com.example.jastipin.ui.theme.lightOrange
import com.example.jastipin.ui.theme.lightSkin
import com.example.jastipin.ui.theme.orange

data class TabItem(
    val title: String,
    val selectIcon: ImageVector,
    val unselectIcon: ImageVector
)


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HalamanSignInScreen(navController: NavController) {
    val tabItem = listOf(
        TabItem(
            title = stringResource(id = R.string.masuk),
            selectIcon = Icons.Filled.Home,
            unselectIcon = Icons.Outlined.Home,
        ),
        TabItem(
            title = stringResource(id = R.string.daftar),
            unselectIcon = Icons.Outlined.SupervisorAccount,
            selectIcon = Icons.Filled.SupervisorAccount,
        )
    )
    var selectTabIndex by remember {
        mutableStateOf(0)
    }
    val pagerState = rememberPagerState {
        tabItem.size
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.Start
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(230.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.umkm1),
                contentDescription = stringResource(id = R.string.umkm1),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(225.dp)
                    .clip(
                        shape = RoundedCornerShape(
                            bottomStart = 18.dp,
                            bottomEnd = 18.dp
                        )
                    ),
                contentScale = ContentScale.Crop
            )
            Surface(
                modifier = Modifier
                    .height(24.dp)
                    .width(300.dp)
                    .align(Alignment.CenterEnd)
                    .padding(
                        end = 14.dp,
                    )
                    .offset(
                        y = 50.dp
                    ),
                shape = RoundedCornerShape(
                    size = 20.dp
                ),
                color = Color.White.copy(alpha = 0.8f),
            ) {
                Text(
                    text = stringResource(
                        id = R.string.image_umkm1
                    ),
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    color = orange,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Column(
            modifier = Modifier
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 20.dp
                )
                .fillMaxSize()
        ) {
            TabRow(
                selectedTabIndex = selectTabIndex,
                backgroundColor = Color.White,
                modifier = Modifier.clip(
                    shape = RoundedCornerShape(10.dp)
                ),
                contentColor = lightSkin
            ) {
                tabItem.forEachIndexed { index, tabItem ->
                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                            .padding(start = 15.dp,end = 15.dp),
                        color = if (index == selectTabIndex) orange else lightSkin,
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Tab(
                            selected = index == selectTabIndex,
                            onClick = {
                                selectTabIndex = index
                            },
                            text = {
                                Text(
                                    text = tabItem.title,
                                    fontFamily = interBold,
                                    color = if (index == selectTabIndex) Color.White else orange
                                )
                            },
                            icon = {
                                Icon(
                                    imageVector = if (index == selectTabIndex) {
                                        tabItem.selectIcon
                                    } else tabItem.unselectIcon,
                                    contentDescription = tabItem.title,
                                    tint = if (index == selectTabIndex) Color.White else orange

                                )
                            }
                        )
                    }
                }
            }
            LaunchedEffect(selectTabIndex) {
            pagerState.animateScrollToPage(selectTabIndex)
            }
            LaunchedEffect(pagerState.currentPage) {
                selectTabIndex = pagerState.currentPage
            }
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) { index ->
                when (index) {
                    0 -> SignInScreen(navController) {
                        selectTabIndex = 1
                    }
                    1 -> SignUpScreen(navController) {
                        selectTabIndex = 0
                    }
                    else -> SignInScreen(navController, onDaftarClicked = {})
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen(
    navController: NavController,
    onDaftarClicked: () -> Unit,
) {
    var txtEmail by rememberSaveable {
        mutableStateOf("")
    }
    var txtPassword by rememberSaveable {
        mutableStateOf("")
    }
    val keyboardController = LocalSoftwareKeyboardController.current

    var obsucureText by remember {
        mutableStateOf(true)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(state = rememberScrollState())
    ) {
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
        TextButton(
            onClick = {
                navController.navigate(
                    NavigationScreen.ForgotPassword.name
                )
            },
            modifier = Modifier.align(
                Alignment.End
            )
        ) {
            Text(
                text = stringResource(id = R.string.lupa_password),
                style = TextStyle(
                    color = orange,
                    fontSize = 14.sp,
                    fontFamily = interSemiBold,
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
        Button(
            onClick = {
                navController.navigate(NavigationScreen.HalamanBottom.name) {
                    popUpTo(NavigationScreen.HalamanSignInScreen.name) {
                        inclusive = true
                    }
                }
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
                text = stringResource(id = R.string.masuk),
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
                    id = R.string.apakah_anda_sudah_memiliki_akun
                ),
                fontSize = 11.sp,
                color = grey,
                fontFamily = interSemiBold,
                fontWeight = FontWeight.SemiBold
            )
            TextButton(onClick = {
                onDaftarClicked()
            }) {
                Text(
                    text = stringResource(id = R.string.daftar),
                    fontSize = 12.sp,
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
fun PreviewSignInScreen() {
    SignInScreen(
        navController = rememberNavController(),
        onDaftarClicked = {},
    )
}

@Preview(showSystemUi = true)
@Composable
fun PreviewHalamanSignInScreen() {
    HalamanSignInScreen(navController = rememberNavController())
}