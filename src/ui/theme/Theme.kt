package io.github.darvld.template.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.window.WindowScope
import com.mayakapps.compose.windowstyler.WindowBackdrop
import com.mayakapps.compose.windowstyler.WindowFrameStyle
import com.mayakapps.compose.windowstyler.WindowStyle

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    CompositionLocalProvider(LocalDarkThemeSetting provides darkTheme) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}

@Composable
fun WindowScope.NativeWindowStyle() {
    // Use dark theme setting provided by the app theme composable 
    val isDarkTheme = LocalDarkThemeSetting.current
    val backgroundColor = MaterialTheme.colorScheme.background

    // Recreate if the theme changes
    val backdropType = remember(backgroundColor) { WindowBackdrop.Solid(backgroundColor) }
    val frameStyle = remember(backgroundColor) { WindowFrameStyle(titleBarColor = backgroundColor) }

    // Apply the style to the window
    WindowStyle(isDarkTheme,backdropType,frameStyle)
}