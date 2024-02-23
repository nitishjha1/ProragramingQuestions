
/*
*           *
* *       * *
* * *   * * *
* * * * * * *
* * *   * * *
* *       * *
*           *
*/
import java.util.*;
class Pattern42
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int st=1,sp=n-2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=st;j++)
			{
				System.out.print("*");

			}
			for(int j=1;j<=sp;j++)
				System.out.print(" ");
			int val=0;
            if(i==(n/2+1))
				val=1;
			for(int j=1;j<=st-val;j++)
			{
				System.out.print("*");
				

			}
			
			if(i<=n/2)
			{
			sp-=2;
			st++;
			}
			else
			{
				sp+=2;
				st--;
			}
			System.out.println();
		}
	}
}