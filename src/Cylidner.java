
public class Cylidner extends Circle 
{
	double height;
	
	public Cylidner(double r, double h){
		super(r);
		height = h;
	} 
	
	double Getarea() {
		return (2 * Math.PI * getRadius() * height) + 2 * super.Getarea();
	}
		
	double getvolume() {
		return super.Getarea() * height;
	}
	

}
