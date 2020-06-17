package com.github.xjcyan1de.creativeplus.api

import org.bukkit.World

interface CreativePlus {
    val gameEnvironments: Collection<GameEnvironment>

    fun getGameEnvironment(world: World): GameEnvironment?

    fun loadGameEnvironment(world: World): GameEnvironment

    fun unloadGameEnvironment(world: World): Boolean
    fun unloadGameEnvironment(gameEnvironment: GameEnvironment): Boolean
}