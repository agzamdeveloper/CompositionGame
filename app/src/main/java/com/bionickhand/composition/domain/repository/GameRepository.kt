package com.bionickhand.composition.domain.repository

import com.bionickhand.composition.domain.entity.GameSettings
import com.bionickhand.composition.domain.entity.Level
import com.bionickhand.composition.domain.entity.Question

interface GameRepository {
    fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question
    fun getGameSettings(level: Level): GameSettings
}