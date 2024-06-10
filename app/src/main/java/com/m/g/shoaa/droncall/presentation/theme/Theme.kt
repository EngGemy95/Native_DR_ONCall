package com.m.g.shoaa.droncall.presentation.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


// presentation/theme/Theme.kt

/*If after this explanation you still wanna use these exact colors, you can silent this warning with @SuppressLint("ConflictingOnColor"): but some system or Material elements may not look good.*/

//@SuppressLint("ConflictingOnColor")

/*private val LightThemeColors = lightColors(
    primary = Blue600,
    primaryVariant = Blue400,
    onPrimary = Black2,
    secondary = Color.White,
    secondaryVariant = Teal300,
    onSecondary = Color.Black,
    error = RedErrorDark,
    onError = RedErrorLight,
    background = Grey1,
    onBackground = Color.Black,
    surface = Color.LightGray, // if we make this Color.White it make error , i think because should be the same color of onSecondary or onSurface
    onSurface = Black2,
)

private val DarkThemeColors = darkColors(
    primary = Blue700,
    primaryVariant = Color.White,
    onPrimary = Color.White,
    secondary = Black1,
    onSecondary = Color.White,
    error = RedErrorLight,
    background = Color.Black,
    onBackground = Color.White,
    surface = Black1,
    onSurface = Color.White,
)*/


private val LightThemeColors = lightColors(
    primary = black,
    primaryVariant = whiteBlue,
    onPrimary = whiteBlue,
    secondary = whiteBlue,
    secondaryVariant = orange,
    onSecondary = whiteBlue,
    error = RedErrorLight,
    onError = RedErrorDark,
    background = white,
    onBackground = Color.LightGray,
    surface = Color.LightGray, // if we make this Color.White it make error , i think because should be the same color of onSecondary or onSurface
    onSurface = Color.DarkGray,
)

private val DarkThemeColors = darkColors(
    primary = white,
    primaryVariant = whiteBlue,
    onPrimary = Color.White,
    secondary = green,
    onSecondary = Color.White,
    error = RedErrorLight,
    background = darkBackground,
    onBackground = Color.White,
    surface = Color.LightGray,
    onSurface = Color.LightGray,
)


@Composable
fun MyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkThemeColors else LightThemeColors

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}