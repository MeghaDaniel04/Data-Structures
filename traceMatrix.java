import java.util.Scanner;

public class traceMatrix {
	
	public static void main(String[] args) {
		
		int i, j, trace = 0;	
		Scanner sc= new Scanner(System.in);	
		
		System.out.print("Enter Matrix Rows and Columns   ");
		int r = sc.nextInt();
		
		int arr[][] = new int[r][r];
		
		System.out.println(" Enter the Matrix elements ");
		for(i = 0; i < r; i++) 
		{
			for(j = 0; j < r; j++) 
			{
				arr[i][j] = sc.nextInt();
			}		
		}
		System.out.println("the matrix\n");
		for(i=0;i<r;i++)
			{
			for(j=0;j<r;j++)
				System.out.print(arr[i][j]+"   ");
			System.out.println();
			}
		
		for(i = 0; i < r; i++) 
		{
			//for(j = 0; j < c; j++) 
			//{
				//if(i == j)
				//{
					trace = trace + arr[i][i];
				//}
			//}		
		}
		
		System.out.println("\nThe Trace Of the Matrix = " + trace);

	}
}
