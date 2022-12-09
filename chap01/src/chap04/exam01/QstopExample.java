package chap04.exam01;

public class QstopExample {

	public static void main(String[] args) throws Exception {

		int keyCode;

		while (true) {
			keyCode = System.in.read();
			System.out.println("keCode: " + keyCode);
			if(keyCode ==  113) {
				break;
			}
		}
		System.out.println("종료");
	}

}
