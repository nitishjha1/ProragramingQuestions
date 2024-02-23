
/*
      1
    1   1
   1  2  1
  1  3  3  1
1  4  6  4   1
*/
import java.util.*;
class Pattern41
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 for(int i=1;i<=n;i++)
		{
			 for(int j=1;j<=n-i;j++)
				 System.out.print("  ");
			 int k=1
			 for(int j=1;j<=i;j++)
			{
				 System.out.println(k+"  ");
				 k=k*(i-j)/j;
			}
			Systemm.out.println():

		}
	}
}