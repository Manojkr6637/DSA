import java.lang.*;
import java.util.Scanner;
class RadixNumb{
 
	public static void main(String[]args){
		String num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number");

		num = sc.nextLine();
		
		if(num.matches("[01]+")){
			System.out.println("Binary Radix=2");
		}
		else if(num.matches("[0-7]+")){
			System.out.println("Binary Radix=8");
		}
               else if(num.matches("[0-9]+")){
			System.out.println("Binary Radix=10");
		}
               else if(num.matches("[0-9A-F]+")){
			System.out.println("Binary Radix=16");
		}else{
			System.out.println("Not valid number!");
		}
		
 	

	}

}
