import java.util.Scanner;
class sumNatural
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit upto which you want to add");
		int limit = sc.nextInt();
		int sum=0;
		for(int i=1; i<=limit; i++)
			sum  += i;
		System.out.println("The sum of the numbers:"+sum);
	}


}
