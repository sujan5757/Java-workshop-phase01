import java.util.Scanner;
class decitobin 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal Number: ");
		int dec=sc.nextInt();
		int x,bin=0,a=1;
		while(dec!=0)
		{
			x=dec%2;
			bin=bin+(x*a);
			a*=10;
			dec/=2;
		}
		System.out.println(bin);
			
	}
}
