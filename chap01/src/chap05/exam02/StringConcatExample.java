package chap05.exam02;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "이건상" + 2.0;
		String str2 = str1 + " 버전";
		System.out.println(str2);
		
		String str3 = "이건상" + 3 + 3.0;
		String str4 = 3 + 3.0 + "이건상";
		System.out.println(str3);
		System.out.println(str4);

	}

}
