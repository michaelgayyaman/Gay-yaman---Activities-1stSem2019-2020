import java.util.Scanner;
import java.lang.System;
import java.text.DecimalFormat;

public class Shapes{
	public static void main (String[] args){
		

		
		DecimalFormat df = new DecimalFormat("0.00");
		
		/*System.out.println("********************");
		
		System.out.println("Choose a shape");
		
		System.out.println("1. Circle");
		System.out.println("2. Square");
		System.out.println("3. Rectangle");
		System.out.println("4. Triangle\n");
		
		System.out.println("Choose a Number 1-4 ONLY!!!");
		
		System.out.println("********************");
		
		switch(shapes){
			case 1:
				System.out.println("Shape Choosen: Circle");
				System.out.print("Enter Radius: ");
				radius = scan.nextInt();
				area = pi * radius * radius;
				System.out.println("Area of the circle is: " + df.format(area));
						
				break;
			case 2:
				System.out.println("Shape Choose: Square");
				System.out.print("Enter Sides: ");
				side = scan.nextInt();
				area = side * side;
				System.out.println("Area of the square is: " + area);
				break;
						
					
		}*/
		
		
		
		String shape;
		double pi = Math.PI, area, radius, side;
		
		System.out.print("Enter shape: ");
		
		while(true){
			
			Scanner scan = new Scanner(System.in);
			
			//System.out.println("Try Again ??? (Y / N) ");
			
			try{

				shape = scan.nextLine();
				
				if(shape.equals("Circle"); || shape.equals("circle"); || shape.equals("CIRCLE");"){
					
					System.out.print("Enter Radius: ");
					radius = scan.nextInt();
					area = pi * radius * radius;
					System.out.println("Area of the circle is: " + df.format(area));
					
				}else if(shape == "Square" || shape == "square" || shape == "SQUARE"){
					System.out.print("Enter Side: ");
				}else{
					break;
				}
				
				
			}catch(Exception e){
				System.out.print("Invalid Input");
			}
		}
		
	
		
		
		
	}
}