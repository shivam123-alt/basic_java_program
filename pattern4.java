public class pattern4
{
	
	public static void printTriangle(int n)
	{
		for (int i=0; i<n; i++)
		{
			for (int j=n-i; j>1; j--)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++ )
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int n = 6;
		printTriangle(n);
	}
}
