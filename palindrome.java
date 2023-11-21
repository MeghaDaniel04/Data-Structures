import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int start, end, flag = 1;String s;
		System.out.println("Input the string\n");
		s = sc.nextLine();
		start = 0;
		end = s.length()-1;
		while(start<end)
		{
			if(s.charAt(start)!=s.charAt(end))
				flag = 0;
			start++;
			end--;
		}
		if(flag == 1)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not  palindrome");
	}
}
