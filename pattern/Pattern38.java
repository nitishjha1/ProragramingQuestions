
/*
    1
   212
  32121
 4321234
543212345

*/
import java.util.Scanner;
class Pattern38
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			int val=i;
			for(int j=1;j<=2*i-1;j++)
			{
				if(j<i){
				System.out.print(val+" ");
				val--;
				}
				else{
                   
					System.out.print(val+" ");
					 val++;
				}
			}
			System.out.println();
		}
	}
}