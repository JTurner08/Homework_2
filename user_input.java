package user_input;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
//		1. Write Fibonnaci series between the user entered start and end values
//		print out first n number of elements from the fibonacci series based on user input
		
		
//		System.out.println("How many fibonacci number do you want to print?: ");
//		int n= scan.nextInt();
//		fibonacci(n);
		
//		2. Determine whether a user entered number is an Armstrong number
//		System.out.println("Enter a number: ");
//		int n= scan.nextInt();
//		int temp=n;
//		int sum=0;
//		int remainder;
//		while(n>0) {
//			remainder=n%10;
//			sum= sum+(remainder*remainder*remainder);
//			n =n/10;
//		}
//		if (temp==sum) {
//			System.out.println("The number you entered is an Armstrong number!");
//		}else {
//			System.out.println("Sorry, this is not an Armstrong number.");
//		}
		
		
//		3. Write a program to see if a user entered string is a palindrome or not
		System.out.println("Enter a string to see if it is a Palindrome:");

		String str= scan.next();
		
		//reverse string entered into a new string
		String strReversed=new StringBuilder(str).reverse().toString();
	

        //checking
        if(str.equals(strReversed)) {
            System.out.println("The word you entered is a palindrome");
        }
        else {
            System.out.println("The word you entered is not a palindrome");
        }
		
	}
		public static void fibonacci(int n) {
			int num1=0; 
			int num2 =1;
			for (int i=0; i<=n; i++) {
				System.out.print(num1+ ", ");
				int num3 = num1+num2;
				num1=num2;
				num2=num3;
			}
		}
}