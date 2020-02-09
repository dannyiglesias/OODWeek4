import java.util.HashMap;

public class TireSelection implements Selection {
	HashMap<String, ConfigurationItem> configurationItems = new HashMap<String, ConfigurationItem>();
  
	public TireSelection() {
		addItem("Soft Compound",
			"Increased grip but also increased degredation",
			true,10000.00);
		addItem("Medium Compound",
			"Slightly less grip but slower degredation",
			false, 9500.00);
		addItem("Hard Compound",
			"Least amount of grip, but takes longer to reach optimal operating temperature",
			true, 9000.00);
	}
 
	public void addItem(String name, String description, 
	                     boolean optimal, double price) 
	{
		ConfigurationItem configurationItem = new ConfigurationItem(name, description, optimal, price);
		configurationItems.put(configurationItem.getName(), configurationItem);
	}
	
	public Iterator createIterator() {
		return new TireSelection(configurationItems);
	}
 
/*	public Map<String, ConfigurationItem> getItems() {
		return configurationItems;
	}
  
	public Iterator createIterator() {
		return new tireIterator(ConfigurationItems);
	}*/
}