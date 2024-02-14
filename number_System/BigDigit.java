//find the bigest digit in given number
import java.util.*;
public class BigDigit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The bigest in "+n+" is: "+bigDigit(n));
	}
	public static int bigDigit(int n)
	{
		int bigdigit=0;

		while(n!=0)
		{
			int rem=n%10;
			if(rem>bigdigit)
				bigdigit=rem;
			n/=10;
		}
		return bigdigit;
	}
}