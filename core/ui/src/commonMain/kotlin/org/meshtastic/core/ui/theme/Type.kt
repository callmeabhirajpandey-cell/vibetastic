/*
 * Copyright (c) 2026 Meshtastic LLC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.meshtastic.core.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

/**
 * OSCOM typography: a squared-off monospace base with readable body sizing.
 *
 * Letter spacing is tightened globally for a denser, squared-off interface. Emphasized variants are generated from
 * these base styles by [MaterialExpressiveTheme].
 */
val AppTypography =
    Typography().let { base ->
        val mono = FontFamily.Monospace
        Typography(
            displayLarge = base.displayLarge.copy(fontFamily = mono, letterSpacing = (-0.35).sp),
            displayMedium = base.displayMedium.copy(fontFamily = mono),
            displaySmall = base.displaySmall.copy(fontFamily = mono),
            headlineLarge = base.headlineLarge.copy(fontFamily = mono),
            headlineMedium = base.headlineMedium.copy(fontFamily = mono),
            headlineSmall = base.headlineSmall.copy(fontFamily = mono),
            titleLarge = base.titleLarge.copy(fontFamily = mono),
            titleMedium = base.titleMedium.copy(fontFamily = mono),
            titleSmall = base.titleSmall.copy(fontFamily = mono),
            bodyLarge = base.bodyLarge.copy(fontFamily = mono, fontSize = 16.sp, lineHeight = 24.sp, letterSpacing = (-0.35).sp),
            bodyMedium = base.bodyMedium.copy(fontFamily = mono),
            bodySmall = base.bodySmall.copy(fontFamily = mono),
            labelLarge = base.labelLarge.copy(fontFamily = mono),
            labelMedium = base.labelMedium.copy(fontFamily = mono),
            labelSmall = base.labelSmall.copy(fontFamily = mono),
        )
    }
