package studio7;

public class rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;
private boolean larger;

	public rectangle (double length, double width) {
		this.length=length;
		this.width=width;
	}
	
	public double area() {
		this.area=area;
		
		double area=length*width;
		return area;
	}
	
	public double perimeter() {
		this.perimeter=perimeter;
		double perimeter = (2*length)+(2*width);
		return perimeter;
	}
	
	public boolean larger(rectangle r1) {
		
		if(this.area()>r1.area()) {
			 larger= true;
		}else {
			 larger= false;
		}
		return larger;
	}
	
	public String toString() {
		area=area();
		perimeter = perimeter();
		return length + ":" + width + ":" + area + ":" + perimeter + ":" ;
	}
	public static void main(String[] args) {
		
		rectangle r1 = new rectangle(2.0,4.0);
		rectangle r2 = new rectangle(4.0,6.0);
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r1.larger(r2));

	}

}
