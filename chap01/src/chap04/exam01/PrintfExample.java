package chap04.exam01;

public class PrintfExample {

	public static void main(String[] args) {

		int value = 123;
		System.out.printf("상품의가격:%d원\n", value);
		System.out.printf("상품의가격:%6d원\n", value);
		System.out.printf("상품의가격:%-6d원\n", value);
		System.out.printf("상품의가격:%06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %1$d인 원의 넓이:%2$10.2f\n", 10, area);
		
		String name = "이건상";
		String job = "프로그래머";
		System.out.printf("%6d : %-10s : %10s\n", 1, name, job);
	}

}
