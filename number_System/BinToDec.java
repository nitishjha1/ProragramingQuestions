/* Binary to Decimal 101=5;
*/
import java.util.*;
public class BinToDec
{
	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println("Decimal value of "+n+" is: ="+bintodec(n));

	}
	public static int bintodec(int n)
	{
		int dec=0;
		int count=0,sum=0;
		 while(n!=0)
		{
			 int rem=n%10;
			 sum=sum+rem*(int)Math.pow(2,count);
			 count++;
			 n/=10;
		}
		dec=sum;
		return dec;
	}
}