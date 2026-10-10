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
            displayLarge = base.displayLarge.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.displayLarge.lineHeight + 2.sp),
            displayMedium = base.displayMedium.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.displayMedium.lineHeight + 2.sp),
            displaySmall = base.displaySmall.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.displaySmall.lineHeight + 2.sp),
            headlineLarge = base.headlineLarge.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.headlineLarge.lineHeight + 2.sp),
            headlineMedium = base.headlineMedium.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.headlineMedium.lineHeight + 2.sp),
            headlineSmall = base.headlineSmall.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.headlineSmall.lineHeight + 2.sp),
            titleLarge = base.titleLarge.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.titleLarge.lineHeight + 2.sp),
            titleMedium = base.titleMedium.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.titleMedium.lineHeight + 2.sp),
            titleSmall = base.titleSmall.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.titleSmall.lineHeight + 2.sp),
            bodyLarge = base.bodyLarge.copy(fontFamily = mono, fontSize = 16.sp, lineHeight = 26.sp, letterSpacing = (-0.40).sp),
            bodyMedium = base.bodyMedium.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.bodyMedium.lineHeight + 2.sp),
            bodySmall = base.bodySmall.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.bodySmall.lineHeight + 2.sp),
            labelLarge = base.labelLarge.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.labelLarge.lineHeight + 2.sp),
            labelMedium = base.labelMedium.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.labelMedium.lineHeight + 2.sp),
            labelSmall = base.labelSmall.copy(fontFamily = mono, letterSpacing = (-0.40).sp, lineHeight = base.labelSmall.lineHeight + 2.sp),
        )
    }
