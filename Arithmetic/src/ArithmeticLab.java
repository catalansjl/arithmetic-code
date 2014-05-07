
import java.util.Scanner;

public class ArithmeticLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		Scanner input = new Scanner(System.in);				
		
		int numb1; 
		int numb2;
		int result;
		int result2;
		int result3;
		
		System.out.print("Please enter the first number "); 
		numb1 = input.nextInt();
		
		System.out.print("Please enter the second number ");
		numb2 = input.nextInt();
		
		result = numb1 * numb2;
		result2 = result / numb1;
		result3 = result2 % 2;
		
		
		System.out.printf("Hello, the result of the remainderis %d", result3);			

	}

}

		
		
		
		
		
		

	