
/**
print Fibonnacci number within n
*/
import java.util.*;
public class Fibonacci
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printfibonacie(n);

	}
	public static void printfibonacie(int n)
	{
		
		int f1=0,f2=1,next=0;

		for(int i=1;f1<=n;i++)
		{
			System.out.print(f1+" ");
			next=f1+f2;
			f1=f2;
			f2=next;
		}

	}
}
