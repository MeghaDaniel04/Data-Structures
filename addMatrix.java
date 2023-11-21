import java.util.Scanner;
class addMatrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrix\n");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr1[][] = new int[r][c];
		int arr2[][] = new int[r][c];
		int sum[][] = new int[r][c];
		int i,j;
		System.out.println("Enter the elements of first matrix\n");
		for(i=0;i<r;i++)
			{
			for(j=0;j<c;j++)
				arr1[i][j] = sc.nextInt();
			}
		System.out.println("Enter the elements of second matrix\n");
		for(i=0;i<r;i++)
			{
			for(j=0;j<c;j++)
				arr2[i][j] = sc.nextInt();
			}
		System.out.println("first matrix\n");
		for(i=0;i<r;i++)
			{
			for(j=0;j<c;j++)
				System.out.print(arr1[i][j]+"  ");
			System.out.println();
			}
		System.out.println("second matrix\n");
		for(i=0;i<r;i++)
			{
			for(j=0;j<c;j++)
				System.out.print(arr2[i][j]+"  ");
			System.out.println();
			}
		for(i=0;i<r;i++)
			{
			for(j=0;j<c;j++)
				sum[i][j] = arr1[i][j] +  arr2[i][j];
			}
		System.out.println(" sum of two matrices");
		for(i=0;i<r;i++)
			{
			for(j=0;j<c;j++)
				System.out.print(sum[i][j]+"  ");
			System.out.println();
			}
			
	
		
		
	}

}
