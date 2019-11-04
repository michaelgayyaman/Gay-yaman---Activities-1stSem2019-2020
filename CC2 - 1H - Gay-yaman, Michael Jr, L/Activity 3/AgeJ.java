import java.io.*;

public class AgeJ{
	public static void main (String[] args){
		
		int age;
		
		//Scanner scan = new Scanner(System.in);
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\nEnter your Age: ");
		

		while(true){
			
			try{
				age = Integer.parseInt(scan.readLine());
				
				if(age < 0){
					System.out.print("\nYou Entered a Negative number/s.\n\tKindly Enter a Valid Value: ");
				}else if(age >= 123){
					System.out.print("\nYou Exceed the Maximum required number/s.\n\tKindly Enter a Valid Value: ");
				}else{
					if(age <= 3){
						System.out.println("Age Category: Baby");
					}else if(age <= 12){
						System.out.println("Age Category: Child");
					}else if(age <= 19){
						System.out.println("Age Category: Teen");
					}else if(age <= 32){
						System.out.println("Age Category: Yound Adult");
					}else if(age <= 45){
						System.out.println("Age Category: Middle Aged");
					}else if(age <= 59){
						System.out.println("Age Category: Adult");
					}else if(age <= 122){
						System.out.print("Age Category: Senior");
					}
					break;
				}
				
			}catch(Exception e){
				System.out.println("\nKindly Enter a Number.");
				System.out.print("\tKindly Enter your Age Again: ");
			}
			
			
		}
		
	}
}