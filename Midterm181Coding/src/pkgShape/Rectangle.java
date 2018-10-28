package pkgShape;

public class Rectangle extends Shape implements Comparable<Object> {

	private int iWidth;
	
	private int iLength;
	
	//Order of parameters is same as order of instance variables in class diagram.
	public Rectangle(int paraW, int paraL) {
		super();
		this.iWidth = paraW;
		this.iLength = paraL;
	}
	
	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int paraW) {
		this.iWidth = paraW;
	}
	
	public int getiLength() {
		return iLength;
	}
	
	public void setiLength(int paraL) {
		this.iLength = paraL;
	}
	
	@Override
	public double area() {
		return this.iWidth * this.iLength;
	}

	@Override
	public double perimeter() {
		return (this.iWidth * 2) + (this.iLength * 2);
	}

	//Assuming here that ascending order means rect should come after the calling object
	//if rect is larger than the calling object, resulting in smallest first
	//Easier implementation would be: return ((Rectangle) this.area) - ((Rectangle) rect.area);
	//that implementation is shown in Cuboid.
	public int compareTo(Object rect) {
		int returnVal = 0;
		
		if (((Rectangle) rect).area() < this.area()) {
			returnVal = 1;
		} else if (((Rectangle) rect).area() == this.area()) {
			returnVal = 0;
		} else if (((Rectangle) rect).area() > this.area()) {
			returnVal = -1;
		}
		
		return returnVal;
	}
}
