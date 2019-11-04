import java.util.Scanner;
import java.text.DecimalFormat;

public class Array{
	public static void main(String[] args){
		
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		char yes;
		int classLabe[];
		int numClassLabel[];
		
		
		System.out.print("Enter number of Employee: ");
		int input = scan.nextInt();
		
		
		do{
			for(int x = 0; x < input; x++ ){
				double payRanges[] = new double[input];
				System.out.print("Employee " + (x+1) + " Gross: ");
				payRanges[x] = scan.nextInt();
				
				if(payRanges[x] > 0 && payRanges[x] < 100000){
					
					payRanges[x] = payRanges[x] * 0.09;
					System.out.println("Week Bonus " + df.format(payRanges[x]) );
					
					double weekTotal = payRanges[x] + 200;
					System.out.println("Week Total " + df.format(weekTotal) );
					
					if(weekTotal < 300){
						System.out.println("Classification " + (x+1) + " : A");
					}else if(weekTotal < 400){
						System.out.println("Classification " + (x+1) + " : B");
					}else if(weekTotal < 500){
						System.out.println("Classification " + (x+1) + " : C");
					}else if(weekTotal < 600){
						System.out.println("Classification " + (x+1) + " : D");
					}else if(weekTotal < 700){
						System.out.println("Classification " + (x+1) + " : E");
					}else if(weekTotal < 800){
						System.out.println("Classification " + (x+1) + " : F");
					}else if(weekTotal < 900){
						System.out.println("Classification " + (x+1) + " : G");
					}else if(weekTotal < 1000){
						System.out.println("Classification " + (x+1) + " : H");
					}else if(weekTotal >= 1000){
						System.out.println("Classification " + (x+1) + " : I");
					}	
				}else
					System.out.println("Invalid Gross");	
			}
			
			System.out.print("\tDo you want to try Again ??? (Y/N): ");
			yes = scan.next().charAt(0);
			
		}while(yes == 'Y' || yes == 'y');
		
	}	
}
