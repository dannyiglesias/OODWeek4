import java.util.HashMap;
import java.util.ArrayList;

public class EngineConfig implements Selection {
	HashMap<String, ConfigurationItem> configurationItems = new HashMap<String, ConfigurationItem>();
	  
	public EngineConfig() {
		addItem("Low Fuel",
			"Lower weight, requires careful managing",
			true,65000.00);
		addItem("Medium Fuel",
			"Slightly heavier but allows for more aggressive passing",
			false, 62000.00);
		addItem("Heavy Fuel",
			"Heaviest, but can go longer and push harder",
			true, 75000.00);
	}
 
	public void addItem(String name, String description, 
	                     boolean optimal, double price) 
	{
		ConfigurationItem configurationItem = new ConfigurationItem(name, description, optimal, price);
		configurationItems.put(configurationItem.getName(), configurationItem);
	}
	
	public ArrayList<ConfigurationItem> getConfigurationItems() {
		return configurationItems;
	}
  
	public Iterator<ConfigurationItem> createIterator() {
		return configurationItems.iterator();
	}
	
/*	public Iterator createIterator() {
		return new EngineConfig(configurationItems);
	}
 */
/*	public Map<String, ConfigurationItem> getItems() {
		return configurationItems;
	}
  
	public Iterator createIterator() {
		return new tireIterator(ConfigurationItems);
	}*/

}
