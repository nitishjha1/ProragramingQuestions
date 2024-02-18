/*
A
BA
CBA
DCBA
EDCBA

*/
import java.util.*;
class Pattern14
{
		public static void main(String[] args)
		{
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j>=1;j--)

				{
					
					System.out.print((char)(65+j-1));
				}
				System.out.println();
			}
		}
}