package chap02.exam03;

public class EscapleExample {

	public static void main(String[] args) {

		System.out.println("01082123228\t이건상\t프로그래머");
		// \t = tap 만큼 띄워짐.
		System.out.println("01082123228\n이건상\n프로그래머");
		// \n = 줄 바꿈 , println의 ln이 \n 역활을 한다.
		System.out.print("ln이 없을경우");
		System.out.println("줄이바뀌지 않음");
		System.out.print("뒤에 역슬래쉬n이 오면 ln을 붙인것고 같은효과이다\n");
		System.out.println("나는 \"이건상\"입니다.");
		// \",\',\\ 등 강조할 때 사용가능
		System.out.println("봄\\여름\\가을\\겨울");
	}

}
