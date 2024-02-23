
/*

    5
   54
  543
 5432
54321
*/
import java.util.*;
class Pattern40
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			System.out.print("  ");
			int val=n;
			for(int j=1;j<=i;j++){
				System.out.print(val+" ");
				val--;
			}
			System.out.println();
		}
	}
}