package chap02.exam02;

public class IntergerLiteralExample {

	public static void main(String[] args) {

		int var1 = 0b1011;
		//0b = 2진수 1x2³ + 0x2² + 1x2¹ + 1x1
		int var2 = 013;
		//0 = 8진수 1x8¹ + 3x1		
		int var3 = 11;
		//0이 안붙는다면 10진수
		int var4 = 0xB3;
		//0x = 16진수(0~9,a~f,A~F) B(11)x16¹ + 3x1

		System.out.println("var1; " + var1);
		System.out.println("var2; " + var2);
		System.out.println("var3; " + var3);
		System.out.println("var4; " + var4);
	}

}
