import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class McDuelsPlaceholders : JavaPlugin() {

    override fun onEnable() {
        if(Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            Expansion().register();
        }
    }

    companion object {
        private var plugin: McDuelsPlaceholders? = null
        val INSTANCE: McDuelsPlaceholders
            get() {
                if (plugin == null) {
                    plugin = getPlugin(McDuelsPlaceholders::class.java)
                }
                return plugin!!
            }
    }

}