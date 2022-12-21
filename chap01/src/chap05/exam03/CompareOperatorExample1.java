package chap05.exam03;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		//int -> double 로 바뀌어서 연산되어서 true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println((double)v5);
		System.out.println(v4 == v5);
		System.out.println((float)v4 == v5);
		System.out.println((int)(v4*10) == (int)(v5*10));
		//float을 double로 강제타입변환하면 부동소수점 방식때문에 정확한 0.1이 안나옴.
		//float과 double을 비교할때에는 float으로 바꾸고 비교 or 정수로 바꿔서 비교
	}

}
