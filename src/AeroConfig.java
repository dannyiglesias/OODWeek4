import java.util.HashMap;

public class AeroConfig implements Selection {
	HashMap<String, ConfigurationItem> configurationItems = new HashMap<String, ConfigurationItem>();
  
	public AeroConfig() {
		addItem("Aero Package 1",
			"Reduced Drag in tight corners, slower speeds on straights",
			true, 40000.00);
		addItem("Aero Package 2",
			"Excellent on straights with decreased performance in cornering",
			false, 35000.00);
		addItem("Aero Package 3",
			"Best for overtaking on straights with minimal speed sacrificed in corners",
			true, 45000.00);
	}
 
	public void addItem(String name, String description, 
	                     boolean optimal, double price) 
	{
		ConfigurationItem configurationItem = new ConfigurationItem(name, description, optimal, price);
		configurationItems.put(configurationItem.getName(), configurationItem);
	}
	
	public Iterator createIterator() {
		return new AeroConfig(configurationItems);
	}
 
/*	public Map<String, ConfigurationItem> getItems() {
		return configurationItems;
	}
  
	public Iterator<ConfigurationItem> createIterator() {
		return configurationItems.values().iterator();
	}*/
}