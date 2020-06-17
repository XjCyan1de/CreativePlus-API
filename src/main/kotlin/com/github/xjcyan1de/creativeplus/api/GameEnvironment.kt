package com.github.xjcyan1de.creativeplus.api

import kotlinx.coroutines.CoroutineScope
import org.bukkit.World
import org.bukkit.entity.Player

interface GameEnvironment : CoroutineScope {
    val world: World
    val players: Collection<Player>

    fun joinPlayer(player: Player)
    fun quitPlayer(player: Player)

    fun saveInventory(player: Player)
    fun loadInventory(player: Player)
}