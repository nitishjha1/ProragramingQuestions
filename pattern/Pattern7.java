
/*

ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
*/
import java.util.*;
public class Pattern7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(65+j-1));
			}
			System.out.println();
			
		}
	}

}