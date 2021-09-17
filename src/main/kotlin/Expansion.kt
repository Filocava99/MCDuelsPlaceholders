import me.clip.placeholderapi.expansion.PlaceholderExpansion
import me.stevie212.McDuels.McDuels
import org.bukkit.Bukkit
import org.bukkit.OfflinePlayer

class Expansion : PlaceholderExpansion() {

    override fun getRequiredPlugin() = "McDuels"

    override fun getIdentifier(): String = McDuelsPlaceholders.INSTANCE.description.name

    override fun getAuthor(): String = McDuelsPlaceholders.INSTANCE.description.authors.joinToString(", ")

    override fun getVersion(): String = McDuelsPlaceholders.INSTANCE.description.version

    override fun canRegister(): Boolean = Bukkit.getPluginManager().getPlugin("McDuels") != null

    override fun onRequest(player: OfflinePlayer?, params: String): String {
        if(params.equals("mcduels_top_elo_1_name")){
            McDuels.datamanager.getTopPlayers(1, "Elo")[0].name
        }else if(params.equals("mcduels_top_elo_2_name")){
            McDuels.datamanager.getTopPlayers(2, "Elo")[1].name
        }else if(params.equals("mcduels_top_elo_3_name")){
                McDuels.datamanager.getTopPlayers(3, "Elo")[2].name
        }
        return ""
    }
}