
/*
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
import java.util.*;
class Pattern37
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			int count=0;
			for(int j=1;j<=2*i-1;j++)
			{
				if(j>i)
					count--;
				else
					count++;
				System.out.print(count+" ");

			}
			System.out.println();
		}

	}
}
