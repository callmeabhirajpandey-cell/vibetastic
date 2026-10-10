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
            displayLarge = base.displayLarge.copy(fontFamily = mono, lineHeight = (base.displayLarge.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
            displayMedium = base.displayMedium.copy(fontFamily = mono, lineHeight = (base.displayMedium.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
            displaySmall = base.displaySmall.copy(fontFamily = mono, lineHeight = (base.displaySmall.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
            headlineLarge = base.headlineLarge.copy(fontFamily = mono, lineHeight = (base.headlineLarge.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
            headlineMedium = base.headlineMedium.copy(fontFamily = mono, lineHeight = (base.headlineMedium.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
            headlineSmall = base.headlineSmall.copy(fontFamily = mono, lineHeight = (base.headlineSmall.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
            titleLarge = base.titleLarge.copy(fontFamily = mono, lineHeight = (base.titleLarge.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
            titleMedium = base.titleMedium.copy(fontFamily = mono, lineHeight = (base.titleMedium.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
            titleSmall = base.titleSmall.copy(fontFamily = mono, lineHeight = (base.titleSmall.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
            bodyLarge = base.bodyLarge.copy(fontFamily = mono, fontSize = 16.sp, lineHeight = 28.sp, letterSpacing = (-0.40).sp),
            bodyMedium = base.bodyMedium.copy(fontFamily = mono, lineHeight = (base.bodyMedium.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
            bodySmall = base.bodySmall.copy(fontFamily = mono, lineHeight = (base.bodySmall.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
            labelLarge = base.labelLarge.copy(fontFamily = mono, lineHeight = (base.labelLarge.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
            labelMedium = base.labelMedium.copy(fontFamily = mono, lineHeight = (base.labelMedium.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
            labelSmall = base.labelSmall.copy(fontFamily = mono, lineHeight = (base.labelSmall.lineHeight.value + 3f).sp, letterSpacing = (-0.40).sp),
        )
    }
