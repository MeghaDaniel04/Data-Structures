import java.util.Scanner;
class largestElement2D
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the square matrix\n");
		int r = sc.nextInt();
		int arr[][] = new int[r][r];
		int i,j;
		System.out.println("Enter the elements\n");
		for(i=0;i<r;i++)
			{
			for(j=0;j<r;j++)
				arr[i][j] = sc.nextInt();
			}
		for(i=0;i<r;i++)
			{
			for(j=0;j<r;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
			}
		int largest = arr[0][0];
		
		for(i=0;i<r;i++)
			{
			for(j=0;j<r;j++)
				{
				if(arr[i][j]>largest)
				
					largest = arr[i][j];
				}	
			}
		
			
	
		System.out.println(" largest element"+largest);
		
	}

}
