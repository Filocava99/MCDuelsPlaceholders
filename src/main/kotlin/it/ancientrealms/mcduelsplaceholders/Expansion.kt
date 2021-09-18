package it.ancientrealms.mcduelsplaceholders

import me.clip.placeholderapi.expansion.PlaceholderExpansion
import me.stevie212.McDuels.McDuels
import org.bukkit.Bukkit
import org.bukkit.OfflinePlayer

class Expansion : PlaceholderExpansion() {

    override fun getRequiredPlugin() = "McDuels"

    override fun getIdentifier(): String = "mcduelsph"

    override fun getAuthor(): String = McDuelsPlaceholders.INSTANCE.description.authors.joinToString(", ")

    override fun getVersion(): String = McDuelsPlaceholders.INSTANCE.description.version

    override fun canRegister(): Boolean = Bukkit.getPluginManager().getPlugin("McDuels") != null

    override fun persist(): Boolean = true

    override fun onRequest(player: OfflinePlayer?, params: String): String {
        return when (params) {
            "top_elo_1_name" -> McDuels.datamanager.getTopPlayers(1, "Elo")[0].name
            "top_elo_2_name" -> McDuels.datamanager.getTopPlayers(2, "Elo")[1].name
            "top_elo_3_name" -> McDuels.datamanager.getTopPlayers(3, "Elo")[2].name
            "top_elo_1" -> McDuels.datamanager.getTopPlayers(1, "Elo")[0].amount.toString()
            "top_elo_2" -> McDuels.datamanager.getTopPlayers(2, "Elo")[1].amount.toString()
            "top_elo_3" -> McDuels.datamanager.getTopPlayers(3, "Elo")[2].amount.toString()
            else -> "Not found"
        }
    }
}