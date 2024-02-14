/* Xylem or Phloem number --> sum of exteme digit==sum of mean digit
12348=sum(1,8)=sum(2,3,4)-->9==9 xylem number
*/
import java.util.*;
public class XylemPholem
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The number is : "+xylemorPholem(n));
	}
	public static String xylemorPholem(int n)
	{
		int sumextrem=0,summean=0;
		  sumextrem=n%10;
		  n=n/10;
		  while(n>9)
		 {
			  int rem=n%10;
			 summean+=rem;
			n/=10;
  		 }
		 sumextrem+=n;
		

		return sumextrem==summean?"Xylem ":"Pholeam";
	}
}