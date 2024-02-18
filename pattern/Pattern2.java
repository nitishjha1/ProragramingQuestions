/*
1010
1010
1010
1010
*/
import java.util.*;
class Pattern2
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner (System.in);
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print((j%2));
				}
					System.out.println();
			}
		}
}