import java.util.Scanner;
class frequency_character
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, freq = 0, flag= 0;
		System.out.println("Enter the string\n");
		String s = sc.nextLine();
		System.out.println("Enter the character whose frequency is to be checked\n");
		char x = sc.next().charAt(0);
		for(i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==x){
				freq ++;
				flag=1;}
				
		}
		if(flag == 1)
			System.out.println("The character is present and the frequency is :"+freq);
		else
			System.out.println("Character is not present");
	}
}
