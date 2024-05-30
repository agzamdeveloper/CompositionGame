package com.bionickhand.composition.domain.usecases

import com.bionickhand.composition.domain.entity.GameSettings
import com.bionickhand.composition.domain.entity.Level
import com.bionickhand.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val gameRepository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return gameRepository.getGameSettings(level)
    }
}