package JavaSessions;

/**
 * This class is used for different data types in Java
 * 
 * @author kdhiv
 *
 */
public class DataTypes {

	public static void main(String[] args) {
		// Data types in Java: Types of data
		// Java follows strict data types
		
		// 1.Primitive data type: According to Java, we do not need any object to create primitive data type.
			//a. boolean data type : boolean : true/ false
			//b. Integral data type
				//b.1. Integer: byte, short, int, long
				//b.2. Floating point: float, double
		
		//2. Non primitive data types:
			// string, Arrays, Interfaces,....,Object
		
		
		//Integer:
		//1.byte: 
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b1 = 10;
		System.out.println(b1);
		
		//2.short:
		//size: 2 byte = 16 bits
		//range: -32768 to 32767
		short s1 = 1000;
		
		//3. integer: int
		//size: 4 byte = 32 bits
		//range: -2147483648 to 2147483647
		int i = 10000;
		
		//4.long:
		//size: 4 byte = 64 bits
		//range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long l1 = 1000003000;
		
		
		//Floating point:
		//5.float:
		// size: 4 byte = 32 bits
		//range: it can take upto 7 digits after the dot.
		float f1 = 12.33f;
		//or
		float f2 = (float)12.33;
		
		//6.double:
		//size: 8 byte = 64 bits
		//range: it can take upto 16 digits after the dot.
		double d1 = 13.33333333333;
		
		//7.char: it only accepts single digits value and value should be given in between single quotes.
		// size: 2 bytes = 16 bits
		// Why does Java takes 2 bytes for a single digit value
		// Because Java supports multiple different types of characters like UNICODE / LANGUAGE CODE / ASCII codes
		char c1 ='a';//a-z
		char c4 =' ';
		char c2 ='1';//0-9
		char c3 = '*';// any special character but single special character is allowed
		
		System.out.println(c1);// a
		System.out.println(c1 + c4);// 32 + 97 = 129
		
		//ASCII Range:
		// a - z = 97 to 122
		// A - Z = 65 to 90
		// 0 -9 = 48 to 57
		// SPACE = 32
		
		//8. boolean : true / false
		// It is used in checkpoints: on validation or on verification
		// In TestNG , boolean can be used in Assertion
		// It is used mostly along with Conditional operators
		
		boolean flag = true;
		boolean fl =  false;
		
		//9.String: string is a default class in java, so it should start with capital letter
		// It is not a primitive data type
		// the value should be passed inside double quotes.
		String str = "Hello World";
		
		System.out.println(str);
		System.out.println("Hello Selenium");
		
		
		
		
		
		
		
		

	}

}
