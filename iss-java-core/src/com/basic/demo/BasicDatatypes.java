package com.basic.demo;

public class BasicDatatypes {

	public static void main(String args[]) {
          // byte:-128 to 127, default=0
	      byte byteValue1 = 3;
	      byte byteValue2 = 4;
	      byte byteResult = (byte)(byteValue1 + byteValue2);//Convert resulting value from int to byte

	      System.out.println("Byte: " + byteResult);
	      // short:-32768 to 32767, default=0
	      short shortValue1 = 3;
	      short shortValue2 = 4;
	      short shortResult = (short)(shortValue1 + shortValue2);//Convert resulting value from int to short

	      System.out.println("Short: " + shortResult);
	      // int: 2,147,483,648 to 2,147,483,647, default=0
	      int intValue1 = 3;
	      int intValue2 = 4;
	      int intResult = intValue1 + intValue2;

	      System.out.println("Int: " + intResult);
	      // long:-9,223,372,036,854,775,808 to-9,223,372,036,854,775,807, default=0L
	      long longValue1 = 3L;
	      long longValue2 = 4L;
	      long longResult = longValue1 + longValue2;

	      System.out.println("Long: " + longResult);
	      //Float data type is a single-precision 32-bit IEEE 754 floating point
	      float floatValue1 = 3.0f;
	      float floatValue2 = 4.0f;
	      float floatResult = floatValue1 + floatValue2;

	      System.out.println("Float: " + floatResult);
	      
	      //double data type is a double-precision 64-bit IEEE 754 floating point
	      double doubleValue1 = 3.0;
	      double doubleValue2 = 4.0;
	      double doubleResult = doubleValue1 + doubleValue2;

	      System.out.println("Double: " + doubleResult);
	      // true/false
	      boolean booleanValue = true;

	      System.out.println("Boolean: " + booleanValue);
          //char data type is a single 16-bit Unicode character
	      char charValue = 'A';

	      System.out.println("Char: " + charValue);     
	   }
	}

