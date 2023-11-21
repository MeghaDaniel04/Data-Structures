import java.util.Scanner;
class replaceElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements\n");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i;
		System.out.println("Enter the elements\n");
		for(i=0;i<n;i++)
			{
			arr[i] = sc.nextInt();
			}
		System.out.println("Enter the particular element which you need to replace");
		int element = sc.nextInt();
		System.out.println("Enter the element to which you need to change");
		int replace = sc.nextInt();
		for(i=0;i<n;i++)
			{
			if(arr[i]==element)
				arr[i]=replace;
			}
		System.out.println("new  array:");
		for(i=0;i<n;i++)
			
			System.out.println(arr[i]);
			
	}

}
