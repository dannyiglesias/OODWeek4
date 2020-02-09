import java.util.ArrayList;

public class tireIterator implements Iterator {
	ArrayList<ConfigurationItem> items;
	int position = 0;
	
	public tireIterator(ArrayList<ConfigurationItem> items) {
		this.items = items;
	}
	
	public ConfigurationItem next() {
		ConfigurationItem item = items.get(position);
		position = position + 1;
		return item;
	}
	
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		}
		else {
			return true;
		}
		
	}
}

