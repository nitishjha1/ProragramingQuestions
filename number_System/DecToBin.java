/* dec to binary*/
import java.util.*;
public class DecToBin
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Binary value of "+ n+" is: "+dectobin(n));

	}
	public static String dectobin(int n)
	{
		String bin="";
		if(n==0)
			return "0";

		while(n!=0){
		 int rem=n%2;
		 bin=rem+bin;
		 n/=2;

		}
		return bin;

	}
}