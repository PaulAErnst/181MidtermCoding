package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparable<Object> {
	
	private int iDepth;
	
	public Cuboid(int paraW, int paraL, int paraD) {
		super(paraW, paraL);
		this.iDepth = paraD;
	}

	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int paraD) {
		this.iDepth = paraD;
	}
	
	public double volume() {
		return this.getiLength() * this.getiWidth() * this.iDepth;
	}
	
	//(Surface) area
	@Override
	public double area() {
		return (this.getiLength() * this.getiWidth() * 2) + (this.getiLength() * this.iDepth * 2) + (this.getiWidth() * this.iDepth * 2);
	}
	
	@Override
	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Perimeter of a Cuboid does not exist!");
	}
	
	
	//This method doesn't seem to have a specific implementation given the instructions for the Midterm;
	//the comparator methods for volume/area are handled by the nested classes, so what is this meant to sort?
	//It isn't listed as needing a JUnit test either.
	//All that said, the implementation below is designed to sort by volume in the absence of clarifying info.
	//(AKA it's the same as the SortByVolume compare() method)
	@Override
	public int compareTo(Object cub) {
		return (int) (((Cuboid) this).volume() - ((Cuboid) cub).volume());
	}
	
	//The static modifier is useful to reference the class for Collections.sort() purposes.
	public static class SortByVolume implements Comparator<Object> {
		
		SortByVolume() {
			
		}
		
		public int compare(Object cuboidA, Object cuboidB) {
			return (int) (((Cuboid) cuboidA).volume() - ((Cuboid) cuboidB).volume());
		}
		
	}
	
	//The static modifier is useful to reference the class for Collections.sort() purposes.
	public static class SortByArea implements Comparator<Object> {
		
		SortByArea() {
			
		}
		
		public int compare(Object cuboidA, Object cuboidB) {
			return (int) (((Cuboid) cuboidA).area() - ((Cuboid) cuboidB).area());
		}
	}
}
