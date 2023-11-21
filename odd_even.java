import java.util.Scanner;

class odd_even
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to check whether it's odd or even");
		int number = sc.nextInt();
		if(number%2==0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");

	}


}
