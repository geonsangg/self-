package chap02.exam03;

public class CharExample {

	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		//'u = 16진수 거의 사용x
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		//16진수는 거의 사용할일 x
		System.out.println(c4);
		System.out.println(c5);
	}

}
