package io.github.darvld.template.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.rememberWindowState

@Composable
fun AppWindow(
    onCloseRequest: () -> Unit,
    state: WindowState = rememberWindowState(),
    content: @Composable () -> Unit,
) {
    Window(onCloseRequest, state, icon = painterResource("icon.png")) {
        AppTheme {
            // Apply native look to the window
            NativeWindowStyle()

            // Base surface providing a stable backdrop
            Surface(Modifier.fillMaxSize()) {
                content()
            }
        }
    }
}