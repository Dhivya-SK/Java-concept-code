package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String x ="Hello";
		String y = "World";
		
		int a = 100;
		int b = 200;
		
		double d1 =12.30;
		double d2 = 22.30;
		
		
		//Arithmetic addition:
		System.out.println(a+b);//300
		System.out.println(d1+d2);//34.60
		
		//String concatenation:
		System.out.println(x+y);//HelloWorld
		System.out.println(x+a);//Hello100
		System.out.println(a+x);//100Hello
		System.out.println(x+y+a+b);//HelloWorld100200
		System.out.println(a+b+x+y);//300HelloWorld
		System.out.println(a+b+x+y+d1+d2);//300HelloWorld12.3022.30
		
		//String concatenation with byte data type:
		
		byte b1 = 10;
		System.out.println(b1+x+y);//10HelloWorld
		
		//Division, Multiplication and Modulo:
		System.out.println(10/3);//3
		System.out.println(10/3.0);//3.3333
		System.out.println(10.0/3);//3.333
		System.out.println(10.0/3.0);//3.333
		
		System.out.println(10 % 3);//1
		System.out.println(10 % 3.1);// 0.699 - Floating point result when either of one input is floating point.
		
		
	}

}
