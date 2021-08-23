// import java.lang.*;
class Literals
{
	public static void main(String args[])
	{
		byte b1 = 10; //Decimal
		byte b2 = 0b1010;  // Binary of 10 
		byte b3 = 012; // Octal of 10
		byte b4 = 0xA; // HexaDecimal of 10
		float f = 123.465f; // By default point value is double to make it float write f at the end
		double d = 123.465;
		long l = 99_999_999_454_545_499L; // To make readble we underscore but it is not visisble on screen but before and at the end it is illegal
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}
}