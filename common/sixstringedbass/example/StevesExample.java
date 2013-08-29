package sixstringedbass.example;

import sixstringedbass.example.network.PacketHandler;
import sixstringedbass.example.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "StevesExample", name = "Steve's Example", version = "Lecture 1")
@NetworkMod(channels = {"example"}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class StevesExample {

	@Instance("StevesExample")
	public static StevesExample instance;
	
	@SidedProxy(clientSide = "sixstringedbass.example.proxies.ClientProxy", serverSide = "sixstringedbass.example.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
