
/*
a
b c
d e f 
g h i j
k l m n o
*/
import java.util.*;
class Pattern15
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int val=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(97+val)+" ");
				val++;

			}
			System.out.println();
		}
	}

}