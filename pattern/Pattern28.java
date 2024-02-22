
/*      5
      4 5
    3 4 5
  2 3 4 5
1 2 3 4 5
*/
import java.util.*;
class Pattern28
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			for(int j=n-i+1;j<=n;j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}