/*
E
D E
C D E
B C D E
A B C D E

*/
import java.util.*;
class Pattern16
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(65+n-i+j-1)+" ");
		
			}
			System.out.println();
		}
	}
}