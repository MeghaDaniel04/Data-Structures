import java.util.Scanner;
class multiply2D
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the first matrix\n");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		System.out.println("Enter the number of rows and columns of the second matrix\n");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int arr1[][] = new int[r1][c1];
		int arr2[][] = new int[r2][c2];
		int product[][] = new int[r1][c2];
		int i,j;
		System.out.println("Enter the elements of first matrix\n");
		for(i=0;i<r1;i++)
			{
			for(j=0;j<c1;j++)
				arr1[i][j] = sc.nextInt();
			}
		System.out.println("Enter the elements of second matrix\n");
		for(i=0;i<r2;i++)
			{
			for(j=0;j<c2;j++)
				arr2[i][j] = sc.nextInt();
			}
		System.out.println("first matrix\n");
		for(i=0;i<r1;i++)
			{
			for(j=0;j<c1;j++)
				System.out.print(arr1[i][j]+"  ");
			System.out.println();
			}
		System.out.println("second matrix\n");
		for(i=0;i<r2;i++)
			{
			for(j=0;j<c2;j++)
				System.out.print(arr2[i][j]+"  ");
			System.out.println();
			}
		System.out.println(" \n  ")
		if(c1==r2)
		{
			for(i=0;i<r1;i++)
			{    
				for(j=0;j<c2;j++)
				{    
					product[i][j]=0;      
					for(int k=0;k<r2;k++)      
					{      
						product[i][j] += arr1[i][k] * arr2[k][j];      
					}

					System.out.print(product[i][j]+" ");  
				} 
				System.out.println();    
			}    
		} else
			System.out.println("multiplication is not possible");
		
	
		
		
	}

}
