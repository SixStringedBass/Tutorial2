package sixstringedbass.example.configuration;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
	
	public static Configuration config;
	
	public static final String CATEGORY_KEYWORD = "useless stuff";
	
	public static void init(File file){
		config = new Configuration(file);
		
		config.load();
		
		ConfigurationSettings.TEST_INT = config.get(CATEGORY_KEYWORD, ConfigurationSettings.TEST_INT_CONFIGNAME, ConfigurationSettings.TEST_INT_DEFAULT).getInt();
		ConfigurationSettings.TEST_STRING = config.get(CATEGORY_KEYWORD, ConfigurationSettings.TEST_STRING_CONFIGNAME, ConfigurationSettings.TEST_STRING_DEFAULT).getString();
		
		config.save();
	}

}
