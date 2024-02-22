/*
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5
*/
import java.util.*;
class Pattern17
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n-i+j);

			}
			System.out.println();
		}

	}
}