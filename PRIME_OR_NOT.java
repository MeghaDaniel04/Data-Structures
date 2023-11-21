import java.util.Scanner;
class PRIME_OR_NOT
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you need to check whether it;s prime or not");
		int num = sc.nextInt();
		int flag = 0;
		for(int i=2; i<num/2; i++)
		{
			if(num%i==0)
			flag = 1;
		}
		if(flag==0)
			System.out.println("The number is prime");
		else
			System.out.println("The number is not prime");
        }
}
