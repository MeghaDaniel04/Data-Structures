import java.util.Scanner;
class search_character
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, flag = 0;
		System.out.println("Enter the string\n");
		String s = sc.nextLine();
		System.out.println("Enter the character to be searched\n");
		char x = sc.next().charAt(0);
		for(i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==x){
				flag = 1;
				break;}
		}
		if(flag == 1)
			System.out.println("The character is found");
		else
			System.out.println("The character is not  found");
	}
}
