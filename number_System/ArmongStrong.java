 //Checking armongstrong number of n
 import java.util.*;
 public class ArmongStrong
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		System.out.println("The Number is : "+armongStrong(n));

	}
	public static String armongStrong(int n)
	{
		int temp=n;
		int sum=0;
		int dig=countdigit(n);
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+ pow(rem,dig);
			n/=10;
		}
		return temp==sum?"ArmongStrong":"Not ArmongStrong";
	}
	//count the digit
	public static int countdigit(int n)
	{
		int count=0;
   do{
	  count++;
     n/=10;
	}while(n!=0);
	
	return count;
	}
	//power of n
	public static int pow(int n,int m)
	{
	int	paw=1;
		for(int i=1;i<=m;i++)
		{
			paw=paw*n;
		}
		return paw;
	}
}
