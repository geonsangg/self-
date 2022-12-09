package chap03.exam03;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {

		String str1 = "10";
		int value1 = Integer.parseInt(str1);//or("10")가능
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);

		int value4 = 10;
		String str2 = String.valueOf(value4);
		String str3 = String.valueOf(3.14);
		String str4 = String.valueOf(true);
		
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		System.out.println("str4: " + str4);
	}

}
