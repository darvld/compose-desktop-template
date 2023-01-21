package io.github.darvld.template.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        // Roboto font family:
        // https://fonts.google.com/specimen/Roboto
        fontFamily = FontFamily(
            Font("font/roboto-thin.ttf", weight = FontWeight.Thin),
            Font("font/roboto-thin-italic.ttf", weight = FontWeight.Thin, style = FontStyle.Italic),
            Font("font/roboto-light.ttf", weight = FontWeight.Light),
            Font("font/roboto-light-italic.ttf", weight = FontWeight.Light, style = FontStyle.Italic),
            Font("font/roboto-normal.ttf", weight = FontWeight.Normal),
            Font("font/roboto-normal-italic.ttf", weight = FontWeight.Medium, style = FontStyle.Italic),
            Font("font/roboto-medium.ttf", weight = FontWeight.Medium),
            Font("font/roboto-medium-italic.ttf", weight = FontWeight.Medium, style = FontStyle.Italic),
            Font("font/roboto-bold.ttf", weight = FontWeight.Bold),
            Font("font/roboto-bold-italic.ttf", weight = FontWeight.Bold, style = FontStyle.Italic),
            Font("font/roboto-black.ttf", weight = FontWeight.Black),
            Font("font/roboto-black-italic.ttf", weight = FontWeight.Black, style = FontStyle.Italic),
        ),
    )
)