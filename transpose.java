import java.util.Scanner;
class transpose
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrix\n");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		int t[][] = new int[c][r];
		int i,j;
		System.out.println("Enter the elements\n");
		for(i=0;i<r;i++)
			{
			for(j=0;j<c;j++)
				arr[i][j] = sc.nextInt();
			}
		System.out.println(" the matrix\n");
		for(i=0;i<r;i++)
			{
			for(j=0;j<c;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
			}
		
		for(i=0;i<r;i++)
			{
			for(j=0;j<c;j++)
			
				t[j][i]=arr[i][j];
				
			}
		
			
	
		System.out.println(" transpose of the matrix");
		for(i=0;i<c;i++)
			{
			for(j=0;j<r;j++)
				System.out.print(t[i][j]+" ");
			System.out.println();
			}
		
	}

}
