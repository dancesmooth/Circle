
public class Circle {

	private double radius;
	
	public Circle(double r) {
		radius = r;
	}
	
	double Getcircumference(){
		return Math.PI*radius*2;
		
	}
	
	double Getarea() {
		return Math.PI*radius*radius;
	}
	
	double getRadius() {
		return radius;
	}
	
}
