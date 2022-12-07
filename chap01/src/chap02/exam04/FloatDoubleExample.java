package chap02.exam04;

public class FloatDoubleExample {

	public static void main(String[] args) {

		float var1 = 3.14f;
		// 기본적으로 double타입으로 인식해서 float타입을 저장 할 때에 뒤에 f를 붙여줘야한다.
		double var2 = 3.14;
		
		System.out.println(var1);
		System.out.println(var2);
		
		float var3 = 0.1234567890123456789f;
		//8자리 이후는 반올림되서 나타남. 즉/7자리까지가 정확
		double var4 = 0.1234567890123456789;
		//17자리 이후는 반올림되서 나타남. 즉/15~16자리까지가 정확 float보다 정확함
		System.out.println(var3);
		System.out.println(var4);
		
		double var5 = 3e6;
		float var6 = 3e6f;
		double var7 = 2e-3;
		
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
	}

}
