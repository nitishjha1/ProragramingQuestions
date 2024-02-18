
/*
1
2 6
3 7 10
4 8 11 13 
5 9 12 14 15

*/
import java.util.*;
class Pattern10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int def=0,val=0;
		for(int i=1;i<=n;i++)
		{
			def=n-1;
			val=i;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(val+" ");
				val=val+def;
					def--;
			}
			System.out.println();
		}
	}
}