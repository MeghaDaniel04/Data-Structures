class checkPrime
{
	public static void main(String args[])
	{
		int num = 51;
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
