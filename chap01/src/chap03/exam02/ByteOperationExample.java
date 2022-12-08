package chap03.exam02;

public class ByteOperationExample {

	public static void main(String[] args) {

		byte result = 10 + 20;
		//컴파일러에서 연산
		byte x = 10;
		byte y = 20;
		int result1 = x + y;
		//JVM에서 연산
		
		System.out.println(result);
		System.out.println(result1);
		
	}

}
