
/*
1 2 3 4 5
6 7 8 9 1
2 3 4 5 6
7 8 9 1 2
3 4 5 6 7
*/
import java.util.*;
public class Pattern12
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				count++;
				System.out.print(count+" ");
				if(count>=9)
				  count=0;
				
			}
			System.out.println();
		}
	}
}