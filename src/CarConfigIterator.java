
public class CarConfigIterator implements Iterator {
	ConfigurationItem[] items;
	int position = 0;
	
	public CarConfigIterator (ConfigurationItem[] items) {
		this.items = items;
	}
	
	public ConfigurationItem next() {
		ConfigurationItem configItem = items[position];
		position = position + 1;
		return configItem;
	}
	
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		}
		else {
			return true;
		}
		
	}

}
