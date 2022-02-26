import java.util.Scanner;

class Test1{
	
	public static void main(String[] args)
	{
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to be printed : ");
		
		int n = S.nextInt();
		int a = 65;
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				if(a>90)
				{
					System.out.print("*");
				} else {
					System.out.print((char)a);
				}
				System.out.print("");
				a = a + 1;
			}
			System.out.println("");
		}
		
	}
	
	
	
}