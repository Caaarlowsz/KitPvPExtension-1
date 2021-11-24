package me.alphagladiator.kpe;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void registerClasses(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new EventListener(), this);
	}
	
	public void consoleBroadcast(String s){
		Bukkit.getServer().getLogger().info(s);
	}
	
	
	@Override
	public void onEnable(){
		PluginDescriptionFile pdf = getDescription();
		consoleBroadcast("[" + pdf.getName() + "] " + pdf.getName() + " v" + pdf.getVersion() + " by " + pdf.getAuthors() + " has been enabled.");
		registerClasses();
	}
	
	@Override
	public void onDisable(){
		PluginDescriptionFile pdf = getDescription();
		consoleBroadcast("[" + pdf.getName() + "] " + pdf.getName() + " v" + pdf.getVersion() + " by " + pdf.getAuthors() + " has been disabled.");
	}

}
