import java.util.Scanner;
class sumArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements\n");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i,sum=0;
		System.out.println("Enter the elements\n");
		for(i=0;i<n;i++)
			{
			arr[i] = sc.nextInt();
			}
		for(i=0;i<n;i++)
			sum += arr[i];
		System.out.println("Sum:"+sum);
	}

}
