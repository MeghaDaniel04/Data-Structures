class fibonacci
{
	public static void main(String args[])
	{
		int num1 = 0, num2 = 1, num3 = 0;

		while(num1 <= 10)
		{
			num3 = num1 + num2;
			System.out.print(num1+" ");
			num1 = num2;
			num2 = num3;
		}

	}

}
