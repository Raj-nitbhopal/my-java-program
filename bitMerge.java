import java.lang.*;

class bitMerge
{
	public static void main(String agrs[])
	{
		byte a=9,b=12,c;
		
		c = (byte)(a<<4);
		c = (byte)(c|b);
		System.out.println((c&0b11110000)>>4);
		System.out.println((c&0b00001111));
	}
}