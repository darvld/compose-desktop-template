package io.github.darvld.template.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

val LocalDarkThemeSetting = compositionLocalOf { false }

val LightColorScheme = lightColorScheme(
    primary = Color(0xFF924C00),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFFFDCC4),
    onPrimaryContainer = Color(0xFF2F1400),
    secondary = Color(0xFF4F57A9),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFE0E0FF),
    onSecondaryContainer = Color(0xFF020865),
    tertiary = Color(0xFF8F3D90),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFFFD6F8),
    onTertiaryContainer = Color(0xFF37003B),
    error = Color(0xFFBA1A1A),
    errorContainer = Color(0xFFFFDAD6),
    onError = Color(0xFFFFFFFF),
    onErrorContainer = Color(0xFF410002),
    background = Color(0xFFFFFBFF),
    onBackground = Color(0xFF201A17),
    surface = Color(0xFFFFFBFF),
    onSurface = Color(0xFF201A17),
    surfaceVariant = Color(0xFFF3DFD2),
    onSurfaceVariant = Color(0xFF51443B),
    outline = Color(0xFF84746A),
    inverseOnSurface = Color(0xFFFBEEE8),
    inverseSurface = Color(0xFF352F2B),
    inversePrimary = Color(0xFFFFB780),
    surfaceTint = Color(0xFF924C00),
)

val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFFFB780),
    onPrimary = Color(0xFF4E2600),
    primaryContainer = Color(0xFF6F3800),
    onPrimaryContainer = Color(0xFFFFDCC4),
    secondary = Color(0xFFBEC2FF),
    onSecondary = Color(0xFF1E2678),
    secondaryContainer = Color(0xFF363E90),
    onSecondaryContainer = Color(0xFFE0E0FF),
    tertiary = Color(0xFFFFA9FA),
    onTertiary = Color(0xFF59035E),
    tertiaryContainer = Color(0xFF742377),
    onTertiaryContainer = Color(0xFFFFD6F8),
    error = Color(0xFFFFB4AB),
    errorContainer = Color(0xFF93000A),
    onError = Color(0xFF690005),
    onErrorContainer = Color(0xFFFFDAD6),
    background = Color(0xFF201A17),
    onBackground = Color(0xFFECE0DA),
    surface = Color(0xFF201A17),
    onSurface = Color(0xFFECE0DA),
    surfaceVariant = Color(0xFF51443B),
    onSurfaceVariant = Color(0xFFD6C3B7),
    outline = Color(0xFF9F8D82),
    inverseOnSurface = Color(0xFF201A17),
    inverseSurface = Color(0xFFECE0DA),
    inversePrimary = Color(0xFF924C00),
    surfaceTint = Color(0xFFFFB780),
)