
/*
A B C D E
  B C D E
    C D E
	  D E
	    E
     
*/
import java.util.*;
class Pattern29
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			for(int j=n-i+1;j<=n;j++)
				System.out.print((char)(65+j-1));
			System.out.println();
		}
	}
}