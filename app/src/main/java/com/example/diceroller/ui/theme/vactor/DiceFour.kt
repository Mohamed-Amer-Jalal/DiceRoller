package com.example.diceroller.ui.theme.vactor

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp

@Composable
fun diceFour(): VectorPainter {
    val diceFour = ImageVector.Builder(
        name = "CustomImage",
        defaultWidth = 200.dp,
        defaultHeight = 250.dp,
        viewportWidth = 800f,
        viewportHeight = 1000f
    ).apply {
        path(
            fill = SolidColor(Color(0xFFC5C4C4)),
            fillAlpha = 0.5f,
            strokeAlpha = 0.5f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(740.8f, 635.42f)
            curveTo(672.53f, 725.89f, 491.03f, 837.18f, 424.8f, 876.05f)
            arcToRelative(50.7f, 50.7f, 0f,
                isMoreThanHalf = false,
                isPositiveArc = true,
                dx1 = -49.93f,
                dy1 = 0.81f
            )
            curveTo(310.68f, 841.86f, 140.78f, 742.98f, 59.22f, 634.9f)
            arcToRelative(14.69f, 14.69f, 0f,
                isMoreThanHalf = false,
                isPositiveArc = true,
                dx1 = -0.12f,
                dy1 = -17.49f
            )
            curveTo(136.68f, 511.12f, 218.77f, 358.52f, 400.16f, 358.52f)
            curveTo(582.16f, 358.52f, 742.35f, 497.6f, 840.43f, 617.3f)
            arcToRelative(14.62f, 14.62f, 0f,
                isMoreThanHalf = false,
                isPositiveArc = true,
                dx1 = 0.37f,
                dy1 = 18.02f
            )
            close()
        }
        path(
            fill = SolidColor(Color(0xFFAA93AE)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(704.9f, 630f)
            lineTo(410.61f, 821.06f)
            lineTo(410.61f, 480.21f)
            lineTo(704.9f, 289.15f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC0A4C5)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(97.59f, 630f)
            lineTo(391.88f, 821.06f)
            lineTo(391.88f, 480.21f)
            lineTo(97.59f, 289.15f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE1BEE7)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(400.14f, 464.73f)
            lineTo(106.95f, 273.28f)
            lineTo(400.14f, 117.97f)
            lineTo(695.53f, 273.28f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE2D3E4)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(106.95f, 273.28f)
            lineToRelative(-9.36f, 15.87f)
            lineToRelative(294.29f, 191.06f)
            lineToRelative(8.26f, -15.48f)
            lineToRelative(-293.19f, -191.45f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE2D3E4)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(695.53f, 273.28f)
            lineToRelative(9.37f, 15.87f)
            lineToRelative(-294.29f, 191.06f)
            lineToRelative(-10.47f, -15.48f)
            lineToRelative(295.39f, -191.45f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE2D3E4)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(391.88f, 480.21f)
            lineToRelative(18.73f, 0f)
            lineToRelative(0f, 340.85f)
            lineToRelative(-18.73f, 0f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE7DCE8)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(400.14f, 464.73f)
            lineToRelative(-8.26f, 15.48f)
            lineToRelative(18.73f, 0f)
            lineToRelative(-10.47f, -15.48f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF000000)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(530.08f, 303.65f)
            arcToRelative(16.9f, 28.71f, 97.07f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = 4.16f,
                dy1 = -33.54f
            )
            arcToRelative(16.9f, 28.71f, 97.07f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = -4.16f,
                dy1 = 33.54f
            )
            close()
        }
        path(
            fill = SolidColor(Color(0xFF000000)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(389.68f, 218.17f)
            arcToRelative(16.9f, 28.71f, 97.07f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = 4.16f,
                dy1 = -33.54f
            )
            arcToRelative(16.9f, 28.71f, 97.07f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = -4.16f,
                dy1 = 33.54f
            )
            close()
        }
        path(
            fill = SolidColor(Color(0xFF000000)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(405.35f, 377.09f)
            arcToRelative(16.9f, 28.71f, 97.07f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = 4.16f,
                dy1 = -33.54f
            )
            arcToRelative(16.9f, 28.71f, 97.07f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = -4.16f,
                dy1 = 33.54f
            )
            close()
        }
        path(
            fill = SolidColor(Color(0xFF000000)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(264.95f, 291.6f)
            arcToRelative(16.9f, 28.71f, 97.07f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = 4.16f,
                dy1 = -33.54f
            )
            arcToRelative(16.9f, 28.71f, 97.07f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = -4.16f,
                dy1 = 33.54f
            )
            close()
        }
        path(
            fill = SolidColor(Color(0xFF000000)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(297.17f, 541.59f)
            arcToRelative(30.12f, 16.11f, 53.82f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = 26.01f,
                dy1 = -19.02f
            )
            arcToRelative(30.12f, 16.11f, 53.82f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = -26.01f,
                dy1 = 19.02f
            )
            close()
        }
        path(
            fill = SolidColor(Color(0xFF000000)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(161.96f, 590.81f)
            arcToRelative(30.12f, 16.11f, 53.82f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = 26.01f,
                dy1 = -19.02f
            )
            arcToRelative(30.12f, 16.11f, 53.82f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = -26.01f,
                dy1 = 19.02f
            )
            close()
        }
        path(
            fill = SolidColor(Color(0xFF000000)),
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(551.15f, 579.45f)
            arcToRelative(30.12f, 16.11f, 126.18f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = 35.56f,
                dy1 = -48.62f
            )
            arcToRelative(30.12f, 16.11f, 126.18f,
                isMoreThanHalf = true,
                isPositiveArc = false,
                dx1 = -35.56f,
                dy1 = 48.62f
            )
            close()
        }
    }.build()

    return rememberVectorPainter(image = diceFour)
}