package com.example.jastipin.ui.theme

import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val orange = Color(0xFFFA6541)
val oranges = Color(0xFFFE3F19)
val grey = Color(0xFFF4F4F4)
val black = Color(0xFF1F2A37)
val lightSkin = Color(0xFFFFE8E3)
val lightGrey = Color(0xFFD9D9D9)

const val originalColor = 0xFFFA6541

const val originalRed = (originalColor shr 16) and 0xFF
const val originalGreen = (originalColor shr 8) and 0xFF
const val originalBlue = originalColor and 0xFF

const val increasePercentage = 0.5 // Misalnya, 50% peningkatan untuk membuat lebih putih
val newRed = (originalRed + (255 * increasePercentage)).coerceAtMost(255.0).toInt()
val newGreen = (originalGreen + (255 * increasePercentage)).coerceAtMost(255.0).toInt()
val newBlue = (originalBlue + (255 * increasePercentage)).coerceAtMost(255.0).toInt()

val newColor = (newRed shl 16) or (newGreen shl 8) or newBlue
val newColorWithAlpha = newColor or 0xFF000000.toInt()

val lightOrange = Color(newColorWithAlpha)
val green = Color(0xFF23E9B4)

val accgrey2 = Color(0xFFE8E8E8)
val accgrey = Color(0xFFB7B7B7)
val accblack = Color(0xFF1F2A37)
val accyellow = Color(0xFFFFC436)
val outlinebox = Color(0xFFD6D6D6)
val fontgrey = Color(0xFF626262)


