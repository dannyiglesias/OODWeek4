package RaceIterator;

import java.util.ArrayList;

public class Aero implements Configs {
	ArrayList<ConfigItems> configItems;
	
	public Aero() {
		configItems = new ArrayList<ConfigItems>();
		addItem("Aero Package 1",
			"Reduced Drag in tight corners, slower speeds on straights", 40000.00);
		addItem("Aero Package 2",
			"Excellent on straights with decreased performance in cornering", 35000.00);
		addItem("Aero Package 3",
			"Best for overtaking on straights with minimal speed sacrificed in corners", 45000.00);
	}
 
	public void addItem(String name, String description, 
	                     double price) 
	{
		ConfigItems configItems = new ConfigItems(name, description, price);
		configItems.add(configItems);
	}
	
	public ArrayList<ConfigItems> getConfigItems(){
		return configItems;
	}
	
	public Iterator createIterator() {
		return (Iterator) new Aero();		
	}
	
	public String toString() {
		return"Aero Configuration Options";
	}

}