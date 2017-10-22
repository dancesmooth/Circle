import java.util.Scanner;
import java.lang.Math;


public class CircleCalculator {

	public static void main(String args[]){
		Scanner ab = new Scanner(System.in);
        String ans;
        
		do {
			boolean b = true;
			
			// step 1: input radius and check.
			System.out.println("Enter the radius of the circle");
			
			/*We are storing the entered radius in double
     		 * because a user can enter radius in decimals
      		*/
			double radius = 0.0;
			
			String s = ab.nextLine();
			//convert string to double
			try {
				radius = Double.parseDouble(s);
			} catch (Exception e) {
				System.out.println("Invalid value for radius.");
				b = false;
			}
			
			if(b == true){
				//check if radius is not negative 
				if(radius < 0){
					System.out.println("Radius must be positive.");
					b = false;
				}
				
			}
			
			double height = 0.0;
			// step 2: input height and check.
			if (b == true) {
				System.out.println("What is the height of the cylinder?");
				String d = ab.nextLine();
				try {
					height = Double.parseDouble(d);
				} catch (Exception e) {
					System.out.println("Invalid value for height.");
					b = false;
				}
				
				
				if(b == true){
					//check if height is not negative 
					if(height < 0){
						System.out.println("Height must be positve.");
						b = false;
					}
						
				}					
			}	
			
			// step 3: get volume / .
			if (b == true) {
				Cylidner cd = new Cylidner(radius, height);
				double surfacearea = cd.Getarea();
				System.out.println("Your surface area is " +  surfacearea);
				double volume = cd.getvolume();
				System.out.println("Your volume is " +  volume);
			}	
			
			// step 4: ask user to re-try.
			System.out.println("Try again?");
	
			ans = ab.nextLine();
			
		}  while (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y"));  
		System.out.println("Thank you for using the program");
		
	
		
		
	}
	
}
