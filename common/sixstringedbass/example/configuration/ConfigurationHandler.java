package sixstringedbass.example.configuration;

import java.io.File;

import sixstringedbass.example.item.ItemInfo;
import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
	
	public static Configuration config;
	
	public static final String CATEGORY_KEYWORD = "useless stuff";
	
	public static void init(File file){
		config = new Configuration(file);
		
		config.load();
		
		ItemInfo.WAND_ID = config.getItem(ItemInfo.WAND_KEY, ItemInfo.WAND_DEFAULT).getInt() - 256;
		
		config.save();
	}

}
