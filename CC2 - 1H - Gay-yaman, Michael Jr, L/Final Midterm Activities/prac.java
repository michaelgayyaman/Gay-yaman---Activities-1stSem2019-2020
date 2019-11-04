import java.util.Scanner;
import java.lang.System;
import java.text.DecimalFormat;

public class prac {
    public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");
        Scanner Area = new Scanner (System.in); 

        double pi = Math.PI, length, width,totalArea, height; 
        String shape, unit;
        
        int loop = 0; 

        while (loop == 0){ 

        System.out.println("Enter Shape: ");
        shape = Area. next(); 

        switch (shape) { 
        
        case "circle" :
        case "CIRCLE" :
        case "Circle" : 
            System.out.println("Please enter the radius of the circle: ");
            length = Area. nextDouble();  
            totalArea = pi * length * length ;
            System.out.println("Area of the circle is: " + df.format(totalArea));
            break;

        /*case "square" : 
            System.out.println("Please enter the leghth of the square: ");
            length = Area. nextDouble (); 
            System.out.println("Please enter the width of the square: ");
            width = Area. nextDouble();
            totalArea = length*width; 
            System.out.println(totalArea+unit);
            break; 
            
        case "rectangle": 
            System.out.println("Please enter the leghth of the rectangle: ");
            length = Area. nextDouble (); 
            System.out.println("Please enter the width of the rectangle: ");
            width = Area. nextDouble();   
            totalArea = length*width; 
            System.out.println(totalArea+unit);
            break; 

        case "triangle" : 
            System.out.println("Please enter the base of the triangle: ");
            length = Area. nextDouble (); 
            System.out.println("Please enter the height of the triangle: ");
            width = Area. nextDouble(); 
            totalArea = ((length*width)/2); 
            System.out.println(totalArea+unit);
            break;*/

 

        default: 
            System.out.println("The shape you entered is not recongnized");
            }
        }
    }
}