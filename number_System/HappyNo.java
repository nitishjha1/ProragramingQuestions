
/* Happy Number:= reduce a numer by adigit of squre its digit .if digit is 1 and 7 then it is happy number!!!!
  19=1^2+9^2=82
  8^2+2^2=68
  6^2+8^2=100
  1^2+0^2+0^2=1  so 19 is happy number
*/
import java.util.*;
public class HappyNo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The Number is : "+happyNo(n));

	}
	public static String happyNo(int n)
	{
		
		
		int sum=0;
		while(n>9){
			int count =count(n);
			while(count!=0){
			int rem =n%10;
			sum=sum+rem*rem;
			n/=10;
			count--;
			}
			n=sum;
			sum=0;
		}
		


	return (n==1||n==7)?"Happy Number":"Not Happy Number";
	}
	public static int count(int n)
	{
		int count=0;
		do
		{
			count++;
			n/=10;
		}
		while (n!=0);
		return count;
	}
}