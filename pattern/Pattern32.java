
/*
         1
       1 * 2
     1 * 2 * 3
   1 * 2 * 3 * 4
 1 * 2 * 3 * 4 * 5

*/
import java.util.*;
class Pattern32
{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print("  ");

		}
		int count=0;
		for(int j=1;j<=2*i-1;j++)
		{
			if(j%2==0)
			System.out.print("*"+ " ");
			else
			{
				count++;
			System.out.print(count+" ");
			}
		}
		System.out.println();
	}

	}
}