package chap04.exam02;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {

		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keCode: " + keyCode);
		}
	}

}