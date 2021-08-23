import java.lang.*;

class byteSwap
{
	public static void main(String agrs[])
	{
		int a=9,b=12;
		a = a^b;
		b = a^b;
		a  = a^b;
		System.out.println("Swapping of a = "+ a + " b = " +b);
		
	}
}