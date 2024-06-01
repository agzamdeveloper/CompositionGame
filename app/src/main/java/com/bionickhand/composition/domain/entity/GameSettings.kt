package com.bionickhand.composition.domain.entity

import java.io.Serializable

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val mainPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
) : Serializable