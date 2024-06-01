package com.bionickhand.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val mainPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
) : Parcelable