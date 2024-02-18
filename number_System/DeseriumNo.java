/*Deserium Number : sume of power of indivudual of position 
  135 =1^1+3^2+3^3=1+9+123=
  
*/
import java.util.*;
public class DeseriumNo
{
 public static void main(String []args)
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 System.out.println("The number is "+diserium(n));

	}
	public static String diserium(int n)
	{
      int count=countdigit(n);
	  int temp=n;
	  int sum=0;
	  while(n!=0)
		{
          int rem=n%10;
		  sum=sum+pow(rem,count);
		  count--;
		  n=n/10;
		}
		return temp==sum?"Diserium":"Not Desirium";

	}
	public static int pow(int n,int m)
	{
		int pw=1;
		for(int i=1;i<=m;i++)
		{
			pw=pw*n;
		}
		return pw;
	}
	public static int countdigit(int n)
	{
		int count=0;
		do{
			count++;
			n/=10;
		}while(n!=0);
		return count;
	}
}