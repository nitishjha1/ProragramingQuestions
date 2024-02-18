//check wheather a number fibonacci or not
import java.util.*;
public class FibOrNot
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		System.out.println("The number "+n+" is : "+(isfib(n)?"Fibonacci Number":"Not Fibbonacci Number"));
	}
	public static boolean isfib(int n)
	{
		int f1=0,f2=1,next=0;
		for(int i=0;f1<=n;i++)
		{
			if(f1==n)
				return true;
			next=f1+f2;
			f1=f2;
			f2=next;
		}
		return false;
		
	}
}