package com.bionickhand.composition.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val mainPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
) {
}