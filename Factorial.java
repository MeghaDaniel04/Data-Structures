import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose factorial you need to find");
		int limit = sc.nextInt();
		int fact=1;
		for(int i=1; i<=limit; i++)
			fact  *= i;
		System.out.println("The factorial of the number:"+fact);
	}


}
