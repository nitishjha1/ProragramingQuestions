/*

12345
2345
345
45
5
*/
import java.util.*;
class Pattern13
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print( j+" ");
			}

			System.out.println();
		}
	}
}