package se.supernovait.dooby.presentation.app.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class StatusColor(
    val info: Color = Color(0xFF0288D1), // Clear informational blue
    val success: Color = Color(0xFF43A047), // Professional green — order completed, action successful
    val warning: Color = Color(0xFFFFA726), // Authority amber — alerts, pending actions, delayed orders
    val error: Color = Color(0xFFB3261E) // Standard red — validation errors, failures, cancellations
)

val LocalStatus = staticCompositionLocalOf { StatusColor() }

val MaterialTheme.statusColor: StatusColor
    @Composable
    @ReadOnlyComposable
    get() = LocalStatus.current
