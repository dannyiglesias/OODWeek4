package RaceSim;

import java.util.ArrayList;
import java.util.List;

public class TireSelection implements Config {
	private List<String> Packages = new ArrayList<String>();
	
	public TireSelection() {
		Packages.add("Soft Compound: Increased grip but also increased degredation");
		Packages.add("Medium Compound: Slightly less grip but slower degredation");
		Packages.add("Hard Compound: Least amount of grip, but takes longer to reach optimal operating temperature");
		
	}
	public Iterator getIterator() {
		return new aeroIterator();	
	}
	
	private class aeroIterator implements Iterator {
		
		private int position;
		
		@Override
		public boolean hasNext() {
			if(position < Packages.size())
				return true;
			return false;
			
		}
		
		@Override 
		public Object next() {
			if (this.hasNext())
				return Packages.get(position++);
			return null;
		}
		
	}

	public Iterator getIterator1() {
		// TODO Auto-generated method stub
		return null;
	}
			
			
	

}