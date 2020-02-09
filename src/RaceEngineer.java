import java.util.Iterator;
  
public class RaceEngineer {
	Selection AeroConfig;
	Selection EngineConfig;
	Selection TireSelection;
 
	public RaceEngineer(Selection AeroConfig, Selection EngineConfig, Selection TireSelection) {
		this.AeroConfig = AeroConfig;
		this.EngineConfig = EngineConfig;
		this.TireSelection = TireSelection;
	}
 
	public void printSelection() {
		Iterator<ConfigurationItem> pancakeIterator = AeroConfig.createIterator();
		Iterator<ConfigurationItem> dinerIterator = EngineConfig.createIterator();
		Iterator<ConfigurationItem> cafeIterator = TireSelection.createIterator();

		System.out.println("Configurations\n----\nAero Packages");
		printSelection(aeroIterator);
		System.out.println("\nEngine Packages");
		printSelection(engineIterator);
		System.out.println("\nTire Options");
		printSelection(tireIterator);
	}
 
	private void printSelection(Iterator<ConfigurationItem> iterator) {
		while (iterator.hasNext()) {
			ConfigurationItem ConfigurationItem = iterator.next();
			System.out.print(ConfigurationItem.getName() + ", ");
			System.out.print(ConfigurationItem.getPrice() + " -- ");
			System.out.println(ConfigurationItem.getDescription());
		}
	}
 
	public void printVegetarianSelection() {
		System.out.println("\nVEGETARIAN Selection\n---------------");
		printVegetarianSelection(AeroConfig.createIterator());
		printVegetarianSelection(EngineConfig.createIterator());
		printVegetarianSelection(TireSelection.createIterator());
	}
 
	public boolean isItemVegetarian(String name) {
		Iterator<ConfigurationItem> pancakeIterator = AeroConfig.createIterator();
		if (isVegetarian(name, pancakeIterator)) {
			return true;
		}
		Iterator<ConfigurationItem> dinerIterator = EngineConfig.createIterator();
		if (isVegetarian(name, dinerIterator)) {
			return true;
		}
		Iterator<ConfigurationItem> cafeIterator = TireSelection.createIterator();
		if (isVegetarian(name, cafeIterator)) {
			return true;
		}
		return false;
	}


	private void printVegetarianSelection(Iterator<ConfigurationItem> iterator) {
		while (iterator.hasNext()) {
			ConfigurationItem ConfigurationItem = iterator.next();
			if (ConfigurationItem.isVegetarian()) {
				System.out.print(ConfigurationItem.getName() + ", ");
				System.out.print(ConfigurationItem.getPrice() + " -- ");
				System.out.println(ConfigurationItem.getDescription());
			}
		}
	}

	private boolean isVegetarian(String name, Iterator<ConfigurationItem> iterator) {
		while (iterator.hasNext()) {
			ConfigurationItem ConfigurationItem = iterator.next();
			if (ConfigurationItem.getName().equals(name)) {
				if (ConfigurationItem.isVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}
}