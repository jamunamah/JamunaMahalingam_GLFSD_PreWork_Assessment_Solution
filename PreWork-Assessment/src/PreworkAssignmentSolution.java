import java.util.Scanner;

public class PreworkAssignmentSolution {

	public static void main(String[] args) {
		
		
		PreworkAssignmentSolution obj = new PreworkAssignmentSolution();
		
		Scanner in = new Scanner(System.in);
		int choice;

	
			do {
		
				System.out.println("Enter your selection from the following 1/2/3/4");
				System.out.println("1. Check for Palindrome Number");
				System.out.println("2. Print Pattern of Stars");
				System.out.println("3. Check whether number is prime or not");
				System.out.println("4. Print Fibonacci Series");
				
				choice = in.nextInt();


			switch(choice)
			{
			
				case 0: {
					choice = 0;
				}
				break;
			
				case 1: {
					obj.CheckPalindrome();
				}
				break;

				case 2: {
					obj.PrintStars();
				}
				break;
			
				case 3: {
					obj.CheckPrimeNumber();
				}
				break;
				
				case 4: {
					obj.PrintFibonacci();
				}
				break;
			
				default: {
					System.out.println("Invalid input. Please enter 1/2/3/4");
				}
				break;
				}
			}
			
				while (choice != 0);
				

				System.out.println("Exited Successfully!!!");

				in.close();
				
		}
	

	
	public void CheckPalindrome()  {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = in.nextInt();
		
		int reversedNumber = 0;
		int remainder;
	    
	    // store the number to originalNum
	    int originalNumber = number;
	    
	    // get the reverse of originalNum
	    // store it in variable
	    while (number != 0) {
	      remainder = number % 10;
	      reversedNumber = reversedNumber * 10 + remainder;
	      number = number/10; //if b>a, a mod d = 1; 1 mod 10 =1
	    }
	    
	    // check if reversedNum and originalNum are equal
	    if (originalNumber == reversedNumber) {
	      System.out.println(originalNumber + " is a Palindrome number.");
	    }
	    else {
	      System.out.println(originalNumber + " is not a Palindrome number.");
	    }
		

    }

	public void PrintStars(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = in.nextInt();
		
		for (int i=rows; i>0; i--)
		{
			for (int j=0; j<i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		
		}
		
	}
	
	public void CheckPrimeNumber(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a whole number");
		int number2 = in.nextInt();
		boolean flag = false;
		
			for (int i=2; i<=number2/2; i++) {
				if (number2%i == 0)	{
					flag = true;
				}
				
			}

				
		if (flag){
					System.out.println(number2 +" is not a prime number");
				}
						
		else {
					System.out.println(number2 +" is a prime number");	
								
			}

	}
	
	public void PrintFibonacci() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a whole number");
		int number3 = in.nextInt();
		
		int firstnum = 0;
		int secondnum = 1;
		int i = 0;
		int sum = firstnum + secondnum;
		System.out.println ("The Fibonacci Series for " +number3);
		
		while (i < number3){
			System.out.print(firstnum +",");			
			firstnum = secondnum;
			secondnum = sum;
			sum = firstnum + secondnum;

			i++;
		}
	
	}
}

		
