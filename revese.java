class revese
{
	public static void main(String args[])
	{
		int num = 102, r=0;
		System.out.println(num);
		while(num>0)
		{
		int d = num%10;
		r = r*10 + d;
		num = num/10;
		}
		System.out.println(num);
		System.out.println(r);



	}
}
