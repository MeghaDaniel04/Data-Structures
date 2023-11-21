import java.util.Scanner;

class factorNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose factors you need to find");
		int number = sc.nextInt();
		System.out.println("The factors are");
		for(int i =1; i<=number;i++)
			if(number%i==0)
				System.out.println(i);


	}


}
