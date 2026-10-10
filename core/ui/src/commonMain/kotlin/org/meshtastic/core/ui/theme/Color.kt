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

import androidx.compose.ui.graphics.Color

// ─── OSCOM dark charcoal + neon green palette ───
// Dark surfaces stay near-black; neon green marks selected and actionable elements.

// ─── Light Scheme (§8.2) ───
val primaryLight = Color(0xFF2D8F52) // Green 700
val onPrimaryLight = Color(0xFFFFFFFF)
val primaryContainerLight = Color(0xFFB5F5CE) // Green 300
val onPrimaryContainerLight = Color(0xFF002E13) // Green 950
val secondaryLight = Color(0xFF555668) // Neutral 600
val onSecondaryLight = Color(0xFFFFFFFF)
val secondaryContainerLight = Color(0xFFD5D6E0) // Neutral 200
val onSecondaryContainerLight = Color(0xFF2C2D3C) // Neutral 800
val tertiaryLight = Color(0xFF2855A8) // Blue 700
val onTertiaryLight = Color(0xFFFFFFFF)
val tertiaryContainerLight = Color(0xFFE8EAF6) // Blue 50
val onTertiaryContainerLight = Color(0xFF001849) // Blue 950
val errorLight = Color(0xFFBA1A1A) // Error 600 (WCAG-safe on white)
val onErrorLight = Color(0xFFFFFFFF)
val errorContainerLight = Color(0xFFFDEAEA) // Error 100
val onErrorContainerLight = Color(0xFF410002) // Error 900
val backgroundLight = Color(0xFFF5F6FA) // Neutral 50
val onBackgroundLight = Color(0xFF2C2D3C) // Neutral 800
val surfaceLight = Color(0xFFF5F6FA) // Neutral 50
val onSurfaceLight = Color(0xFF2C2D3C) // Neutral 800
val surfaceVariantLight = Color(0xFFDADBE7) // NV 200
val onSurfaceVariantLight = Color(0xFF5C5E78) // NV 600
val outlineLight = Color(0xFF767892) // NV 500
val outlineVariantLight = Color(0xFFBDBFCF) // NV 300
val scrimLight = Color(0xFF000000)
val inverseSurfaceLight = Color(0xFF3D3E50) // Neutral 700
val inverseOnSurfaceLight = Color(0xFFECEDF3) // Neutral 100
val inversePrimaryLight = Color(0xFF67EA94) // Green 500
val surfaceDimLight = Color(0xFFD5D6E0) // Neutral 200
val surfaceBrightLight = Color(0xFFF5F6FA) // Neutral 50
val surfaceContainerLowestLight = Color(0xFFFFFFFF)
val surfaceContainerLowLight = Color(0xFFF5F6FA) // Neutral 50
val surfaceContainerLight = Color(0xFFECEDF3) // Neutral 100
val surfaceContainerHighLight = Color(0xFFE0E1EB) // Interpolated 100↔200
val surfaceContainerHighestLight = Color(0xFFD5D6E0) // Neutral 200

// ─── Dark Scheme (§8.3) ───
val primaryDark = Color(0xFF39F56A)
val onPrimaryDark = Color(0xFF061008)
val primaryContainerDark = Color(0xFF164A25)
val onPrimaryContainerDark = Color(0xFFD0FFD9)
val secondaryDark = Color(0xFFA6B0A8)
val onSecondaryDark = Color(0xFF111412)
val secondaryContainerDark = Color(0xFF252C27)
val onSecondaryContainerDark = Color(0xFFE0E8E1)
val tertiaryDark = Color(0xFF9AA8A0)
val onTertiaryDark = Color(0xFF0B0D0C)
val tertiaryContainerDark = Color(0xFF303A33)
val onTertiaryContainerDark = Color(0xFFDCE7DF)
val errorDark = Color(0xFFFFB4AB) // Error 300
val onErrorDark = Color(0xFF690005) // Error 800
val errorContainerDark = Color(0xFF93000A) // Error 700
val onErrorContainerDark = Color(0xFFFDEAEA) // Error 100
val backgroundDark = Color(0xFF0B0D0C)
val onBackgroundDark = Color(0xFFE7F0E9)
val surfaceDark = Color(0xFF111412)
val onSurfaceDark = Color(0xFFE7F0E9)
val surfaceVariantDark = Color(0xFF252D28)
val onSurfaceVariantDark = Color(0xFFA9B6AC)
val outlineDark = Color(0xFF647168)
val outlineVariantDark = Color(0xFF39433C)
val scrimDark = Color(0xFF000000)
val inverseSurfaceDark = Color(0xFFE7F0E9)
val inverseOnSurfaceDark = Color(0xFF111412)
val inversePrimaryDark = Color(0xFF237A3A)
val surfaceDimDark = Color(0xFF080A09)
val surfaceBrightDark = Color(0xFF303832)
val surfaceContainerLowestDark = Color(0xFF080A09)
val surfaceContainerLowDark = Color(0xFF111412)
val surfaceContainerDark = Color(0xFF171B18)
val surfaceContainerHighDark = Color(0xFF1D231F)
val surfaceContainerHighestDark = Color(0xFF252C27)
