import java.util.Scanner;
class replace_character
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, flag = 0;
		System.out.println("Enter the string\n");
		String s1 = sc.nextLine();
		System.out.println("Enter the character to be replaced\n");
		char x = sc.next().charAt(0);
		System.out.println("Enter the character to which is to be replaced\n");
		char y = sc.next().charAt(0);
		
		String s2 = s1.replace(x,y);
		System.out.println("New string after replacement:"+s2);
	}


}
