/*
5 4 3 2 1
  4 3 2 1 
    3 2 1
	  2 1
	    1
*/
import java.util.*;
class Pattern22
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
				System.out.print(i-j+1+" ");
			System.out.println();
		}
	}
}
