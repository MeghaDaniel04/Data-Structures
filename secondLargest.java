import java.util.Scanner;
class secondLargest
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
			arr[i] = sc.nextInt();
		int largest = arr[0];
		int secondlargest = arr[0];
		for(i=0;i<n;i++)
			{
			if(arr[i]>largest){
				secondlargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>secondlargest && arr[i]!=largest)
				secondlargest = arr[i];
			}
		System.out.println("Second largest element"+secondlargest);
		
	}

}
