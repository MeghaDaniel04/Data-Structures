import java.util.Scanner;

class fibonacciSeries
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which you need to find the series");
		int limit = sc.nextInt();
		int num1 =0, num2 = 1,num3;
		while(num1 <= limit)
		{
			num3 = num1 + num2;
			System.out.print(num1+" ");
			num1 = num2;
			num2 = num3;
		}

	}

}
